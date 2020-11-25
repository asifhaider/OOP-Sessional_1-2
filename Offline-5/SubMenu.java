import java.util.Scanner;

public class SubMenu{
    public void setCarList(CarList carList) {
        this.carList = carList;
    }

    public static SubMenu instance;
    private CarList carList;
    public static SubMenu getInstance() {
        if (instance == null) {
            instance = new SubMenu();
        }
        return instance;
    }

    private Scanner scn;
    public int option;

    public SubMenu() {
        this.scn = new Scanner(System.in);
    }

    @Override
    public String toString() {
        return "\nCar Searching Options! Press any of the following numbers to continue." + '\n' + "(1) By Registration Number" + '\n' + "(2) By Car Make and Car Model" + '\n' + "(3) Back to Main Menu" + '\n';
    }

    public int getSubOption() {
        System.out.println("Enter any option between 1-3");
        String s = this.scn.nextLine();
        try {
            option = Integer.parseInt(s);
            System.out.println(option);
            return option;
        } catch (Exception exp1) {
            return -1;
        }
    }

    public String getSearchInput() {
        String searchInput = scn.nextLine();
        return searchInput;
    }

}


