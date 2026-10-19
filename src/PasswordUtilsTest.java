import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // arrange 
        String password = "hello";
        // act 
        String actual = PasswordUtils.describePasswordLength(password);
        // assert 
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthExactly12Chars() {
        // arrange 
        String password = "************";
        // act  
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("long", actual);
    }

    @Test
    void testDescribePasswordLengthExtraLongPassword() {
        String password = "testDescribePasswordLengthExtraLongPassword6676767676767676";
        String actual = PasswordUtils.describePasswordLength(password);
        assertEquals("extra long", actual);
    }

    @Test
    void testDescribePasswordRepeatedLetter() {
        String password = "passsword"; 
        boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(true, actual);
    }
}
