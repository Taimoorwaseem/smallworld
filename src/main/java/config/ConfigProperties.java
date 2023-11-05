/*
# set & get environment/globals variables
*/

package config;

import java.util.ArrayList;

public class ConfigProperties {
    public static ApplicationConfigReader appConfig = new ApplicationConfigReader();

    public static String BaseUrl = appConfig.getBaseUrl();
    public static String Browser = appConfig.getBrowser();


}
