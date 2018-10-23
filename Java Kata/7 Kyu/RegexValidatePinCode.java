/*
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

eg:
    Solution.validatePin("1234") === true
    Solution.validatePin("12345") === false
    Solution.validatePin("a234") === false
 */

//----------------------------------------------------------------------------------------------------------------------

/*
 * My Solution
 */
public class Solution {

    public static boolean validatePin(String pin) {
        return (pin.matches("\\d{6}|\\d{4}"));
    }
}

/*
 * Best Practices or Most Clever Solution
 */
public class Solution {

    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

}