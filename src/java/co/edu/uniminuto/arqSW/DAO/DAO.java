/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSW.DAO;

import co.edu.uniminuto.arqSW.hibernate.Deporte;
import co.edu.uniminuto.arqSW.hibernate.Equipo;
import co.edu.uniminuto.arqSW.hibernate.NewHibernateUtil;
import co.edu.uniminuto.arqSW.hibernate.Roles;
import co.edu.uniminuto.arqSW.hibernate.Torneo;
import co.edu.uniminuto.arqSW.hibernate.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import co.edu.uniminuto.arqSW.hibernate.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        public List<Torneo> getTorn() {
        List<Torneo> misTorneo = new ArrayList<Torneo>();
        try {
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Torneo");
            misTorneo = (List<Torneo>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return misTorneo;
    }
                public List<Equipo> getEquipo() {
        List<Equipo> misEquipo = new ArrayList<Equipo>();
        try {
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Equipo");
            misEquipo = (List<Equipo>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return misEquipo;
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
    public Date setActualizarTorneo(int dato, String nombre, Date date,Date date2,int cod) {
    String Nombre=nombre;
     Deporte deporte=(Deporte) session.load(Deporte.class, cod);
     Torneo aux=new Torneo();
     aux.setIdTorneo(dato);
     aux.setNombreTorneo(Nombre);
     aux.setFechaTorneoIn(date);
     aux.setFechaTorneoOu(date2);
     aux.setDeporte(deporte);
     session.clear();
     session.beginTransaction();
     session.update(aux); 
     session.getTransaction().commit();
     session.close();
    
    return date;
}
    public Date setCrearTorneo(String nombre, Date date,Date date2,int cod) {
    String Nombre=nombre;
     Deporte deporte=(Deporte) session.load(Deporte.class, cod);
     Torneo aux=new Torneo();
     aux.setIdTorneo(null);
     aux.setNombreTorneo(Nombre);
     aux.setFechaTorneoIn(date);
     aux.setFechaTorneoOu(date2);
     aux.setDeporte(deporte);
     session.clear();
     session.beginTransaction();
     session.save(aux); 
     session.getTransaction().commit();
     session.close();
    
    return date;
}    
     public static Date ParseFecha(String fecha) throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
       Date fechaDate = format.parse(fecha);
       
        return fechaDate;
    }
     
    public Deporte setCrearDeporte(String nombre){

     String no=nombre;
     // Torneo torneo=(Torneo) session.load(Torneo.class,1);
     Deporte aux=new Deporte();
     aux.setIdDeporte(null);
     aux.setNombreDeporte(no);
     session.clear();
     session.beginTransaction();
     session.save(aux); 
     session.getTransaction().commit();
     session.close();
        return null;
    }
    
    public Deporte getDeportes(int dato){
    
        Deporte deporte=(Deporte)session.get(Deporte.class,dato);
        return deporte;
    }
    
       public Torneo getTorneos(int dato){
    
        Torneo torneo=(Torneo)session.get(Torneo.class,dato);
        return torneo;
    }
       public Equipo getEquipos(int dato){
    
        Equipo equipo=(Equipo)session.get(Equipo.class,dato);
        return equipo;
    }
    public Deporte setEliminar(int dato) {
     Deporte deporte=(Deporte)session.get(Deporte.class,dato);
     Integer aux1=deporte.getIdDeporte();
     String no=deporte.getNombreDeporte();
     Torneo torneo=(Torneo) session.load(Torneo.class,dato);
     Deporte aux=new Deporte();
     aux.setIdDeporte(aux1);
     aux.setNombreDeporte(no);
     session.clear();
     session.beginTransaction();
    // session.delete(aux); 
    // session.getTransaction().commit();
     //session.close();*/
     return deporte;
}

}
