public class lab3 {
    public static void main(String[]args){
        StringBuffer sb = new StringBuffer(" This is StringBuffer");
        System.out.println(sb.append("This is sample program"));
        System.out.println(sb.insert(21, "obj"));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(14, 20,"Builder"));
    }
}
