package com.nithin.doremi_rest_nithin.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.enums.SubscriptionCategory;

public class RenewalReminderDto {

	private final SubscriptionCategory subscriptionCategory;
	private final LocalDate renewalDate;

	public RenewalReminderDto(LocalDate renewalDate, SubscriptionCategory subscriptionCategory) {
		this.renewalDate = renewalDate;
		this.subscriptionCategory = subscriptionCategory;
	}

	@Override
	public String toString() {
		return "RENEWAL_REMINDER " + subscriptionCategory + " "
				+ DateTimeFormatter.ofPattern(Constants.DATE_FORMAT).format(renewalDate);
	}
}
