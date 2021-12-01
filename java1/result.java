import java.util.*;
class result{
	public static void main(String[]args){
		System.out.println("enter the Total");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		if(a<=35){
			System.out.println("fail");
		}
		else if(a<=60 && a>35)
			System.out.println("B Grade");
		else
			System.out.println("A Grade");
	}
}