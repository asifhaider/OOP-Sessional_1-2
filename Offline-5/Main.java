import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class Main {

    public static final String INPUT_FILE = "cars.txt";
    public static final String OUTPUT_FILE = "cars.txt";

    public static void ExitSystem () {
        System.out.println("You have successfully exited our database!");
    }

    public static void WrongOption () {
        System.out.println("Invalid option. You must input between 1-4!");
    }

    public static CarList LoadCarData (){

        CarList allCarLists = new CarList();
        try {
            String carInfo [], line;
            BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE));
            while (true) {
                line = br.readLine();
                if (line == null) break;
                // System.out.println(line);
                carInfo = line.split(",");
                Car c = new Car(carInfo[0], carInfo[1], carInfo[2], carInfo[3], carInfo[4], carInfo[5], carInfo[6], carInfo[7]);
                allCarLists.AddCar(c);
            }
            br.close();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        return allCarLists;
    }

    public static void SaveCarData (CarList allCarList) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE));
            // write present data into the output file
            Iterator itr = allCarList.getCarList().iterator();

            while (itr.hasNext()){
                Car newCar = (Car)itr.next();
                bw.write(newCar.toString());
                //bw.write("\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main (String[] args){

        CarList allCarList = LoadCarData();
        while (true) {
            System.out.println(new MainMenu());
            // allCarList.ShowCar();
            MainMenu.getInstance().setCarList(allCarList);
            int option = MainMenu.getInstance().getOption();
            switch (option){
                case 1:
                    new SearchCar().view(allCarList);
                    break;
                case 2:
                    new AddCarMenu().view(allCarList);
                    break;
                case 3:
                    new DeleteCarMenu().view(allCarList);
                    break;
                case 4:
                    ExitSystem();
                    SaveCarData(allCarList);
                    return;
                default:
                    WrongOption();
            }

        }
    }
}
