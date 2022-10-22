package ExerciseRepl;

public class Importantrpl {

    public static String mixString(String s1, String s2) {
        String mix = "";
        for (int i = 0; i < s1.length(); i++) {
            mix += (s1.substring(i, i + 1) + s2.substring(i, i + 1));
        }
        return mix;
    }


    public static void main(String[] args) {

        System.out.println(mixString("12345","abcde"));
    }
}