package Day_3.String_Manipulations;
import  java.util.Scanner;
public class Vowel_Cons {
    static void vowelCons(String str){
        String vowels="aeiou";
        String consonants="bcdfghjklmnpqrstvwxyz";
        int v=0,c=0,w=0,d=0;
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(vowels.indexOf(ch)!=-1){
                v++;
            }else if(consonants.indexOf(ch)!=-1){
                c++;
            }else if(Character.isWhitespace(ch)){
                w++;
            }else if(Character.isDigit(ch)){
                d++;
            }

        }
    
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("White Spaces: "+w);
        System.out.println("Digits: "+d);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        vowelCons(str);

        
    }
    
}
