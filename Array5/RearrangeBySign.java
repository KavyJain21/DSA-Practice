//O(n)
import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int arr[] = {3, 1, -2, -5, 2, -4};
      int result[] = new int[arr.length];
int pos = 0;
int neg = 1;
for(int i = 0; i < arr.length; i++){
    if (arr[i]>0) {
        result[pos]=arr[i];
        pos=pos+2;
    }else{
        result[neg]=arr[i];
        neg=neg+2;
    }
}System.out.println(Arrays.toString(result));
    }
}

// We'll use a new array and two pointers.
// int result[] = new int[arr.length];

// int pos = 0;
// int neg = 1;
// Step 3: Traverse the original array
// Use a for loop:
// for(int i = 0; i < arr.length; i++)


// Inside the loop:

// If the number is positive:
// 1. Put it at result[pos].
// 2. Increase pos by 2.
// If the number is negative:
// 1. Put it at result[neg].
// 2. Increase neg by 2.