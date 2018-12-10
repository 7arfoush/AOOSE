/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author holo7
 */

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class weatherAPI {
    
    private CheckEvents gui;

    public weatherAPI(CheckEvents gui) {
        this.gui = gui;
        //gui.getConvertBtn().addActionListener(new ConvertButtonHandler());
    }

    class ConvertButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {

                // This code ignores SSL certificates when dealing with HTTPS
                SSLContext sslcontext = SSLContexts.custom()
                        .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                        .build();
                SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext);
                CloseableHttpClient httpclient = HttpClients.custom()
                        .setSSLSocketFactory(sslsf)
                        .build();
                Unirest.setHttpClient(httpclient);

                String json = Unirest.get("http://http://api.openweathermap.org/data/2.5/weather?q=Cairo,eg&appid=c33f66be87c3c5859a9ca7f25ed7277f").asString().getBody();
                Weather result = new Gson().fromJson(json, Weather.class);

                
                // Get Rate from JSON response
                float rate = result.getResult();

                // Finally, setting the result
                //gui.getTxtEGP().setText(egp + "");
                
            } catch (Exception e) {
                System.out.println("EXCEPTION: " + e.getMessage());
            }
        }
    }
    
}
