import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20,"HN");
        Student student2 = new Student("Hung",21,"HN");
        Student student3 = new Student("Ha",22,"HN");

        System.out.println("-------HashMap (With Key)--------");
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        for (Map.Entry<Integer,Student> studentEntry : studentMap.entrySet()) {
            System.out.println(studentEntry);
        }

        System.out.println("-------HashSet--------");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
