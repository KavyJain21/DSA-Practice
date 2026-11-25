// Time: O(N³)

public class MaxProd3num {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int product;
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
    for(int j = i+1; j < arr.length; j++) {
        for(int k = j+1; k < arr.length; k++) {

       product=  arr[i] * arr[j] * arr[k];
 if (product>maxProduct) {
    maxProduct=product;
        }
    }
}
}System.out.println(maxProduct);
    }
}

// Three nested loops select three different elements.
// product multiplies those three elements.
// if(product > maxProduct) checks whether the current product is the largest.
// maxProduct = product updates the answer.