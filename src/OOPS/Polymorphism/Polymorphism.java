//Polymorphism -> the ability to take more than one form

// A- Compile Time (Method Overload)
// 1. Same method name but different parameters
// 2. Possible within single class
// 3. Static allows to overload method
// 4. Final allows to overload method
// 5. By changing return type its possible to overload method


// B- Run Time (Method Override)
// 1. Same method name and same parameters
// 2. Need to use inheritance
// 3. Static can't allow override method
// 4. Final can't allow override method


package OOPS.Polymorphism;

class Department {

    //Method Overload - works irrespective of return type and access level
    void show(int deptId, String deptName) {
        System.out.println(deptId + " " + deptName);
    }

    void show(String deptCode) {
        System.out.println(deptCode);
    }

    int show(int id) {
        System.out.println(id);
        return 0;
    }

    Department get(int id) {
        return new Department();
    }
}

class Employee extends Department {

    @Override
    void show(int deptId, String deptName) {
        System.out.println(deptId + " " + deptName);
    }

    @Override
    Employee get(int id) {
        return new Employee();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        //Method overload
        Department d1 = new Department();
//        d1.show(12);
//        d1.show("CSE");
//        d1.show(121, "CSE");

        //Method override
        Employee e1 = new Employee();
        e1.show(121,"Mechanical");
        e1.show(12);
        e1.get(12);
    }
}
