package Array;

public class ExceptionHandle {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
		System.out.println(a/b);
		System.out.println("hii");
	}
	catch(Exception e) {
		System.out.println("Idiot enter valid input");
	}
}
}
