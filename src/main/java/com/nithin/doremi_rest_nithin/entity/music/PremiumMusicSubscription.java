package com.nithin.doremi_rest_nithin.entity.music;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Subscription;

public class PremiumMusicSubscription extends Subscription {
	public PremiumMusicSubscription() {
		super.price = Constants.MUSIC_SUBSCRIPTION_PREMIUM_PLAN_PRICE;
		super.validityInMonths = Constants.MUSIC_SUBSCRIPTION_PREMIUM_PLAN_VALIDITY;
	}
}
