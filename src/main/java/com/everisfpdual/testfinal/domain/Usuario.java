package com.everisfpdual.testfinal.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author ngalindg
 * @version 1.1
 * @since 10/06/2020
 *
 */
@Entity
@Table(name = "users")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	// Enunciado: Desarrolla la entidad para obtener los datos de BBDD

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "email")
	private String email;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "password")
	private String password;

	public Usuario() {

	}

	/**
	 * constructor clase Usuario
	 * 
	 * @param id
	 * @param email
	 * @param firstname
	 * @param lastname
	 * @param password
	 */
	public Usuario(Integer id, String email, String firstname, String lastname, String password) {
		this.id = id;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;

	}

	/**
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * id
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * email
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * firstname
	 * 
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * 
	 * @return lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * lastname
	 * 
	 * @param firstname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
