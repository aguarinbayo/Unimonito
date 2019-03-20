/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSW.DAO;

import co.edu.uniminuto.arqSW.hibernate.Deporte;
import co.edu.uniminuto.arqSW.hibernate.NewHibernateUtil;
import co.edu.uniminuto.arqSW.hibernate.Roles;
import co.edu.uniminuto.arqSW.hibernate.Usuario;
import java.util.ArrayList;
import java.util.List;

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

}
