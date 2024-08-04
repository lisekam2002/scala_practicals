object CalculateSquare{
    def calculateSquare(numbers:List[Int]):List[Int]={
        val squareNumbers=numbers.map(x=>x*x);
        return squareNumbers;
    }

    def main(args:Array[String]):Unit={
        print("Enter how many numbers you want to enter :  ");
        var n=scala.io.StdIn.readInt();
        print("Enter the numbers : ");
        var Numbers=List[Int]();
        for(i<-1 to n){
            var input=scala.io.StdIn.readInt();
            Numbers=Numbers:+input;
        }
        println("Square numbers of the "+Numbers+" are : "+calculateSquare(Numbers));
    }
}