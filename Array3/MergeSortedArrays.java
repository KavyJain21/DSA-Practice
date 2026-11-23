public class MergeSortedArrays {
    public static void main(String[] args) {

        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};

        int n = arr1.length;
        int m = arr2.length;

        int result[] = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare both arrays
        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of arr1
        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        // Print merged array
        for (int x = 0; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }
    }
}