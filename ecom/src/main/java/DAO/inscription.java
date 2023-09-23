package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import metier.Clients;

public class inscription {
	public static int inscriptioncli(Clients em) {
		int res=0;
        Connection conn=Connexion.getConnection();
			PreparedStatement ps;
			try {
				 ps = conn.prepareStatement (
					" INSERT INTO client(nomCli,prenomCli,pass,adrCli,email,numtel)  values(?,?,?,?,?,?)");
			    ps.setString(1, em.getNomCli());
			    ps.setString(2, em.getPrenomCli());
			    ps.setString(3, em.getPass());
			    ps.setString(4, em.getAdrCli());
			    ps.setString(5, em.getEmail());
			    ps.setString(6, em.getNumtel());
			   System.out.println(ps);
		        res=ps.executeUpdate();
			    ps.close();
			   
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
			return res;

	}
	
	

}
