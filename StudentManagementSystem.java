import java.util.*;

public class StudentManagementSystem {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(123456, "a", "Science"));
        students.add(new Student(234567, "b", "Math"));
        students.add(new Student(345678, "c", "Physics"));
        students.add(new Student(456789, "d", "Biology"));
        students.add(new Student(567890, "e", "Chemistry"));
 
        for(Student student : students) {
            System.out.println(student);
        }

        students.add(2, new Student(678901, "x", "Biology"));
        students.remove(1);
        System.out.println();

        for(Student student : students) {
            System.out.println(student);
        }
        System.out.println();



        Set<Student> oopCourse = new HashSet<>();
        oopCourse.add(students.get(0));
        oopCourse.add(students.get(1));
        oopCourse.add(students.get(2));
        oopCourse.add(students.get(0));
        System.out.println("Number of students " + oopCourse.size());
        if ( oopCourse.contains(students.get(1)) ) {
            System.out.println("SUCCESS: " + students.get(1) + " is already Course.");
        } else {
            System.out.println("ERROR:   " + students.get(1) + " is not in Course.");
        }

        for (Student std: oopCourse) {
            System.out.println(std);
        }
        System.out.println();



        Map<Integer, Student> studentMap = new HashMap<>();
        for(Student student : students) {
            studentMap.put(student.getStudentId(), student);
        }
        Student std = studentMap.get(678901);
        System.out.println("From map: " + std);
    }
}