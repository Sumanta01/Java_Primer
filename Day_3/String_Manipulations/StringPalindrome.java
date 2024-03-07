package Day_3.String_Manipulations;

import java.util.Scanner;

public class StringPalindrome {
    static void palindrome(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        palindrome(str);
        
    }
    
}
