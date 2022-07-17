package domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	
	

	public Mentoria(String titulo, String descricao, String instrutor, LocalDate data) {
		super(titulo, descricao, instrutor);
		this.data = data;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [Titulo: " + getTitulo() + "Intrutor: " + getInstrutor() + ", descrição: " + getDescricao() + ", data: " + data + "]";
	}


	
	
	
}
