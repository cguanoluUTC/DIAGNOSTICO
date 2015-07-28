package models;

import javax.persistence.Entity;

import play.db.jpa.Model;


@Entity
public class Producto extends Model {
	
	public String Nombre;
	public int Precio;
	
	public Producto(String nombre, int precio) {
		super();
		Nombre = nombre;
		Precio = precio;
	}
	   public String toString()  {
	        return "nombre: " + Nombre + " precio:"+Precio+"";
	}


}
