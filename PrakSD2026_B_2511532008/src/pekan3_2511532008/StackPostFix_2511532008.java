package pekan3_2511532008;
import java.util.*;

public class StackPostFix_2511532008 {
    public static int postfixEvaluate(String expression) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner input_2511532008 = new Scanner(expression);
        while (input_2511532008.hasNext()) {
            if (input_2511532008.hasNextInt()) {       
                s.push(input_2511532008.nextInt());
            } else {                       
                String operator_2511532008 = input_2511532008.next();
                int operand2 = s.pop();
                int operand1 = s.pop();
                if (operator_2511532008.equals("+")) {
                    s.push(operand1 + operand2);
                } else if (operator_2511532008.equals("-")) {
                    s.push(operand1 - operand2);
                } else if (operator_2511532008.equals("*")) {
                    s.push(operand1 * operand2);
                } else {
                    s.push(operand1 / operand2);
                    }   }   }
        input_2511532008.close();
        return s.pop();
    }
    public static void main(String[] args) {
        System.out.println("hasil postfix = "+postfixEvaluate("5 2 4 * + 7 -"));   
    }
}
