import java.time.LocalDate;

import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
import domain.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso = new Curso("Dominando POO em java", "dominando poo em java", "Camila", 5);
		Curso curso1 = new Curso("Dominando IDE java", "curso de poo com js", "Pedro", 8);
		Curso curso2 = new Curso("Curso de NodeJS", "descrição do curso de node", "João", 4);
		Curso curso3 = new Curso("Primeiros passos com node js", "descrição Primeiros passos com node js", "Alex" , 3);
		
		Mentoria mentoria = new Mentoria("Mentoria java", "Mentoria java dio", "Camila", LocalDate.now());
		//System.out.println(mentoria);
		Mentoria mentoria1 = new Mentoria("Mentoria NodeJS", "Mentoria NodeJS dio", "Francisco", LocalDate.now());
		//System.out.println(mentoria1);
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcap Java");
		bootcamp1.setDescricao("Descrição bootcamp java");
		bootcamp1.getConteudos().add(curso);
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(mentoria);
		
		Bootcamp bootcamp2 = new Bootcamp();
		bootcamp2.setNome("Bootcamp JavaScript");
		bootcamp2.setDescricao("Descrição bootcamp javascript");
		bootcamp2.getConteudos().add(curso2);
		bootcamp2.getConteudos().add(curso3);
		bootcamp2.getConteudos().add(mentoria1);
		
		Dev dev = new Dev();
		dev.setNome("Alex");
		dev.IncreverBootcamp(bootcamp1);
		System.out.println("Conteudos inscritos Alex: " + dev.getConteudosInscritos());
		dev.progredir();
		dev.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos Alex: " + dev.getConteudosInscritos());
		System.out.println("Conteudos conclúidos Alex: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularTotalXp());
		
	}

}
