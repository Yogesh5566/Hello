package String;

public class A {
	public static void main(String[] args) {
		String a="yogesh";
		String b="dhumal";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.charAt(1));
		System.out.println(a.indexOf('h'));
		System.out.println(a.startsWith("y"));
		System.out.println(a.endsWith("h"));
		System.out.println(a.concat(b));
		System.out.println(a.replace('y', 'a'));
		System.out.println(a.substring(2,6));
	}
}
