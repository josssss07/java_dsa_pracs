import java.util.Stack;
//prac1
public class InfixToPostfix {
    static int prech(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    static String infixToPostFix(String exp){
        String result = new String("");
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i<exp.length(); i++){

            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)) result += c;
            else if(c== '(') stack.push(c);
            else if(c == ')'){
                while (!stack.isEmpty() && stack.peek()!= '('){
                    result += stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() != '('){
                    return "invalid expression";
                }else stack.pop();
            }else{
                while (!stack.isEmpty() && prech(c) <= prech(stack.peek())){
                    if(stack.peek() == '(' ) return "invalid expression";
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            result+= stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String exp = "((a+b)/(c-(d*e)))";
        System.out.println(infixToPostFix(exp));
    }

}
