package com.nithin.doremi_rest_nithin.entity.video;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Subscription;

public class FreeVideoSubscription extends Subscription {
	public FreeVideoSubscription() {
		super.price = Constants.VIDEO_SUBSCRIPTION_FREE_PLAN_PRICE;
		super.validityInMonths = Constants.VIDEO_SUBSCRIPTION_FREE_PLAN_VALIDITY;
	}
}
