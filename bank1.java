class bank {
	public void interest() {
		System.out.println();
	}
}
class SBI extends bank {
	float a = 8.0f;
	public void interest () {
		System.out.println(" the rate of interest in SBI" + a);
	}
}
class ICICI extends bank {
	float b = 7.0f;
	public void interest() {
		System.out.println(" the rate of interest in ICICI " + b);
	}
}

class AXIS extends bank {
	float c = 9.0f;
	public void interest () {
		System.out.println(" the rate of interest in AXis" + c);
	}
}


public class bank1 {

	public bank1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS ();
    s.interest();
    i.interest();
    a.interest();
	}

}
