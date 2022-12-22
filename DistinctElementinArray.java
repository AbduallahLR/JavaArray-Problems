import java.util.*;
public class DistinctElementinArray{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        int N;
        int [] arr = new int[10];
        N=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            arr[i]= obj.nextInt();
        }
        System.out.println(arr[0]);
        int ans=DisticntElemnt(arr,N);
        System.out.println(ans);
    }
        static int DisticntElemnt(int[] A,int N)
    {
        int ptr = 0;
        int num = A[0];
        for(int i=1;i<N;i++)
        {
            if(A[i] == num)
            {
                continue;
            }
            else
            {
                ptr++;
                A[ptr] = A[i];
                num = A[i];
            }   
            System.out.println(A[i]);
        }
        return ptr+1;
    }
}
