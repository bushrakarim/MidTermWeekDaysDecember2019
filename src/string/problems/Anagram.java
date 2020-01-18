package string.problems;


import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    isAnagram("Cat","Tac");
        isAnagram("Army","Mary");
        isAnagram("Dormitory","DirtyRoom");
        isAnagram("schoolmaster","Theclassroom");

    }

    public static boolean isAnagram(String a, String b) {
        boolean status = true;
        if (a.length() != b.length()) {
            status = false;
        } else {
            char [] arrays1 = a.toLowerCase().toCharArray();
            char [] arrays2= b.toLowerCase().toCharArray();
            Arrays.sort(arrays1);
            Arrays.sort(arrays2);
            status=Arrays.equals(arrays1,arrays2);
        }
        System.out.println(a+" "+b+" "+status);
        return status;


    }
}
