package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity 

public class Usuario extends Model {
	 public String  UserName;
	 public String  Apellido;
	 public String  Direccion;
	 public int     Telefono;
	 public String  Password;
	
	public Usuario (String UserName,String  Apellido,String  Direccion,int Telefono,String  Password){
	
	this.UserName=UserName;
	this.Apellido=Apellido;
	this.Direccion=Apellido;
	this.Telefono=Telefono;
	this.Password=Password;
	
		
	}

}
