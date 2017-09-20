import junit.framework.TestCase;

public class GroceryListTest extends TestCase {
  public static void main (String[] args){}
  public void testIndexOf() {
    GroceryListArray newList = new GroceryListArray();
    
    
    GroceryItem soap = new GroceryItem("Soap", 3);
    GroceryItem shampoo = new GroceryItem("Shampoo", 5);
    GroceryItem toothpaste = new GroceryItem("Colgate", 2);
    GroceryItem conditioner = new GroceryItem("Conditioner", 10);
    GroceryItem earphones = new GroceryItem("Earphones", 5);
    GroceryItem mouse = new GroceryItem("Mouse", 1);
    GroceryItem laptop = new GroceryItem("Laptop", 6);
    
    
    newList.add(soap);
    newList.add(shampoo);
    newList.add(conditioner);
    newList.add(mouse);
    
    assertEquals(3, newList.indexOf("Mouse"));
    assertEquals(0, newList.indexOf("Soap"));             
    assertEquals(1, newList.indexOf("Shampoo"));
    assertEquals(2, newList.indexOf("Conditioner"));
    
    assertEquals(-1, newList.indexOf("Colgate"));             
    assertEquals(-1, newList.indexOf("Laptop"));             
    assertEquals(-1, newList.indexOf("Earphones"));
            
  }
  
  public void testMarkAsBought(){
    
    GroceryListArray newList = new GroceryListArray();
    
    
    GroceryItem soap = new GroceryItem("Soap", 3);
    GroceryItem shampoo = new GroceryItem("Shampoo", 5);
    GroceryItem toothpaste = new GroceryItem("Colgate", 2);
    GroceryItem conditioner = new GroceryItem("Conditioner", 10);
    GroceryItem earphones = new GroceryItem("Earphones", 5);
    GroceryItem mouse = new GroceryItem("Mouse", 1);
    GroceryItem laptop = new GroceryItem("Laptop", 6);
    
    
    newList.add(soap);
    newList.add(shampoo);
    newList.add(conditioner);
    newList.add(mouse);
    
    assertEquals(true, newList.markAsBought("Soap"));
    assertEquals(true, newList.markAsBought("Shampoo"));
    assertEquals(true, newList.markAsBought("Conditioner"));
    assertEquals(true, newList.markAsBought("Mouse"));
    
    
    assertEquals(false, newList.markAsBought("Colgate"));
    assertEquals(false, newList.markAsBought("Laptop"));
    assertEquals(false, newList.markAsBought("Earphones"));  
  }
  
  public void testRemove(){
  
   GroceryListArray newList = new GroceryListArray();
    
    
    GroceryItem soap = new GroceryItem("Soap", 3);
    GroceryItem shampoo = new GroceryItem("Shampoo", 5);
    GroceryItem toothpaste = new GroceryItem("Colgate", 2);
    GroceryItem conditioner = new GroceryItem("Conditioner", 10);
    GroceryItem earphones = new GroceryItem("Earphones", 5);
    GroceryItem mouse = new GroceryItem("Mouse", 1);
    GroceryItem laptop = new GroceryItem("Laptop", 6);
  
        
    newList.add(soap);
    newList.add(shampoo);
    newList.add(conditioner);
    newList.add(mouse);
    
    System.out.print(newList);
    
  
    assertTrue(newList.remove(soap.name));
    assertTrue(newList.remove(shampoo.name));
    assertTrue(newList.remove(conditioner.name));
    
//    assertEquals(true, newList.remove("Shampoo"));
//    assertEquals(true, newList.remove("Conditioner"));
//    assertEquals(false, newList.remove("Mouse"));
  }
  
