object Rational{
  class Rational(n:Int, d:Int) {
    require(d != 0, "Denominator cannot be zero");

    val numer: Int = if (d < 0) -n else n;
    val denom: Int = d.abs;

    def neg: Rational = new Rational(-numer, denom);

    override def toString: String = numer+"/"+denom;
  }

  def main(args:Array[String]):Unit={
      print("Enter a value for Numerator :");
      val num=scala.io.StdIn.readInt();
      print("Enter a value for Denominator :");
      val denom=scala.io.StdIn.readInt();
      val x = new Rational(num, denom);
      println(s"x : $x");
      println(s"Negation of x : ${x.neg}");
  }
}