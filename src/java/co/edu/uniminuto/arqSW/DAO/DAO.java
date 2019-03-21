/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSW.DAO;

import co.edu.uniminuto.arqSW.hibernate.Deporte;
import co.edu.uniminuto.arqSW.hibernate.NewHibernateUtil;
import co.edu.uniminuto.arqSW.hibernate.Roles;
<<<<<<< HEAD
import co.edu.uniminuto.arqSW.hibernate.Torneo;
import co.edu.uniminuto.arqSW.hibernate.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
=======
import co.edu.uniminuto.arqSW.hibernate.Usuario;
import java.util.ArrayList;
import java.util.List;
>>>>>>> master

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author clarylinux
 */
public class DAO {
        
    Session session = null;
    public DAO(){
        this.session = NewHibernateUtil.sessionFactory.openSession();
    }
    
    
    
    public List<Deporte> getDeporte() {
        List<Deporte> misDeportes = new ArrayList<Deporte>();
        try {
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Deporte");
            misDeportes = (List<Deporte>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return misDeportes;
    }
    
    public List<Usuario> getUsuario(){
        List<Usuario> Usuarios= new ArrayList<Usuario>();
         try {
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Deporte");

            Usuarios = (List<Usuario>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Usuarios;
        
    }

    
        public List<Usuario> getExisteUsuario(String correo){
             List<Usuario> Usuarios= new ArrayList<Usuario>();
         try {
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Usuario WHERE correoUsuario= :correo");
             q.setParameter("correo", correo);
            Usuarios = (List<Usuario>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Usuarios;
        
            
         
        }
        
<<<<<<< HEAD
          public List<Usuario> getlogin(String correo,String pass){
             List<Usuario> Usuarios= new ArrayList<Usuario>();
         try {
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Usuario WHERE correoUsuario= :correo AND passUsuario=:pass");
            q.setParameter("correo", correo);
             q.setParameter("pass", pass);
            Usuarios = (List<Usuario>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Usuarios;
                  
        }
        
=======
>>>>>>> master
        
        public void setUsuario(String Nombre,int Cedula,String Correo,String pass){
            
            Roles rol=(Roles) session.load(Roles.class, 2);
            session.beginTransaction();
            Usuario usuarios=null;
            usuarios=new Usuario();
            usuarios.setIdUsuario(null);
            usuarios.setNombreUsuario(Nombre);
            usuarios.setCedulaUsuario(Cedula);
            usuarios.setCorreoUsuario(Correo);
            usuarios.setPassUsuario(pass);
            usuarios.setRoles(rol);
            session.save(usuarios);
            session.getTransaction().commit();
            session.close();     
        
    }
<<<<<<< HEAD
    /*public void setEliminar(int dato,String tipo){
session.beginTransaction();
Query q = session.createQuery("delete from Deporte where idDeporte = :dato");
q.setParameter("dato", dato);
q.executeUpdate();

        // session.delete(depor);
         //session.getTransaction().commit();
 
    }*/
    /*
    public Deporte Buscar(int dato){
        List<Deporte> deporte=new ArrayList<>();
           Deporte deportes = (Deporte)session.get(Deporte.class,1);
    return deportes;
    }*/
    public void setActualizar(int dato, String nombre) {
     
     Integer aux1=dato;
     String no=nombre;
     // Torneo torneo=(Torneo) session.load(Torneo.class,1);
     Deporte aux=new Deporte();
     aux.setIdDeporte(aux1);
     aux.setNombreDeporte(no);
     session.clear();
     session.beginTransaction();
     session.update(aux); 
     session.getTransaction().commit();
     session.close();

  
}
    public Deporte getDeporte(int dato){
    
        Deporte deporte=(Deporte)session.get(Deporte.class,dato);
        return deporte;
    }
    
    public Deporte setEliminar(int dato) {
     Deporte deporte=(Deporte)session.get(Deporte.class,dato);
     Integer aux1=deporte.getIdDeporte();
     String no=deporte.getNombreDeporte();
     // Torneo torneo=(Torneo) session.load(Torneo.class,1);
     Deporte aux=new Deporte();
     aux.setIdDeporte(aux1);
     aux.setNombreDeporte(no);
     session.clear();
     session.beginTransaction();
     session.delete(aux); 
     /*session.getTransaction().commit();
     session.close();*/
     return aux;
}
=======
>>>>>>> master
}
