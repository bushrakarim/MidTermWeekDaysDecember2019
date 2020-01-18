package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Anagram anagram = new Anagram();
        Assert.assertEquals(anagram.isAnagram("mary", "Army"), true, "the check is not right");

        Palindrome pal = new Palindrome();
        Assert.assertEquals("level", "level", "check is right");
        System.out.println("level is a palindrome word.");


    }
}
