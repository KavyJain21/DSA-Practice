// For Question 1: Find the length of a string without using length():
// 1. Convert the string to a char[] using toCharArray().
// 2. Set a counter to 0.
// 3. Use an enhanced for loop to visit each character.
// 4. Increase the counter once per character.
// 5. Print the counter.

public class lengthofstring {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars=str.toCharArray();
        int counter=0;
        for(char ch:chars){
            counter++;
        }
   System.out.println(counter); }
}
