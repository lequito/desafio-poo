package domain;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	private String instrutor;
	
	public Conteudo(String titulo, String descricao, String instrutor) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.instrutor = instrutor;
	}

	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
}
