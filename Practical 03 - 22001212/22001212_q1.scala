def reverseString(string:String):String={
    if(string.isEmpty()){
        return " ";
    }
    else{
        reverseString(string.tail)+string.head;
    }
 }

object demo{
    def main(args:Array[String]):Unit={
        print(reverseString("Welcome"));
    }
}