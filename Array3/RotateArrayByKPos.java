// right rot
public class RotateArrayByKPos {
   public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
int k = 2;
int temp=arr[arr.length-1];

  for(int i = arr.length - 1; i > 0; i--) {
    arr[i]=arr[i-1];
}
arr[0]=temp;
  for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
   } 
}

//left rot
public class RotateArrayByKPos {
   public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
int k = 2;
int temp=arr[0];

  for(int i = 0; i < arr.length - 1; i++) {
    arr[i]=arr[i+1];
}
arr[arr.length-1]=temp;
  for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
   } 
}
