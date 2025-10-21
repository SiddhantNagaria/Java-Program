package Access_Modifiers;

public class Default_Ac_M {//extends Access_Modifier_Example {

    public static void main(String[] args) {

        //create obj of previous class whose member has to be accessed here.
        Employee e1 = new Employee();

        //default members accessed within same package
        e1.Name = "Rahul";

        e1.age = 23;
        //use setter getter to access private members
        e1.setId(101);
        System.out.println(e1.Name + "  " + e1.getId());

        //protected members accessed within same package in different class object
        // this class obj needs inheritance to access protected member.
        // Default_Ac_M emp = new Default_Ac_M();
        // emp.companyName = "Accenture";
        // System.out.println(emp.companyName);
//
    }
}
