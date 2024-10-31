package softear;

import java.io.*;
import java.util.*;
public class MerryChristmas {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuffer sb = new StringBuffer();

        sb.append("##  ##     ##     #####    #####    ##  ##            ##  ##            ##   ##    ##      ####\n" +
                "##  ##    ####    ##  ##   ##  ##   ##  ##            ##  ##            ### ###   ####    ##  ##\n" +
                "##  ##   ##  ##   ##  ##   ##  ##   ##  ##             ####             #######  ##  ##   ##\n" +
                "######   ######   #####    #####     ####               ##     ######   ## # ##  ######    ####\n" +
                "##  ##   ##  ##   ##       ##         ##               ####             ##   ##  ##  ##       ##\n" +
                "##  ##   ##  ##   ##       ##         ##              ##  ##            ##   ##  ##  ##   ##  ##\n" +
                "##  ##   ##  ##   ##       ##         ##              ##  ##            ##   ##  ##  ##    ####");


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }


}
