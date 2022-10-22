// multiple catch block 
public class exceptionhandling2 {
    public static void main(String[] args) {
        int a[] = { 10, 20 };
        int b = 10;
        try 
        {
            // int c = a[0] / b - a[1];
            int c = 10 /30;
            try
            {
                int d = a[3] / b - a[1];
            }
            catch(ArithmeticException e)
            {
                System.out.println("Divided By zero error : ");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divided By zero error : ");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error : ");
        }
        catch(ArrayStoreException e)
        {
            System.out.println("Array wrong data-type : ");
        }
        finally {
            int y = a[1] / a[0];
            System.out.println("y is : "+y);
        }
        
    }
}
