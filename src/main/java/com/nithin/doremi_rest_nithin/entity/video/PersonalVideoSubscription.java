package com.nithin.doremi_rest_nithin.entity.video;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Subscription;

public class PersonalVideoSubscription extends Subscription {
	public PersonalVideoSubscription() {
		super.price = Constants.VIDEO_SUBSCRIPTION_PERSONAL_PLAN_PRICE;
		super.validityInMonths = Constants.VIDEO_SUBSCRIPTION_PERSONAL_PLAN_VALIDITY;
	}
}
