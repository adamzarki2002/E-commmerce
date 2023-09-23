package metier;

public class famille {
	private int numFam;
	private String nomFam;
	public famille(int numFam, String nomFam) {
		super();
		this.numFam = numFam;
		this.nomFam = nomFam;
	}
	public famille() {
		// TODO Auto-generated constructor stub
	}
	public int getNumFam() {
		return numFam;
	}
	public void setNumFam(int numFam) {
		this.numFam = numFam;
	}
	public String getNomFam() {
		return nomFam;
	}
	public void setNomFam(String nomFam) {
		this.nomFam = nomFam;
	}
	@Override
	public String toString() {
		return "famille [numFam=" + numFam + ", nomFam=" + nomFam + "]";
	}
	

}
