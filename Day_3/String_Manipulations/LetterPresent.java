package Day_3.String_Manipulations;

import java.util.*;
public class LetterPresent {
    static boolean present(String str,char letter){
        letter=Character.toLowerCase(letter);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==letter){
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char letter=sc.next().charAt(0);
        System.out.println(present(str,letter));


          
        
    }
    
}
