package prc1_22001212

object demo {
  def main(args:Array[String]): Unit = {
    //01
    def area(r:Double):Double={
      return r*r*scala.math.Pi;
    }
    println("Area of the disk with the radius 5 : "+ area(5));

    //02
    def tempInFahrenheit(c:Double):Double={
      return c*1.8000+32.00;
    }
    println("35 celcius in to fahrenheit : "+ tempInFahrenheit(35));

    //03
    def volume(r:Double):Double={
      return (4*scala.math.Pi*r*r*r)/3;
    }
    println("The volume of a sphere with radius 5 : "+ volume(5));

    //04
    def wholeSaleCost(copies:Int):Double={
      var coverPrice=24.95*copies;
      var discountPrice= coverPrice-(coverPrice*40/100);
      var shippingCost=0.0;
      if(copies<50){
        shippingCost=copies*3;
      }
      else{
        shippingCost=50*3+(copies-50)*0.75
      }   
      return discountPrice+shippingCost;
    }
    println("Whole sale cost for 60 copies : "+ wholeSaleCost(60));

    //05
    def runningTime(easyPace:Int,tempo:Int):Double={
      return (2*easyPace)+(3*tempo)+(2*easyPace);
    }
    println("Total running time : "+ runningTime(8,7) + "minutes");
  }
}
