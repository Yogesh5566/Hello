package LogicalPro;

public class primeNo {
public static void main(String[] args) {
	int num=11;
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
		
	}
	if(count==2) {
		System.out.println("It is prime number");
	}
	else {
		System.out.println("It is not");
	}
}
}
