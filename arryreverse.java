public class arryreverse {
    public static void reverse(int arr[])
    {
        int temp=0;
        for(int i=0;i=arr.length/2;i++){
             temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        reverse(arr);
        System.out.println(reverse);
    }
}
