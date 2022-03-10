import java.util.Scanner;

public class desafio {
    public static void main (String[] args){
        
        Scanner scan=new Scanner(System.in);

        int x;
        int y;
        int x1;
        int y1;
        int[][] mat;
        int[][] mat1;

        System.out.println("Digite a quantidade de linhas: ");
        x = scan.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        y = scan.nextInt();
     
        //System.out.println("linha "+x+" coluna:"+y);
        mat=new int[x][y];

        for (int i = 0; i < x; i++){
            for (int j = 0; i < x && j < y; j++){
                System.out.println("digite um valor: ");
                mat[i][j] = scan.nextInt();
            }
        } 

        System.out.println("Digite a quantidade de linhas da segunda matriz: ");
        x1 = scan.nextInt();
        System.out.println("Digite a quantidade de colunas da segunda matriz: ");
        y1 = scan.nextInt();
     
        //System.out.println("linha "+x+" coluna:"+y);
        mat1=new int[x1][y1];

        for (int i = 0; i < x1; i++){
            for (int j = 0; i < x1 && j < y1; j++){
                System.out.println("digite um valor: ");
                mat1[i][j] = scan.nextInt();
            }
        } 

        if (mat[0].length == mat1.length){
            int[][] mat2 = new int[x][y1];
            for(int i = 0; i < x; i++){
                for(int j = 0; j < y1; j++){
                    for(int k = 0; k < x1; k++){
                        mat2[i][j] += mat[i][k] * mat1[k][j];
                    }
                }
            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y1; j++) {
                    System.out.print(mat2[i][j] + " ");
                }
                System.out.println();
            }
        } else{
            System.out.println("Não é possivel multiplicar");
        }
    }  
}