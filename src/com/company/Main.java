package com.company;

import java.sql.Array;
import java.util.*;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static List<String> oper = new ArrayList();
    public static ArrayDeque<Integer> number = new ArrayDeque();

    public static Boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void twoArray (){
        String input = scan.nextLine();
        String[] symbols = input.split(" ");
        for(String s : symbols){
            if(isNumeric(s)==true){
                number.addLast(Integer.parseInt(s));
            }else{
                oper.add(s);
            }

        }
    }


    public static void main(String[] args) {
        System.out.println("Введите математическую запись");
        twoArray();
         for(int n : number){
             System.out.print(n);
         }
        for(String n : oper){
            System.out.print(n);
        }

    }
}
