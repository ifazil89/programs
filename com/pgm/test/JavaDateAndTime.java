package com.pgm.test;

import java.io.*;
        import java.math.*;
        import java.security.*;
import java.sql.Time;
import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

class JavaDateAndTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,month-1);
            calendar.set(Calendar.DATE,day);
            calendar.setTimeZone(TimeZone.getTimeZone("UTC"));

            System.out.println(calendar.getFirstDayOfWeek());
            int dayOfWeek =   calendar.get(Calendar.DAY_OF_WEEK);
            System.out.println(calendar.getTime());
            switch (dayOfWeek) {
                case Calendar.SUNDAY : return "SUNDAY";
                case Calendar.MONDAY : return "MONDAY";
                case Calendar.TUESDAY : return "TUESDAY";
                case Calendar.WEDNESDAY : return "WEDNESDAY";
                case Calendar.THURSDAY : return "THURSDAY";
                case Calendar.FRIDAY : return "FRIDAY";
                case Calendar.SATURDAY : return "SATURDAY";
            }


            return null;
    }


    public static void main_1(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaDateAndTime.findDay(month, day, year);

        System.out.println(res);
        //bufferedWriter.write(res);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();


    }

    public static void main(String[] args) {
            String in = "<h1>Nayeem loves counseling</h1><h2>second content</h2>";
            Pattern p = Pattern.compile("<(\\w+)>(.*)</\\1>");
            Matcher m = p.matcher(in);

            System.out.println(m.find(3));
            while ((m.find())) {
                    System.out.println(m.group(2));


            }
    }
}
