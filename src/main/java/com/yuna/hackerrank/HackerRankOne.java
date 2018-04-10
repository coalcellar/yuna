package com.yuna.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 최지혜 on 2018-04-10.
 */
public class HackerRankOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ip = sc.next();
            System.out.println(javaRegex(ip));
        }

    }

    // https://www.hackerrank.com/challenges/java-regex/problem


    //https://regexr.com/
    private static boolean javaRegex(String ipAddr) {
//        String text = "[0-2]{1}";

        Pattern pattern = Pattern.compile("(?:(?:(?:\\d{1,2})|(?:1\\d{2})|(?:2[0-4]\\d)|(?:25[0-5]))\\.){3}(?:(?:\\d{1,2})|(?:1\\d{2})|(?:2[0-4]\\d)|(?:25[0-5]))");
        Matcher matcher = pattern.matcher(ipAddr);

        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
//        return true;

    }

}
