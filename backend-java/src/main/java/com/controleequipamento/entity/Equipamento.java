package com.controleequipamento.entity;

import java.io.Serializable;

import com.controleequipamento.enums.StatusEquipamento;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Equipamento implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String serial;
	
	private String modelo;
	
	private String marca;
	
	@Enumerated(EnumType.STRING)
	private StatusEquipamento status;
	
	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionario funcionarioAtual;
	
	public Equipamento() {
		// TODO Auto-generated constructor stub
	}

	public Equipamento(Long id, String serial, String modelo, String marca, StatusEquipamento status,
			Funcionario funcionarioAtual) {
		super();
		this.id = id;
		this.serial = serial;
		this.modelo = modelo;
		this.marca = marca;
		this.status = status;
		this.funcionarioAtual = funcionarioAtual;
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

	public Funcionario getFuncionarioAtual() {
		return funcionarioAtual;
	}

	public void setFuncionarioAtual(Funcionario funcionarioAtual) {
		this.funcionarioAtual = funcionarioAtual;
	}

	@Override
	public String toString() {
		return "Equipamento [id=" + id + ", serial=" + serial + ", modelo=" + modelo + ", marca=" + marca + ", status="
				+ status + ", funcionarioAtual=" + (funcionarioAtual !=null ? funcionarioAtual.getId() : "null" )+ "]";
	}
	
	
	

}
