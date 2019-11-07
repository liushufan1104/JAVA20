package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        phone phone = new phone(1,"華夏","hcd636","1997","$1000");
        phone phone1 = new phone(2,"下流","6g41sd","2015","$3799");
        phone phone2 = new phone(3,"上流","a874s63","2022","$29998");
        phone phone3 = new phone(4,"笨蛋才用手機","a9603","3000","$99999999");
        phone phone4 = new phone(5,"手機","f666307","2000","$1000");
        phone.alldetailedprint();
        phone1.alldetailedprint();
        phone2.alldetailedprint();
        phone3.alldetailedprint();
        phone4.alldetailedprint();
    }
}