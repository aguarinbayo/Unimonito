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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Deporte generated by hbm2java
 */
@Entity
@Table(name="Deporte"
    ,catalog="unimonito"
)
public class Deporte  implements java.io.Serializable {


     private Integer idDeporte;
     private String nombreDeporte;
     private Set<Torneo> torneos = new HashSet<Torneo>(0);

    public Deporte() {
    }

    public Deporte(String nombreDeporte, Set<Torneo> torneos) {
       this.nombreDeporte = nombreDeporte;
       this.torneos = torneos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idDeporte", unique=true, nullable=false)
    public Integer getIdDeporte() {
        return this.idDeporte;
    }
    
    public void setIdDeporte(Integer idDeporte) {
        this.idDeporte = idDeporte;
    }

    
    @Column(name="nombreDeporte", length=45)
    public String getNombreDeporte() {
        return this.nombreDeporte;
    }
    
    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="deporte")
    public Set<Torneo> getTorneos() {
        return this.torneos;
    }
    
    public void setTorneos(Set<Torneo> torneos) {
        this.torneos = torneos;
    }




}


