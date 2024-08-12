object CaesarCipher {

  def encryption(msg: String, key: Int):String = {
    var encryptedText = "";
    for (char <- msg) {
      if (char.isLetter) {
        val offset = if (char.isUpper) 'A' else 'a';
        val encryptedChar = ((char - offset + key) % 26 + offset).toChar;
        encryptedText += encryptedChar;
      } 
      else {
        encryptedText += char;
      }
    }
    return encryptedText;
  }

  def decryption(msg: String, key: Int):String = {
    encryption(msg, 26 - key);
  }

  def cipher(text: String, shift: Int, func: (String, Int) => String): String = {
    func(text, shift);
  }

  def main(args: Array[String]): Unit = {
    println("Enter your choice : \n1.Encryption \n2.Decryption");
    var choice=scala.io.StdIn.readInt();
    if(choice==1){
        println("Enter the text : ");
        var text=scala.io.StdIn.readLine();
        println("Enter the shifts : ");
        var shift=scala.io.StdIn.readInt();
        println("Encrypted text : "+ cipher(text,shift,encryption));
    }
    else if(choice==2){
        println("Enter the text : ");
        var text=scala.io.StdIn.readLine();
        println("Enter the shifts : ");
        var shift=scala.io.StdIn.readInt();
        println("Decrypted text : "+ cipher(text,shift,decryption));
    }
    else{
        println("Invalid Choice");
    }
  }
}
