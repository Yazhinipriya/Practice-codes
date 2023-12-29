import java.io.*;

void multiply(int, int);
void multiply(double,double);

class calculator
{ 
	void multiply(int a, int b){
		System.out.println(“product =”(a*b));
	} 

	void multiply(double a, double b){
		System.out.println(“product=”(a*b));
	} 
	
	public static void main(String[] args){ 
		Calculator cl=new Calculator();
		cl.multiply(5,6);
		cl.multiply(5.4,7.2);
}
}
