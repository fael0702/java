public class exec05 {
    public static void main(String[] args){

        for (long i = 0; i <= 20; i++){
            // Mesmo mudando para long o maximo que pode a variavel consegue é 20
            for (long n = 1, fat = 1; n <= i; n++){
                fat = fat * n;
                System.out.println("fatorial do numero "+ i +": "+ fat);
            }
        }
    }
}
