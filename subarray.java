public class subarray {
    public static void subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;i++){
                int end=j;
                for(int k=start;k<end;k++)
                {
                    System.out.println(arr[k]+ " ");
                }
                System.out.println();

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={7,3,9,2,1};
        subarray(arr);
    }
}
