public class exec06 {
    public static void main(String[] args){

        int[] vet = new int[20];

        for(int f = 3; f <= vet.length; f++){
            f = (f - 1) + (f - 2);
            System.out.println(f);
            }
    }
}
