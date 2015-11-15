package com.ozay.service.util;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;


/**
 * Created by rakesh on 02-11-2015.
 */
public class Sendgridurl {

    public void fetch (String args[])
    {
        URL myURL = null;
        try {
            myURL = new URL("https://angelicaarias:admin@app.ozay.us/#/notification_archive/foo.php ");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection myURLConnection = null;
        try {
            myURLConnection = myURL.openConnection();
            }

            catch (IOException e) {
            e.printStackTrace();
        }
        try {
            myURLConnection.connect();
        } catch (IOException e) {
            e.printStackTrace();
            try
            {
                BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null)
                    System.out.println(inputLine);
                in.close();
            }
            catch (IOException ee)
            {
                e.printStackTrace();
            }

        }
    }

}

