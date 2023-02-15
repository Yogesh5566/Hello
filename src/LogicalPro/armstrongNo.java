package LogicalPro;

public class armstrongNo {
public static void main(String[] args) {
	int num=153;
	int actNum=num;
	int r=0;
	int arm=0;
	while(num>0) {
		r=num%10;
		arm=r*r*r+arm;
		num=num/10;
	}
	if(actNum==arm) {
		System.out.println("It is armstrong number");
	}
	else {
		System.out.println("not");
	}
}
}
