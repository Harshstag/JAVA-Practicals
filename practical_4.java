
import java.util.Scanner;

interface queue1 {
    void enqueue();

    void dequeue();

    boolean isfull();

    boolean isempty();

    void display();

    void peak();

}
class queueimpl implements queue1{
    int SIZE = 5;
        int queue[] = new int[SIZE];
        int front = -1;
        int rear = -1;

    public boolean isempty(){
            if(front==-1){
                return true;

            }
            return false;
        }

        public boolean isfull(){
            if (front == 0 && rear == SIZE - 1){
                return true;
            }
            return false;

        }


        public void enqueue(){
            if(isfull()){
                System.out.println("QUEUE is full ");
            }
            else{
                System.out.println("Enter The element ");

                Scanner sc = new Scanner(System.in);
                int ele=sc.nextInt();

                if (front==-1){
                    front=0;
                }
                rear++;
                queue[rear]=ele;
                System.out.println(ele + "  Inserted");
            }

        }
        public void dequeue(){
            int deleted;
            if(isempty()){
                System.out.println("QUEUE is EMPTY ");
            }
            else{
                deleted = queue[front];
                if(front>=rear){
                    front = -1;
                    rear = -1;
                }
                else{
                    front++;
                }
                System.out.println(deleted +" Deleted");


            }

        }
        
        public void peak(){
            if(front>-1){
                System.out.println("Peak is  "+ queue[front]);

            }
            else{
                System.out.println("Queue is empty");
            }
            

        }
        public void display(){
            int i;
            if(isempty()){
                System.out.println("QUEUE is EMPTY ");
            }
            else{
                 System.out.println("Front -> ");
                for (i = front; i <= rear; i++)
                {
                    System.out.print(queue[i] + "  ");

                }

            }

        }
}
class practical_4{
    
    public static void main(String[] args){

        queue1 q =new queueimpl();
        
        int i=0;
        while(i==0)
        {
            System.out.println("Enter the choice | --> 1 for enqueu | --> 2 for dequeue | --> 3 peak | --> 4 display | --> 0 for exit ");
            Scanner sc1 = new Scanner(System.in);
            int ch = sc1.nextInt();
            switch(ch){
            case 1:
                q.enqueue();
                break;
                
             case 2:
                q.dequeue();
                break;


             case 3:
                q.peak();
                break;


             case 4:
                q.display();
                break;

             case 0:
                return;
                
            }

        }

    }
}