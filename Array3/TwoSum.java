public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 8, 10};
int target = 14;
  for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length-1;j++){
       if(arr[i] + arr[j] == target){
       System.out.println(arr[i] + " + " + arr[j]);
       } 
    }
  }
    }
}
