import java.util.Scanner;

public class MainMenu {

    public static MainMenu instance;

    public void setCarList(CarList carList) {
        this.carList = carList;
    }

    private CarList carList;

    public static MainMenu getInstance() {
        if (instance == null) {
            instance = new MainMenu();
        }
        return instance;
    }

    private Scanner scn;
    public int option;

    public MainMenu() {
        this.scn = new Scanner(System.in);
    }

    @Override
    public String toString() {
        return "\nWelcome to Car Database! Press any of the following numbers to continue." + '\n' + "(1) Search Cars" + '\n' + "(2) Add car" + '\n' + "(3) Delete Car" + '\n' + "(4) Exit System" + '\n';
    }

    public int getOption() {
        System.out.println("Enter any option between 1-4");
        String s = this.scn.nextLine();
        try {
            option = Integer.parseInt(s);
            System.out.println(option);
            return option;
        } catch (Exception exp1) {
            return -1;
        }
    }

    public String[] getInput() {
        String[] carInfo = new String[8];
        System.out.println("\nWelcome to the Add car section. Please provide necessary info for your car.");
        System.out.println("Maintain the following data sequence. Use 'Enter' between two info: ");
        System.out.println("Car Registration Number, Year Made, Color (Upto 3), Car Make, Car Model and Price.");
        for (int i = 0; i < 8; i++) {
            String s = this.scn.nextLine();
            carInfo[i] = s;
        }

        return carInfo;
    }



    public String getDeleteInput() {
        String deleteInput = scn.nextLine();
        return deleteInput;
    }
//
//    public int getSubOption() {
//        System.out.println("Enter any option between 1-3");
//        String s = this.scn.nextLine();
//        try {
//            option = Integer.parseInt(s);
//            System.out.println(option);
//            return option;
//        } catch (Exception exp1) {
//            return -1;
//        }
//    }

}