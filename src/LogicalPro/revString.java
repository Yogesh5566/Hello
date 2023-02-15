package LogicalPro;

public class revString {
public static void main(String[] args) {
	String a="pop";
	String b="";
	for(int i=a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
	}
	System.out.println(b);
	if(a.equals(b)) {
		System.out.println("It is palindrome");
	}
	else {
		System.out.println("It is not palindrome");
	}
}
}
