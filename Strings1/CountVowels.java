// Approach
// 1. Create a string, for example "education".
// 2. Set a vowel counter to 0.
// 3. Convert the string to a char[].
// 4. Loop through each character.
// 5. If the character is a, e, i, o, or u, increase the counter.
// 6. Print the counter.

public class CountVowels {
    public static void main(String[] args) {
        String str="Education";
        int VowCount=0;
        char[] chars=str.toCharArray();
        for(char ch:chars){
              char lowerCh = Character.toLowerCase(ch);
        if(lowerCh=='a'||lowerCh=='e'||lowerCh=='i'||lowerCh=='o'||lowerCh=='u'){
          
            VowCount++;
        }
          
        }  System.out.println(VowCount);
    }
}
