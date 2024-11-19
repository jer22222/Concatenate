public class ConcatenationStringJerson1 {

public static String concatenateString(String firstName, String lastName) {
    int len1 = firstName.length();
  int len2 = lastName.length();

  char[] fullName = new char[len1 + len2];
    int i = 0;
  
    while (i < len1)  {
    fullName[i] = firstName.charAt(i);
    i++;
    }

    int j = 0;
    while (j < len1 + len2) {
        fullName[i] = lastName.charAt(j);
        j++;
    }

        return new String(fullName);
    }
    public static void main(String[] args)  {
        String firstName = "Jerson";
        String lastName = "Panisales";

        String fullName= concatenateString(firstName, lastName);
        System.out.println("Concatenated string: " + fullName);
    }
    
}
