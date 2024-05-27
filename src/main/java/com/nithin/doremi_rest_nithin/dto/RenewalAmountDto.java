package com.nithin.doremi_rest_nithin.dto;

public class RenewalAmountDto {
	
	private final Integer renewalAmount;

	public RenewalAmountDto(Integer renewalAmount) {
		this.renewalAmount = renewalAmount;
	}

	@Override
	public String toString() {
		return "RENEWAL_AMOUNT" + " " + renewalAmount;
	}
}
