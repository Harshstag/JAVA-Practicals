public class practical_2b {
    public static void main(String[] args)
    {
        AreaOfTrangle at =new AreaOfTrangle();

        at.area(10,20);
        at.area(2.2,4.5);

    }
}

class AreaOfrRectangle
{
    int area ;
    
    public void area(int a,int b)
    {
        area =a*b;
        
        System.out.println("Area of Rectangle "+ area );
        

    }
    

}
class AreaOfTrangle extends AreaOfrRectangle
{


    public void area(double x,double y)
    {
        double area=(x*y)/2;
        System.out.println("Area of Trangle "+ super.area);
        System.out.println("Area of Trangle "+ area );
    }
    

}
