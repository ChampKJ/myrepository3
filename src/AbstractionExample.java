
abstract class Food
{
	public void parcleService()
	{
		System.out.println("YOu have to Pay 1% extra for Parcle Service");
	}
	
	abstract  void prepareFood();
	
}
abstract class DiateFood extends Food
{
	
	abstract public void tasteIt();
}
class Oats extends DiateFood
{
	public void tasteIt()
	{
		System.out.println(" It is taste less!!!");
	}
	void prepareFood()
	{
		System.out.println("Don't use any spices and oil");
	}
}




public class AbstractionExample {

	public static void main(String[] args) {
		DiateFood f = new Oats();
		f.prepareFood();
		f.parcleService();
		f.tasteIt();

	}

}
