package pekan3_2511532008;
import java.util.*;

public class NilaiMaksismum_2511532008 {
    public static int max(Stack<Integer> s) {
        Stack<Integer> backup_2511532008 = new Stack<Integer>();
        int maxValue_2511532008 = s.pop();
        backup_2511532008.push(maxValue_2511532008);
        while (!s.isEmpty()) {
            int next = s.pop();
            backup_2511532008.push(next);
            maxValue_2511532008 = Math.max(maxValue_2511532008, next);
        }
        while (!backup_2511532008.isEmpty()) {
            s.push(backup_2511532008.pop());   }
        return maxValue_2511532008; }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(70);
        s.push(12);
        s.push(20);
        System.out.println("isi stack "+s);
        System.out.println("Stack Teratas "+s.peek());
        System.out.println("Nilai maksimum "+max(s));
    }
}