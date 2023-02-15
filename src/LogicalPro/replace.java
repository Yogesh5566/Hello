package LogicalPro;

public class replace {
public static void main(String[] args) {
	String a="y*g#sh";
	String b=a.replaceAll("[^0-9a-zA-Z]","");
	System.out.println(b);
}
}
