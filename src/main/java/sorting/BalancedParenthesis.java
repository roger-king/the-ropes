package sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by roger on 11/27/16.
 */
public class BalancedParenthesis {
    private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
    static
    {
        brackets.put('[', ']');
        brackets.put('<', '>');
        brackets.put('{', '}');
        brackets.put('(',')');
    }
    private BalancedParenthesis() {};
    public static Boolean isBalanced(String str)
    {
        if(str.length() == 0)
        {
            throw new IllegalArgumentException("Please provide a string");
        }

        final Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++)
        {
            if(brackets.containsKey(str.charAt(i)))
            {
                stack.push(str.charAt(i));
            } else if(stack.empty() || str.charAt(i) != brackets.get(stack.pop()))
            {
                return false;
            }
        }
        return true;
    }
}
