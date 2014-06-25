package com.mvc.demo.commons.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Base Enitty class to hold common id property, shoould be extended
 * 
 * @author Dawid
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -8408390457896092709L;
	@Id
	@GeneratedValue
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
