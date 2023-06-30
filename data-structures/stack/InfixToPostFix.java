package stack;

public class InfixToPostFix {

    public int precedence(char chr) {
        switch (chr) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }


    public boolean isRightAssociative(char chr) {
        if (chr == '^')
            return true;
        return false;
    }

    public String infixToPostFix(String exp) {
        StringBuilder sb = new StringBuilder();
        StackLinkedList<Character> stack = new StackLinkedList<>();

        for (int i=0; i<exp.length(); i++) {
            char chr = exp.charAt(i);

            if (Character.isLetterOrDigit(chr))
                sb.append(chr);

            else if (chr == '(') {
                stack.push(chr);
            }
            else if (chr == ')') {
                while (!stack.isEmpty() && stack.first() != '(')
                    sb.append(stack.pop());
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && precedence(chr) <= precedence(stack.first())) {
                    if (precedence(chr) == precedence(stack.first()) && isRightAssociative(chr))
                        break;
                    sb.append(stack.pop());
                }
                stack.push(chr);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.first() == '(')
                return "Invalid Expression";
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        InfixToPostFix i = new InfixToPostFix();
        String exp = "((a+b)*c)-d^e^f";
        System.out.println(i.infixToPostFix(exp));
    }

}
