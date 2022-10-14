package ReviewClass1;

public class Shelter {

    public static void main(String[] args) {

        Dog dog1=new Dog();

        // How to access instance variable

        dog1.name="Bobby";
        dog1.weight=5;

        Dog dog2=new Dog();
        System.out.println(dog2.name);
        dog2.name="Tommy";
        dog2.weight=10;
        System.out.println(dog2.name+" "+dog2.weight);

    }

}
