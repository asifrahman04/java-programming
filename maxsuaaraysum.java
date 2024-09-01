public class maxsuaaraysum {
    public static void maxsubarray(int arr[])

{
    int currsum=0;
    int maxsum= Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        int start=i;
        for(int j=i;j<arr.length;j++)
        {
            int end=j;
            currsum=0;
            for(int k=start;k<end;k++)
            {
                currsum=currsum+arr[k];
            }
            if(maxsum<currsum){
                maxsum=currsum;
            }

        }
    }
    System.out.println(maxsum);

}
public static void main(String args[])
{
    int arr[]= {1,-2,6,-1,3};
    maxsubarray(arr);
}


    
}
