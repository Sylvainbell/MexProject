package services.objects;

import java.awt.Image;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Product implements Serializable {

	private static final long serialVersionUID = -6002434467864451448L;

	// Nom du produit
	public String Name;
	// code barre reference
	public String PublicCodeBarre;
	public String CustoCodeBarre;
	// Description du produit
	public String Description;
	// Prix d'achat unitaire du produit
	public float PrixAchat;
	//prix de vente calculer 
	// Nombre en stock
	public int Stock;
	// Photo du produit
	public Image Photo;
	// profit sur le produit
	public float Profit;
	// Historique des modification de l'objet
	private LocalDateTime dateModification;
	private String commentModif;
	
	
	
	// getter & setter
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getPublicCodeBarre() {
		return PublicCodeBarre;
	}
	public void setPublicCodeBarre(String publicCodeBarre) {
		this.PublicCodeBarre = publicCodeBarre;
	}
	public String getCustoCodeBarre() {
		return CustoCodeBarre;
	}
	public void setCustoCodeBarre(String custoCodeBarre) {
		this.CustoCodeBarre = custoCodeBarre;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public float getPrixAchat() {
		return PrixAchat;
	}
	public void setPrixAchat(float prixAchat) {
		this.PrixAchat = prixAchat;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		this.Stock = stock;
	}
	public Image getPhoto() {
		return Photo;
	}
	public void setPhoto(Image photo) {
		this.Photo = photo;
	}	
	public float getProfit() {
		return Profit;
	}
	public void setProfit(float profit) {
		this.Profit = profit;
	}
	
	
	public Product(String name, String publicCodeBarre,
			String custoCodeBarre, String description, float prixAchat,
			float tVA, int stock, float profit, Image photo) {
		super();
		this.Name = name;
		this.PublicCodeBarre = publicCodeBarre;
		this.CustoCodeBarre = custoCodeBarre;
		this.Description = description;
		this.PrixAchat = prixAchat;
		this.Stock = stock;
		this.Profit = profit;
		this.Photo = photo;
	}
	
		
}
