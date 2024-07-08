object StringFormat{

    def toUpper(string:String):String={
        return string.toUpperCase();
    }

    def toLower(string:String):String={
        return string.toLowerCase();
    }

    def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name);

    def main(args:Array[String]):Unit={
        val inputs=List("Benny","Niroshan","Saman","Kumara");
        for(i<- 0 to inputs.length-1){
            if(inputs(i)=="Benny"){
                println(toUpper(inputs(i)));
            }
            else if(inputs(i)=="Niroshan"){
                val(firstTwo,last)=inputs(i).splitAt(2);
                println(toUpper(firstTwo)+toLower(last));
            }
            else if(inputs(i)=="Saman"){
                println(toLower(inputs(i)));
            }
            else if(inputs(i)=="Kumara"){
                val t=inputs(i).last;
                val mid=inputs(i).tail.init;
                println(inputs(i).head+toLower(mid)+toUpper(t.toString()));
            }
        }
    }
}