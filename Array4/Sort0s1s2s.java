//o(n)
public class Sort0s1s2s {
    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0};

int count0 = 0;
int count1 = 0;
int count2 = 0;

for(int i=0;i<arr.length;i++){
    if (arr[i]==0) {
        count0++;
    }else if(arr[i]==1){
        count1++;
    }else{
        count2++;
    }
} 
int index=0;
for(int i=0;i<count0;i++){
    arr[index]=0;
    index++;
}
for(int i=0;i<count1;i++){
    arr[index]=1;
    index++;
}
for(int i=0;i<count2;i++){
    arr[index]=2;
    index++;
}for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
    }
}
