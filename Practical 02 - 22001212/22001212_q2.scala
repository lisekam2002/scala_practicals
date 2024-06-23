object demo{
    def main(args:Array[String]):Unit={
        var a:Int=2;
        var b:Int=3;
        var c:Int=4;
        var d:Int=5;
        var k:Float=4.3f;
        var g:Float=4.0f;
        b-=1;
        var res1= b  * a + c *(d); 
        d -= 1;
        println("- -b * a + c *d - -  =: "+ (res1));
        a+=1;
        println("a++ =: "+ a);
        var res2= (-2 * ( g - k ) + c)
        println("-2 * ( g - k ) +c =: "+ res2)
        println("c=c++ =: "+ c)
        c+=1;
        c+=1;
        c=c*a;
        a+=1;
        println("c=++c*a++ =: "+c);

    }
}