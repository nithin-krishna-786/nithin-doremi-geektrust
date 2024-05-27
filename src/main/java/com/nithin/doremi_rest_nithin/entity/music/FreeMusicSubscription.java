package com.nithin.doremi_rest_nithin.entity.music;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Subscription;

public class FreeMusicSubscription extends Subscription {
	public FreeMusicSubscription() {
		super.price = Constants.MUSIC_SUBSCRIPTION_FREE_PLAN_PRICE;
		super.validityInMonths = Constants.MUSIC_SUBSCRIPTION_FREE_PLAN_VALIDITY;
	}
}
