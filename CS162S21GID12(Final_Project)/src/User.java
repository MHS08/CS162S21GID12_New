/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umar
 */
public class User {
     private  String UserName;
    private  String UserPass;
    
    public String getadmin(){
        return UserName;
    }
    public  void setadmin(String name){
        this.UserName=name;
    }
    public  String getpass(){
        return UserPass;
    }
    public  void setPass(String pass){
        this.UserPass=pass;
    }
    
}
