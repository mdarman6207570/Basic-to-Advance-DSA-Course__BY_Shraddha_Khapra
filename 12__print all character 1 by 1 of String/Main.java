import java.util.*;
public class Main {
    public static void main(String[] args) {
        String firstname = "md";
        String lastname = "arman";
        String fullname = firstname + " " + lastname;

        for (int i = 0; i < fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}