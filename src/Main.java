public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // operaciones
        int resultadoSuma = calc.sumar(5, 3);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = calc.restar(8, 4);
        System.out.println("Resta: " + resultadoResta);

        int resultadoMultiplicacion = calc.multiplicar(6, 2);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        double resultadoDivision = calc.dividir(10, 3);
        System.out.println("División: " + resultadoDivision);
    }
}
