package Recap;

public interface WebDriver {
    //Create a WebDriver Interface that will have the following unimplemented behaviour:
    // openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
    // Create 2 classes that implements WebDriver interface: 
    // ChromeDriver and FirefoxDriver.

   void openBrowser();
   void closeBrowser();
   void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening browser in Chrome");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser in Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Minimize window from chrome");

    }

    @Override
    public void findElement() {
        System.out.println("Looking for an element in Chrome");

    }
}
    class FireFoxDriver implements WebDriver{

        @Override
        public void openBrowser() {
            System.out.println("Opening browser in Firefox");  
        }

        @Override
        public void closeBrowser() {

            System.out.println("Closing browser in Firefox");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Minimize window from Firefox");
        }

        @Override
        public void findElement() {
            System.out.println("Looking for an element in Firefox");
        }
    }

