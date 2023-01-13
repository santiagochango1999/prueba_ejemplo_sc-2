package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="citamedica")
public class CitaMedica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cime_seq")
	@SequenceGenerator(name = "cime_seq", sequenceName = "cime_seq", allocationSize = 1)
	@Column(name="cime_id")
	private Integer id;
	@Column(name="cime_numero_cita")
	private Integer numeroCita;
	@Column(name="cime_fecha_cita")
	private LocalDateTime fechaCita;
	@Column(name="cime_valor_cita")
	private BigDecimal valorCita;
	@Column(name="cime_lugar_cita")
	private String lugarCita;
	@Column(name="cime_diagnostico")
	private String diagnostico;
	@Column(name="cime_receta")
	private String receta;
	@Column(name="cime_fecha_proxima_cita")
	private LocalDateTime fechaProximaCita;
	
	@Column(name="doct_id")
	private Integer idDoctor;
	@Column(name="paci_id")
	private Integer idPaciente;
	
	//METODOS GET Y SET
	
	
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numeroCita=" + numeroCita + ", fechaCita=" + fechaCita + ", valorCita="
				+ valorCita + ", lugarCita=" + lugarCita + ", diagnostico=" + diagnostico + ", receta=" + receta
				+ ", fechaProximaCita=" + fechaProximaCita + ", idDoctor=" + idDoctor + ", idPaciente=" + idPaciente
				+ "]";
	}
	public Integer getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroCita() {
		return numeroCita;
	}
	public void setNumeroCita(Integer numeroCita) {
		this.numeroCita = numeroCita;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public BigDecimal getValorCita() {
		return valorCita;
	}
	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}
	public String getLugarCita() {
		return lugarCita;
	}
	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public LocalDateTime getFechaProximaCita() {
		return fechaProximaCita;
	}
	public void setFechaProximaCita(LocalDateTime fechaProximaCita) {
		this.fechaProximaCita = fechaProximaCita;
	}
	
	
	
	

}
