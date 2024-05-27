package com.nithin.doremi_rest_nithin.entity.music;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Subscription;

public class PersonalMusicSubscription extends Subscription {
	public PersonalMusicSubscription() {
		super.price = Constants.MUSIC_SUBSCRIPTION_PERSONAL_PLAN_PRICE;
		super.validityInMonths = Constants.MUSIC_SUBSCRIPTION_PERSONAL_PLAN_VALIDITY;
	}
}
