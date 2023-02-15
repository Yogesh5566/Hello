package LogicalPro;

public class CountIntegers {
public static void main(String[] args) {
	int a=12345;
	int count=0;
	while(a>0) {
		a=a/10;
		count++;
	}
	System.out.println(count);
}
}
