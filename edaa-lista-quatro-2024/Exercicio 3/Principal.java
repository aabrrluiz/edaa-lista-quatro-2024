public class Principal {
    public class Exercicio1{

        public static void main(String[] args) {
            int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
                65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
                75, 76, 77, 78, 79, 80, 81,
                82, 83, 84, 85, 86, 87, 88, 89,
                90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
                int chave = 99;
                int chaveUm = 81;
        
        
                AglbuscaBinaria AglbuscaBinaria = new AglbuscaBinaria();
        
                int indice = AglbuscaBinaria.buscaBinaria(listaNumeros, chave);
                int indiceUm = AglbuscaBinaria.buscaBinaria(listaNumeros, chaveUm);
                
        
                if(indice != -1){
                    System.out.println("A chave é " +chave+ " Foi encontrada no indice: " +indice);
                    System.out.println("\nA chave é " +chaveUm+ " Foi encontrada no indice: " +indiceUm);
                    
                }
                else{
                    System.out.println("A chave: " +chave+ "Não foi encontrada no Array");
                }
            
        }
        }
    
}
