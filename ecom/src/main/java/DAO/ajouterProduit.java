package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import metier.Clients;
import metier.produit;

public class ajouterProduit {
	
	public static int ajouterPoste (produit em) {
		int res=0;
        Connection conn=Connexion.getConnection();
			PreparedStatement ps;
			try {
				 ps = conn.prepareStatement (
					" INSERT INTO produit(puPro,nomPro,famPro,photoP)  values(?,?,?,?)");
			    ps.setDouble(1, em.getPuProd());
			    ps.setString(2, em.getNomPro());
			    ps.setString(3, em.getFamPro());
			    ps.setString(4, em.getPhotoP());
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
