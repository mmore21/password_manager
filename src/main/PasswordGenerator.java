package main;

public class PasswordGenerator
{
    final public String upperDictionary = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final public String lowerDictionary = "abcdefghijklmnopqrstuvwxyz";
    final public String numbers = "0123456789";
    final public String specials = "!@#$%^&*~?";

    public Password() {}

    public static String generatePassword(int length, String dictionary)
    {
        String password = "";
        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(dictionary.length());
            result += dictionary.charAt(index);
        }
        return result;
    }
}