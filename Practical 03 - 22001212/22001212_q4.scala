def sumOfEven(numbers:List[Int]):Int={
    var sum=0;
    for(i<-numbers){
        if(i%2==0){
            sum=sum+i;
        }
    }
    return sum;
}

object Demo3{
    def main(args:Array[String]):Unit={
        val list2=List(15,22,27,30,48,71);
        println("Numbers in the list = "+list2);
        println("The sum of all the even numbers in the list = "+sumOfEven(list2));
    }
}