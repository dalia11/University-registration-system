package registrationsystem;

import java.util.ArrayList;

public class Student {
	private Department dep;
	private ArrayList<Courses > courses;
	private String Name;
	public Student (String Name,Department dep)
	{
		this.Name=Name;
		this.dep=dep;
	}
        public Student()
        {}
        

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Courses> courses) {
        this.courses = courses;
    }
	
	
}
