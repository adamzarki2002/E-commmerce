package metier;

public class Clients {
	private int numCli;
	private String nomCli;
	private String prenomCli;
	private String adrCli;
	private String pass;
	private String email;
	private String numtel;
	public Clients(int numCli, String nomCli, String prenomCli, String adrCli, String pass, String email,
			String numtel) {
		super();
		this.numCli = numCli;
		this.nomCli = nomCli;
		this.prenomCli = prenomCli;
		this.adrCli = adrCli;
		this.pass = pass;
		this.email = email;
		this.numtel = numtel;
	}
	public int getNumCli() {
		return numCli;
	}
	public void setNumCli(int numCli) {
		this.numCli = numCli;
	}
	public String getNomCli() {
		return nomCli;
	}
	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}
	public String getPrenomCli() {
		return prenomCli;
	}
	public void setPrenomCli(String prenomCli) {
		this.prenomCli = prenomCli;
	}
	public String getAdrCli() {
		return adrCli;
	}
	public void setAdrCli(String adrCli) {
		this.adrCli = adrCli;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumtel() {
		return numtel;
	}
	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}
	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Clients [numCli=" + numCli + ", nomCli=" + nomCli + ", prenomCli=" + prenomCli + ", adrCli=" + adrCli
				+ ", pass=" + pass + ", email=" + email + ", numtel=" + numtel + "]";
	}

}
