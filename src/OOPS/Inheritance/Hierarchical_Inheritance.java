package OOPS.Inheritance;

class RBIBank {
    int rateOfInterest() {
        return 0;
    }
}

class SBIBank extends RBIBank {
    @Override
    int rateOfInterest() {
        return 7;
    }
}

class HDFCBank extends RBIBank {
    @Override
    int rateOfInterest() {
        return 11;
    }
}

class CBIBank extends RBIBank {
    @Override
    int rateOfInterest() {
        return 9;
    }
}

class ICICIBank extends RBIBank {
    @Override
    int rateOfInterest() {
        return 10 ;
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        RBIBank sbiBank = new SBIBank();
        RBIBank hdfcBank = new HDFCBank();
        RBIBank cbiBank = new CBIBank();
        RBIBank iciciBank = new ICICIBank();

        System.out.println("SBI Bank ROI : " + sbiBank.rateOfInterest());
        System.out.println("HDFC Bank ROI : " + hdfcBank.rateOfInterest());
        System.out.println("CBI Bank ROI : " + cbiBank.rateOfInterest());
        System.out.println("ICICI Bank ROI : " + iciciBank.rateOfInterest());
    }
}
