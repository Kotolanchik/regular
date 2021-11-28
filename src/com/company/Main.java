package com.company;
import java.lang.String;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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

    static boolean checkIp(String str){

        if(str.matches("([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                             "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                             "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                             "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])" ))
            return true;
        else
            return false;
    }
    static boolean checkGUID(String str){

        if(str.matches("[A-Fa-f0-9]{8}\\-[A-Fa-f0-9]{4}\\-[A-Fa-f0-9]{4}\\-[A-Fa-f0-9]{4}\\-[A-Fa-f0-9]{12}"))
            return true;
        else
            return false;
    }
    static boolean checkURL(String str){

        if(str.matches("^(http:\\/\\/|https:\\/\\/|http:\\/\\/www\\.|https:\\/\\/www\\.)?[a-z0-9][a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$"))
            return true;
        else
            return false;
    }
    static boolean checkPass(String str){

        if(str.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$"))
            return true;
        else
            return false;
    }

}

