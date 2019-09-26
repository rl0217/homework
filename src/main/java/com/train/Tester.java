package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int countAll=0;

        while (countAll !=-1) {
            System.out.println("Please enter number of tickets:");
            countAll = scan.nextInt();
            if (countAll == -1) {
                break;
            };

            System.out.println("How many round-trip tickets:");
            int countR = scan.nextInt();

            Ticket T = new Ticket(1000, 2000, countAll, countR);

            T.TotalPrice();
            T.print();
        }
//            System.out.println("Do you want to buy more tickets?");
//            int answer=scan.nextInt();

    }
}
