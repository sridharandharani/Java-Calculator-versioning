package com.harman.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Addition addobj = new Addition();
        Subraction subobj = new Subraction();
        Multiply mulobj = new Multiply();
        Divide divobj = new Divide();
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Num 1 :");
        x = input.nextInt();
        System.out.println("Enter the Num 2 :");
        y = input.nextInt();
        int addresult = addobj.add2numbers(x,y);
        System.out.println(addresult);
        int subresult = subobj.sub2numbers(x,y);
        System.out.println(subresult);
        int mulresult = mulobj.multiply2numbers(x,y);
        System.out.println(mulresult);
        int divresult = divobj.divide2numbers(x,y);
        System.out.println(divresult);


    }
}
