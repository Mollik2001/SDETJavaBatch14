package Recap;

public class WEbdriveTester {
    public interface WebDriverTester {
        public static void main(String[] args) {
      WebDriver []webDrivers={new ChromeDriver(),new FireFoxDriver()};
            for (WebDriver webdriver:webDrivers
                 ) {
                webdriver.openBrowser();
                webdriver.closeBrowser();
                webdriver.findElement();
                webdriver.maximizeWindow();

            }

        }
    }



        }
