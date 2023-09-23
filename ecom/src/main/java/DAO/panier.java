package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import metier.Clients;
import metier.cmnd;

public class panier {
	public static ArrayList<cmnd> listePanier(int numcli) {
		ArrayList<cmnd> cmd = new ArrayList<cmnd>();
		Connection connection= Connexion.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement("select * from produit inner join procde on procde.numpro = produit.numPro inner join commande on commande.numCde = procde.numCde inner join cdecli on cdecli.numCde = commande.numCde  inner join client on client.numCli = cdecli.numcli where client.numCli=? ;");
			ps.setInt(1,numcli);
			
			ResultSet rs = ps.executeQuery();
			Iterator it= cmd.iterator();
			
			while (rs.next()) {
				cmnd em = new cmnd();
				em.setNumcli(numcli);
				em.setNumcde(rs.getInt("numCde"));
				em.setNumpro(rs.getInt("numPro"));
				em.setDate(rs.getDate("dateCde"));
				em.setNv(rs.getString("nv"));
				em.setQte(rs.getInt("qte"));
				em.setFampro(rs.getString("famPro"));
				em.setNomPro(rs.getString("nomPro"));
				em.setPhotoP(rs.getString("photoP"));
				em.setPuPro(rs.getDouble("puPro"));
				
				cmd.add(em);
			}
			ps.close();
			System.out.println(cmd.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
		return cmd;
	}
}
