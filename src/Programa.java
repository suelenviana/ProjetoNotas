import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	static int cont = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Aluno> aluno = new ArrayList();
		ArrayList<Materia> materia = new ArrayList();

		System.out.print("Digite o nome do aluno: ");
		String nome = sc.next();
		aluno.add(new Aluno(nome));

		for (int i = 0; i < 4; i++) {
			System.out.print("Digite a matéria: ");
			String nomemateria = sc.next();
			System.out.print("Digite a nota: ");
			double n1 = sc.nextDouble();
			System.out.print("Digite a nota: ");
			double n2 = sc.nextDouble();
			 System.out.print("Digite a nota: ");
			 double n3 = sc.nextDouble();
			 System.out.print("Digite a nota: ");
			double n4 = sc.nextDouble();
			double media = Materia.calcularmedia(n1, n2);
			if (media <= 6) {
				cont++;
			}
			materia.add(new Materia(nomemateria, media));
		}

		for (Aluno al : aluno) {
			System.out.println(al);
			for (Materia mat : materia)
				System.out.println(mat);
		}
		statusAluno();

	}

	public static void statusAluno() {
		if (cont <= 2) {
			System.out.println("Aluno em exame!");
		} else if (cont >= 3) {
			System.out.println("Aluno Reprovado!!");
		} else {
			System.out.println("Aluno Aprovado");
		}
		System.out.println();
	}
}
