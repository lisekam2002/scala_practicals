object InventoryManagement{

    def getProductList(ProductNames:List[String]):List[String]={
        var item="";
        var products=ProductNames;
        if(ProductNames.length==0){
            println("Product list is empty!");
            println("Enter Products, enter 'done' when you are finished => ");
        }
        else{
            println("Enter Products, enter 'done' when you are finished => ");
        }
        while(item.toLowerCase()!="done"){
            item=scala.io.StdIn.readLine();
            if(item.toLowerCase()!="done")
                products=products:+item;
        }
        products;
    }

    def printProductList(ProductNames:List[String]):Unit={
        println("Product Name"+" "*6+"Position");
        for(i<- 0 to ProductNames.length-1 ){
            println(f"${ProductNames(i)}%-20s${i + 1}");
        }
    }

    def getTotalProducts(ProductNames:List[String]):Int={
        ProductNames.length;
    }

    def main(args:Array[String]):Unit={
        var productList = List[String]();
        var updatedProductList = getProductList(productList);
        printProductList(updatedProductList);
        println(s"Total number of products in the Inventory: ${getTotalProducts(updatedProductList)}");
        var updatedProductList2 = getProductList(updatedProductList);
        printProductList(updatedProductList2);
        println(s"Total number of products in the Inventory: ${getTotalProducts(updatedProductList2)}");

    }
}