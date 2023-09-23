package com.objis.gestionformations.copy;



import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import DAO.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import metier.Clients;
import metier.cmnd;
import metier.commande;
import metier.famille;
import metier.prodCde;
import metier.produit;


/**
 * Servlet implementation class MaServlet
 */
@WebServlet(urlPatterns = { "/login","/inscription","/listeclient","/supprimerCli","/ajouterP","/ajouterfamille","/listefamille","/listeP","/editP",
							"/modifierproduit","/listefamilleE","/supprimer","/listePCH","/listePCC","/view","/ajouterC","/listePa","/valide","/commande","/logout"})
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Login login;
	private inscription inscrcli;
	private listeclient listecli;
	private supprimercli supp;
	private ajouterProduit ajouterP;
	private ajouterFamille ajouterF;
	private modifierProduit modifierP;
	private supprimerP supprimerP;
	private viewP v;
	private commandeP cmd;
	public void init() {
    	listecli=new listeclient();
    	supp= new supprimercli();
    	ajouterP=new ajouterProduit();
    	ajouterF=new ajouterFamille();
    	modifierP=new modifierProduit();
    	supprimerP =new supprimerP();
    	v=new viewP();
    	cmd=new commandeP();
    }		
	
    /**
     * Default constructor. 
     */
    public MaServlet() {
       super();
    	// TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		///////////////////////////////supprimer client////////////////////////////////////////////////
		 if (request.getServletPath().equals("/supprimerCli")) {
				System.out.println("1");
				int numCli = Integer.parseInt(request.getParameter("numCli"));
				System.out.println("1");
				supp.supprimercli(numCli);
				System.out.println(122);
				request.setAttribute("em", 1);
				this.getServletContext().getRequestDispatcher("/listeclient").forward(request, response);
			
		}
		 
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getServletPath();
		System.out.println("path : " + path);
		
		HttpSession session = request.getSession();
		if(request.getServletPath().equals("/login")) {
			String pass = request.getParameter("pass");

			String nomcli = request.getParameter("nomcli");
			String prenomcli = request.getParameter("prenomcli");
			String email = request.getParameter("email");
		

			System.out.println(2);
			
			System.out.println("userr "+Login.getUser(email,pass));
			

		
				if(Login.getUser(email,pass).getEmail().equals("adam@gmail.com")){
					System.out.println(2);
					Clients user =new Clients();
					user = Login.getUser(email,pass);
					nomcli = user.getNomCli();
					
					prenomcli = user.getPrenomCli();
					int numCli=user.getNumCli();
					session.setAttribute("nomcli", nomcli);
					session.setAttribute("numcli", numCli);
					session.setAttribute("prenomcli", prenomcli);
					session.setAttribute("email", email);
					request.getRequestDispatcher("homeadmin.jsp").forward(request,response);
					System.out.println(2);
					
				}
				else if(!Login.getUser(email,pass).getEmail().equals("adam@gmail.com")) {
					System.out.println(2);
					Clients user =new Clients();
					user = Login.getUser(email,pass);	
					int numCli=user.getNumCli();
					nomcli = user.getNomCli();
					prenomcli = user.getPrenomCli();	
					session.setAttribute("numcli", numCli);
					session.setAttribute("email", email);
					session.setAttribute("nomcli", nomcli);
					session.setAttribute("prenomcli", prenomcli);
					request.getRequestDispatcher("homeC.jsp").forward(request,response);
					System.out.println(2);
					System.out.println(2);
				
				}
				else {
					request.setAttribute("mdpInco", "email ou mot de passe incorrect");
					this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
				}
		}
		//////////////////////////////////inscription/////////////////////////////////////////////
		if(request.getServletPath().equals("/inscription")) {
			Clients em = new Clients();
			em.setNomCli(request.getParameter("nomcli"));
			System.out.println("2");
			em.setPrenomCli(request.getParameter("prenomcli"));
			System.out.println("4");
			em.setPass(request.getParameter("pass"));
			em.setAdrCli(request.getParameter("adrcli"));
			em.setEmail(request.getParameter("email"));
			em.setNumtel(request.getParameter("numtel"));
			request.setAttribute("name", 1);
			System.out.println(5);
		
			 	if(inscrcli.inscriptioncli(em)!=0) {
			 		
			         // session.setAttribute("username",username);
			         response.sendRedirect("login.jsp");
			     } else {
			         
			         //session.setAttribute("user", username);
			         response.sendRedirect("inscription.jsp");
			     }
			
		}
		if(request.getServletPath().equals("/logout")) {
			System.out.println(00);
			session.invalidate();
			System.out.println(99);
			response.sendRedirect("login.jsp");
		
	}
		
		////////////////////////////////liste client//////////////////////////////////////////////////
		if(request.getServletPath().equals("/listeclient")) {
			List<Clients> c= new ArrayList<Clients>();
			c=(List<Clients>) listeclient.listeClients();
			request.setAttribute("client", c);
			this.getServletContext().getRequestDispatcher("/listeclient.jsp").forward(request, response);
		
		}
		////////////////////////////ajouter Produit//////////////////////////////////////////////////
		if(request.getServletPath().equals("/ajouterP")) {
			produit em = new produit();
			em.setNomPro(request.getParameter("nomPro"));
			System.out.println("2");
			em.setPuProd(Integer.parseInt(request.getParameter("puPro")));
			System.out.println("4");
			em.setFamPro(request.getParameter("famPro"));
			em.setPhotoP(request.getParameter("photoP"));

			request.setAttribute("name", 1);
			System.out.println(5);
		
			 	if(ajouterP.ajouterPoste(em)!=0) {
			 		
			         // session.setAttribute("username",username);
			         response.sendRedirect("homeadmin.jsp");
			     } else {
			         
			         //session.setAttribute("user", username);
			         response.sendRedirect("/listefamille");
			     }
			
		}		
		//////////////////////////////////////////// lister les famille/////////////////////////////////////////////////
		if(request.getServletPath().equals("/listefamille")) {

		List<famille> c= new ArrayList<famille>();
			c=(List<famille>) ajouterFamille.listeFamille();
			request.setAttribute("famille", c);  
			this.getServletContext().getRequestDispatcher("/ajouterP.jsp").forward(request, response);

		}
		//////////////////////////////////////ajouter famille/////////////////////////////////////////////////////
		if(request.getServletPath().equals("/ajouterfamille")) {
			famille em = new famille();
			em.setNomFam(request.getParameter("nomFam"));
			request.setAttribute("name", 1);
			 	if(ajouterF.ajouterFamille(em)!=0) {
			 		
			         // session.setAttribute("username",username);
			         response.sendRedirect("ajouterfamille.jsp");
			     } else {
			         
			         //session.setAttribute("user", username);
			         response.sendRedirect("homeadmin.jsp");
			     }
			
		}
		///////////////////////////////////liste Produit/////////////////////////
		if(request.getServletPath().equals("/listeP")) {
			List<produit> c= new ArrayList<produit>();
			c=(List<produit>) listeProduit.listeProduit();
			request.setAttribute("produit", c);
			this.getServletContext().getRequestDispatcher("/listeProduit.jsp").forward(request, response);
		
		}
		if (request.getServletPath().equals("/editP")) {

	 		int numPro = Integer.parseInt(request.getParameter("numPro"));
	 		produit em=new produit();
	 		modifierP.chercherProduit(numPro,em);
	 		String nomFam=em.getFamPro();
			em.setNumPro(numPro);
			request.setAttribute("em", em);
			System.out.println(numPro);
			
			System.out.println(nomFam);
			
			List<famille> c= new ArrayList<famille>();
				c=(List<famille>) ajouterFamille.listeFamille();
				request.setAttribute("famille", c);
				List<famille> b= new ArrayList<famille>();
				c=(List<famille>) ajouterFamille.listeFamilleE(nomFam);
				request.setAttribute("familleP", b);
			this.getServletContext().getRequestDispatcher("/modifierproduit.jsp").forward(request, response);
		}	
if (request.getServletPath().equals("/modifierproduit")) {
	 int numPro = Integer.parseInt(request.getParameter("numPro"));
	produit em = new produit();
	em.setNumPro(numPro);
	em.setNomPro(request.getParameter("nomPro"));
	System.out.println("2");
	em.setPuProd(Double.parseDouble(request.getParameter("puProd")));
	System.out.println("4");
	em.setFamPro(request.getParameter("famPro"));
	em.setPhotoP(request.getParameter("photoP"));
	modifierP.modifierProduit(em);
	System.out.println(em);
	
	request.getRequestDispatcher("/listeP").forward(request, response);
}
if (request.getServletPath().equals("/supprimer")) {
	int numPro = Integer.parseInt(request.getParameter("numPro"));
	supprimerP.supprimerP(numPro);
	request.setAttribute("em", 1);
	this.getServletContext().getRequestDispatcher("/listeP").forward(request, response);
}
if(request.getServletPath().equals("/listePCH")) {
	List<produit> c= new ArrayList<produit>();
	c=(List<produit>) listeProduit.listeProduit();
	request.setAttribute("produit", c);
	this.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);

}
if(request.getServletPath().equals("/listePCC")) {
	List<produit> c= new ArrayList<produit>();
	c=(List<produit>) listeProduit.listeProduit();
	request.setAttribute("produit", c);
	this.getServletContext().getRequestDispatcher("/homeclient.jsp").forward(request, response);

}
if (request.getServletPath().equals("/view")) {

		int numPro = Integer.parseInt(request.getParameter("numPro"));
		produit em=new produit();
		modifierP.chercherProduit(numPro,em);
		String nomFam=em.getFamPro();
	em.setNumPro(numPro);
	session.setAttribute("numPro", numPro);
	request.setAttribute("em", em);
	System.out.println(numPro);
	
	System.out.println(nomFam);
	
	List<produit> c= new ArrayList<produit>();
		c=(List<produit>) viewP.viewProduit(numPro);
		request.setAttribute("produit", c);
	this.getServletContext().getRequestDispatcher("/produitV.jsp").forward(request, response);
}
if(request.getServletPath().equals("/ajouterC")) {
	prodCde em=new prodCde();
	prodCde em1=new prodCde();
	Clients c=new Clients();
	commande cm=new commande();
	
	int numPro = Integer.parseInt(request.getParameter("numPro"));
	String nomcli=(String) session.getAttribute("nomcli");
	int numcli =cmd.getId(nomcli);
	int idcmdNonVlaide= cmd.getcmdnv(numcli);
	
	session.setAttribute("numcli", numcli);
	session.setAttribute("numPro", numPro);
	System.out.println(numcli);
	
	c.setNumCli(numcli);
	em.setQte(Integer.parseInt(request.getParameter("qte")));
	em.setNumPro(numPro);
	em.setNumCde(idcmdNonVlaide);
	request.setAttribute("name", 1);
	if(idcmdNonVlaide!=0) {
		cmd.procde(em);
	}
	else {
		 cmd.commande(cm);
		 int i=cmd.getLast();
		 cmd.cdecli(i, numcli);
		 
		 em1.setNumCde(i);
		 em1.setNumPro(numPro);
		 em1.setQte(Integer.parseInt(request.getParameter("qte")));
		 cmd.procde(em1);
		
	}
	 this.getServletContext().getRequestDispatcher("/listePCC").forward(request, response);
	
}
if(request.getServletPath().equals("/listePa")) {

	String nomcli=(String) session.getAttribute("nomcli");
	int numcli =cmd.getId(nomcli);
	List<cmnd> c= new ArrayList<cmnd>();
	c=(List<cmnd>) panier.listePanier(numcli);
	request.setAttribute("panier", c);
	this.getServletContext().getRequestDispatcher("/panier.jsp").forward(request, response);

}
if (request.getServletPath().equals("/valide")) {
	 int numCde = Integer.parseInt(request.getParameter("numCde"));
	 commande em=new commande();
	em.setNumCde(numCde);
	cmd.valider(em);
	
	request.getRequestDispatcher("/listePa").forward(request, response);
}
if(request.getServletPath().equals("/commande")) {
	List<cmnd> c= new ArrayList<cmnd>();
	c=(List<cmnd>) listeCommande.listeCommande();
	request.setAttribute("commande", c);
	this.getServletContext().getRequestDispatcher("/listeCommande.jsp").forward(request, response);

}

//if(request.getServletPath().equals("/commandeLivree")) {
//int numcmde=
//	this.getServletContext().getRequestDispatcher("/listeCommande.jsp").forward(request, response);
//
//}
	}
}

			
	
