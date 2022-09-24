package j13last;

class math
{
	int a,b;
	
	math(int a,int b)
	{
		System.out.println("This= "+this);
		this.a=a;
		this.b=b;
	}
	void printdata()
	{
		System.out.println("This= "+this+"A= "+this.a+"B= "+this.b);
	}
}
public class thiss {

	public static void main(String[] args) {
		
		math m1=new math(22,33);
		math m3=new math(5,7);
		math m2=new math(2,3);
		
		m1.printdata();
		m2.printdata();
		m3.printdata();
	}
}
