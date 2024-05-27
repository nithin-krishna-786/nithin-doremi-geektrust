package com.nithin.doremi_rest_nithin.entity.podcast;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Subscription;

public class PremiumPodCastSubscription extends Subscription {
	public PremiumPodCastSubscription() {
		super.price = Constants.PODCAST_SUBSCRIPTION_PREMIUM_PLAN_PRICE;
		super.validityInMonths = Constants.PODCAST_SUBSCRIPTION_PREMIUM_PLAN_VALIDITY;
	}
}
