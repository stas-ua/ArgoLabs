/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author admin
 */
public class Student implements ISpecialFunc {
   
    String Name;
    String LastName;
    int year;
    int id;
    boolean isArmy;
    
    public Student(String n, String ln, int id, int y, boolean isArmy)
    {
        Name = n;
        LastName = ln;
        year = y;
        this.id = id;
        this.isArmy = isArmy;
        
    }
    
    @Override
    public void SpecFunc() {
        
        System.out.println(id + " - " + Name + " - " + LastName + " - " +  year + " - " + isArmy);
    }
    
}
