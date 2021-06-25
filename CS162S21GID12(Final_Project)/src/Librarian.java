/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umar
 */
public class Librarian {
     private  String LibName;
    private  String LibPass;
    
    public String getadmin(){
        return LibName;
    }
    public  void setadmin(String name){
        this.LibName=name;
    }
    public  String getpass(){
        return LibPass;
    }
    public  void setPass(String pass){
        this.LibPass=pass;
    }
    
}
