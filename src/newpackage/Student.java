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
public class Student {
   
    private String Name;
    private String LastName;
    private int year;
    private int id;
    private boolean isArmy;
    
    public Student(String n, String ln, int id, int y, boolean isArmy)
    {
        Name = n;
        LastName = ln;
        year = y;
        this.id = id;
        this.isArmy = isArmy;
        
    }
    

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the isArmy
     */
    public boolean isIsArmy() {
        return isArmy;
    }

    /**
     * @param isArmy the isArmy to set
     */
    public void setIsArmy(boolean isArmy) {
        this.isArmy = isArmy;
    }
    
}
