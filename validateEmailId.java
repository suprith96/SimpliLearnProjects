

//Java program to check if an email address
//is valid using Regular Expressions.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

class validateEmailId
{
 public static boolean isValid(String email)
 {
     String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                         "[a-zA-Z0-9_+&*-]+)*@" +
                         "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                         "A-Z]{2,7}$";
                           
     Pattern pat = Pattern.compile(emailRegex);
     if (email == null)
         return false;
     return pat.matcher(email).matches();
 }

 public static void main(String[] args)
 {
     ArrayList<String> address = new ArrayList<>();
         
       address.add("Suprith96@gmail.com");
       address.add("Suprith96.gmail.com");
       address.add("Suprith96.gmail@com");
         
     for(String i : address){
         if (isValid(i))
             System.out.println(i + " - Valid");
         else
             System.out.println(i + " - Invalid");
     }
 }
}