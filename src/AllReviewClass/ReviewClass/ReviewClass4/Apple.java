package AllReviewClass.ReviewClass.ReviewClass4;

public class Apple extends Fruit{
    String size;
    String taste;
    double price;

    Apple(String name, String shape, String color, String size){
        super(name, shape, color);
        this.size=size;
    }

    Apple(String name, String shape, String color, String size,String taste, double price){
        this(name, shape, color, size);
        this.taste=taste;
        this.price=price;
    }

    public static void main(String[] args) {

        Apple app=new Apple("apple", "circle", "red", "big");
        // app.color; not visible since it acc mod is PRIVATE
        System.out.println(app.name);
        System.out.println(app.shape);
        System.out.println(Fruit.fresh);
        System.out.println(Apple.fresh);

        app.grow();
        app.haveBenefits();
    }
    void makeJuice(){
        System.out.println("from"+name+"we can make"+taste+"juice");
    }
}




