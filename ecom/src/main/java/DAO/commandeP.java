package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;

import metier.*;

public class commandeP {
	public static commande commande(commande em) {
		int res=0;
        Connection conn=Connexion.getConnection();
        java.sql.Date date=new java.sql.Date(Calendar.getInstance().getTime().getTime());
			PreparedStatement ps;
			try {
				 ps = conn.prepareStatement (
					" INSERT INTO commande(numCde,dateCde,nv)  values(?,?,?)");
			    ps.setInt(1,em.getNumCde());
			    ps.setDate(2,date);
			    ps.setString(3,"non valide");
			   System.out.println(ps);
		        res=ps.executeUpdate();
			    ps.close();
			   
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
			return em;
	}
			public static cdeClient cdecli(int numcmd,int numcli) {
			int res=0;
	        Connection conn=Connexion.getConnection();
	        PreparedStatement ps;
	        cdeClient em=new cdeClient();
			try {
				 ps = conn.prepareStatement (
						 "INSERT INTO cdecli(numCde,numcli) values(?,?) "
						 );
				 ps.setInt(1,numcmd);
			    ps.setInt(2,numcli);
			   System.out.println(ps);
		        res=ps.executeUpdate();
			    ps.close();
			   
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
			return em;
			}

			public static prodCde procde(prodCde em) {
				int res=0;
				PreparedStatement ps;
		        Connection conn=Connexion.getConnection();
			try {
				 ps = conn.prepareStatement (" INSERT INTO procde(numpro,numcde,qte)  values(?,?,?)");
			    ps.setInt(1,em.getNumPro());
			    ps.setInt(2, em.getNumCde());
			    ps.setInt(3, em.getQte());
			    
			   System.out.println(ps);
		        res=ps.executeUpdate();
			    ps.close();
			   
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
			return em;

	}
	public int getId(String nomcli) {
        Connection conn=Connexion.getConnection();
        Clients em=new Clients();
		try {
			
			PreparedStatement ps = conn.prepareStatement(" select * from client where nomCli=?");
			ps.setString(1,nomcli);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				
			
				
				em.setNumCli(rs.getInt("numCli"));
				
				System.out.println(em);
			}
			
			ps.close();


		} catch (SQLException e) {
			e.printStackTrace();
		}
		return em.getNumCli();
	
	}
	public int getcmdnv(int numcli) {
		Connection conn=Connexion.getConnection();
		ResultSet rs ;
		int res=0;
		try {
			cdeClient em=new cdeClient();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM commande join cdecli on commande.numCde=cdecli.numCde where commande.nv=\"non valide\" and cdecli.numcli=?  ;");		    
		    ps.setInt(1, em.getNumcli());
		    
		   System.out.println(ps);
	        rs=ps.executeQuery();
		    ps.close();
		   
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("error");
	}
		return res;

		
	}
	public int getLast() {
		Connection conn=Connexion.getConnection();
		
		int res = 0;
		try {
			commande em=new commande();
			PreparedStatement ps = conn.prepareStatement("SELECT numCde FROM commande ORDER BY numCde DESC LIMIT 1;");		    
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
			
				
				em.setNumCde(rs.getInt("numCde"));
			}
			res=rs.getInt("numCde");
		   System.out.println(ps);
	        rs=ps.executeQuery();
		    ps.close();
		   
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("error");
	}
		return res;
	}
	/////////////////////////////valider la commande/////////////////////////////////////////////////
	public static void valider(commande em) {
		Connection connection= Connexion.getConnection();
		
		try {
			
			
			PreparedStatement ps = connection.prepareStatement("update commande set nv=? where numCde=? ;");
			ps.setString(1, "valide");
			ps.setInt(2, em.getNumCde());
			
			ps.executeUpdate();
			ps.close();
			System.out.println(em);
		} catch (Exception e) {
		
			e.printStackTrace();
			System.out.println("error");
		}

	}
}
