object Categorizer{

  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      println("Please provide an integer input.\n");
    }

    val input = args(0).toInt;

    val multipleOfThree: Int => Boolean = _ % 3 == 0;
    val multipleOfFive: Int => Boolean = _ % 5 == 0;

    val result = (multipleOfThree(input), multipleOfFive(input)) match {
      case (true, true)   => "Multiple of Both Three and Five";
      case (true, false)  => "Multiple of Three";
      case (false, true)  => "Multiple of Five";
      case (false, false) => "Not a Multiple of Three or Five";
    }

    println(f"$result\n");
  }
}
