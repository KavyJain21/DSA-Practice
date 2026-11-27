public class CountDigitsAndSpecial {
    public static void main(String[] args) {
        String str = "Java Strings 101!";
        int digitCount = 0;
        int specialCount = 0;
        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetter(ch) &&
                       !Character.isWhitespace(ch)) {
                specialCount++;
            }
        }

        System.out.println("Digits: " + digitCount);   // 3
        System.out.println("Special characters: " + specialCount); // 1
    }
}