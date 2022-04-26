package com.company;

import java.lang.String;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static com.company.RegularExpressions.*;

public class Main {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        str = str.trim();
        System.out.println(checkGUID(str));
        System.out.println(checkIp(str));
        System.out.println(checkURL(str));
        System.out.println(checkPass(str));
    }


}

