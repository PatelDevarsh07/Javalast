package j13last;

import java.util.Scanner;

class stud
{
	int no;
	String name;
	static int x;	

public void setdata()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter name");
   name=sc.next();
   x++;
   no++;
}

public void printdata()
{
	System.out.println("Name=> "+name);
	System.out.println(x);	
}
}

public class staticc2 {

	public static void main(String[] args) {
		
		stud s1=new stud();       
        stud s2=new stud();
        stud s3=new stud();
        
        s1.setdata();
        s2.setdata();
        s3.setdata();
        
        s1.printdata();
        s2.printdata();
        s3.printdata();
	}

}
