package co.edu.uniminuto.arqSW.hibernate;
// Generated 20/03/2019 11:53:12 AM by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Catalogo generated by hbm2java
 */
@Entity
@Table(name="Catalogo"
    ,catalog="unimonito"
)
public class Catalogo  implements java.io.Serializable {


     private Integer idCatalogo;
     private Equipo equipoByCodEquipo2;
     private Equipo equipoByCodEquipo1;
     private Date fechaIn;
     private Date fechaFn;
     private Float entrada;
     private Set<Apuesta> apuestas = new HashSet<Apuesta>(0);
     private Set<Boleteria> boleterias = new HashSet<Boleteria>(0);

    public Catalogo() {
    }

    public Catalogo(Equipo equipoByCodEquipo2, Equipo equipoByCodEquipo1, Date fechaIn, Date fechaFn, Float entrada, Set<Apuesta> apuestas, Set<Boleteria> boleterias) {
       this.equipoByCodEquipo2 = equipoByCodEquipo2;
       this.equipoByCodEquipo1 = equipoByCodEquipo1;
       this.fechaIn = fechaIn;
       this.fechaFn = fechaFn;
       this.entrada = entrada;
       this.apuestas = apuestas;
       this.boleterias = boleterias;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idCatalogo", unique=true, nullable=false)
    public Integer getIdCatalogo() {
        return this.idCatalogo;
    }
    
    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_Equipo2")
    public Equipo getEquipoByCodEquipo2() {
        return this.equipoByCodEquipo2;
    }
    
    public void setEquipoByCodEquipo2(Equipo equipoByCodEquipo2) {
        this.equipoByCodEquipo2 = equipoByCodEquipo2;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_Equipo1")
    public Equipo getEquipoByCodEquipo1() {
        return this.equipoByCodEquipo1;
    }
    
    public void setEquipoByCodEquipo1(Equipo equipoByCodEquipo1) {
        this.equipoByCodEquipo1 = equipoByCodEquipo1;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FechaIn", length=10)
    public Date getFechaIn() {
        return this.fechaIn;
    }
    
    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FechaFn", length=10)
    public Date getFechaFn() {
        return this.fechaFn;
    }
    
    public void setFechaFn(Date fechaFn) {
        this.fechaFn = fechaFn;
    }

    
    @Column(name="Entrada", precision=12, scale=0)
    public Float getEntrada() {
        return this.entrada;
    }
    
    public void setEntrada(Float entrada) {
        this.entrada = entrada;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="catalogo")
    public Set<Apuesta> getApuestas() {
        return this.apuestas;
    }
    
    public void setApuestas(Set<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="catalogo")
    public Set<Boleteria> getBoleterias() {
        return this.boleterias;
    }
    
    public void setBoleterias(Set<Boleteria> boleterias) {
        this.boleterias = boleterias;
    }




}


