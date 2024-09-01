public class sumMatchingpairs {
    public static void main(String args[]){
        int arr[]= {2,7,6,4,1,8,9};
        int sum=8;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println(arr[i]+"+"+arr[j]+ "="+sum);
                }
            }
        }
    }
    
}
