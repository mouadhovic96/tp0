/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaResource;

import java.util.ArrayList;

/**
 *
 * @author Bandovic
 */
public class Restaurent {
   ArrayList<String> list = new ArrayList<String>();
   
public Restaurent(){
    
}
        
    
    
        public void setList(String n1){
            list.add(n1);
        
        }
        public ArrayList getList(){
            return list;
            
        }
    
    
}
