
public class Main {

	public static void main(String[] args) {
		
		// To return object
		ObjReturn test = new ObjReturn(20, "Abhi");
		Object obj = test.x1();
		System.out.println(obj);
		
		// To get single or multiple value.
		SingleReturn test2 = SingleReturn.x2(18,"Akki");
		System.out.println("Id : " + test2.x);
		System.out.println("Name : " + test2.y);
	}
}
