package com.train
import java.util.*

fun main() {
//    KtTicket().totalTicket()
        val scanner=Scanner(System.`in`)
        var countAll=0

    while (countAll != -1) {
        print("Please enter number of tickets:")
        countAll = scanner.nextInt()

        if (countAll == -1){
            print("Thanks for buying! Bye!Bye!")
            break
        }

        print("How many round-trip tickets:")
        var countR = scanner.nextInt()

        val k = KtTicket(1000, 2000, countAll, countR)
//        k.totalTicket()
        k.totalPrice()
        k.print()
    }
}

class KtTicket (var onetrip: Int, var roundtrip:Int, var countAll:Int, var countR:Int) {


    fun totalPrice() :Double {
        val totalPrice = ((countAll-countR)*onetrip) + (roundtrip*countR*0.9)
        return totalPrice
    }
    fun print() {
        println("Toatl Tickets:$countAll")
        println("Round-trip:$countR")
        println("Total Price is: $" + totalPrice())
    }


}
