package vardemin.com.jetrshots.util;

import java.util.Map;

/**
 * Created by xavie on 12.02.2017.
 */

public class UrlUtil {
    /**
     * Form URL with params
     * @param baseUrl base URL
     * @param destination path
     * @param args params
     * @return endpoint URL
     */
    public static String getUrl(String baseUrl, String destination, Map<String, String> args) {
        String url = baseUrl.concat("/".concat(destination.concat("?")));
        for (Map.Entry<String, String> entry : args.entrySet())
        {
            url = url.concat(entry.getKey().concat("=".concat(entry.getValue().concat("&"))));
        }
        return url;
    }

}
