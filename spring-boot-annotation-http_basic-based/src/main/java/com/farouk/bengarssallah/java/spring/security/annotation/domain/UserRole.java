package com.farouk.bengarssallah.java.spring.security.annotation.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class UserRole extends AEntity implements Serializable {
	@Column(name = "type", unique = true, nullable = false)
	private String type;

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}
}