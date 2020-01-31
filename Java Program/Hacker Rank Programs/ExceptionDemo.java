import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionDemo {

	public static void main(String[] args) {
		try{
            Scanner scan=new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.print(a/b);
        }
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.print(e);
        }
	}
}
