/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Hazihabibullah.Syed
 */
public class Bean {
    private String Name;
    
    private Integer Id;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    
    
     @Override
    public String toString() {
        return "bean [Name=" + Name + "]";
    }

}