  public void testtotalQuantity(){
  
    GroceryListArray newList = new GroceryListArray();
    
    
    GroceryItem soap = new GroceryItem("Soap", 3);
    GroceryItem shampoo = new GroceryItem("Shampoo", 5);
    GroceryItem toothpaste = new GroceryItem("Colgate", 2);
    GroceryItem conditioner = new GroceryItem("Conditioner", 10);
    GroceryItem earphones = new GroceryItem("Earphones", 5);
    GroceryItem mouse = new GroceryItem("Mouse", 1);
    GroceryItem laptop = new GroceryItem("Laptop", 6);
  
        
    newList.add(soap);
    newList.add(shampoo);
    newList.add(conditioner);
    newList.add(mouse);
    newList.add(earphones);
    
    assertEquals(newList.totalQuantity(), 24);
  
  }
  
  public void testItemQuantityCheck(){
    
    GroceryListArray newList = new GroceryListArray();
    
    GroceryItem soap = new GroceryItem("Soap", 3);
    GroceryItem shampoo = new GroceryItem("Shampoo", 5);
    GroceryItem toothpaste = new GroceryItem("Colgate", 2);
    GroceryItem conditioner = new GroceryItem("Conditioner", 10);
    GroceryItem earphones = new GroceryItem("Earphones", 5);
    GroceryItem mouse = new GroceryItem("Mouse", 1);
    GroceryItem laptop = new GroceryItem("Laptop", 6);
  
    
    newList.add(soap);
    newList.add(shampoo);
    newList.add(conditioner);
    
    newList.itemQuantityCheck("Soap", 3, 0);
    assertEquals(newList.size, 3);
    newList.itemQuantityCheck("Conditioner", 10, 3);
    assertEquals(newList.size, 3);
  }
  
  public void testReduceItemQuantity(){
  
   GroceryListArray newList = new GroceryListArray();
    
    GroceryItem soap = new GroceryItem("Soap", 3);
    GroceryItem shampoo = new GroceryItem("Shampoo", 5);
    GroceryItem toothpaste = new GroceryItem("Colgate", 2);
    GroceryItem conditioner = new GroceryItem("Conditioner", 10);
    GroceryItem earphones = new GroceryItem("Earphones", 5);
    GroceryItem mouse = new GroceryItem("Mouse", 1);
    GroceryItem laptop = new GroceryItem("Laptop", 6);
  
    
    newList.add(soap);
    newList.add(shampoo);
    newList.add(conditioner);
  
    newList.reduceItemQuantity("Soap", 0, 0);
    assertEquals(soap.quantity, 3);
    newList.reduceItemQuantity("Shampoo", 1, 1);
    assertEquals(shampoo.quantity, 4);
    newList.reduceItemQuantity("Conditioner", 10, 2);
    assertEquals(conditioner.quantity, 0);
    
  
  }
  
  public void testReduceQuantity(){
  
  GroceryListArray newList = new GroceryListArray();
    
    GroceryItem soap = new GroceryItem("Soap", 3);
    GroceryItem shampoo = new GroceryItem("Shampoo", 5);
    GroceryItem toothpaste = new GroceryItem("Colgate", 2);
    GroceryItem conditioner = new GroceryItem("Conditioner", 10);
    GroceryItem earphones = new GroceryItem("Earphones", 5);
    GroceryItem mouse = new GroceryItem("Mouse", 1);
    GroceryItem laptop = new GroceryItem("Laptop", 6);
  
    
    newList.add(soap);
    newList.add(shampoo);
    newList.add(conditioner);
    newList.add(laptop);
    newList.add(mouse);
    newList.add(earphones);
    
    assertEquals(newList.reduceQuantity("Soap", 1), true);
    assertEquals(newList.reduceQuantity("Laptop", 3), true);
    assertEquals(newList.reduceQuantity("Earphones", 1), true);
    assertEquals(newList.reduceQuantity("Mouse", 1), true);
    assertEquals(newList.reduceQuantity("Conditioner", 0), true);
    
    assertEquals(soap.quantity, 2);
    assertEquals(laptop.quantity, 3);
    assertEquals(earphones.quantity, 4);
    assertEquals(mouse.quantity, 0);
    assertEquals(conditioner.quantity, 10);
    
  
  } 
}
