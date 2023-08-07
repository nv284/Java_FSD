package com.gen.day1;

public class DemoClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * /  %
		// + -
		
int a = 20 ; int b = 10 ; double a1 = 15.5, b1 = 20.2; 
int p =9 ; int q=12 ; int r=3;

//compound 
p+= q ; // p=p+q
p -=q+r; // p = p-(q+r)
p *=(q*r); // p=p*(q*r)
//Assignment as expression 
 p +=1 ; q -=1 ; r *=2;
 int y = (10+p); int u = q+100 ; int s =p+q+r;

System.out.println(" x :"+(!((p+2)==(1+2))));

int exp1 = p-q/3 +r*2-1;
System.out.println("exp1 "+exp1);

int exp2 = (p-q)/3 +((r*2)-1);
System.out.println("exp2 "+exp2);

System.out.println(" Exp1 is comapring with exp2 => "+ ((exp1 >= exp2)&&(exp1 <= exp2)));//true
System.out.println(" Exp1 is comapring with exp2 => "+ (exp1 == exp2));//false
System.out.println(" Exp1 is comapring with exp2 => "+ (exp1 <= exp2));//false
System.out.println(" Exp1 is comapring with exp2 => "+ (exp1 != exp2));//true
System.out.println(" Initail value of a & b "+ a );
int x = (a*a)+(b*b)+2*a*b ; // relational 
System.out.println(" x = "+x);

int s1 = -a%b ;
System.out.println(" s = "+s);
System.out.println("a1 - b1 = " +(a1 - b1)); 
	}

}
