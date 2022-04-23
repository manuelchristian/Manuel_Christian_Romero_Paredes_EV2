package com.idat.idatapirest.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "bodega")
@Entity
public class Bodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBodeja;
    private String NomBodeja;
    private String direccion;

    @ManyToOne
    @JoinColumn(name="id_producto", nullable = false, unique = true,
            foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_producto) references products (id_producto)"))
    private Products product;

	public Integer getIdBodeja() {
		return idBodeja;
	}

	public void setIdBodeja(Integer idBodeja) {
		this.idBodeja = idBodeja;
	}

	public String getNomBodeja() {
		return NomBodeja;
	}

	public void setNomBodeja(String nomBodeja) {
		NomBodeja = nomBodeja;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
    
   

}