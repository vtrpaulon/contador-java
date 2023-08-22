import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
		int parametroUm = teclado.nextInt();
		System.out.println("Digite o segundo parametro");
		int parametroDois = teclado.nextInt();
		
        try {
            //chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(e.getMessage());
		}
		
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}