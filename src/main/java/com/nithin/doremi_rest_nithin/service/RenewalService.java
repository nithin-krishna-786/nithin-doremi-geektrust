package com.nithin.doremi_rest_nithin.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.dto.RenewalAmountDto;
import com.nithin.doremi_rest_nithin.dto.RenewalReminderDto;
import com.nithin.doremi_rest_nithin.entity.Device;
import com.nithin.doremi_rest_nithin.entity.DoReMiSubscription;
import com.nithin.doremi_rest_nithin.entity.Subscription;
import com.nithin.doremi_rest_nithin.enums.SubscriptionCategory;
import com.nithin.doremi_rest_nithin.enums.SubscriptionStatus;
import com.nithin.doremi_rest_nithin.enums.TopUpStatus;
import com.nithin.doremi_rest_nithin.exceptions.SubscriptionNotFoundException;

public class RenewalService implements IRenewalService {
	private final DoReMiSubscription doReMiSubscription;

	public RenewalService(DoReMiSubscription doReMiSubscription) {
		this.doReMiSubscription = doReMiSubscription;
	}

	@Override
	public List<RenewalReminderDto> calculateListOfRenewalDateOfSubscriptions() throws SubscriptionNotFoundException {

		if (doReMiSubscription.getSubscriptionStatus().equals(SubscriptionStatus.NOT_STARTED))
			throw new SubscriptionNotFoundException("SUBSCRIPTIONS_NOT_FOUND");
		
		if (doReMiSubscription.getSubscriptionStatus().equals(SubscriptionStatus.STARTED))
			throw new SubscriptionNotFoundException("SUBSCRIPTIONS_NOT_FOUND");

		List<RenewalReminderDto> renewalReminderDtoList = new ArrayList<>();
		Map<SubscriptionCategory, Subscription> subscriptionMap = doReMiSubscription.getListOfSubscription();

		for (SubscriptionCategory subscriptionCategory : subscriptionMap.keySet()) {
			LocalDate renewalDate = doReMiSubscription.getStartDateOfSubscription()
					.plusMonths(subscriptionMap.get(subscriptionCategory).getValidityInMonths())
					.minusDays(Constants.NO_OF_DAYS_BEFORE_TO_NOTIFIED);
			renewalReminderDtoList.add(new RenewalReminderDto(renewalDate, subscriptionCategory));
		}

		return renewalReminderDtoList;
	}

	@Override
	public RenewalAmountDto calculateRenewalAmount() {
		double amount = 0.0;
		Map<SubscriptionCategory, Subscription> subscriptionMap = doReMiSubscription.getListOfSubscription();
		
		for (Subscription subscription : subscriptionMap.values()) {
			amount += subscription.getPrice();
		}
		
		Device extraDevices = doReMiSubscription.getDevice();
		if (doReMiSubscription.getTopUpStatus().equals(TopUpStatus.ADDED) && extraDevices != null)
			amount += (extraDevices.getPrice() * doReMiSubscription.getNoOfMonthsForTopUp());
		
		return new RenewalAmountDto((int) amount);
	}
}
