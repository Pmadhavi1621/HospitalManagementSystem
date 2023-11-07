package com.hms.Entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="doctor")
public class Doctor {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length=10)
    private int doctor_id;
    @Column(length=20)
    @NotNull
    private String doctor_name;
    @Column(length=30)
    @NotNull
    private String specialization;
    
    @NotNull
    @Column(length=30)
    private String phone_number;
    
  //one doctor can check many patients
    @OneToMany(cascade = CascadeType.PERSIST,fetch=FetchType.LAZY) 
	@JsonIgnoreProperties("doctor")
    List<Patient>patients ;

	public void setDoctor(List<Patient> patients2) {
		// TODO Auto-generated method stub
		
	}
    
}