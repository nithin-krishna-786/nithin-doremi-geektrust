package com.nithin.doremi_rest_nithin.entity.podcast;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Subscription;

public class PersonalPodCastSubscription extends Subscription {
	public PersonalPodCastSubscription() {
		super.price = Constants.PODCAST_SUBSCRIPTION_PERSONAL_PLAN_PRICE;
		super.validityInMonths = Constants.PODCAST_SUBSCRIPTION_PERSONAL_PLAN_VALIDITY;
	}
}
