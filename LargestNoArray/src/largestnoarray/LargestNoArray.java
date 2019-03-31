package largestnoarray;
public class LargestNoArray {

    public static void main(String[] args) 
    {
        int[] a={5,4,7,8,6,9,2,125};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i]-1;
            }
        }
        System.out.println(max);
    }
    
}
