package registrationsystem;

import java.util.ArrayList;

public class Professor {

    private Department Dep;
    private String Name;
    private String Salary;
    private Professor prof;
    private ArrayList<Courses> Courses;

    public Professor(String Name, String Salary, Department Dep) {
        this.Name = Name;
        this.Salary = Salary;
        this.Dep = Dep;
    }

    public Department getDep() {
        return Dep;
    }

    public void setDep(Department dep) {
        Dep = dep;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary2) {
        this.Salary=salary2;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

}
