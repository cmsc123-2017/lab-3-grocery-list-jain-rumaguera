class GroceryListArray implements IGroceryList {
 
  int max = 10;
  GroceryItem items[] = new GroceryItem[max];
  int size = 0;
  
  GroceryListArray() {}
    
  
  public boolean add(GroceryItem item) {
    if (size == max) {
      // create new array with bigger length
      int newMax = max + 10;
      GroceryItem bigger[] = new GroceryItem[newMax];
      // copy items to new array
      // assign new array to items
      
      return false; // don't return instead
    }
    
    int i = indexOf(item.name);
    if (i > -1) {
      items[i].addQuantity(item.quantity);
    } else {    
      items[this.size] = item;
      this.size++;
      
    }
    return true;
  }
  
  // TEMPLATE
  /*  Fields:
        ...this.max...           --int
        ...this.items...         --GroceryItem[]
        ...this.size...          --int
        ...this.itemName...      --String
        ...this.quantity...      --int
     
      Methods:
        ...this.add...               --boolean
        ...this.indexOf...           --int
        ...this.remove...            --boolean
        ...this.markAsBought...      --boolean
        ...this.display...           --void
        ...this.totalQuantity...     --int
   */
  
  // String -> int
  // Given the name of a GroceryItem, returns the
  // corresponding GroceryItem index from the list. If it is not in the list,
  //  returns -1
  int indexOf(String name) {
    for (int i = 0; i < this.size; i++) {
      if (this.items[i].equals(new GroceryItem(name, 0))) {
        return i;
      }
    }
    
    return -1;
  }
  
  // TEMPLATE
  /*  Fields:
        ...this.max...           --int
        ...this.items...         --GroceryItem[]
        ...this.size...          --int
        ...this.itemName...      --String
        ...this.quantity...      --int
     
      Methods:
        ...this.add...               --boolean
        ...this.indexOf...           --int
        ...this.remove...            --boolean
        ...this.markAsBought...      --boolean
        ...this.display...           --void
        ...this.totalQuantity...     --int
   */
  
  //String -> boolean
  //Returns true if this item is removed given its name
  public boolean remove(String name) {
    if(size == 0){
      return false; 
    }
     GroceryItem item = new GroceryItem(name, 0);
     int i = 0;
     boolean itemFound = false;
     for(i = 0; i < this.size; i++){
       if(items[i].name.equals(name)){
          items[i] = items[size - 1];
         return items[i].isFound();
       }
      }
     
     this.size--;
     return itemFound;
  }
  
  // TEMPLATE
  /*  Fields:
        ...this.max...           --int
        ...this.items...         --GroceryItem[]
        ...this.size...          --int
        ...this.itemName...      --String
        ...this.quantity...      --int
     
      Methods:
        ...this.add...               --boolean
        ...this.indexOf...           --int
        ...this.remove...            --boolean
        ...this.markAsBought...      --boolean
        ...this.display...           --void
        ...this.totalQuantity...     --int
   */
  
  //-> int
  // Returns the index of the item given this GroceryItem item.
  int indexOfAgain(GroceryItem item) {
    for (int i = 0; i < this.size; i++) {
      if (item.equals(items[i])) {
        return i;
      }
    }
    
    return -1;
  }
  
  // TEMPLATE
  /*  Fields:
        ...this.max...           --int
        ...this.items...         --GroceryItem[]
        ...this.size...          --int
        ...this.itemName...      --String
        ...this.quantity...      --int
     
      Methods:
        ...this.add...               --boolean
        ...this.indexOf...           --int
        ...this.remove...            --boolean
        ...this.markAsBought...      --boolean
        ...this.display...           --void
        ...this.totalQuantity...     --int
      Methods on GoceryItem item.
        ...item.addQuantity()...        --void
        ...item.toString()...           --String
        ...item.equals...               --boolean
        ...item.bought()...             --boolean
        ...item.isRemove()...           --boolean
        ...item.isFound()...            --boolean
   */
  
  // String -> boolean
  //Determines if an item is bought given its name
  public boolean markAsBought(String name) {
    GroceryItem item = new GroceryItem(name, 1);
    for (int i = 0; i < this.size; i++){
      if(item.equals(items[i])){
        return items[i].bought();
      }
    } 
    return false;
  }
  
  // TEMPLATE
  /*  Fields:
        ...this.max...           --int
        ...this.items...         --GroceryItem[]
        ...this.size...          --int
        ...this.itemName...      --String
        ...this.quantity...      --int
     
      Methods:
        ...this.add...               --boolean
        ...this.indexOf...           --int
        ...this.remove...            --boolean
        ...this.markAsBought...      --boolean
        ...this.display...           --void
        ...this.totalQuantity...     --int
   */
  //->void
  //Displays the array of grocery items.
  public void display() {
    for (int i = 0; i < this.size; i++) {
      System.out.println(items[i]);
    }
  }
  
  // TEMPLATE
  /*  Fields:
        ...this.max...           --int
        ...this.items...         --GroceryItem[]
        ...this.size...          --int
        ...this.itemName...      --String
        ...this.quantity...      --int
     
      Methods:
        ...this.add...               --boolean
        ...this.indexOf...           --int
        ...this.remove...            --boolean
        ...this.markAsBought...      --boolean
        ...this.display...           --void
        ...this.totalQuantity...     --int
   */
  
  // -> int
  // Returns the number of this individual items in the Grocery List
   public int totalQuantity() {
     int total = 0;
     for(int i = 0; i < this.size; i++){
       total += items[i].quantity;
     }   
    return total;
   }
     
  // TEMPLATE
  /*  Fields:
        ...this.max...           --int
        ...this.items...         --GroceryItem[]
        ...this.size...          --int
        ...this.itemName...      --String
        ...this.quantity...      --int
     
      Methods:
        ...this.add...               --boolean
        ...this.indexOf...           --int
        ...this.remove...            --boolean
        ...this.markAsBought...      --boolean
        ...this.display...           --void
        ...this.totalQuantity...     --int
   */   
   
  //String, int, int -> 
  //Checks if item is is the list
  //if the quantity of item is 0, removes it from the list
    void itemQuantityCheck(String name, int itemIndex, int quantity){
      if(quantity < 1){
        remove(name);
     }
   }
  
  // TEMPLATE
  /*  Fields:
        ...this.max...           --int
        ...this.items...         --GroceryItem[]
        ...this.size...          --int
        ...this.itemName...      --String
        ...this.quantity...      --int
     
      Methods:
        ...this.add...               --boolean
        ...this.indexOf...           --int
        ...this.remove...            --boolean
        ...this.markAsBought...      --boolean
        ...this.display...           --void
        ...this.totalQuantity...     --int
   */
    
  //String, int, int -> 
  //Subtracts desired quantity to the original quantity of the item
  void reduceItemQuantity(String name, int quantity, int itemIndex){
     items[itemIndex].quantity = items[itemIndex].quantity - quantity;
     itemQuantityCheck(name, quantity, items[itemIndex].quantity);
   }
  
  // TEMPLATE
  /*  Fields:
        ...this.max...           --int
        ...this.items...         --GroceryItem[]
        ...this.size...          --int
        ...this.itemName...      --String
        ...this.quantity...      --int
     
      Methods:
        ...this.add...               --boolean
        ...this.indexOf...           --int
        ...this.remove...            --boolean
        ...this.markAsBought...      --boolean
        ...this.display...           --void
        ...this.totalQuantity...     --int
   */
  
  //String, int -> boolean
  //Returns true if the item's quantity was sucessfully reduced,
  //else return false
   
  boolean reduceQuantity(String itemName, int quantity){
    int itemIndex = indexOf(itemName);
      if(itemIndex >= 0){
        reduceItemQuantity(itemName, quantity, itemIndex);
          return true;
       }
      else{
          return false;
      }
    }
}
