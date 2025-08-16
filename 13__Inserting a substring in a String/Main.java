import java.util.*;
public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Arman");

        sb.insert(2,'m');
        System.out.println(sb);


        //   now we delete extra m

        sb.delete(2,3);             // 3    3-1 tal mean 2 to 2  tk delete krna hi
        System.out.println(sb);


        //now delete n
        sb.delete(4,5);

        System.out.println(sb);
    }
}