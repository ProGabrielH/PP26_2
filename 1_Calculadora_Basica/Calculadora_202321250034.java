public class Calculadora_202321250034 {
    

    public double soma(double num1, double num2){
        return num1 + num2;
    }

    public double sub(double num1, double num2){
        return num1 - num2;
    }

    public double mult(double num1, double num2){
        return num1 * num2;
    }

    public double div(double num1, double num2){
        if (num2 == 0){
            System.out.println("Aviso: Divisão por zero");
            return 0;
        }
        return num1 / num2;
    }
}
