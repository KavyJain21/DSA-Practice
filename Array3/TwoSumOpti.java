import java.util.*;
public class TwoSumOpti {
       public static void main(String[] args) {
        int arr[] = {3, 4, 6, 8, 10};
int target = 14;
HashMap<Integer,Integer>map=new HashMap<>();
  for(int i=0;i<arr.length-1;i++){
  int needed=target-arr[i];
  if(map.containsKey(needed)){
              System.out.println("Found: " + needed + " and " + arr[i]);
  }
  map.put(arr[i], i);
  }
    }
}
