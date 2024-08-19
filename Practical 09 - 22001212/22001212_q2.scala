object patternMatcher{

    val numberMatcher:Int=>String=number=>number match{
        case n if(n<=0)=>"Negative/Zero is input";
        case n if(n%2==0)=>"Even number is given";
        case _ =>"Odd number is given";
    }

    def main(args:Array[String]):Unit={
        if(args.length>0){
            val num=args(0).toInt;
            println(numberMatcher(num));
        }
        else{
            println("\nPlease provide an integer input as an argument.");
        }
    }
}