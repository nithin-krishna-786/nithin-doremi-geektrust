package com.nithin.doremi_rest_nithin.entity.podcast;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Subscription;

public class FreePodCastSubscription extends Subscription {
	public FreePodCastSubscription() {
		super.price = Constants.PODCAST_SUBSCRIPTION_FREE_PLAN_PRICE;
		super.validityInMonths = Constants.PODCAST_SUBSCRIPTION_FREE_PLAN_VALIDITY;
	}
}
