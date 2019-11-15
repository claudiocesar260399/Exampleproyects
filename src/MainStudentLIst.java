public class MainStudentLIst {

    public static void main(String[] args) {
        String[] names = {"Oscar","Perlita","Edgar","Claudio"};
	    StudentLIst studentLIst = new StudentLIst(names);
        studentLIst.removeStudent(5);
	    studentLIst.display();
    }
}
//Excepcion no comprobada