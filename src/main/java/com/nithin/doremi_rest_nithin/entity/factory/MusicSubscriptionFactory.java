package com.nithin.doremi_rest_nithin.entity.factory;

import com.nithin.doremi_rest_nithin.entity.Subscription;
import com.nithin.doremi_rest_nithin.entity.music.FreeMusicSubscription;
import com.nithin.doremi_rest_nithin.entity.music.PersonalMusicSubscription;
import com.nithin.doremi_rest_nithin.entity.music.PremiumMusicSubscription;
import com.nithin.doremi_rest_nithin.enums.SubscriptionPlan;

public class MusicSubscriptionFactory extends AbstractFactory {
	@Override
	Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType) {
		switch (subscriptionPlanType) {
		case FREE:
			return new FreeMusicSubscription();
		case PERSONAL:
			return new PersonalMusicSubscription();
		case PREMIUM:
			return new PremiumMusicSubscription();
		}
		return null;
	}
}
