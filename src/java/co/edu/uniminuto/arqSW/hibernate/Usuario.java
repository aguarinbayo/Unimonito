package co.edu.uniminuto.arqSW.hibernate;
// Generated 20/03/2019 11:53:12 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="Usuario"
    ,catalog="unimonito"
)
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private Roles roles;
     private String nombreUsuario;
     private Integer cedulaUsuario;
     private String correoUsuario;
     private String passUsuario;
     private Set<Boleteria> boleterias = new HashSet<Boleteria>(0);
     private Set<Apuesta> apuestas = new HashSet<Apuesta>(0);

    public Usuario() {
    }

    public Usuario(Roles roles, String nombreUsuario, Integer cedulaUsuario, String correoUsuario, String passUsuario, Set<Boleteria> boleterias, Set<Apuesta> apuestas) {
       this.roles = roles;
       this.nombreUsuario = nombreUsuario;
       this.cedulaUsuario = cedulaUsuario;
       this.correoUsuario = correoUsuario;
       this.passUsuario = passUsuario;
       this.boleterias = boleterias;
       this.apuestas = apuestas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idUsuario", unique=true, nullable=false)
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_Usuario")
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    
    @Column(name="nombreUsuario", length=45)
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
    @Column(name="CedulaUsuario")
    public Integer getCedulaUsuario() {
        return this.cedulaUsuario;
    }
    
    public void setCedulaUsuario(Integer cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    
    @Column(name="correoUsuario", length=45)
    public String getCorreoUsuario() {
        return this.correoUsuario;
    }
    
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    
    @Column(name="passUsuario", length=45)
    public String getPassUsuario() {
        return this.passUsuario;
    }
    
    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set<Boleteria> getBoleterias() {
        return this.boleterias;
    }
    
    public void setBoleterias(Set<Boleteria> boleterias) {
        this.boleterias = boleterias;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set<Apuesta> getApuestas() {
        return this.apuestas;
    }
    
    public void setApuestas(Set<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    public void setParameter(String correo, String correo0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}


