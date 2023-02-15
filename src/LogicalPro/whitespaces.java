package LogicalPro;

public class whitespaces {
public static void main(String[] args) {
	String a="I am yogesh";
	int count=1;
	for(int i=0;i<=a.length()-1;i++) {
		char v=a.charAt(i);
		if(v==' ') {
			count++;
		}
	}
	System.out.println(count);
}
}
