package com.train;

public class Ticket {

    int oneticket;
    int roundticket;
    int countAll;
    int countR;


    public Ticket(int oneticket, int roundticket, int countAll, int countR) {
        this.oneticket = oneticket;
        this.roundticket = roundticket;
        this.countAll = countAll;
        this.countR = countR;
    }

    public void print(){
        System.out.println("Toatl Tickets:" + countAll);
        System.out.println("Round-trip:" + countR);
        System.out.println("Total Price is: $" + TotalPrice());
    };




    public float TotalPrice() {

        float TotalPrice = ((countAll-countR)*oneticket) + (roundticket *countR * 0.9f );
        return TotalPrice;
    }

}
