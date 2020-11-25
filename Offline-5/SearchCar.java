public class SearchCar {

    public static void WrongOption () {
        System.out.println("Invalid option. You must input between 1-3!");
    }

    public void view (CarList carList){
        while (true) {
            System.out.println(new SubMenu());
            SubMenu.getInstance().setCarList(carList);
            int option = SubMenu.getInstance().getSubOption();
            switch (option){
                case 1:
                    new SearchCarMenu().SearchByRegNumber(carList);
                    break;
                case 2:
                    new SearchCarMenu().SearchByCarMakeAndModel(carList);
                    break;
                case 3:
                    return;
                default:
                    WrongOption();
            }
        }
    }
}
