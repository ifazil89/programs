package com.pgm.test;

import java.io.*;
        import java.math.*;
        import java.text.*;
        import java.util.*;
        import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

            String convertedString = null;
            if (s.endsWith("AM")) {

                    String[] times = s.replaceAll("AM","").split(":");
                    if ("12".equalsIgnoreCase(times[0])) {
                            convertedString = "00";
                    }else {
                            convertedString = times[0];
                    }
                    convertedString += ":" + times[1]+":"+times[2];
            } else {
                    String[] times = s.replaceAll("PM","").split(":");
                    if ("12".equalsIgnoreCase(times[0])) {
                        convertedString = "12";
                    }else {
                        convertedString = String.valueOf(Integer.parseInt(times[0])+12);
                    }
                    convertedString += ":" + times[1]+":"+times[2];
            }
            return convertedString;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
       /* bw.write(result);
        bw.newLine();

        bw.close();*/
    }
}
