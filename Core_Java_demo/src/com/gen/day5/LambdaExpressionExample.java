package com.gen.day5;

@FunctionalInterface
interface Myname {
	//public void sayMyName();
	 int add( int x , int y ) ;
		
	
}
@FunctionalInterface
interface MyJob{
	public void post();
}


public class LambdaExpressionExample implements Myname , MyJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJob j1 = ()->{System.out.println("Techology Expert");};
		j1.post();
		Myname b = (x,y)->(x+y);
		System.out.println(b.add(100, 400));
		Myname a = (int x,int y)->{return(x*y);};
		System.out.println(a.add(20, 50));
				
LambdaExpressionExample obj = new LambdaExpressionExample();
obj.sayMyName();

	}

	@Override
	public void sayMyName() {
		// TODO Auto-generated method stub
		System.out.println(" Lambda Expression ");
	}

	@Override
	public void post() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
