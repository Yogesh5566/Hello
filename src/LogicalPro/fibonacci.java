package LogicalPro;

public class fibonacci {
public static void main(String[] args) {
	int firstterm=0;
	int secondterm=1;
	int nextterm;
	for(int i=0;i<=10;i++) {
		nextterm=firstterm+secondterm;
		firstterm=secondterm;
		secondterm=nextterm;
		System.out.println(nextterm);
	}
}
}
