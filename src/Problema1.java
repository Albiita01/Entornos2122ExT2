public class Problema1 {


    private boolean esNumeroPar(Integer n) {
        return n % 2 == 0;
    }

    private static boolean esMultiploDeTres(Integer n) {
        return n % 3 == 0;
    }

    private static boolean esMultiploDeCinco(Integer n) {
        return n % 5 == 0;
    }

    public static String cadenaDeNumeros() {
        int n = 0;
        String numeros = "1";
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";
        for (int i = 1; i <= 20; i++) {
            if (n % 3 == 0) {
                return fizz;
            } else if (n % 5 == 0) {
                return buzz;
            } else if (n % 3 == 0 && n % 5 == 0) {
                return fizzBuzz;
            }
        }
        return numeros;
    }
}
