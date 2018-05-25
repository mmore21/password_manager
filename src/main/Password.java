/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;

/**
 *
 * @author Mason
 */
public class Password implements Serializable {
    
    // instance fields
    private String name, username, email, password, note;
    
    // constructor
    public Password(String na, String u, String e, String p, String no) {
        name = na;
        username = u;
        email = e;
        password = p;
        note = no;
    }
    
    // methods
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
