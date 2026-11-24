import java.util.*;

public class Union {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 6, 7};

        ArrayList<Integer> union = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++) {
            if(!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
        }

        for(int j = 0; j < arr2.length; j++) {
            if(!union.contains(arr2[j])) {
                union.add(arr2[j]);
            }
        }

        System.out.println(union);
    }
}