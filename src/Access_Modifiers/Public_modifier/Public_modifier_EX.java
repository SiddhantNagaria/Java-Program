package Access_Modifiers.Public_modifier;

import Access_Modifiers.Access_Modifier_Example;

public class Public_modifier_EX extends Access_Modifier_Example {
    public static void main(String[] args) {
        Access_Modifier_Example am1 = new Access_Modifier_Example();
        Public_modifier_EX ex1 = new Public_modifier_EX();

        //public variable "address" is accessed everywhere - outside of package also
        System.out.println(am1.address);
        System.out.println(ex1.address);
    }
}
