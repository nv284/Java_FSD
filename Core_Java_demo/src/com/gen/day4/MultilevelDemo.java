package com.gen.day4;
class Sem1{
	int m1 , m2 , m3 , m4 , avg1;

	public Sem1() {
		super();
		 m1 =80;
		 m2 = 67;
		 m3 =77 ;
		m4 = 73;
		avg1 = (m1+m2+m3+m4)/4;
	}
	
}
class Sem2 extends Sem1{
	int m21 , m22 , m23, m24 , avg2;

	public Sem2() {
		//super(m1, m2, m3, m4);
		m21 = 80;m22=88 ;m23=24 ; m24=78;
		avg2 = (m21+m22+m23+m24)/4;
	}
	
	
}
class Sem3 extends Sem2{
	int m31, m32, m33,m34, avg3;

	public Sem3() {
	//super(m1, m2, m3, m4, m21, m22, m23, m24);
		m31=80;m32=67;m33=78;m34 = 90;
		avg3 = (m32+m31+m33+m34 )/4;
	}
	
	
}
class Semm4 extends Sem3{
	int m41,m42,m43,m44, avg4;

	public Semm4() {
		super();
		m41=78;m42=77;m43=70;m44=90;
		avg4 = (m41+m42+m43+m44)/4;
	}
	 int totatavg()
	 {
	      return (avg1+avg2+avg3+avg4)/4;
	 }
	
	
}
public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semm4 s4 = new Semm4();
		System.out.println("Sem1 avg "+s4.avg1);

		System.out.println("Sem2 avg "+s4.avg2);
		
		System.out.println("Sem3 avg "+s4.avg3);
		
		System.out.println("Sem4 avg "+s4.avg4);
		System.out.println("Total avg = "+s4.totatavg());
	}

}
