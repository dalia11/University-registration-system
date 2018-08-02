package registrationsystem;

import java.util.ArrayList;

public class Courses {

    private String name;

    private Department dep;
//private ArrayList<Student> Students;
//private Professor prof;
//private String[] Courses={"maths","programming","humanities","analysis","materials","fluid","logic","data"};

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
        dep.addcourses(this);
    }

    public void setName(String c) {

        this.name = c;
    }

    public String getName() {
        return name;
    }
public String toString()
{ return name;
}
}
