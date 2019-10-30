package demoOct;

public class Demo123 {

	public static void main(String[] args) {
		test1();
		Demo123.test1();
		Demo123 obj1  = new Demo123();
		obj1.test2();
	}
	
	public static void test1()  // static
	{
		int a = 99;
		String S = "Demo123";
	}
	public  void test2()  // non Static
	{
		int a = 99;
		String S = "Demo123";
	}

}
