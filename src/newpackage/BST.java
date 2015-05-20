
package newpackage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;


public class BST {
    
    private Node root;
    
    private class Node{
            public String key;
            public String value;
            public long n;
            public Node left;
            public Node right;
            public Node(String key, String value, long n){
                    this.key = key;	this.value = value; this.n =n;
            }		
    }

    public  long size(){
            return size(root);
    }

    private long size(Node obj){
            if(obj ==null) return 0;
            return size(obj.left) + size(obj.right)+1;
    }

    /*private long size(Node obj){
            if(obj ==null) return 0;
            return obj.n;
    }*/

    public String get(String key){		
        return get(root, key);
    }    

    private String get(Node obj, String key){
        if (obj==null) return null;
        int q = key.compareTo(obj.key);		
        if (q<0) return get(obj.left, key);
        if(q>0) return get(obj.right, key);
        return obj.value;
    }
    
    public String get2( String key){
        Node pobj = root;
        int cmp;        
        do {
            cmp = key.compareTo(pobj.key);
            if (cmp<0) pobj = pobj.left; 
            else if (cmp>0) pobj = pobj.right; 
            else return pobj.value;
        }while (pobj!=null);        
        return null;
    }

    public void put(String key, String value){
            if (root==null) root = new Node(key, value, 1);
            else put(root, new Node(key, value, 1));
    }

    private void put(Node obj, Node newobj){

        int q = newobj.key.compareTo(obj.key);
        if (q<0) {
                if (obj.left==null) obj.left = newobj;
                else put(obj.left, newobj);				
        }
        if (q>0) {
                if(obj.right==null) obj.right = newobj;
                else put(obj.right, newobj);			
        }		
        obj.n=size(obj.left)+size(obj.right)+1;
    }

    public void delete(String key){
        root = delete(root, key);
    }

    public void delete2(String key){
        Node nd = delete(null, 0, root, key);
        if(nd!=null) root = nd;
    }

    public String min(){
        return null;
    }

    public String max(){
        return null;
    }

    private Node max(Node obj){
        if(obj==null) return null;
        if (obj.right==null) return obj;
        else return max(obj.right);
    }

    private Node min(Node obj){
        if(obj==null) return null;
        if (obj.left==null) return obj;
        else return min(obj.left);
    }

    private Node delete(Node pObj, int pQ, Node obj, String key){

        if (obj!=null) {

                int q = key.compareTo(obj.key);		
                if(q<0)  return delete(obj, q, obj.left, key);
                if(q>0)  return delete(obj, q, obj.right, key);

                Node chlObj;

                if(obj.left!=null){
                        max(obj.left).right = obj.right;
                        chlObj = obj.left;
                }else chlObj = obj.right;

                if (pObj!=null){
                        if (pQ<0) pObj.left = chlObj;
                        else pObj.right = chlObj;

                }else return chlObj;
        }
        return null;

    }

    private Node delete(Node obj, String key){
        
        if(obj==null) return null;
        int cmp = key.compareTo(obj.key);
        if(cmp<0)  obj.left = delete(obj.left, key); 
        else if(cmp>0) obj.right = delete(obj.right, key);
        else{
            if (obj.left==null) return obj.right;
            if (obj.right==null) return obj.left;
            Node mobj = min(obj.right);
            obj.right = delete(obj.right, mobj.key);
            mobj.right = obj.right;
            mobj.left = obj.left;
            return mobj;
        }
        return obj;
    }

    public void print(){
            print(root);
    }

    private void print(Node obj){
        if(obj!=null)
        {
            print(obj.left);
            System.out.println(obj.key);
            print (obj.right);
        }
    }
    
    public void printByLevel(){
        List<List> arrTbl = GetArr();
        ListIterator<List>  itrRow = arrTbl.listIterator();
        ListIterator<Node>  itrCell ;
        while(itrRow.hasNext()){
            itrCell = itrRow.next().listIterator();
            while(itrCell.hasNext()){
                System.out.print(itrCell.next().key+ " ");
            }
            System.out.println();
        }
        
    }
    
    private List<List> GetArr(){
        
        List<List> arrTbl = new ArrayList() ;
        List<Node> arrRow;// = new ArrayList() ;
        List<Node> arrRowPre;
        ListIterator<List>  itr = arrTbl.listIterator();
        //arrTbl.add(new ArrayList<Node>());
        Node obj = root;       
        while(obj!=null){
            if(itr.hasNext())
            {
                arrRow = itr.next();
                arrRow.add(obj);
            }else{                
                arrRow = new ArrayList();   
                arrRow.add(obj);              
                itr.add(arrRow); 
            }     
            if (obj.left!=null)
            {
                obj = obj.left;                
            }else if(obj.right!=null)
            {
                obj = obj.right;                
            }else {      
                do{
                arrRowPre = itr.previous();
                if(arrRow.get(arrRow.size()-1)!=arrRowPre.get(arrRowPre.size()-1).right)
                    obj = arrRowPre.get(arrRowPre.size()-1).right; 
                arrRow = arrRowPre;
                
                }while(itr.hasPrevious() && obj==null);
                itr.next();
            }        
        }
        return arrTbl;
    }
    
    public void Traversal()
    {
        Node curNode;
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        int isEq;
        while (!queue.isEmpty())
        {
            curNode = queue.remove();
            System.out.print(curNode.key+ "");
            if(queue.peek()!=null)
            {
                isEq = curNode.key.compareTo(queue.peek().key );
                if (isEq > 0 || curNode.right==queue.peek()||queue.peek()==null)
                    System.out.println();
            }else if(curNode.left!=null || curNode.left!=null)
                System.out.println();
            
            
            if(curNode.left!=null)
                queue.add(curNode.left);
            if(curNode.right!=null)
                queue.add(curNode.right);           
        }
        
        
    }
    
//    private List<List> GetArr2(){
//        List<List> arrTbl = new ArrayList() ;
//        //List<Node> arrRow;// = new ArrayList() ;
//        ListIterator<List>  itr = arrTbl.listIterator();
//        //arrTbl.add(new ArrayList<Node>());
//        Node obj = root;
//        int i = 0;
//        
//        while(obj!=null){
//            if (obj!=null){
//                arrTbl.add(new ArrayList<Node>());
//                itr.next().add(obj);
//                obj = obj.left;
//            }else
//            {
// 
//     
//            if (obj.left!=null)
//            {
//                obj = obj.left;                
//            }else if(obj.right!=null)
//            {
//                obj = obj.right;                
//            }else {                
//                itr.previous();
//            }        
//        }
//        return null;
//    }
   // private void addNode(ArrayList<ArrayList> a1, ArrayList<Node> a2, Node obj, int n ){
   //    if  
        
   // }

    
//	private Node ceiling(Node obj, String key, int q){
//		if (obj==null) return null;		
//		if (q<0) {
//			if (obj.left==null) return null;	
//			int qChld = key.compareTo(obj.left.key);	
//			if (qChld==0) return obj;
//			else return ceiling(obj.left, key, qChld);
//		}
//		if(q>0){
//			if (obj.right==null) return null;
//			int qChld = key.compareTo(obj.right.key);	
//			if (qChld==0) return obj;
//			else return ceiling(obj.right, key, qChld);
//		}
//		return null;
//		
//	}

}

