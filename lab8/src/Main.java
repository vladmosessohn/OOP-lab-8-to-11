import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "vlad", "mose", 9.5);
        Student s2 = new Student(2,"vlad", "ionescu", 9.5);
        Student s3 = new Student(3, "alin", "mihaila", 5.6);
        Student s4 = new Student(4, "radu", "ionita", 8.4);
        Student s5 = new Student(5, "andrei", "popescu", 6.3);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        Collections.sort(list);
        for(Student s : list)
            System.out.println(s);
        PriorityQueue<Student> q = new PriorityQueue<Student>(list.size(), new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Long.compare(s1.getId(), s2.getId());
            }
        });
        q.addAll(list);
        for(Student s : q)
            System.out.println(s);

        HashMap<Student, LinkedList<String>> map = new HashMap<Student, LinkedList<String>>();
        map.put(s1, new LinkedList<String>(List.of("POO", "PA") ) );
        map.put(s2, new LinkedList<String>(List.of("PC", "IOCLA") ) );
        map.put(s3, new LinkedList<String>(List.of("TS", "PP") ) );
        map.put(s4, new LinkedList<String>(List.of("USO", "MATE1") ) );
        map.put(s5, new LinkedList<String>(List.of("MATE2", "MATE3") ) );

        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
