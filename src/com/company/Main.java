package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static String input = scan.nextLine();
    public static List<String> oper = new ArrayList();
    public static List<Integer> number = new ArrayList();
    public static String[] symbols = input.split(" ");




    public static Boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println("Введите математическую запись");

    }
}
