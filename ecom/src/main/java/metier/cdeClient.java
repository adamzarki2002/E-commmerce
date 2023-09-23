package metier;

public class cdeClient {
	private int numcli;
	private int numcde;
	public cdeClient(int numcli, int numcde) {
		super();
		this.numcli = numcli;
		this.numcde = numcde;
	}

	public cdeClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumcli() {
		return numcli;
	}
	public void setNumcli(int numcli) {
		this.numcli = numcli;
	}
	public int getNumcde() {
		return numcde;
	}
	public void setNumcde(int numcde) {
		this.numcde = numcde;
	}
	@Override
	public String toString() {
		return "cdeClient [numcli=" + numcli + ", numcde=" + numcde + "]";
	}
	

}
