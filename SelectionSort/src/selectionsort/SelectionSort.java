package selectionsort;

public class SelectionSort {
    public static void main(String[] args) 
    {
       int[] a = {32,21,87,45,2};//BubbleSort
        int temp=0, min;
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]< a[min])
                {
                    min=j;
                }
                temp=a[i];
                    a[i]=a[min];
                    a[min]=temp;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+"");
        }
    }
    
}
