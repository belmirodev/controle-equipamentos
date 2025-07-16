package com.controleequipamento.dto;

import java.io.Serializable;
import java.util.Objects;

import com.controleequipamento.enums.StatusEquipamento;

public class EquipamentoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
    private String serial;
    private String modelo;
    private String marca;
    private StatusEquipamento status;
    
    public EquipamentoDTO() {
		// TODO Auto-generated constructor stub
	}

	public EquipamentoDTO(Long id, String serial, String modelo, String marca, StatusEquipamento status) {
		super();
		this.id = id;
		this.serial = serial;
		this.modelo = modelo;
		this.marca = marca;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public StatusEquipamento getStatus() {
		return status;
	}

	public void setStatus(StatusEquipamento status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquipamentoDTO other = (EquipamentoDTO) obj;
		return Objects.equals(id, other.id);
	}
    
    
	
}
