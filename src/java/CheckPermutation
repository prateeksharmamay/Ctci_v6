/**
 * 1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 * 
 * Solution #1: Sort the strings.
If two strings are permutations, then we know they have the same characters, but in different orders. Therefore,
sorting the strings will put the characters from two permutations in the same order. We just need to
compare the sorted versions of the strings.
Complexity: Time: worst-case complexity Ω(n log n).
Space: space usage is not O(1)

Solution #2: Check if the two strings have identical character counts.
We can also use the definition of a permutation-two words with the same character counts-to implement
this algorithm. We simply iterate through this code, counting how many times each character appears.
Then, afterwards, we compare the two arrays.

Complexity: Time:  O(len1+len2) or O(n)
Space: O(1) using fixed size array
 * 
 */

public class CheckPermutation{

    public static void main(String []args){
        
        String s1 = "Hello";
        String s2 = "olleH";
        String s3 = "HellP";
        String s4 = "HellO";
        String s5 = "hello";
        String s6 = "qwessqwe";
        String s7 = "Hoell";
        System.out.println("Hello");
        System.out.println(s2 + " : " + stringPermuationOfAnotherString(s1,s2));
        System.out.println(s3 + " : " + stringPermuationOfAnotherString(s1,s3));
        System.out.println(s4 + " : " + stringPermuationOfAnotherString(s1,s4));
        System.out.println(s5 + " : " + stringPermuationOfAnotherString(s1,s5));
        System.out.println(s6 + " : " + stringPermuationOfAnotherString(s1,s6));
        System.out.println(s7 + " : " + stringPermuationOfAnotherString(s1,s7));
    }
    
    public static boolean stringPermuationOfAnotherString(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 != len2) return false;
        int a[] = new int[128];
        
        for(int i = 0 ; i < len1 ; i++) {
            a[str1.charAt(i)]++;
        }
        
        for(int i = 0 ; i < len2 ; i++) {
            a[str2.charAt(i)]--;
            if(a[str2.charAt(i)] < 0) return false;
        }
    
        return true;
    }
}
