class Print_num_from_n_to_1{

    public static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        print(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}