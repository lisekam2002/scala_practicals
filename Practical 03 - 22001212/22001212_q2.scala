def filterList(stringList:List[String]):List[String]={
    var afterList=List[String]();
    for(str<-stringList){
        if(str.length()>5){
            afterList=afterList:+str;
        }
    }
    return afterList;
}

object Demo2{ 
    def main(args:Array[String]):Unit={
        val list1= List ("Football","Cricket","Elle","Golf","Netball");
        println("The initial list : "+list1);
        println("The strings that have a length greater than 5 : "+  filterList(list1));
    }
}