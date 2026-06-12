package OTP_Generator;

import java.security.SecureRandom;

public class OTP_Generator {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
//      int otp = secureRandom.nextInt(9000)+1000;
//      System.out.println(otp);

        for(int i = 0; i<100;i++){
            //4 digit otp
            int otp = secureRandom.nextInt(9000)+1000;
            System.out.println(otp);
        }
    }
}
