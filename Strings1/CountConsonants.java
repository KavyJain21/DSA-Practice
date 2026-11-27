
public class CountConsonants {
    public static void main(String[] args) {
          String str="Education";
        int ConsoCount=0;
        char[] chars=str.toCharArray();
        for(char ch:chars){
              char lowerCh = Character.toLowerCase(ch);
        if(lowerCh!='a'&& lowerCh!='e'&&lowerCh!='i'&& lowerCh!='o'&& lowerCh!='u'){
          
            ConsoCount++;
        }
          
        }  System.out.println(ConsoCount);
    }
}
