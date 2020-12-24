package com.rubanelearning.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "BUYERS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Buyer extends BaseEntity {

	private static final long serialVersionUID = -605580846371197508L;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "GENDER")
	private String gender;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "buyer")
	private BuyerContact buyerContact;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BuyerContact getBuyerContact() {
		return buyerContact;
	}

	public void setBuyerContact(BuyerContact buyerContact) {
		this.buyerContact = buyerContact;
	}

}