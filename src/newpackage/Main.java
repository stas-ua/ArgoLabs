
package newpackage;

import newpackage.func.*;



public class Main {
    
   public static void main(String[] args) {

     BST_new <Integer, Student> bstn = new BST_new(); 
     
     bstn.put(4, new Student("Ivan", "Ivanov", 4, 1, true));
     bstn.put(2, new Student("Petr", "Petrov", 2, 1, false));  
     bstn.put(3, new Student("Sidor", "Sidorov", 3, 5, true));  
     bstn.put(1, new Student("Dart", "Vader", 1, 5, true));   
     bstn.put(5, new Student("Roman", "Romanov", 5, 1, false));
     bstn.put(8, new Student("Vasya", "Vasylev", 8, 1, true));
     bstn.put(6, new Student("Vitya", "Viktorov", 6, 1, false));
     bstn.put(7, new Student("Michael", "Michailov", 7, 1, false));
     
     bstn.FuncList.add(new FuncPrint());
     
     System.out.println("\nIn_order");      
     System.out.println("id - Name - LastName - year - isArmy");
     bstn.Traversal(BST_new.TraversalType.In_order);
     
     System.out.println("\nBy_Level");
     System.out.println("Print all st-'s ");
     System.out.println("id - Name - LastName - year - isArmy");
     bstn.Traversal(BST_new.TraversalType.By_level); 
     
     bstn.FuncList.clear();
     bstn.FuncList.add(new FuncPrintIf());
     
     System.out.println(); 
     System.out.println("Print all 5 years and isArmy st-'s "); 
     System.out.println("id - Name - LastName - year - isArmy");
     bstn.Traversal(BST_new.TraversalType.By_level); 
     
     bstn.FuncList.clear();
     bstn.FuncList.add(new FuncDeleteIf());
     
     System.out.println(); 
     System.out.println("Delete all 5 years and isArmy st-'s ");      
     bstn.Traversal(BST_new.TraversalType.By_level);
     
     
     bstn.FuncList.clear();
     bstn.FuncList.add(new FuncPrint());
     
     System.out.println();
     System.out.println("Print all st-'s ");
     System.out.println("id - Name - LastName - year - isArmy");
     bstn.Traversal(BST_new.TraversalType.By_level);       

   }

}
