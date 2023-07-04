package ExamenEjemplo;
public class Multiplo3y5 {
        public static void main(String[] args) {
            System.out.println(sum( 1000));
        }

        public static int sum(int n) {
            int x = 0;
            for (int i = 0; i < n; i++) {
                if (i % 3 == 0) {
                    x += i;
                }
            }
            return x;
        }
}
   /* Los números menores a 10 y múltiplos de 3 son: 3, 6, y 9. La suma de estos múltiplos es 18.
        Encuentra la suma de los múltiplos de 3 menores a 1000. */