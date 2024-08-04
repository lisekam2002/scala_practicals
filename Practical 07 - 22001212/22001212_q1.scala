object FirstEvenNumbers{

    def firstEvenNumbers(numbers:List[Int]):List[Int]={
        val evenNumbers=numbers.filter(x=>x%2==0);
        return evenNumbers;
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
        println("Even numbers in the "+firstEvenNumbers(Numbers));
    }
}