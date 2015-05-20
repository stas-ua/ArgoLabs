
package newpackage;



public class Main {
    
    public static void main(String[] args) {

        BST bst = new BST();
        System.out.println("размер " + bst.size());
        bst.put("k", "value k");
        bst.put("b", "value b");
        bst.put("a", "value a");
        bst.put("r", "value r");
        bst.put("l", "value l");
        bst.put("m", "value m");
        bst.put("z", "value z");
        bst.put("e", "value e");
        bst.put("f", "value f");
        bst.put("s", "value s");
        bst.put("t", "value t");
        bst.put("d", "value d");
        bst.print();
        System.out.println("размер " + bst.size());
        bst.delete("z");
        System.out.println(" ");
        bst.print();
        System.out.println("размер " + bst.size());
        System.out.println(bst.get("a"));
        System.out.println(bst.get("a"));
         System.out.println(" printByLevel: ");
        bst.printByLevel();
        bst.Traversal();

    }

}
