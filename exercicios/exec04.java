public class exec04 {
    public static void main(String[] args){

        for (int i = 0; i <= 10; i++){
            for (int n = 1, fat = 1; n <= i; n++){
                fat *= n;
                System.out.println("fatorial do numero "+ i +": "+ fat);
            }
        }
    }
}
