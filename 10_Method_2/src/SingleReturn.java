
public class SingleReturn {

	int x = 100;
	String y = "amit";
	
	public SingleReturn(int x, String y) {
		this.x = x;
		this.y = y;
	}
	
	public static SingleReturn x2(int x, String y) {
		
		return new SingleReturn(x,y);
	}
}