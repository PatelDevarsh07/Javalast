package j13last;

import java.util.Scanner;

class student
{
	int no;
	String name;
	static int x;	

public void setdata()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter no");
   no=sc.nextInt();
   System.out.println("Enter name");
   name=sc.next();
   x++;
}

public void printdata()
{
	System.out.println("No=> "+no);
	System.out.println("Name=> "+name);
	System.out.println(x);
}
}

public class staticc {

	public static void main(String[] args) {
		
        student s1=new student();       
        student s2=new student();
        student s3=new student();
        
        s1.setdata();
        s1.printdata();
        s2.printdata();
        s3.printdata();
        
        s2.setdata();
        s1.printdata();
        s2.printdata();
        s3.printdata();
        
        s3.setdata();
        s1.printdata();
        s2.printdata();
        s3.printdata();
	}

}
