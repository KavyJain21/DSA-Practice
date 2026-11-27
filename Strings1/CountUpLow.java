
// Approach: Count uppercase and lowercase letters
// 1. Set upperCount and lowerCount to 0.
// 2. Convert the string to a char[].
// 3. Loop through each character using for (char ch : chars).
// 4. If Character.isUpperCase(ch) is true, increase upperCount.
// 5. Otherwise, if Character.isLowerCase(ch) is true, increase lowerCount.
// 6. Print both counts after the loop.
public class CountUpLow {
    public static void main(String[] args) {
        String str = "Java Strings 101!";
        int upperCount=0;
        int LowerCount=0;
        char[] chars=str.toCharArray();
        for (char ch : chars){
            if(Character.isUpperCase(ch)){
                upperCount++;
            }else if(Character.isLowerCase(ch)){
                LowerCount++;
            }
        }System.out.println(upperCount);
        System.out.println(LowerCount);
    }
}
