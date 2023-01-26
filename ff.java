
package zee;

  
interface animal {
  void getName(String name);
}

class cat implements animal {

  public void getName(String name) {
    System.out.println("animal: " + name);
  }
}

class Main {
  public static void main(String[] args) {
    cat ca = new cat();
    ca.getName("cat");
  }
}

 
