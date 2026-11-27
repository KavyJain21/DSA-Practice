
public class Palindrome {
    public static void main(String[] args) {
        String str="madam";
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }if(str.equals(reversed)){
System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
