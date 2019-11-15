
import java.util.ArrayList;

public class StudentLIst {
    private ArrayList<String> students;

    public StudentLIst()
    {
        students= new ArrayList<>();

    }

    public StudentLIst(String[] names)
    {
        students= new ArrayList<>();
        for(int i=0; i < names.length;i++) {
             students.add(names[i]);
        }

    }

    public void display() {

        for(int i=0 ; i <students.size();i++) {
            System.out.println(i + ".-" + students.get(i));
        }
    }

    public void removeStudent(int index)
    {
        try {
            students.remove(index);
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Invalid index student");
        }
    }

}
