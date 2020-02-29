package Gitexample;

public class Sub {
	int a=10,b=20,c;
	public void sub1()
	{
		c=b-a;
		System.out.println(c);
	}
public static void main(String[] args) {
		Sub b=new Sub();
		b.sub1();
	}

}
