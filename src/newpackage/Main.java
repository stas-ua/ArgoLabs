
package newpackage;



public class Main {
    
   public static void main(String[] args) {

     BST_new <Integer, Student> bstn = new BST_new(); 
     
     bstn.put(4, new Student("Ivan", "Ivanov", 4, 1, true));
     bstn.put(2, new Student("Ivan", "Ivanov", 2, 1, false));  
     bstn.put(3, new Student("Ivan", "Ivanov", 3, 1, true));  
     bstn.put(1, new Student("Ivan", "Ivanov", 1, 1, true));   
     bstn.put(5, new Student("Ivan", "Ivanov", 5, 1, false));
     bstn.put(8, new Student("Ivan", "Ivanov", 8, 1, true));
     bstn.put(6, new Student("Ivan", "Ivanov", 6, 1, false));
     bstn.put(7, new Student("Ivan", "Ivanov", 7, 1, false));
     
     System.out.println("In_order");
     System.out.println("id - Name - LastName - year - isArmy");
     bstn.Traversal(BST_new.TraversalType.In_order);
     
     System.out.println("By_Level");
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
