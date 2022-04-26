package com.company;

public class RegularExpressions {
    static boolean checkIp(String str) {
        return str.matches("([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])");
    }

    static boolean checkGUID(String str) {
        return str.matches("^[({\\[]?[a-fA-F\\d]{8}-([a-fA-F\\d]{4}-){3}[a-fA-F\\d]{12}[)}\\]]?$");
    }

    static boolean checkURL(String str) {
        return str.matches("((http|https)://)(www.)?"
                + "[a-zA-Z0-9@:%._\\+~#?&//=]"
                + "{2,256}\\.[a-z]"
                + "{2,6}\\b([-a-zA-Z0-9@:%"
                + "._\\+~#?&//=]*)");
    }

    static boolean checkPass(String str) {
        return str.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$");
    }
}
