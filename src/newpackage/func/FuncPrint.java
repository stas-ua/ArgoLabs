/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.func;

import newpackage.BST_new;
import newpackage.Student;



public class FuncPrint implements ISpecialFunc<BST_new, Student>  {

    @Override
    public void SpecFunc(BST_new bst, Student s) {
       System.out.println(s.getId() + " - " + s.getName() + " - " 
                + s.getLastName() + " - " +  s.getYear() + " - " + s.isIsArmy());
    }

}
