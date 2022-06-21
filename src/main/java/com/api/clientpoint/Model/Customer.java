package com.api.clientpoint.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.SpringApplication;

import com.api.clientpoint.ClientPointApplication;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 150)
	private String name;

	@Column(nullable = false, length = 11)
	private String cpf;

	@Column()
	private LocalDateTime registerDate;

}