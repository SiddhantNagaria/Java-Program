public class PrimeNumber {
    public static void main(String[] args) {
        int n =7;
        int i, m = 0, flag = 0;
        m = n/2;
        for(i = 2; i <= m; i++){
            if(n%i == 0){
                System.out.println("not prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("it is prime");
        }
        
    }
}
