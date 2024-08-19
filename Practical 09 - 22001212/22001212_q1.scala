object interestCalculate{

    val InterestCalculate:Double=>Double=deposit=>deposit match {
        case d if(d<=20000)=>d*2/100;
        case d if(d<=200000)=>d*4/100;
        case d if(d<=2000000)=>d*3.5/100;
        case d if(d>2000000)=>d*6.5/100;
    }

    def main(args:Array[String]):Unit={
        printf("\nEnter the deposit amount = ");
        val amount=scala.io.StdIn.readDouble();
        val interest=InterestCalculate(amount);
        println(f"\nInterest for $amount is $interest");
    }
}