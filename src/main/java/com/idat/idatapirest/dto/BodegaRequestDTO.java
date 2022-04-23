package com.idat.idatapirest.dto;

public class BodegaRequestDTO {
	private Integer idRequest;
    private String NomBodeja;
    private String direccion;
    
	
	public Integer getIdRequest() {
		return idRequest;
	}
	public void setIdRequest(Integer idRequest) {
		this.idRequest = idRequest;
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
