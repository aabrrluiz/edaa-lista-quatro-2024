public class Aglbusca {
    public int buscaSequencial(int [] array, int chave){
        for (int i = 0; 1 < array.length; i++){
            if(array[i] == chave){
                return i;
            }
            
        }
        return -1; 
    }
    
}
