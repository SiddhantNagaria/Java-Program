package Exception_Handling;

public class Throw {
    static void demoProc(){
        try{
            throw new NullPointerException("demo");
        }catch(NullPointerException e) {
            System.out.println("caught inside demoProc");
        }
    }

    public static void main(String[] args) {
        try{
            demoProc();
        }catch(NullPointerException e){
            System.out.println("recaught : " + e);
        }
    }
}
