public class Adapter_202321250034 extends Calculadora_202321250008 implements Alvo_202321250034{

    @Override
    public double soma(double num1, double num2) {
        return super.somar(num1, num2);
    }

    @Override
    public double sub(double num1, double num2) {
        return super.subtrair(num1, num2);
    }

    @Override
    public double mult(double num1, double num2) {
        return super.multiplicar(num1, num2);
    }

    @Override
    public double div(double num1, double num2) {
        return super.dividir(num1, num2);
    }
    
}
