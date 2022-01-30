
public class TestaCondicional2 {

	public static void main(String[] args) {
System.out.println("Testando Condicionais 2");
		
		int idade = 20;
		int quantidadeDePessoas = 2;
		boolean acompanhado = quantidadeDePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && quantidadeDePessoas >=2) {
			System.out.println("Seja bem vindo!");
		}
		else {
		System.out.println("infelizmente voce não pode entrar.");
		}
			
	}

}
