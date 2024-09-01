public class reverse {
    public static int reverse(int arr[]){
    int start=arr[0];
    int end= arr.length-1;
    while (start<end)
    {
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
        start++;
        end--;
    }
     
    }
    public static void main(String args []){
        arr[]={7,3,2,9,1};
        reverse(arr);
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    
    
}
}