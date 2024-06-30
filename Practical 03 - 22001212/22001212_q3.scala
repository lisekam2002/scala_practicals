def arithmeticMean(num1:Int,num2:Int):Float={
    val average = (num1 + num2) / 2;
    f"$average%.2f".toFloat;
}

object Demo2{
    def main(args:Array[String]):Unit={
        var n1=15;
        var n2=17;
        print("Arithmetic Mean of "+n1+ " and "+n2+ " = "+arithmeticMean(n1,n2));
    }
}