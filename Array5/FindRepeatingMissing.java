public class FindRepeatingMissing {
    public static void main(String[] args) {

        int arr[] = {1, 3, 3, 4, 5, 6};
        int n = arr.length;

        // Find repeating number
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is repeating");
                }
            }
        }

        // Find missing number
        for(int i = 1; i <= n; i++) {

            boolean isExist = false;

            for(int j = 0; j < n; j++) {

                if(arr[j] == i) {
                    isExist = true;
                    break;
                }
            }

            if(!isExist) {
                System.out.println(i + " is missing");
            }
        }
    }
}





//optimal
public class FindDuplicate {
    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 2, 2};

        int slow = arr[0];
        int fast = arr[0];

        // Phase 1: Find intersection point
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];

        } 

        // Phase 2: Find duplicate number
        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        System.out.println("Duplicate number: " + slow);
    }
}