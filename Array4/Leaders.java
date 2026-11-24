

public class Leaders {
    public static void main(String[] args) {
     int arr[] = {10, 22, 12, 3, 0, 6};
        int leader=arr[arr.length-1];
                System.out.println(leader);
        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]>leader){
                leader=arr[i];
                System.out.println(leader);
            }
        }
    }
}
