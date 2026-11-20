public class CountEO {
      public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]%2==0){
                   even++;
             }   else{
                odd++;
             }
            }
        System.out.println("EVEN="+even);
        
        System.out.println("ODD="+odd);
        
    }  
}
