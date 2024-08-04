object FilterPrime{
    def filterPrime(numbers:List[Int]):List[Int]={
        numbers.filter(isPrime);
    }

    def isPrime(n:Int):Boolean= n match{
        case x if(x<=1)=>false;
        case x if(x==2)=>true;
        case x if(x % 2 == 0) =>false;
        case _ => !(3 to Math.sqrt(n).toInt by 2).exists(i => n % i == 0);
    }

    def main(args:Array[String]):Unit={
        println("Enter how many numbers that you want to enter:");
        var n=scala.io.StdIn.readInt();
        println("Enter the numbers:");
        var Numbers=List[Int]();
        for(i<-1 to n){
            var input=scala.io.StdIn.readInt();
            Numbers=Numbers:+input;
        }
        println("Prime numbers in the "+filterPrime(Numbers));
    }
}