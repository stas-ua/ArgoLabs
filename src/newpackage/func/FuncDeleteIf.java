/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.func;
import newpackage.BST_new;
import newpackage.Student;

public class FuncDeleteIf implements ISpecialFunc<BST_new, Student>  {

    @Override
    public void SpecFunc(BST_new bst, Student s) {
       
       if(s.getYear()==5 && s.isIsArmy()) {
            bst.delete(s.getId());
       }
    }

}
