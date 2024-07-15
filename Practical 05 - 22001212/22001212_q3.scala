object Fibonacci{
    def fibonacci(num:Int):Int=num match{
        case 0=>0;
        case 1=>1;
        case x=>fibonacci(x-1)+fibonacci(x-2);
    }

    def fibonacciSequence(num:Int):Unit={
        for(i<-0 to num-1){
            var result=fibonacci(i);
            print(result+", ");
        }
    }
    
    def main(args:Array[String]):Unit={
        print("Enter a number to get Fibonacci numbers = ");
        var num=scala.io.StdIn.readInt();
        println(f"first ${num} Fibonacci numbers for number ${num} = ");
        fibonacciSequence(num);
    }
}