package com.rakesh.thisReference;

public class ThisKeyword {
	
	public void process()
	{
		int b=90;
		doOperate(b, n->{
			System.out.println(b+n);
			//System.out.println(this);
		});
	}
	
	public static void main()
	{
		int b=90;
		ThisKeyword.doOperate(b, n->{
			System.out.println(b+n);
			//System.out.println(this);
		});
	new ThisKeyword().process();
	}
	
	public static void doOperate(int i,Operate o)
	{
		o.operation(i);
	}

}
