package Recap;

public class FileTester {
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new PdfFile(), new MsWordFile()};
        for (File file : files
        ) {
            file.open();

        }

    }

}
