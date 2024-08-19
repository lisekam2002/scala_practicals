object Formatter{
  val toUpper:String =>String = _.toUpperCase;

  val toLower:String =>String = _.toLowerCase;

  def formatNames(name:String)(formatFunction:String =>String):String = {
    formatFunction(name);
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper));
    println(formatNames("Niroshan")(name => {
      val (first, rest) = name.splitAt(2);
      first.toUpperCase+rest.toLowerCase;
    }));
    println(formatNames("Saman")(toLower));
    println(formatNames("Kumara")(name => {
      val (first, rest) = name.splitAt(name.length - 1);
      first+rest.toUpperCase;
    }));
  }
}
