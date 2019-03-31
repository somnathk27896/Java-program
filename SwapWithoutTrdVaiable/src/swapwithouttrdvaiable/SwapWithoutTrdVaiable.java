package swapwithouttrdvaiable;
public class SwapWithoutTrdVaiable {
    public static void main(String[] args) 
    {
        int a=498, b=8900 , t;
        System.out.println("Before swapping \na="+a+" b=" +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping \na="+a+" b="+b);
    }
    
}
