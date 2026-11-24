
import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
int arr2[] = {2, 3, 4, 6, 7};
ArrayList<Integer>result=new ArrayList<>();
for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr2.length;j++){
    if(arr1[i]==arr2[j]){
      if( !result.contains(arr1[i])){
        result.add(arr1[i]);
      }break;
    }
}
}System.out.println(result);
    }
}
