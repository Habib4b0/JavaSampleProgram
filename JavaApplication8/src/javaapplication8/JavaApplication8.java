/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Hazihabibullah.Syed
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bean b1 = new Bean();
        Bean b2 = new Bean();
        Bean b3 = new Bean();
        Set<Bean> beanList = new HashSet<Bean>();
        b1.setName("b");
        b2.setName("a");
        b3.setName("Z");
        b1.setId(1);
        b2.setId(2);
        b3.setId(3);
        beanList.add(b1);
        beanList.add(b2);
        beanList.add(b3);
        
        System.out.println("beanList0-------"+beanList.toString());
    }
    
}
