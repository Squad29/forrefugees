package com.forRefugees.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contratante implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nomeContratante;
	private String cpfContratante;
	private String cnpjContratante;
	private String enderecoContratante;
	private String bairroContratante;
	private String cidadeContratante;
	private String estadoContratante;
	private String seguimentoContratante;
	private String telefoneContratante;
	private String emailContratante;
	private int valorHoraContratante;
	private String bioContratante;
	private Date dataCadastroContratante = new java.sql.Date(System.currentTimeMillis());
	
	public Contratante() {
		
	}

	public Contratante(Long id, String nomeContratante, String cpfContratante, String cnpjContratante,
			String enderecoContratante, String bairroContratante, String cidadeContratante, String estadoContratante,
			String seguimentoContratante, String telefoneContratante, String emailContratante, int valorHoraContratante,
			String bioContratante, Date dataCadastroContratante) {
		this.Id = id;
		this.nomeContratante = nomeContratante;
		this.cpfContratante = cpfContratante;
		this.cnpjContratante = cnpjContratante;
		this.enderecoContratante = enderecoContratante;
		this.bairroContratante = bairroContratante;
		this.cidadeContratante = cidadeContratante;
		this.estadoContratante = estadoContratante;
		this.seguimentoContratante = seguimentoContratante;
		this.telefoneContratante = telefoneContratante;
		this.emailContratante = emailContratante;
		this.valorHoraContratante = valorHoraContratante;
		this.bioContratante = bioContratante;
		this.dataCadastroContratante = dataCadastroContratante;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNomeContratante() {
		return nomeContratante;
	}

	public void setNomeContratante(String nomeContratante) {
		this.nomeContratante = nomeContratante;
	}

	public String getCpfContratante() {
		return cpfContratante;
	}

	public void setCpfContratante(String cpfContratante) {
		this.cpfContratante = cpfContratante;
	}

	public String getCnpjContratante() {
		return cnpjContratante;
	}

	public void setCnpjContratante(String cnpjContratante) {
		this.cnpjContratante = cnpjContratante;
	}

	public String getEnderecoContratante() {
		return enderecoContratante;
	}

	public void setEnderecoContratante(String enderecoContratante) {
		this.enderecoContratante = enderecoContratante;
	}

	public String getBairroContratante() {
		return bairroContratante;
	}

	public void setBairroContratante(String bairroContratante) {
		this.bairroContratante = bairroContratante;
	}

	public String getCidadeContratante() {
		return cidadeContratante;
	}

	public void setCidadeContratante(String cidadeContratante) {
		this.cidadeContratante = cidadeContratante;
	}

	public String getEstadoContratante() {
		return estadoContratante;
	}

	public void setEstadoContratante(String estadoContratante) {
		this.estadoContratante = estadoContratante;
	}

	public String getSeguimentoContratante() {
		return seguimentoContratante;
	}

	public void setSeguimentoContratante(String seguimentoContratante) {
		this.seguimentoContratante = seguimentoContratante;
	}

	public String getTelefoneContratante() {
		return telefoneContratante;
	}

	public void setTelefoneContratante(String telefoneContratante) {
		this.telefoneContratante = telefoneContratante;
	}

	public String getEmailContratante() {
		return emailContratante;
	}

	public void setEmailContratante(String emailContratante) {
		this.emailContratante = emailContratante;
	}

	public int getValorHoraContratante() {
		return valorHoraContratante;
	}

	public void setValorHoraContratante(int valorHoraContratante) {
		this.valorHoraContratante = valorHoraContratante;
	}

	public String getBioContratante() {
		return bioContratante;
	}

	public void setBioContratante(String bioContratante) {
		this.bioContratante = bioContratante;
	}

	public Date getDataCadastroContratante() {
		return dataCadastroContratante;
	}

	public void setDataCadastroContratante(Date dataCadastroContratante) {
		this.dataCadastroContratante = dataCadastroContratante;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
