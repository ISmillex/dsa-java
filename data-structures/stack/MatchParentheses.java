package stack;

import java.util.HashMap;

public class MatchParentheses {


    public boolean matchParanthesis(String str) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '('); map.put(']', '['); map.put('}', '{');

        StackLinkedList<Character> stack = new StackLinkedList<>();

        for (int i=0; i<str.length(); i++) {
            Character chr = str.charAt(i);
            if (map.containsValue(chr))
                stack.push(chr);
            else if (map.containsKey(chr)) {
                if (stack.isEmpty() || map.get(chr) != stack.pop())
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MatchParentheses m = new MatchParentheses();
        System.out.println(m.matchParanthesis("(4+5*{3+7}+[1+2])"));
    }
}
