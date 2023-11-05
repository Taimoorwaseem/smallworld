/*
# Get properties values and set into variables
*/
package config;
/*
# Get properties values and set into variables
*/

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource.Classpath;

import java.util.ArrayList;

//import static com.venturedive.base.config.BaseApplicationConfigReader.isNullOrEmpty;

@Classpath({"ApplicationConfig.properties"})

public class ApplicationConfigReader {

    @Property("baseUrl")
    private String baseUrl;

    @Property("browser")
    private String browser;

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ApplicationConfigReader() {
        PropertyLoader.newInstance().populate(this);
    }

    public String getBrowser() {
        return this.browser;
    }






//    public String getIsEnableReporting() {
//        return this.isEnableReporting;
//    }
//    public String getEnvironment() {
//        return this.Environment;
//    }
}