/**
 * 1.1 Is Unique: 
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 * 
 *****Solution:
 * solution is to create an array of boolean values, where the flag at index i indicates whether character
i in the alphabet is contained in the string. The second time you see this character you can immediately
return false.

*****Complexity:
* Time: O( n), where n is the length ofthe string
* Space: O( 1)
 * 
 * 
 * If we can't use additional data structures, we can do the following:
1. Compare every character of the string to every other character of the string. This will take O( n2) time
and 0 (1) space.
2. If we are allowed to modify the input string, we could sort the string in O( n log( n» time and then
linearly check the string for neighboring characters that are identical. Careful, though: many sorting
algorithms take up extra space.

****Output:
* abcd : true
abbcd : false
abccd : false
abcdd : false
aabcd : false
23sdfa)94 : true
 */

public class IsUnique{

    public static void main(String []args){
        String str1 = "abcd";
        String str2 = "abbcd";
        String str3 = "abccd";
        String str4 = "abcdd";
        String str5 = "aabcd";
        String str6 = "23sdfa)94";
        
        System.out.println(str1 + " : "+ hasUniqueCharacters(str1));
        System.out.println(str2 + " : "+ hasUniqueCharacters(str2));
        System.out.println(str3 + " : "+ hasUniqueCharacters(str3));
        System.out.println(str4 + " : "+ hasUniqueCharacters(str4));
        System.out.println(str5 + " : "+ hasUniqueCharacters(str5));
        System.out.println(str6 + " : "+ hasUniqueCharacters(str6));
    }
     
    public static boolean hasUniqueCharacters(String str) {
        int len = str.length();
        
        if (len > 128) return false;
        
        boolean ch[] = new boolean[128];
        
        for(int i = 0 ; i < len ; i++){
            if(ch[str.charAt(i)]) {
                return false;  
            }
            ch[str.charAt(i)] = true;
        }
        return true;
    }
}
