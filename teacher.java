class teacher1{
	String college;
	String designation;
	void work() {
		System.out.println(" Good Teacher");
	}
}
class ITteacher extends teacher1{
	String collegeName;
	void work () {
		System.out.println("best teacher");
	}
}
 class mathTeacher extends teacher1{
	 
 }
 class musicTeacher extends teacher1{
	 
 }
class physicsTeacher extends teacher1{
	
}





public class teacher {

	public teacher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ITteacher i = new ITteacher();
    mathTeacher m = new mathTeacher();
    musicTeacher mu = new musicTeacher();
    physicsTeacher p = new physicsTeacher();
    m.work();
    i.work();
    mu.work();
    p.work();
    
	}

}
