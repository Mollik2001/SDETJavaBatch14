package Exe;

public class Rep1 {
    public static void main(String[] args) {

        String carColor;
        int carYear;
        String carMake;

            Car Bmw=new Car();

            Bmw.carColor=" Black ";
            Bmw.carYear= 2019;
            Bmw.carMake=" BMW ";

            System.out.println(" carColor "+ Bmw.carColor +" carYear "+ Bmw.carYear +" carMake "+ Bmw.carMake);


            Car Toyota=new Car();
            Toyota.carColor="White";
            Toyota.carYear=2018;
            Toyota.carMake="Toyota";


            System.out.println(" carColor "+ Toyota.carColor + " carYear " + Toyota.carYear +" carMake " + Toyota.carMake);
        }

    }

