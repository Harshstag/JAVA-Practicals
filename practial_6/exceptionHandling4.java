class NoMatchException extends Exception{
	NoMatchException(){
		System.out.println("Strings not equal");
		}
	}
public class exceptionHandling4 {
    public static void main(String args[]){
		String s;
		s= "PROGRAMMING";
		String s1 = "PROGRAMMING";
		try{
			if(s!=s1){
				throw new NoMatchException();
				}
			else{
				System.out.println("Strings are equal");
				}
			}
			catch(Exception e){
				System.out.println("Error:"+e);
				}
		}
}
