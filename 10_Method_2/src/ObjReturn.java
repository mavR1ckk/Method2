
public class ObjReturn {
	
	int a;
	String b;
	
	public ObjReturn(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public ObjReturn x1() {
		ObjReturn test = new ObjReturn(a, b);
		return test;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
}
