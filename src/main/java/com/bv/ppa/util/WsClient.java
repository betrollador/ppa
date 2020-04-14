package com.bv.ppa.util;

import com.bv.ppa.model.TipoConsultaCredito;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.json.JsonArray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WsClient {
    public List<TipoConsultaCredito> doBuscaTipoConsultaCredito(String busca){

        List<TipoConsultaCredito> resultado = new ArrayList<TipoConsultaCredito>();
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {

            URL url = new URL("http://localhost:8080/ppa/api/tipoconsultacredito/"+busca);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));


            String output = "";
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
                json = json + output;
            }

            conn.disconnect();



        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

        try {
            resultado = Arrays.asList(mapper.readValue(json, TipoConsultaCredito[].class));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return resultado ;

    }
}
