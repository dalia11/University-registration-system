package registrationsystem;

import java.util.ArrayList;

public class Department {

    public ArrayList<Courses> courses;
    private Department dep;
    private String Name;
    //private String[] depa={"compu","electro","petro","construction"};

    public Department(String name) {
        this.Name = name;
courses=new ArrayList<Courses>();
    }

    public void addcourses(Courses c) {
        courses.add(c);
    }



    public ArrayList<Courses> getCourse() {
        return courses;
    }

    public String tosString() {
        return super.toString();
    }

    @Override
    public String toString() {
        return Name; //To change body of generated methods, choose Tools | Templates.
    }

  

 
    public String getName() {
        // TODO Auto-generated method stub
        return Name;
    }
}
