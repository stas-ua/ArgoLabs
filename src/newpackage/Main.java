
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
       
//        BST bst = new BST();
//        System.out.println("размер " + bst.size());
//        bst.put("k", "value k");
//        bst.put("b", "value b");
//        bst.put("a", "value a");
//        bst.put("r", "value r");
//        bst.put("l", "value l");
//        bst.put("m", "value m");
//        bst.put("z", "value z");
//        bst.put("e", "value e");
//        bst.put("f", "value f");
//        bst.put("s", "value s");
//        bst.put("t", "value t");
//        bst.put("d", "value d");
//        System.out.println("bst.print(1)");
//        bst.print(1);
//        System.out.println("bst.print(2)");
//        bst.print(2);
//        System.out.println("bst.print(3)");
//        bst.print(3);
//        System.out.println("размер " + bst.size());
//        bst.delete("z");
//        System.out.println(" ");
//        bst.print(1);
//        System.out.println("размер " + bst.size());
//        System.out.println(bst.get("a"));
//        System.out.println(bst.get("a"));
//         System.out.println(" printByLevel: ");
//        bst.printByLevel();
//        System.out.println(" printByLevel2: ");
//        bst.Traversal();
//        
//        
//
   }

}
