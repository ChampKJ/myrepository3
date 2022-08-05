class Emp
{
	private void task1()
	{
		System.out.println(" THis is confidential task !");
	}
	public static void add(int x,int y)
	{
		System.out.println("Additio  is "+(x+y));
	}
	
}
class HR extends Emp
{
	
	public void task1()
	{
		
		System.out.println(" THis is task from child");
	}
//	public  void add(int a,int b)
//	{
//		System.out.println(" Addition is HR "+ (a+b));
//	}
}

public class ExampleOfOverriding {

	public static void main(String[] args) {
		Emp.add(6, 7);
        HR.add(46,56);
	}

}
