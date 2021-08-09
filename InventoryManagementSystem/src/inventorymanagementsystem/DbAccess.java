/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

/**
 *
 * @author ASUS
 */
public class DbAccess {
    
    private final String dbString = "jdbc:mysql://localhost:3306/inventoryDB";
    private final String dbuser = "user1";
    private final String dbpass = "12345";
    
    
    public DbAccess(){
        
    }
    
    public String getdbString(){
        return this.dbString;
        
    }
    
    public String getDbUser(){
        return this.dbuser;
        
    }
    
    public String getDbPass(){
        return this.dbpass;
    }
}
