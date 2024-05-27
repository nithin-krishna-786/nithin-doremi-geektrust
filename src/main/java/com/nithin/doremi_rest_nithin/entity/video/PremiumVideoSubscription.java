package com.nithin.doremi_rest_nithin.entity.video;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Subscription;

public class PremiumVideoSubscription extends Subscription {
	public PremiumVideoSubscription() {
		super.price = Constants.VIDEO_SUBSCRIPTION_PREMIUM_PLAN_PRICE;
		super.validityInMonths = Constants.VIDEO_SUBSCRIPTION_PREMIUM_PLAN_VALIDITY;
	}
}
