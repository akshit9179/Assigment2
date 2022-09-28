package Oops;
abstract class Food {
 
  public abstract void italian();
 
  public void chinese() {
    System.out.println("this is chinese food");
  }
}


class Fruit extends Food {
  public void italian() {
   
    System.out.println("this is italian food");
  }
}

class Question1 {
  public static void main(String[] args) {
    Fruit myFood = new Fruit();
    myFood.italian();
    myFood.chinese();
  }
}
