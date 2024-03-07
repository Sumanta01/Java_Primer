package Day_3.String_Manipulations;

public class Replace {
    static String replaceString(String str,String oldString,String newString){
        return str.replace(oldString, newString);
        
    }

    public static void main(String[] args) {
        String str="A batman with a bat";
        String oldString="bat";
        String newString="snow";
        System.out.println(replaceString(str,oldString,newString));



        
    }
    
}
