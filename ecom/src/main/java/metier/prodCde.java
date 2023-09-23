package metier;

public class prodCde {
	private int numPro;
	private int numCde;
	private int qte;
	public prodCde(int numPro, int numCde, int qte) {
		super();
		this.numPro = numPro;
		this.numCde = numCde;
		this.qte = qte;
	}
	
	public prodCde() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumPro() {
		return numPro;
	}
	public void setNumPro(int numPro) {
		this.numPro = numPro;
	}
	public int getNumCde() {
		return numCde;
	}
	public void setNumCde(int numCde) {
		this.numCde = numCde;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	@Override
	public String toString() {
		return "prodCde [numPro=" + numPro + ", numCde=" + numCde + ", qte=" + qte + "]";
	}
	
}
