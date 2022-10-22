import java.util.Scanner;
class BinarSearch
{
    int arr[]={10,20,30,40,50,60,70}; // array arr
    int count = 0; 
    int found = 0;
    int low = 0;
    int high = 6;
    int mid = 0;

    void BinarySearchFinder(int n)
    {
        int num = n; // input number
        while (low<=high)
    {
        mid = (low + high)/2;

        if (num == arr[mid])
        {
            System.out.println("The element found at : " + mid + " Index ");
            found = 1;
            break;
        }  
        else if (num < arr[mid])
        {
            high = mid-1;
        }
        else if (num > arr[mid])
        {
            low = mid+1;
        }
    }
    if(found ==0) 
        {
            // if element does not found in arr 
            System.out.println("\nElement not found ");
        }
    }
}
class binarySearchUcommandline {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(" Your Commandline argument "+ n);
        BinarSearch obj1 =new BinarSearch();
        obj1.BinarySearchFinder(n);


    }
    
}
