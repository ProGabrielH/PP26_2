public class Cliente_2_202321250034 {

    public static void main(String[] args) {

        Calculadora_202321250034 calc = new Calculadora_202321250034();
        Adapter_202321250034 calc_adapter = new Adapter_202321250034();

        double a = 10.0;
        double b = 5.0;

        System.out.println("TESTE DAS OPERAÇÕES BÁSICAS E COMPARAÇÕES\n");
        
        if (calc.soma(a, b) == calc_adapter.soma(a, b)){
            System.out.println("Teste de soma OK");
        }
        else{ System.out.println("Teste de soma falhou");}

        if (calc.sub(a, b) == calc_adapter.sub(a, b)){
            System.out.println("Teste de subtração OK");
        }
        else{ System.out.println("Teste de subtração falhou"); }

        if (calc.mult(a, b) == calc_adapter.mult(a, b)){
            System.out.println("Teste de multiplicação OK");
        }
        else{ System.out.println("Teste de multiplicação falhou"); }

        if (calc.div(a, b) == calc_adapter.div(a, b)){
            System.out.println("Teste de divisão OK");
        }
        else{ System.out.println("Teste de divisão falhou"); }

    }
}