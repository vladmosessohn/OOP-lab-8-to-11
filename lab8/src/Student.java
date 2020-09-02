import java.util.*;
import java.lang.*;

public class Student implements Comparable<Student>{
    private long id;
    private String name;
    private String surname;
    private double averageGrade;

    public Student(long id, String name, String surname, double averageGrade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.averageGrade, averageGrade) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, averageGrade);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int compareTo(Student student1){
        if(this.getAverageGrade() != student1.getAverageGrade())
            return Double.compare(this.averageGrade, student1.averageGrade);
            else {
                if(this.getName() != student1.getName())
                    return this.getName().compareTo(student1.getName());
                    else {
                        return this.getSurname().compareTo(student1.getSurname());
                }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}