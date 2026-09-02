public class Cliente_202321250034 {

    public static void main(String[] args) {

        Calculadora_202321250034 calc = new Calculadora_202321250034();

        double a = 10.0;
        double b = 5.0;

        System.out.println("TESTE DAS OPERAÇÕES BÁSICAS");
        
        double resultadoSoma = calc.soma(a, b);
        System.out.println("Soma (" + a + " + " + b + "): " + resultadoSoma);

        double resultadoSub = calc.sub(a, b);
        System.out.println("Subtração (" + a + " - " + b + "): " + resultadoSub);

        double resultadoMult = calc.mult(a, b);
        System.out.println("Multiplicação (" + a + " * " + b + "): " + resultadoMult);

        double resultadoDiv = calc.div(a, b);
        System.out.println("Divisão (" + a + " / " + b + "): " + resultadoDiv);

        // Teste da Divisão por Zero
        System.out.println("\nTESTE DE DIVISÃO POR ZERO");
        double resultadoDivZero = calc.div(a, 0);
        System.out.println("Resultado retornado: " + resultadoDivZero);
    }
}