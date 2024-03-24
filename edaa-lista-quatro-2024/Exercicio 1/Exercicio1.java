public class Exercicio1{

public static void main(String[] args) {

    int[] listaNumeros = {40, 63, 40, 36, 10, 89, 74,
        32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52,
        25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19,
        33, 21, 57, 19, 55, 93, 31, 54, 31, 50,
        66, 44, 54, 55, 29, 75, 43, 88, 61, 65,
        49, 87, 10, 25, 33, 70, 84, 125, 345, 400,
        77, 32, 41, 66, 33, 70, 84, 125, 600,
        38, 43, 51, 34, 76, 25, 48, 14, 50, 71,
        1, 98, 86, 38, 91, 65, 96, 60, 43, 75,
        86, 59, 17, 86, 12, 10, 16, 10, 33, 15,
        77, 22, 56, 4, 9, 63, 49, 80, 39, 53,
        97, 36, 34, 16, 1, 98, 78, 92, 100, 35 };
        int chave = 77;
        int chaveUm = 600;
        int chaveDois = 56;
        int chaveTres = 65;

        Aglbusca aglbusca = new Aglbusca();

        int indice = aglbusca.buscaSequencial(listaNumeros, chave);
        int indiceUm = aglbusca.buscaSequencial(listaNumeros, chaveUm);
        int indiceDois = aglbusca.buscaSequencial(listaNumeros, chaveDois);
        int indiceTres = aglbusca.buscaSequencial(listaNumeros, chaveTres);
        

        if(indice != -1){
            System.out.println("A chave é " +chave+ " Foi encontrada no indice: " +indice);
            System.out.println("\nA chave é " +chaveUm+ " Foi encontrada no indice: " +indiceUm);
            System.out.println("\nA chave é " +chaveDois+ " Foi encontrada no indice: " +indiceDois);
            System.out.println("\nA chave é " +chaveTres+ " Foi encontrada no indice: " +indiceTres);
            
        }
        else{
            System.out.println("A chave: " +chave+ "Não foi encontrada no Array");
        }
    
}
}