/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

/**
 *
 * @author dominator
 */
public class Admin {
    private String username;
    private String password;

    Admin() {
        this.username = "admin";
        this.password = "12345";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int checkAdminCredentials(String username, String password){
    if(username.equals(getUsername()) &&  password.equals(getPassword())){
        return 1;
}
    else{
        return 0;
    }
    }
    
    public int changeAdminPassword(String oldpass, String newpass){
        if(oldpass.equals(getPassword())){
            setPassword(newpass);
        return 1;
}
    else{
        return 0;
    }
    }
    
    public static void main(String[] args){
      
        
        
    }
}
