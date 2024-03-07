package Day_3.String_Manipulations;
import java.util.*;

public class Substring {
    
        static String replace(String str){
            String []words=str.split("\\s+");
            for(int i=0;i<words.length;i++){
                if(isPalindrome(words[i])){
                    words[i]="*".repeat(words[i].length());
                }
            }
              
            return String.join(" ",words);

        }
        static boolean isPalindrome(String str){
            
            for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(replace(str));
    }
    
}
