object NumberPatternMatcher{
    def inputMatcher(num:Int):Unit= num match{
        case x if(x<=0)=>println("Negative number/Zero is input");
        case x if(x%2==0)=>println("Even number is given");
        case _=>println("Odd number is given");
    }

    def main(args:Array[String]):Unit={
        print("Input Number>");
        val num=scala.io.StdIn.readInt();
        inputMatcher(num);
    }
}