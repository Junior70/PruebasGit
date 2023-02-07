package pruebas.driverconnect;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hooks {


    public static WebDriver driver;


    @BeforeClass
    public static void Setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-print-preview");
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        //caps.setCapability(ChromeOptions.CAPABILITY, options);

        //WebDriver driver = new ChromeDriver(ssl);
        driver = new ChromeDriver(caps);
        // driver = new ChromeDriver(options);


        //driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
