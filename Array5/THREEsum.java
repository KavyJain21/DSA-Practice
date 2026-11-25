// (Find all triplets whose sum is 0)
// Time: O(N³) — three nested loops.
public class THREEsum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        for(int k=j+1;k<arr.length;k++){
            if (arr[i]+arr[j]+arr[k]==0) {
                System.out.println(arr[i]+","+arr[j]+","+arr[k ]+ " is a valid triplet");
            }
        }
    }
}
    }
}


// Step 1: Understand the approach
// For every element:
// 1. Pick one element using i.
// 2. Pick another using j = i + 1.
// 3. Pick the third using k = j + 1.
// 4. Check whether:
// \[
// arr[i] + arr[j] + arr[k] == 0
// \]

// 5. If the sum is zero, it's a valid triplet.

//optimal
//o(n2)


import java.util.Arrays;

public class THREEsum {
    public static void main(String[] args) {

        int arr[] = {-1, 0, 1, 2, -1, -4};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right]);
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
    }
}

