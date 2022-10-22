public class practical_1c 
{
    public static void main(String[] args)
    {
        int i;
        int sqare ;
        int total=0;
        int avrage=0;
        for(i=1;i<21;i++)
        {
            sqare = i*i;
            System.out.println("Sqare of "+ i +" is :"+ sqare );
            total= total+sqare;
            avrage=total/20;
        }
        System.out.println("\n\nAvrage of first 20 sqare is "+ avrage +"\n\n");
    }

    
}