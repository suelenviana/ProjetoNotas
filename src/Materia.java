
public class Materia {

	private String nomemateria;
	private double media;

	static double calcularmedia(double n1, double n2, double n3, double n4) {
		double media = (n1 + n2 + n3 + n4) / 4;
		return media;
	}
	static double calcularmedia(double n1, double n2) {
		double media = (n1 + n2 ) / 4;
		return media;
	}

	public Materia(String nomemateria, double media) {
		this.media = media;
		this.nomemateria = nomemateria;
	}

	public Materia() {

	}

	public String getNomemateria() {
		return nomemateria;
	}

	public void setNomemateria(String nomemateria) {
		this.nomemateria = nomemateria;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	 


	@Override
	public String toString() {  
		StringBuilder s= new StringBuilder();
		s.append(" Matéria: ");
		s.append(getNomemateria());
		s.append(" Média: ");
		s.append(getMedia());
		return s.toString();
	}
		
	

}
