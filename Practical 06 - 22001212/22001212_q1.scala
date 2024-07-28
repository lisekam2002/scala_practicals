object InventoryManagement{
    case class Product(name:String,quantity:Int,unitPrice:Double);

    var Inventory1:Map[Int, Product] = Map(
        1001->Product("Plastic Cup",150,100),
        1002->Product("Plastic Chair",300,4000),
        1003->Product("Spoon",400,500),
        1004->Product("Plastic Table",200,7000)
    )

    var Inventory2:Map[Int, Product] = Map(
        1003->Product("Spoon",500,450),
        1004->Product("Plastic Table",400,8000),
        1005->Product("Glass decoration",200,5000)
    )

    def getAllProducts(inventory:Map[Int,Product]):Unit={
        if(inventory.isEmpty){
            isInventoryEmpty(inventory);
        }
        else{
            println("Product ID"+" "*5+"Product Name");
            inventory.foreach{case (id,product)=>
                println(f"${id}%-15s${product.name}");    
            }
        }
    }

    def calculateTotalValue(inventory:Map[Int,Product]):Unit={
        println("\nProduct ID"+" "*5+"Product Name"+" "*5+"Quantity"+" "*5+"Unit Price"+" "*5+"Total Value");
        inventory.foreach{case(id,product)=>
            println(f"${id}%-15s${product.name}%-20s${product.quantity}%-10s${product.unitPrice}%-15.2f${product.quantity*product.unitPrice}%.2f");
        }
        var totalValue=inventory.values.map(product=>product.quantity*product.unitPrice).sum;
        println("\nTotal value of the products in the inventory : %.2f".format(totalValue));
    }

    def isInventoryEmpty(inventory:Map[Int,Product]):Unit={
        if(inventory.isEmpty){
            println("Inventory is Empty!!!");
        }
        else{
            println("Inventory is not Empty!!!"); 
        }
    }

    def mergeInventory(inventory1:Map[Int,Product],inventory2:Map[Int,Product]):Map[Int,Product]={
        inventory2.foldLeft(inventory1) { case (acc, (id, product2)) =>
            acc.get(id) match {
                case Some(product1) =>
                    acc.updated(id, Product(product1.name, product1.quantity + product2.quantity, math.max(product1.unitPrice, product2.unitPrice)));
                case None =>
                    acc + (id -> product2);
            }
        }
    }

    def checkProductById(inventory: Map[Int, Product]):Unit = {
        print("Enter the Product ID to check:");
        var id=scala.io.StdIn.readInt();
        inventory.get(id) match {
            case Some(product) => println(s"Product ID:$id\nProduct Name:${product.name}\nProduct Quantity:${product.quantity}\nUnit Price:${product.unitPrice}")
            case None => println(s"Product with ID $id does not exist.")
        }
    }

    def main(Args:Array[String]):Unit={
        getAllProducts(Inventory1); //(I)
        calculateTotalValue(Inventory1); //(II)
        isInventoryEmpty(Inventory1);//(III)
        var updatedInventory=mergeInventory(Inventory1,Inventory2);//(IV)
        println("\nMerged Inventory: ")
        calculateTotalValue(updatedInventory);
        checkProductById(Inventory1);//(V)
    }
}