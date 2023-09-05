package main;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbTipo;
import model.TbUsuario;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("===JPACRUD===");
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01x");
		EntityManager em = fabrica.createEntityManager();
		
		List<TbUsuario> lstUsuario = em.createQuery("Select a From TbUsuario a",TbUsuario.class).getResultList();
		System.out.print("El Número de Usuarios es :"+ lstUsuario.size());
		
		
		/*Listar todos los usuarios*/
		/*
		System.out.println("Lista de usuarios:");
		System.out.println("-----------------");
		*/
		/*
		System.out.println("Buscar usuario con id=2");
		System.out.println("-----------------------");
		TbUsuario us = em.find(TbUsuario.class,2);
		System.out.println("Codigo: " + us.getCodUsua());
		System.out.println("Nombre: " +us.getNomUsua());
		System.out.println("Apellido: " +us.getApeUsua());
		System.out.println("==============================================");
		*/
		
		/*Insertar Nuevo Usuario*/
		/*
		System.out.println("Insertar usuario con id=6");
		System.out.println("-----------------------");
		
		em.getTransaction().begin();
		TbUsuario usuario = new TbUsuario();
		Date fecha = new Date();
		TbTipo tipo = em.find(TbTipo.class,2 );
		usuario.setCodUsua(7);
		usuario.setNomUsua("Victor");
		usuario.setApeUsua("Galarza");
		usuario.setUsrUsua("vgvictor");
		usuario.setFnaUsua(fecha);
		usuario.setTbTipo(tipo);
		usuario.setEstUsua(1);
		em.persist(usuario);
		em.getTransaction().commit();
		System.out.print("=================================================");
		*/
		
		
		
		/*Actualizar usuario*/
		
		System.out.println("Actualizamos usuario con id=7: y actualizamos campo cla_usua=10001");
		System.out.println("-------------------------------------------------------------------");
		em.getTransaction().begin();
		TbUsuario usuarioActualizar = em.find(TbUsuario.class, 7);
		usuarioActualizar.setClaUsua("10005");
		em.persist(usuarioActualizar);
		em.getTransaction().commit();
		System.out.println("==============================================");
		
		
		/*Eliminar usuario*/
		/*
		System.out.println("Eliminar usuario con id=6");
		System.out.println("-------------------------");
		em.getTransaction().begin();
		TbUsuario usuarioEliminar = em.find(TbUsuario.class, 6);
		em.remove(usuarioEliminar);
		em.getTransaction().commit();
		System.out.println("==============================================");		
		//Cerrando la conexión a la Base de datos
		fabrica.close();
		em.close();
		*/

	}

}
