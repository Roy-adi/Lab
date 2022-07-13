class A{
	public void base() {
		System.out.println("method of base class A");
	}
	
}
class B {
	public void subbase() {
		System.out.println("method of subclass B ");
	}
}




public class q2 {

	public q2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    B child = new B ();
    child.subbase();
	}

}
