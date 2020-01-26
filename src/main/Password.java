package main;

import java.io.Serializable;

public class Password implements Serializable
{
    private String name;
    private String username;
    private String email;
    private String password;
    private String note;
    
    public Password(String na, String u, String e, String p, String no)
    {
        name = na;
        username = u;
        email = e;
        password = p;
        note = no;
    }
    
    public String getName() {
        return name;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getNote() {
        return note;
    }    
}
