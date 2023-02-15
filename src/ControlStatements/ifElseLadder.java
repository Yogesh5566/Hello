package ControlStatements;

public class ifElseLadder {
public static void main(String[] args) {
	int marks=45;
	if(marks>=90) {
		System.out.println("You are fabulous");
	}
	else if(marks>=75) {
		System.out.println("you paased with distinction");
	}
	else if(marks>=60) {
		System.out.println("You are above average");
	}
	else if(marks>=35) {
		System.out.println("You are passed with average marks");
	}
	else {
		System.out.println("failed");
	}
}
}
