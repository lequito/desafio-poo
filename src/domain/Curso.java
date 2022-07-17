package domain;

public class Curso extends Conteudo{

	private Integer cargaHoraria;


	public Curso(String titulo, String descricao, String instrutor, Integer cargaHoraria) {
		super(titulo, descricao, instrutor);
		this.cargaHoraria = cargaHoraria;
	}


	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [Titulo: " + getTitulo() + ", Descricao: " + getDescricao() + "Instrutor: " + getInstrutor() + ", carga horaria: " + cargaHoraria + " horas]";
	}

	
	
}
