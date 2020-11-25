public class DeleteCarMenu {

    private String regNumber;


    public void view (CarList carList){
        System.out.println("Welcome to Car Delete Menu!");
        System.out.println("Provide your Car's Registration Number!");
        regNumber = MainMenu.getInstance().getDeleteInput();
        carList.SearchAndDeleteCar(regNumber);
    }
}
