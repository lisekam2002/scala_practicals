object Rational1{
    class Rational1(x:Int, y:Int) {
        def numer = x;
        def denom = y;
        def sub(r: Rational1) =new Rational1(numer * r.denom - r.numer * denom,denom * r.denom);
        override def toString = numer + "/" + denom;
    }

    def main(args:Array[String]):Unit={
        print("Enter the Numerator of the first rational number : ");
        val num1=scala.io.StdIn.readInt();
        print("Enter the Denomerator of the first rational number : ");
        val denom1=scala.io.StdIn.readInt();
        print("Enter the Numerator of the second rational number : ");
        val num2=scala.io.StdIn.readInt();
        print("Enter the Denomerator of the second rational number : ");
        val denom2=scala.io.StdIn.readInt();
        val r1=new Rational1(num1,denom1);
        val r2=new Rational1(num2,denom2);
        println(f"r1 = ${r1}");
        println(f"r2 = ${r2}");
        println("r1 - r2 = "+{r1.sub(r2)});
    }
}