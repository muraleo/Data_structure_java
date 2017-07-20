import java.util.*;

public class InputExample{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("How many do you want: ");
		int i = input.nextInt();
		System.out.println("What do you want: ");
		String s = input.next();
		System.out.println("Delivery of "+i+" "+s+" is on the way!");
	}
}