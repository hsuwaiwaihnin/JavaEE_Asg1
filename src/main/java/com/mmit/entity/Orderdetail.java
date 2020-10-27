package com.mmit.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Orderdetail implements Serializable {

	@Id
	private int id;
	private int subQty;
	private int subPrice;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Orders order;
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;

	public int getSubQty() {
		return subQty;
	}

	public void setSubQty(int subQty) {
		this.subQty = subQty;
	}

	public int getSubPrice() {
		return subPrice;
	}

	public void setSubPrice(int subPrice) {
		this.subPrice = subPrice;
	}

	private static final long serialVersionUID = 1L;

	public Orderdetail() {
		super();
	}
	
   
}
