package ReviewClass;

public class StringeMethod {
    public static void main(String[] args) {

        String str = "hello";
        // TtoUpperCase or toLowerCase

        str.toUpperCase(); //hello
        System.out.println(str);
        System.out.println("++++++++");
        str = str.toUpperCase();
        System.out.println(str); //HELLO

        //lenght() -> gives size
        int size = str.length();
        System.out.println(size);

        // CharAt() -> returns the char value at the specified index
        char letter = str.charAt(4);
        System.out.println(letter);


    }


}
