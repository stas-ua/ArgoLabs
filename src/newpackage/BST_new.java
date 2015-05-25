/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;
import newpackage.func.ISpecialFunc;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public  class BST_new <T1 extends Comparable<T1>, T2>  {
        
    private Node<T1, T2> root;
    
    public List<ISpecialFunc<BST_new, T2>> FuncList = new LinkedList(); 
    
    private class Node<T1, T2> {
            public T1 key;
            public T2 value;
            public long n;
            public Node<T1, T2>  left;
            public Node<T1, T2>  right;
            public Node(T1 key, T2 value, long n){
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

    public T2 getR(T1 key){		
        return getR(root, key);
    }    

    private T2 getR(Node<T1, T2>  obj, T1 key){
        if (obj==null) return null;
        int q = key.compareTo(obj.key);		
        if (q<0) return getR(obj.left, key);
        if(q>0) return getR(obj.right, key);
        return  obj.value;
    }
    
    public T2 getC( T1 key){
        Node<T1, T2>  pobj = root;
        int cmp;        
        do {
            cmp = key.compareTo(pobj.key);
            if (cmp<0) pobj = pobj.left; 
            else if (cmp>0) pobj = pobj.right; 
            else return pobj.value;
        }while (pobj!=null);        
        return null;
    }

    public void put(T1 key, T2 value){
            if (root==null) root = new Node(key, value, 1);
            else put(root, new Node(key, value, 1));
    }

    private void put(Node<T1, T2>  obj, Node <T1, T2> newobj){

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

    public void delete(T1 key){
        root = delete(root, key);
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

    private Node delete(Node<T1, T2>  obj, T1 key){
        
        if(obj==null) return null;
        int cmp = key.compareTo(obj.key);
        if(cmp<0)  obj.left = delete(obj.left, key); 
        else if(cmp>0) obj.right = delete(obj.right, key);
        else{
            if (obj.left==null) return obj.right;
            if (obj.right==null) return obj.left;
            Node<T1, T2>  mobj = min(obj.right);
            obj.right = delete(obj.right, mobj.key);
            mobj.right = obj.right;
            mobj.left = obj.left;
            return mobj;
        }
        return obj;
    }
    
    public enum TraversalType { Pre_order, In_order, Post_order, By_level };
    
    public void Traversal (TraversalType t){
        switch (t){
                case Pre_order:
                    TraversalPre(root); 
                    break;
                    
                case In_order:
                    TraversalIn(root); 
                    break;
                    
                case Post_order:
                    TraversalPost(root); 
                    break;
                    
                case By_level:
                TraversalByLevel(); 
                break;
        }
    }

    private void TraversalIn(Node<T1, T2> obj){
        if(obj!=null)
        {
            TraversalIn(obj.left);
            for(ISpecialFunc f : FuncList){
                f.SpecFunc(this, obj.value);
            }           
            TraversalIn (obj.right);
        }
    }
    
    private void TraversalPre(Node<T1, T2> obj){
        if(obj!=null)
        {
            for(ISpecialFunc f : FuncList){
                f.SpecFunc(this, obj.value);
            } 
            TraversalPre(obj.left);            
            TraversalPre (obj.right);
        }
    }
    private void TraversalPost(Node<T1, T2> obj){
        if(obj!=null)
        {            
            TraversalPost(obj.left);            
            TraversalPost (obj.right);
            for(ISpecialFunc f : FuncList){
                f.SpecFunc(this, obj.value);
            } 
        }
    }
     
    private void TraversalByLevel()
    {
        Node<T1, T2> curNode;
        Queue<Node<T1, T2>> queue = new LinkedList();
        queue.add(root);
//        int isEq;
        while (!queue.isEmpty())
        {
            curNode = queue.remove();
            for(ISpecialFunc f : FuncList){
               f.SpecFunc(this, curNode.value);
            } 
//            if(queue.peek()!=null)
//            {
//                isEq = curNode.key.compareTo(queue.peek().key );
//                if (isEq > 0 || curNode.right==queue.peek()||queue.peek()==null)
//                    System.out.println();
//            }else if(curNode.left!=null || curNode.left!=null)
//                System.out.println();            
            
            if(curNode.left!=null)
                queue.add(curNode.left);
            if(curNode.right!=null)
                queue.add(curNode.right);           
        }       
    }
    
}
