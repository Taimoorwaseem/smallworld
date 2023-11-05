package general;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    public ExtentSparkReporter htmlReporter;
    public ExtentReports extent = new ExtentReports();



    @BeforeSuite
    public void setUp() {
        htmlReporter = new ExtentSparkReporter("extent.html");
        extent.attachReporter(htmlReporter);

    }

    @AfterSuite
    public void tearDown(){
        extent.flush();
    }

}
