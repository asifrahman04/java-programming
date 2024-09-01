public class dec {
    public static void main(String[] args)
    {
        int arr[]= {43,24,76,23};
        int i,j ,temp=0;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)

            {
                if(arr[0]>arr[1])
                {
                    temp=arr[0];
                    arr[0]=arr[1];
                    arr[1]=temp;
                }

            }
            
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    
    
}
