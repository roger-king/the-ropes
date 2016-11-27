package sorting;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by roger on 11/27/16.
 */
public class BalancedParenthesisTest {
    @Test
    public void isBalanced(){
        assertEquals(false, BalancedParenthesis.isBalanced("(Hell[o}])"));
        assertEquals(true, BalancedParenthesis.isBalanced("()[]{}[][]"));
    }
}
