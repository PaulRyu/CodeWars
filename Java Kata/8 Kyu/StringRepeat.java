/*
    Write a function called repeatStr which repeats the given string string exactly n times.

    repeatStr(6, "I") // "IIIIII"
    repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */

//----------------------------------------------------------------------------------------------------------------------

/*
 * My Solution
 */
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String repeated = "";
        for (int i = 0; i < repeat; i++) {
            repeated += string;
        } return repeated;
    }
}

/*
 * Best Practices or Most Clever Solution
 */
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }
}