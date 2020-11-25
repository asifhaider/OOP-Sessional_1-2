public class SearchCarMenu {

    public void SearchByRegNumber(CarList carList){

        System.out.println("Provide your Car's Registration Number!");
        String regNumber = SubMenu.getInstance().getSearchInput();
        carList.SearchCarRegNumber(regNumber);

    }

    public void SearchByCarMakeAndModel(CarList carList){

        System.out.println("Provide the name of your Car Make!");
        String carMake = SubMenu.getInstance().getSearchInput();
        System.out.println("Provide the Car Model!");
        String carModel = SubMenu.getInstance().getSearchInput();
        carList.SearchCarMakeModel (carMake, carModel);
    }

}
