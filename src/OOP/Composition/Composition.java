package OOP.Composition;

class Car{
    private String carColor;
    private int carGears;

    Engine e = new Engine();

    Car(String carColor, int carGears, int carPower, String transmission){
        e.setCarPower(carPower);
        e.setTransmission(transmission);
        this.carColor = carColor;
        this.carGears = carGears;
    }

    public String getCarColor(){
        return carColor;
    }
    public int getCarGears(){
        return carGears;
    }

    public String getTransmission(){
        return e.getTransmission();
    }

    public int getCarPower(){
        return e.getCarPower();
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car1 = new Car("Red", 10, 20, "Manual");
        System.out.println(car1.getCarColor());
    }
}
