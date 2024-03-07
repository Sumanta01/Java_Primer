package Day_3.String_Manipulations;

import java.util.Scanner;
public class Skip_MiddleName {
    static String skipMiddleName(String name){
        String []res=name.split(" ");
        if(res.length>=2){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<res.length-1;i++){
                sb.append(res[i].charAt(0)).append(".");
                
            }
            sb.append(res[res.length-1]);
            return sb.toString();

        }else{
            return name;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(skipMiddleName(name));
        
    }
    
}
