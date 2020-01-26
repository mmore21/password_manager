package main;
import java.util.Random;

public class PasswordGenerator
{
    final public static String UPPER_DICTIONARY = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final public static String LOWER_DICTIONARY = "abcdefghijklmnopqrstuvwxyz";
    final public static String NUMBERS = "0123456789";
    final public static String SPECIALS = "!@#$%^&*~?";

    public PasswordGenerator() {}

    public static String generatePassword(int length, String dictionary)
    {
        Random random = new Random();
        String password = "";
        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(dictionary.length());
            password += dictionary.charAt(index);
        }
        return password;
    }
}