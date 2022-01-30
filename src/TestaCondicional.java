
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 16;
		int quantidadeDePessoas = 2;
		
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos.");
			System.out.println("Seja bem vindo!");
		}
		else { if (quantidadeDePessoas >=2) {
			System.out.println("Voce é menor de 18 anos, porém esta acompanhado.");
			System.out.println("Sja bem vindo!");
		}
		else {System.out.println("Voce é menor de 18 anos e não esta acompanhado.");
		System.out.println("infelizmente voce não pode entrar.");
		}
			
		}

	}

}
