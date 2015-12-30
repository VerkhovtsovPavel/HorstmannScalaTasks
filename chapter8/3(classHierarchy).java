public abstract class Person {
    private String name;
    private int age;
    private boolean isMale;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public boolean isMale() {
        return isMale;
    }
 
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }
 
    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
}
//-----------------------------------------------------------

public class Student extends Person {

    private String group;
    private double rating;
 
    public String getGroup() {
        return group;
    }
 
    public void setGroup(String group) {
        this.group = group;
    }
 
    public double getRating() {
        return rating;
    }
 
    public void setRating(double rating) {
        this.rating = rating;
    }
 
    public Student(String name, int age, boolean isMale, String group, double rating) {
        super(name, age, isMale);
        this.group = group;
        this.rating = rating;
    }
 
    @Override
    public String toString() {
        return "Student " + getName() + " group " + getGroup()
                + " rating " + getRating();
    }
}

//--------------------------------------------------------------------------------

public class Teacher extends Person {
   
    private String title;

    private String subject;
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getSubject() {
        return subject;
    }
 
    public void setSubject(String subject) {
        this.subject = subject;
    }
 
    public Teacher(String name, int age, boolean isMale, String title, String subject) {
        super(name, age, isMale);
        this.title = title;
        this.subject = subject;
    }
 
    @Override
    public String toString() {
        return "Teacher " + getName() + " title " + getTitle() + " subject " + getSubject();
    }
}

//--------------------------------------------------------------------------------------------

public class Dean extends Person {
    private String faculty;
 
    public String getFaculty() {
        return faculty;
    }
 
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
 
    public Dean(String name, int age, boolean isMale, String faculty) {
        super(name, age, isMale);
        this.faculty = faculty;
    }
 
    @Override
    public String toString() {
        return "Dean " + getName() + " faculty " + getFaculty();
    }
}