public class Main {
    public static void main(String[] args) {

        Car car = new Car("Mitsubishi");
        Car car2 = new Car("KIA");


        Truck truck = new Truck("UAZ",6);
        Truck truck2 = new Truck("MAN",8);

        Bicycle bicycle = new Bicycle("Stels",2);
        Bicycle bicycle2 = new Bicycle("Stern",2);


        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car);
        System.out.println();
        serviceStation.check(car2);
        System.out.println();
        serviceStation.check(truck);
        System.out.println();
        serviceStation.check(truck2);
        System.out.println();
        serviceStation.check(bicycle);
        System.out.println();
        serviceStation.check(bicycle2);



    }
}