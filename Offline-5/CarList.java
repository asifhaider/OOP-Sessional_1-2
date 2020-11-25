import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarList {

    List <Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    public CarList() {

        this.carList = new ArrayList();

    }

    public CarList(List carList){
        this.carList = carList;
    }

    public void AddCar (Car c){
        this. carList.add(c);

    }

    public void SearchAndDeleteCar (String regNumber) {
        boolean foundCar = false;
        for (Iterator <Car> itr = carList.iterator(); itr.hasNext();) {
            Car c = itr.next();
            if (c.getCarReg().equalsIgnoreCase(regNumber)) {
                itr.remove();
                foundCar = true;
                break;
            }
        }
        if (!foundCar)
            System.out.println("No car found with this Registration Number!");
        else{
            System.out.println("Car info deleted successfully!");
        }
    }

//    public void ShowCar (){
//        for (Car c: this. carList){
//            c.ShowCarInfo();
//        }
//    }

    public void SearchCarRegNumber (String regNumber){
        boolean count = false;
        for (Car c:this.carList){
            if (c.getCarReg().equalsIgnoreCase(regNumber)){
                c.ShowCarInfo();
                count = true;
            }
        }
        if (!count)
            System.out.println("No such car found with this Registration Number!");
    }

    public void SearchCarMakeModel (String carMake, String carModel){
        boolean printed = false;
        for (Car c: this.carList){
            if (c.getCarMake().equalsIgnoreCase(carMake)){
                if (carModel.equalsIgnoreCase("ANY")){
                    c.ShowCarInfo();
                    printed = true;
                }
                else if (c.getCarModel().equalsIgnoreCase(carModel)){
                    c.ShowCarInfo();
                    printed = true;
                }
            }
        }
        if (!printed){
            System.out.println("No such car with this Car Make and Car Model!");
        }
    }

}
