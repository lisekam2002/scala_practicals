object LetterCount{
  def countLetterOccurrences(words:List[String]):Int={
    val wordLengths = words.map(_.length);

    val totalLetters = wordLengths.reduce(_ + _);

    return totalLetters;
  }

  def main(args:Array[String]):Unit={
    val words = List("apple", "banana", "cherry", "date");
    println("Word list : ");
    words.foreach(println);
    val totalCount = countLetterOccurrences(words);
    println(s"\nTotal count of letter occurrences: $totalCount");
  }
}
