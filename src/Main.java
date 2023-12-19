import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            // Creating students
            Student[] students = {
                    new Student("Name1", "Surname1", "Grop1", 1,  1),
                    new Student("Name2", "Surname2", "Grop2", 2,  2),
                    new Student("Name3", "Surname3", "Grop3", 3,  3),
            };
            // First sorting
            Arrays.sort(students, new NumberInGroupComparator());
            for(Student student : students){
                System.out.println(student);
            }
            System.out.println("--------");
            // Second sorting but in reverse for descending order
            Arrays.sort(students, new YearOfEducationComparator().reversed());
            for(Student student : students){
                System.out.println(student);
            }
        } catch (IllegalAccessError e){
            System.out.println(e.getMessage());
        }
    }
}