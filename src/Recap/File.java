package Recap;

public abstract class File {
   abstract void open();
   void edit(){
        System.out.println("Editing file");
    }
   void close(){
       System.out.println("closing file");
   }

    }

    // Create a class File that will have the following behaviors:
    // open, edit, close. Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, Wo fFile that will provide specific implementation
    // of open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .
    // doc file we need Microsoft Word to be installed etc


class JavaFile extends File{

    @Override
    void open() {
        System.out.println("To open java file we Java Runtime Environment installed.");
    }

    }
    class PdfFile extends File {


        @Override
        void open() {
            System.out.println("To open PDF file we need to download a PDF reader.");
        }
    }
        class MsWordFile extends File{


            @Override
            void open() {
                System.out.println("To open Ms word file we have to have application");
            }

}
