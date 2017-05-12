package com.continuum.framework.utils;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * HttpRestUtils class is to reduce the amount of code needed to make simple,
 * unauthenticated http calls. This can be very useful when testing back end rest
 * API.
 *
 */
public class HttpRestUtils {
    public static String get( String url ) {
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet get = new HttpGet( url );
            CloseableHttpResponse resp1 = httpClient.execute( get );
            HttpEntity ent1 = resp1.getEntity();
            String body = IOUtils.toString( ent1.getContent() );
            EntityUtils.consume( ent1 );
            resp1.close();
            return body;
        } catch ( Exception e ) {
            return null;
        }
    }
}