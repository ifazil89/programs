package com.pgm.test;


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class TagContentExtractor_String{

    static String getPlainString(String line, boolean found) {

        Pattern p = Pattern.compile("<([\\w\\s]+)>(.*)</\\1>");
        Matcher m = p.matcher(line);

        System.out.println(line);
        boolean isFound = false;
        StringJoiner outLine = new StringJoiner(" ");
        StringBuffer buffer = new StringBuffer();
        while(m.find()) {
            outLine.add(m.group(2));
            isFound = true;
        }

        if (isFound) {
            return getPlainString(outLine.toString() , true);
        } else {
                if (found) {
                        Pattern p1 = Pattern.compile("(<[\\w\\s]+>)");
                        Matcher m1 = p1.matcher(line);
                        if (m1.find()) {
                                return null;
                        }
                        return line;

                }else {
                        return null;
                }
        }

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<String> inputList = new ArrayList<>();
        while(testCases>0){
            String line = in.nextLine();
            inputList.add(line);
            //Write your code here
            testCases--;
        }

        inputList.stream().forEach( s -> {
                String outStr = getPlainString(s,false);
                if (outStr == null) {
                        System.out.println("None");
                } else {
                    System.out.println(outStr);
                }
        });


    }
}



//qqoNVOmJDG@6IBDZoEmk9337LswEL&TQnLCuR`04XD%1t{G)Jmi_iNEXKwp&<iBKMbDGtF4v@coLsF1_LqgTJ3cSp& 3a~I&Q(j0h_w~Vk(oBZCL#vhYY9%c><wkjkTvAuA8Zk}n_l7Si"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>bMUGux)5n7L={M}e^`0xlSm5ce}ehiE}CJ6y0KPd~~B~ak5$PTdPGv}QnXpw6n9V8wVCVaTRTgLKkeF</wkjkTvAuA8Zk}n_l7Si"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>haZQKlWPxlRqXXkKHo=FDofc6$_S-GWA&m0zT*D~uorf_nAF^ym*U&6hGAI)s<XshvNhnnNbeVDuxRcQAgTpWZ-kqIps-@@}Uwq0J3Z06Y5mZgB9><FbTSC#F104{py9Xl6s{yi-R~}k5Fv4i1kCgmBY7P=vVj-j48xUg8x9BCxl~Y><lyxRRMqnMBGj1_d7Qqh5Ebn7 aMb{Q0Dm){9~I0DTS8BZ7+bui~)rQ"2Yb4f>EeZWvJvHIk</XshvNhnnNbeVDuxRcQAgTpWZ-kqIps-@@}Uwq0J3Z06Y5mZgB9><BkkZV631Pnj}#%TWhZn@Y><kXjDpTvLA^tnXYb`h+cA J2