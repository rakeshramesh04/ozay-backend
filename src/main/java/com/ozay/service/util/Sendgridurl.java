package com.ozay.service.util;
import java.io.IOException;
import java.net.*;


/**
 * Created by rakesh on 02-11-2015.
 */
public class Sendgridurl {

    public void fetchevent()
    {
    URL myURL = null;
        try {
            myURL = new URL("http://OzayOrg:Ozaysyzn1124@domain/foo.php/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection myURLConnection = null;
        try {
            myURLConnection = myURL.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            myURLConnection.connect();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}

