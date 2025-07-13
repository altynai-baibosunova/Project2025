import java.util.regex.Pattern;

public class A_193_ValidPhoneNumber {

    public static void main(String[] args) {
        String regex = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
        String phone = "123-234-5432";

        if(Pattern.matches(regex, phone)){
            System.out.println("Phone is Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
}
/*

Code
Testcase
Testcase
Test Result
193. Valid Phone Numbers
Easy
Topics
premium lock icon
Companies
Given a text file file.txt that contains a list of phone numbers (one per line), write a one-liner bash script to print all valid phone numbers.

You may assume that a valid phone number must appear in one of the following two formats: (xxx) xxx-xxxx or xxx-xxx-xxxx. (x means a digit)

You may also assume each line in the text file must not contain leading or trailing white spaces.

Example:

Assume that file.txt has the following content:

987-123-4567
123 456 7890
(123) 456-7890
Your script should output the following valid phone numbers:

987-123-4567
(123) 456-7890
 */