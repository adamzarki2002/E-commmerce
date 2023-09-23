package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import metier.Clients;
import metier.famille;
import metier.produit;

public class ajouterFamille {
	public static int ajouterFamille (famille em) {
		int res=0;
        Connection conn=Connexion.getConnection();
			PreparedStatement ps;
			try {
				 ps = conn.prepareStatement (
					" INSERT INTO famille(nomFam)  values(?)");
			    ps.setString(1, em.getNomFam());
			   System.out.println(ps);
		        res=ps.executeUpdate();
			    ps.close();
			   
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
			return res;

	}
	public static ArrayList<famille> listeFamille() {
		ArrayList<famille> famille = new ArrayList<famille>();
		Connection connection= Connexion.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement("select * from famille\r\n;");
			ResultSet rs = ps.executeQuery();
			Iterator it= famille.iterator();
			while (rs.next()) {
				famille em = new famille();
				em.setNomFam(rs.getString("nomFam"));
				em.setNumFam(rs.getInt("numFam"));

				famille.add(em);
			}
			ps.close();
			System.out.println(famille.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
		return famille;
	}
	public static ArrayList<famille> listeFamilleE(String nomFam) {
		ArrayList<famille> famille = new ArrayList<famille>();
		Connection connection= Connexion.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement("select * from famille where nomFam=? \r\n;");
			ps.setString(1, nomFam);
			ResultSet rs = ps.executeQuery();
			Iterator it= famille.iterator();
			while (rs.next()) {
				famille em=new famille();
				em.setNomFam(rs.getString("nomFam"));
				em.setNumFam(rs.getInt("numFam"));
				famille.add(em);
			}
			ps.close();
			System.out.println(famille.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
		return famille;
	}
	

}
