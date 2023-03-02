package CodigosJava;

import java.util.Scanner;

public class MultiplosNaoMultiplos {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Digite um número inteiro: ");
		n1= sc.nextInt();
		System.out.println("Digite mais um número inteiro: ");
		n2= sc.nextInt();
		
		if(n1%n2==0 || n2%n1==0) {
			System.out.println(n1+" e "+n2+" SÃO múltiplos comuns!");
		}
		else{
			System.out.println(n1+" e "+n2+" NÃO SÃO múltiplos comuns!");
		}
		
		sc.close();

	}

}
