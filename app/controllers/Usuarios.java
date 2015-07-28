package controllers;

import java.util.List;

import models.Usuario;
import play.mvc.Controller;

public class Usuarios extends Controller {
	
	public static void registro(){
		render();
	}
	
	public static void Guardar(String UserName,String  Apellido,String  Direccion,int Telefono,String  Password){
		Usuario persona = new Usuario(UserName,Apellido,Direccion,Telefono,Password);
		persona.save();
		registro();
	}
	public static void index(){
		List<Usuario> usuarios=Usuario.findAll();
		render(usuarios);	
	}
	
	public static void editar (Long id){
		Usuario persona= Usuario.findById(id);
		render(persona);
	}
		
	public static void Actualizar( Long id,String UserName,String  Apellido,String  Direccion,int Telefono,String  Password ){
		Usuario persona= Usuario.findById(id);
		persona.UserName=UserName;
		persona.Apellido=Apellido;
		persona.Direccion=Direccion;
		persona.Telefono=Telefono;
		persona.Password=Password;
		persona.save();
		index();	
	}
	
	public static void eliminar (Long id){
		Usuario persona= Usuario.findById(id);
		persona.delete();
		index();
	}
	
}
