public class arraylargest {
    public static int getlargest(int arr[])
    {
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }arraylargest 
        return largest;
    }
    public static void main(String args[])
    {
        int arr[]= {8,2,9,12,3};
        int largest= getlargest(arr);
        System.out.print("the largest number is : " +largest);

    }
}
