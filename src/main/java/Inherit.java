

class A
{
	void display()
	{
		System.out.println("A print");
	}
}
class B
{
	void display1()
	{
		System.out.println("B print");
		
	}
}
class C
{
	void display2()
	{
		System.out.println("C print");
		
	}
}
class D{
	void display3()
	{
		System.out.println("D print");
	}
}
public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A obj=new A();
     obj.display();
     B obj1=new B();
     obj1.display1();
     C obj2=new C();
     obj2.display2();
     D obj3=new D();
     obj3.display3();
	}

}
