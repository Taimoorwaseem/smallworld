/*
# baseTest functions defined in this class
 */

package general;


//import com.aventstack.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import io.restassured.RestAssured;
//import io.restassured.filter.log.LogDetail;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//import static config.ConfigProperties;
//
//public class MainCall {
//
//
//
//    private static ExtentReports extent;
//    public final static String reportPath = System.getProperty("user.dir") + "\\reports\\ExtentReport-"+ new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss").format(Calendar.getInstance().getTime())+".html";
//
//    public static void startReport() {
//        extent = new ExtentReports(reportPath, true);
//        extent.addSystemInfo("Environment", Environment);
//    }
//
//    public static ExtentReports getExtentReport() {
//        if (extent != null) {
//            return extent;
//        } else {
//            throw new IllegalStateException("Extent Report object not initialized");
//        }
//    }
//
//    public static void restAssuredPreReq() {
//        //baseTest.REQUEST = RestAssured.given().baseUri(coreBaseUrl);
//        //RestAssured.baseURI = baseUrl;
//        //RestAssured.port = Integer.valueOf(Port);
//        //REQUEST = RestAssured.given().contentType(ContentType.JSON);
//        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
//      //  BasicConfigurator.configure();
//
//    }
//
//}
