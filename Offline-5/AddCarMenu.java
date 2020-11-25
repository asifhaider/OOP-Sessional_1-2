import java.util.Iterator;
import java.util.Scanner;

public class AddCarMenu {

    public String[] getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String[] carInfo) {
        this.carInfo = carInfo;
    }

    private String carInfo[] = new String[8];

    public void view(CarList carList) {
        carInfo = MainMenu.getInstance().getInput();
        Car c = new Car(carInfo[0], carInfo[1], carInfo[2], carInfo[3], carInfo[4], carInfo[5], carInfo[6], carInfo[7]);
        try {

            for (Iterator<Car> itr = carList.carList.iterator(); itr.hasNext(); ) {

                Car x = itr.next();
                if (x.getCarReg().equalsIgnoreCase(carInfo[0])) {
                    System.out.println("\nCar Info adding failed. Please try again with a unique registration number!");
                    return;
                }
            }
            carList.AddCar(c);
            System.out.println("Car info added successfully!");
        } catch (Exception e){
            System.out.println("Unexpected Behavior Occurred. Please try again with correct format!");
        }

    }
}



