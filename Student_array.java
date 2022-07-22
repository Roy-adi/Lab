class details{
    int studentID;
    int fees;
    String name;
    String Email;
    String Address;

    public details(int studentID, String name, String Email, String Address){
        this.studentID= studentID;
        this.fees= fees;
        this.name=name;
        this.Email=Email;
        this.Address=Address;
    }
    public void StudentFees(int fees){
        if (fees<=2000){
        fees +=10* fees/100;
        }
        this.fees=fees;
    
    }
    public void display(){
        System.out.println("ID -:" +studentID+ "Student Name-:"+name+" ,Email ID-:"+ Email+"Address-:"+Address+" ,fess-:"+fees);
    }

}

public class Students {
    public static void main(String[]args){
        details [] dt = new details[4];
        dt[0]= new details(01,  "Aditya", "adi@","Kolkata");
        dt[1]= new details(02,  "Ani", "ani@", "Kolkata");
        dt[2]=new details(03,  "dev", "dev@", "kolkata");
        dt[3]=new details(04 , "Rik", "rik@", "Kolkata");
    
        dt[0].StudentFees(4000);
        dt[1].StudentFees(2500);
        dt[2].StudentFees(1500);
        dt[3].StudentFees(1700);

    for (details elements:dt){
        elements.display();
    }
}
}
