package exemplos;
import java.util.Arrays;

public class ExemploVetor {
    public static void name(String[] args) {
        int numeros[] = new int [6];
        // 0 | 1 | 2 | 3 | 4 | 5 | -> tamanho 6
        System.out.println("Consultar tamanho do vetor");
        System.out.println(numeros.length);

        // loop 
        for(int i = 0; i < numeros.length; i++){
            System.out.println("posição: " + i);
            System.out.println(" conteudo " + numeros[i]);
        }
        //numeros[6] = 80; // posição 6 não existe
        numeros[0] = 20;
        numeros[4] = 65;
        numeros[5] = 70;
        for (int i : numeros){// for i in numeros: //se Python
            System.out.println(i);
        }
        String nomes[] = new String[5];
        nomes[0] = "Cebolinha"; nomes[1] = "Cascão"; nomes[2] = "Magali";
        nomes[3] = "Monica"; nomes[4] = "Franjinha";
        for(String personagem : nomes){
            System.out.println("Personagens " + personagem);
        } 
        Arrays.sort(numeros); // ordena o vetor numeros
        Arrays.sort(nomes);
        System.out.println("Vetor ordenado");
        for (String personagem : nomes){
            System.out.println("Personagem " + personagem);
        }

        String strA = "Chico Bento";
        nomes[1] = strA;
        System.out.println("posição 1: " + nomes[1]);
        strA = "Zé Lele";
        System.out.println("posição 1: " + nomes[1]);
    }
}
