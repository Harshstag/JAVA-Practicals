public class exceptionHandling3 {
    public static void main(String[] args) {
        System.out.println("inside main");
        int[] numr = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int[] denom = { 2, 0, 4, 4, 0, 8 };
        for (int i = 0; i < numr.length; i++) {
            try {
                System.out.println(numr[i] + "/" + denom[i] + " is : " + numr[i] / denom[i]);
            } catch (ArithmeticException ex) {
                System.out.println("can't divide by zero");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("No matching element Found");
            }
        }
    }
}

// there may be times when we would like to throw our own exception apart from system define expresions we can do it using  'throw' keyword
// throw new throwable_subclass;
// exception is the subclass of throw and there fore my exception is a sub class of throw class
