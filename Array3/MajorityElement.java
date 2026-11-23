// public class MajorityEle {
//     public static void main(String[] args) {
//         int arr[] = {2, 2, 1, 2, 3, 2, 2};

//         for (int i = 0; i < arr.length; i++) {

//             int count = 0;
//               for (int j = 0; j < arr.length; j++) {

//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//         }
//           if (count > arr.length / 2) {
//                 System.out.println("Majority Element: " + arr[i]);
//                 break;
//             }
//     }
// }
// }


public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = {2, 2, 1, 2, 3, 2, 2};

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println("Majority Element: " + candidate);
    }
}