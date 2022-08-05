
public class Clinic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surgone s1 = new Surgone(45, "ByPass surgery");
		s1.makedignosys("Chest Pain");
		System.out.println(s1);
		s1.doSurgery();
	}

}
