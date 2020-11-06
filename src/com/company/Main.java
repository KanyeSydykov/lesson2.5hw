package com.company;

import java.rmi.dgc.Lease;

public class Main {

    public static void main(String[] args) {


        Lea <Integer> c = new Lea<>();
        System.out.println("Число 4 и 6  =  "+c.addition(4,6));
        System.out.println("Деление 7 и 1 =  "+c.subtract(7,1));
        System.out.println("Процент = "+c.multiplication(9,5));



    }
}



