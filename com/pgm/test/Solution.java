package com.pgm.test;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import com.google.gson.*;

public class Solution {
    /*
     * Complete the function below.
     */
    static int getNumberOfMovies(String substr) throws Exception {
        /*
         * Endpoint: "https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr
         */

         URL url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr);
         HttpURLConnection connection = (HttpURLConnection)url.openConnection();
         connection.setRequestMethod("GET");
         
         BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line = null;
        String response = null;
        int count = 0;
         while ((line = reader.readLine()) != null) {
                System.out.println(line);
                count ++;

             if (line != null) {
                 String format = "\"total\":(\\d*)";
                 Pattern pattern = Pattern.compile(format);
                 Matcher matcher =  pattern.matcher(line);
                 if (matcher.find()) {
                     String str = matcher.group(1);
                     count = Integer.parseInt(str);
                 }
                 response = line;
             }


         }


        return count;
        
    }
    public static void main(String[] args) throws Exception{

        int res;

        
        res = getNumberOfMovies("maze");
        System.out.println(res
        );
    }
}