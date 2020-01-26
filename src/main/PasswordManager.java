package main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class PasswordManager implements Serializable {
    private static ArrayList<Password> passwords = new ArrayList<Password>();
    
    public static void addPassword(Password p) {
        passwords.add(p);
    }
    
    public static void removePassword(int i) {
        passwords.remove(i);
    }
    
    public static ArrayList<Password> getPasswords() {
        return passwords;
    }
    
    public static boolean serialize() {
        // creating output stream variables
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
 
        try {
            // for writing or saving binary data
            fos = new FileOutputStream("passwords.ser");
 
            // converting java-object to binary-format 
            oos = new ObjectOutputStream(fos);
 
            // writing or saving ArrayList values to stream
            oos.writeObject(passwords);
            oos.flush();
            oos.close();
        } 
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }
 
        System.out.println("ArrayList of Customer objects saved to "
                + "passwords.ser file");
        System.out.println(passwords);
        return true;
    }
    
    public static boolean deserialize() {
        // creating input stream variables
        FileInputStream fis = null;
        ObjectInputStream ois = null;
 
        try {
            // reading binary data
            fis = new FileInputStream("passwords.ser");
 
            // converting binary-data to java-object
            ois = new ObjectInputStream(fis);
 
            // reading object's value and casting ArrayList<Customer>
            passwords = (ArrayList<Password>) ois.readObject();
        } 
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        } 
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }
 
        System.out.println("ArrayList object de-serialized from "
                + "ArrayListOfCustomer.ser file\n");

        outputPasswordsToConsole(passwords);

        return true;
    }

    public static void outputPasswordsToConsole(ArrayList<Password> passwords) {
        for (Password p : passwords){
            System.out.println(p);
        }
        
        System.out.println(passwords);
        
    }
}
