package ParameterizedConstructor;

public class Gun {
	String gunName;
	int noOfBullets;
public Gun(String gunName,int noOfBullets) {
	this.gunName=gunName;
	this.noOfBullets=noOfBullets;
	
}
public void shoot() {
	for(int i=0;i<=noOfBullets;i++) {
		System.out.println("shoot the enemy");
	}
}
}
