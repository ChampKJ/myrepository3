
public class COntainmentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1 = new Doctor(3353453, "Shantanu Abhyankar", "Heart Specialist");
		Hospital h1 = new Hospital(5000, "Dinanath Hospital", "Karve Nagar, Pune", d1);
		System.out.println(h1);
		
		
		//Doctor d2 = new Doctor(2423432,"Raghav Barve","Artho surgen");
		Doctor d2 = new Doctor();
		d2.setDName("Raghav Barve");
		d2.setRegNo(4343442);
		d2.setSpeciality("Aorthopedic Surgen");
		Hospital h = new Hospital();
		h.setDoc(d2);
		h.setHName("Dinanath Hospital");
		h.setLocation("Karve Nagar,Pune");
		h.setNoOfBeds(100000);
		
		System.out.println(h);
	}

}
