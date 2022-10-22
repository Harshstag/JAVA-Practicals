import java.applet.*;
import java.awt.*;
public class applet1 extends Applet
{
    public static void main(String[] args)
    {
        public void Paint(Graphics g)
        {
            g.drawString("hello", 150, 150);
            g.clearRect(20, 20, 100, 100);
            g.drawOval(20, 40, 30, 50);
            g.drawString("Input a number in a teext box", 10, 40);
    
    
        }
        applet1 text1,text2;
        public void init()
        {
            text1= new applet1(10);
            text2= new applet1(10);
            add(text1);
            add(text2);
            text1.setText("0");
            text2.setText("0");
    
        }
        public void paint(Graphics g)
        {
            int x=0,y=0,z=0;
            String s1,s2,s3;
            g.drawString("Input a number in each  box", 10, 40);
        }
        try {
            {
                Object s1 = text1.getText();
                Object x = Integer.parseInt(s1);
                Object s2 = text2.getText();
                Object y = Integer.parseInt(s1);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exveption "+e);
        }
        z=x+y;
        g.drawString("the Sum is ",100,75);
        g.drawString(s,300,100);
        public actioBoolean(Event event)
        {
            repaint();
            return true;
        }

    }

}