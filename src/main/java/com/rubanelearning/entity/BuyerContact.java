package com.rubanelearning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BUYER_CONTACTS")
public class BuyerContact extends BaseEntity {

	private static final long serialVersionUID = -5002211688803452505L;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "CONTACT")
	private String contact;

	@Column(name = "FAX")
	private String fax;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "BUYER_ID", nullable = false)
	private Buyer buyer;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

}