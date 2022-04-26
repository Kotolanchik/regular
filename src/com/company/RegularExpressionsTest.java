package com.company;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionsTest {

    @org.junit.jupiter.api.Test
    void checkIp() {
        assertAll(
                () -> assertTrue(RegularExpressions.checkIp("0.0.0.0")),
                () -> assertTrue(RegularExpressions.checkIp("255.255.255.255")),
                () -> assertTrue(RegularExpressions.checkIp("127.0.0.1")),
                () -> assertTrue(RegularExpressions.checkIp("1.2.3.4")),
                () -> assertTrue(RegularExpressions.checkIp("1.1.1.1"))
        );

        assertAll(
                () -> assertFalse(RegularExpressions.checkIp("256.256.256.256")),
                () -> assertFalse(RegularExpressions.checkIp("abc.def.gha.bcd")),
                () -> assertFalse(RegularExpressions.checkIp("1300.6.7.8")),
                () -> assertFalse(RegularExpressions.checkIp("ЧО")),
                () -> assertFalse(RegularExpressions.checkIp(""))
        );
    }

    @org.junit.jupiter.api.Test
    void checkGUID() {
        assertAll(
                () -> assertTrue(RegularExpressions.checkGUID("ac556b4a-cfd4-456c-ac35-a74e9f17e3e6")),
                () -> assertTrue(RegularExpressions.checkGUID("ecd3a799-2c4f-4273-9ec4-7d36429743fa")),
                () -> assertTrue(RegularExpressions.checkGUID("b0047e12-b6a4-448d-b87d-cafd9b4f6e28")),
                () -> assertTrue(RegularExpressions.checkGUID("d8aac6d3-7fb3-442d-9e97-0b1c62d32e52")),
                () -> assertTrue(RegularExpressions.checkGUID("00000000-0000-0000-0000-000000000000"))
        );

        assertAll(
                () -> assertFalse(RegularExpressions.checkGUID("Gc556b4a-cfd4-456c-ac35-a74e9f17e3e6")),
                () -> assertFalse(RegularExpressions.checkGUID("b711a2e7-48ad-be7e-f9c32a5b6a45")),
                () -> assertFalse(RegularExpressions.checkGUID("A5cd6caa5-0f9d-402a-9871-3d7c6a558ffc")),
                () -> assertFalse(RegularExpressions.checkGUID("ЧО")),
                () -> assertFalse(RegularExpressions.checkGUID(""))
        );
    }

    @org.junit.jupiter.api.Test
    void checkURL() {
        assertAll(

                () -> assertTrue(RegularExpressions.checkURL("https://example.com:80/path/path/#an")),
                () -> assertTrue(RegularExpressions.checkURL("https://auto.ru/?utm_source=main_stripe_big")),
                () -> assertTrue(RegularExpressions.checkURL("https://e.mail.ru/inbox/")),
                () -> assertTrue(RegularExpressions.checkURL("https://habr.com/ru/post/120101/")),
                () -> assertTrue(RegularExpressions.checkURL("https://www.youtube.com/watch?v=MLCa7QIsQnk&list=PL7ZzXmLk6CYXCsJTwtClt42Xtn4lMDABZ&index=1&t=5s&ab_channel=%D0%94%D0%BC%D0%B8%D1%82%D1%80%D0%B8%D0%B9%D0%A4%D0%B8%D0%BD%D0%B0%D1%88%D0%BA%D0%B8%D0%BD"))

        );

        assertAll(
                () -> assertFalse(RegularExpressions.checkURL("http://yandex-.ru/")),
                () -> assertFalse(RegularExpressions.checkURL("hts:/yandex.ru/")),
                () -> assertFalse(RegularExpressions.checkURL("htt://yan_dex.ru/")),
                () -> assertFalse(RegularExpressions.checkURL("http:/yan dex.ru/")),
                () -> assertFalse(RegularExpressions.checkURL("хттп:/yandex.ru/")),
                () -> assertFalse(RegularExpressions.checkURL("ЧО")),
                () -> assertFalse(RegularExpressions.checkURL(""))
        );
    }

    @org.junit.jupiter.api.Test
    void checkPass() {
        assertAll(
                () -> assertTrue(RegularExpressions.checkPass("jhyetjhjYE65")),
                () -> assertTrue(RegularExpressions.checkPass("MLBkh3546")),
                () -> assertTrue(RegularExpressions.checkPass("sSGsreg2")),
                () -> assertTrue(RegularExpressions.checkPass("LMKOERlN35")),
                () -> assertTrue(RegularExpressions.checkPass("asdjKDADLIAUD2H2HAKD"))
        );

        assertAll(
                () -> assertFalse(RegularExpressions.checkPass("qwerty")),
                () -> assertFalse(RegularExpressions.checkPass("_word_")),
                () -> assertFalse(RegularExpressions.checkPass("aB2adw_")),
                () -> assertFalse(RegularExpressions.checkPass(".............")),
                () -> assertFalse(RegularExpressions.checkPass(""))
        );
    }
}