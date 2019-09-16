package aeparthur.primary;

public class Conceito {
	private String id;
	private Aluno aluno;
	private Nota nota;
	private Avaliação avaliação;
	
	public Conceito(String id, Aluno aluno, Avaliação avaliação) {
		this.id = id;
		this.aluno =  aluno;
		this.avaliação = avaliação;
	}
	
	public String getId() {
		return id;
	}
	
	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	public Nota getNota() {
		return nota;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Avaliação getAvaliação() {
		return avaliação;
	}
}
