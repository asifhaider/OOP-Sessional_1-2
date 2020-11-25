// Car object defines each single cars

import java.sql.SQLOutput;

public class Car {
    @Override
    public String toString() {
        return CarReg + "," + YearMade + "," + Colors[0] + "," + Colors[1] + "," + Colors[2] + "," + CarMake + "," + CarModel + "," + Price + '\n';
    }

    private String CarReg;
    private int YearMade;
    private String [] Colors; // can have upto 3 different colors
    private String CarMake;
    private String CarModel;
    private int Price;


    public Car(String CarReg, String YearMade, String Color1, String Color2, String Color3, String CarMake, String CarModel, String Price) {
        this.CarReg = CarReg;
        this.YearMade = Integer.parseInt(YearMade);
        this.Colors = new String[3];
        this.Colors[0] = Color1;
        this.Colors[1] = Color2;
        this.Colors[2] = Color3;
        this.CarMake = CarMake;
        this.CarModel = CarModel;
        this.Price = Integer.parseInt(Price);
    }

    public void ShowCarInfo (){
        System.out.println("\nHere is your Car Info! ");
        System.out.println("Registration Number: " + getCarReg());
        System.out.println("Year Made: " + getYearMade());
        for (int i=0; i<getColors().length; i++){
            if (!getColors()[i].isEmpty())
            System.out.println("Car Color " + (i+1) + ": " + getColors()[i]);
        }
        System.out.println("Car Make: " + getCarMake());
        System.out.println("Car Model: " + getCarModel());
        System.out.println("Car Price: " + getPrice());
    }

    public String getCarReg() {
        return CarReg;
    }

    public void setCarReg(String carReg) {
        this.CarReg = carReg;
    }

    public int getYearMade() {
        return YearMade;
    }

    public void setYearMade(int yearMade) {
        this.YearMade = yearMade;
    }

    public String[] getColors() {
        return Colors;
    }

    public void setColors(String[] colors) {
        this.Colors = colors;
    }

    public String getCarMake() {
        return CarMake;
    }

    public void setCarMake(String carMake) {
        this.CarMake = carMake;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        this.CarModel = carModel;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }
}
