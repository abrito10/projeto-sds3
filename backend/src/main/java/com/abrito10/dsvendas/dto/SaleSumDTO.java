package com.abrito10.dsvendas.dto;

import java.io.Serializable;

import com.abrito10.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String selletName;
	private Double sum;
	
	public SaleSumDTO() {
	}
	
	public SaleSumDTO(Seller seller, Double sum) {
		this.selletName = seller.getName();
		this.sum = sum;
	}

	public String getSelletName() {
		return selletName;
	}

	public void setSelletName(String selletName) {
		this.selletName = selletName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	

}
