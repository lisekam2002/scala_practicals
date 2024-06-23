object demo{

    def no_of_attendees(ticketPrice:Int):Int ={
        120+ (15-ticketPrice)/5*20;
    }

    def income(ticketPrice:Int):Int={
        no_of_attendees(ticketPrice)*ticketPrice;
    }

    def cost(ticketPrice:Int):Int={
        500 + no_of_attendees(ticketPrice)*3;
    }

    def profit(ticketPrice:Int):Int= income(ticketPrice)-cost(ticketPrice);

    def main(args:Array[String]):Unit={
        println("Profit when the ticket price is Rs.10 =: "+ profit(10));
        println("Profit when the ticket price is Rs.15 =: "+ profit(15));
        println("Profit when the ticket price is Rs.20 =: "+ profit(20));
    }
}