//         Comman java exceptions 
// Arthematic exception - It is causeed by math errors bivide by 0 (/0)
// ArrayIndexOutOfBoundException -  it is caused by bad array index
// ArrayStoreException - when program tries to store the wrong type of data in an array
// FileNotFoundException- Caused by an attempt to acesss a non existing file 
// IOException - caused by general I/O failuers, that is inability to read from a file 
// NullPointerException -  refrenceing a null objct
// NumberformatException - Conversion between strings and numbers failes 
// StackOverflowException -  cause when the system runs out of stack space
// StringIndexOutOfBoundException - caused when a program attempts to acess a non existing char position in the string



//          Using Finally Statement 
// Java Supports another statement knows as finally that can be used to handellad exception 
// that is not cought by any of the previous catch statement
// finally block can be used to handel any expcpton witthen a try block it can be 
// imedialty after the tr block or after the last catch block
//this is garented to executed despite of wether or not exception is thrown we can use it to perform 
//sertin house keepting operation
//such as closing files and pointers and relising system resourses
// yes it is posile to try nested try bloc in this case theexception is an raised with its attched try bloc inside 
// if it is appropreate handler 



// Code 1 
// public class excepttionhandlling1 {
//     public static void main(String[] args) {
//         try {
//             int i = 0;
//             int a = 10 / i;
//             System.out.println("Hello from try class");

//         } catch (ArithmeticException e) {
//             System.out.println(e);
//             System.out.println("Exception Handllling ");

//         }
//         System.out.println("rest of the code");
//     }
// }

// Code 2
class excepttionhandlling1 {
    public static void main(String[] args)
    {
        int invalid = 0;
        int number, count = 0;
        for (int i = 0; i<args.length;i++)
        {
            try {
                number = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalid = invalid + 1;
                System.out.println("Invalid Number : " + args[i]);
                continue;
            }
            count = count + 1;
        }
        System.out.println("Valid Number : " + count);
        System.out.println("Invalid Number : " + invalid);

        for (int i = 0; i<args.length;i++)
        {
            System.out.println("Valid Number : " + args[i]);
        }
    }
}
