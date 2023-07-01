package com.warofvar.sms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
		
}
