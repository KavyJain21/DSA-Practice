// Put the loop inside main.
// Start at str.length() - 1, because the last index is one less than the length.
// Use str.charAt(i) to get a character; Java strings don’t use str[i].
// Keep adding each character to reversed, then print it after the loop.
public class Reverse {
    public static void main(String[] args) {
       String str="Hello";
       String reversed=" ";
    for(int i=str.length()-1;i>=0;i--){
      reversed=reversed+str.charAt(i);
    }  System.out.println(reversed); 
    
}
}
