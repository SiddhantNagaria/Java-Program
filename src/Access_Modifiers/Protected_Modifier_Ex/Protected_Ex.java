package Access_Modifiers.Protected_Modifier_Ex;

import Access_Modifiers.Access_Modifier_Example;

public class Protected_Ex extends Access_Modifier_Example {
    public static void main(String[] args) {
        Protected_Ex ex = new Protected_Ex();
        //protected members are accessed outside package using subclass - Inheritance
        System.out.println(ex.companyName);
        ex.companyName= "abc";
        System.out.println(ex.companyName);
    }
}


