package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);

        System.out.println("Please enter number of tickets:");
        int countAll = scan.nextInt();

        System.out.println("How many round-trip tickets:");
        int countR=scan.nextInt();

        Ticket T = new Ticket(1000,2000,countAll,countR);

        T.TotalPrice();
        T.print();


    }
}
