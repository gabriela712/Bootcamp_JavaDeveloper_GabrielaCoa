package ExamenEjemplo;

public class Multiplos2menor1000 {
    public static void main(String[] args) {
        System.out.println(sum( 1000));
    }

    public static int sum(int n) {
        int x = 0;
        for (int i = 0; i < n; i ++) {
            if (i % 2 != 0 ) {
                x += i;
            }
        }
        return x;
    }
}
    /*Los números menores a 10 e impares son: 1, 3, 5, 7 y 9. La suma de estos múltiplos es 25.
        Encuentra la suma de los números impares menores a 1000. Solo tienes que escribir el resultado. (2 puntos)
    */