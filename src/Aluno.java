
public class Aluno {
	
	private String nome;
	private Materia materia;

	
	public Aluno (String nome){
		this.nome=nome;
	}
	
	public Aluno() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Aluno: ");
		sb.append(getNome());
		return sb.toString();
		
	}
	
}
