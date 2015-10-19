/**
* Write a description of class StringCompare here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class StringCompare
{
/** description of instance variable x (add comment for each instance variable) */


/**
* Default constructor for objects of class StringCompare
*/
    public static void main (String[]args)
{
    // initialise instance variables
    String word1 = "catalog";
    String word2 = "cat";
    String word3 = "aaa";

    int result1 = word1.compareTo(word3);
    System.out.println(result1);

    if (word1.equals(word2))
     System.out.println("word1 is lexicographically equal to word2.");
    else
    System.out.println("word1 is not lexicographically equal to word2.");

    int result2 = word1.compareTo(word2);
    System.out.println(result2);

    String substring = word1.substring(0,3);
    System.out.println(substring);
    if (substring.equals(word2))
    System.out.println("word1 and word2 have the same 3 letter prefix");
    else
    System.out.println("word1 and word2 don't have the same 3 letter prefix");
}
}