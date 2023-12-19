import java.util.Comparator;

/**
 *  Compares by number in group in ascending order
 */
public class NumberInGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getNumberInGroup(), o2.getNumberInGroup());
    }
}
