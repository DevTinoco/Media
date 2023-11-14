package entities;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, media, soma, resto;
		
		System.out.println("Digite a nota do aluno 1: ");
		a = sc.nextInt();
		System.out.println("Digite a nota do aluno 2: ");
		b = sc.nextInt();
		System.out.println("Digite a nota do aluno 3: ");
		c = sc.nextInt();
		System.out.println("Digite a nota do aluno 4: ");
		d = sc.nextInt();
		
		media = 4;
		soma = a * b * c * d;
		resto = soma % media;
		soma = (a + b + c + d);
		
		System.out.println("Total da soma: " + soma);
		media = soma / media;
		
		System.out.println("Media da soma: " + media);
		
		System.out.println("Resto da divisão: " + resto);
		
		
		sc.close();
	}

}
