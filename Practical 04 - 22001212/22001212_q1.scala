object InventoryManagement {

  var itemNames: Array[String] = Array("Sugar", "Rice", "Dhal","Flour");
  var itemQuantities: Array[Int] = Array(20, 55, 30,45);

  def displayInventory(names: Array[String], quantities: Array[Int]): Unit = {
    println("Current Inventory:");
    println("Item Name"+" "*4+"|"+"Quantity");
    for ((name, quantity) <- names zip quantities) {
      println(f"$name%-12s | $quantity");
    }
    println();
  }

  def restockItem(names: Array[String], quantities: Array[Int], itemName: String, quantity: Int): Unit = {
    val i = names.indexOf(itemName);
    if(i != -1){
        quantities(i)+=quantity;
        println(quantity+" of "+itemName+" restocked to the system");
    }
    else{
        println("Item is not found to restock");
    } 
  }

  def sellItem(names: Array[String], quantities: Array[Int], itemName: String, quantity: Int): Unit = {
    val i=names.indexOf(itemName);
    if(i != -1){
        if(quantities(i)>=quantity){
            quantities(i)-=quantity;
            println(quantity+" of "+itemName+" sold");
        }
        else{
            println(itemName+"is not enough to sell");
        }
    }
    else{
        println("Item is not found to sell");
    }
    println();
  }

  def main(args: Array[String]): Unit = {
    displayInventory(itemNames, itemQuantities);
    restockItem(itemNames, itemQuantities, "Flour", 50);
    sellItem(itemNames, itemQuantities, "Sugar", 15);
    displayInventory(itemNames, itemQuantities);
  }
}
