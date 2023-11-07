package com.hms.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length=10)
     private int patient_id;
    @Column(length=20)
    private String patient_name;
    @Column(length=5)
    private String age;
    @Column(length=40)
    private String disease;
    @Column(length=20)
    private String gender;
 
    @JsonIgnore
 @ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="doctor_id")
@JsonIgnoreProperties
	private Doctor doctor;

	
 

}
