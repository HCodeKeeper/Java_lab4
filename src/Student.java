/**
 * Student with fields: name, surname, group, numberInGroup, yearOfEducation
 */
public class Student {
    private String name;
    private String surname;
    private String group;
    private int numberInGroup;
    private int yearOfEducation;

    /**
     * @param name Name of the student
     * @param surname Surname of the student
     * @param group Group name of the student
     * @param numberInGroup Number in group of the student
     * @param yearOfEducation Student's year of education (should be between 1 and 6)
     */
    public Student(String name, String surname, String group, int numberInGroup, int yearOfEducation) {
        setName(name);
        setSurname(surname);
        setGroup(group);
        setNumberInGroup(numberInGroup);
        setYearOfEducation(yearOfEducation);
    }

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets surname
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return Group
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets group
     * @param group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @return Number in group
     */
    public int getNumberInGroup() {
        return numberInGroup;
    }

    /**
     * sets Number in group
     * @param numberInGroup
     */
    public void setNumberInGroup(int numberInGroup) {
        if (numberInGroup <= 0){
            throw new IllegalArgumentException("numberInGroup cannot be negative or 0");
        }
        this.numberInGroup = numberInGroup;
    }

    /**
     * @return Year of education
     */
    public int getYearOfEducation() {
        return yearOfEducation;
    }

    /**
     * Sets year of education
     * @param yearOfEducation
     */
    public void setYearOfEducation(int yearOfEducation) {
        if (yearOfEducation >= 1 & yearOfEducation <=6){
            this.yearOfEducation = yearOfEducation;
        }
        else{
            throw new IllegalArgumentException("yearOfEducation should be in range of 1 to 6");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", numberInGroup=" + numberInGroup +
                ", yearOfEducation=" + yearOfEducation +
                '}';
    }
}
