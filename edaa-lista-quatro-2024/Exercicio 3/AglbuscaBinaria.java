public class AglbuscaBinaria {
public int buscaBinaria(int[] array, int chave) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (array[mid] == chave)
            return mid;

        if (array[mid] < chave) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1;
}
}