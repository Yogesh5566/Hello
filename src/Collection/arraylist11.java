package Collection;

import java.util.ArrayList;

public class arraylist11 {
public static void main(String[] args) {
	ArrayList a=new ArrayList<>();
	a.add("Yogesh");
	a.add(100);
	a.add(null);
	a.add("Dhumal");
	a.add(0);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.isEmpty());
	a.remove(4);
	System.out.println(a);
}
}
