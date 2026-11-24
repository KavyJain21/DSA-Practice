import java.util.Arrays;

public class MergeWithouExtraSpace {
    public static void main(String[] args) {

        int arr1[] = {1, 4, 8, 10};
        int arr2[] = {2, 3, 9};

        for(int i = 0; i < arr1.length; i++) {

            for(int j = 0; j < arr2.length; j++) {

                if(arr1[arr1.length - 1] > arr2[0]) {

                    int temp = arr1[arr1.length - 1];

                    arr1[arr1.length - 1] = arr2[0];

                    arr2[0] = temp;

                    Arrays.sort(arr1);
                    Arrays.sort(arr2);
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}