/**
 * 1.3 URLify: Write a method to replace all spaces in a string with '%2e: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.)

EXAMPLE
Input: "Mr John Smith JJ, 13
Output: "Mr%2eJohn%2eSmith"

Complexity: Time: O(n+n) = O(n)
Space: in-space  O(1)

 * 
 */

public class Urlify {

    public static void main(String []args){
        
        String s1 = "Mr John Smith    ";
        
        System.out.println("original str: "+s1);
        System.out.println("After URLifying: "+ urlify(s1.toCharArray(),13));
    }
    
    public static String urlify(char[] str, int len) {
        int spaces = 0;
        
         for(int i = 0 ; i < len ; i++ ) {
             if(str[i] == ' ') {
                 spaces++;
             }
         }
         
         int reqLen = len + (2*spaces);
        //  System.out.println("spaces: "+spaces);
        // System.out.println("reqLen: "+reqLen);
        for(int i = len-1 ,j = reqLen-1 ; i >=0 ; ) {
            // System.out.println("str[i]"+str[i]);
            // System.out.println("str[j]"+str[j]);
            if(str[i] != ' '){
                str[j] = str[i];
                i--;
                j--;
            }
            
            else {
                str[j--] = '0';
                str[j--] = '2';
                str[j--] = '%';
                i--;
            }
        }
    
        return String.valueOf(str);
    }
}
