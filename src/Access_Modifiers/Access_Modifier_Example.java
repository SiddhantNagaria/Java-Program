package Access_Modifiers;

class Employee {
    private int Id;

    //default access modifier - it is default if not specified
    String Name;
    int age;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
}

public class Access_Modifier_Example {

    protected String companyName = "TCS";
    public String address = "pune, india";

    public static void main(String[] args) {
        Employee E1 = new Employee();

        //use setter to access private members
        E1.setId(824);

        //default members accessed directly in same package
        E1.Name = "Siddhant";

        //use getters to access private members
        System.out.println("\nEmployee Name :" + E1.Name + " \nEmployee ID : " + E1.getId());
    }
}
