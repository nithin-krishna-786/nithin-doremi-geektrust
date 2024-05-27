package com.nithin.doremi_rest_nithin.entity.factory;

import com.nithin.doremi_rest_nithin.entity.Subscription;
import com.nithin.doremi_rest_nithin.entity.video.FreeVideoSubscription;
import com.nithin.doremi_rest_nithin.entity.video.PersonalVideoSubscription;
import com.nithin.doremi_rest_nithin.entity.video.PremiumVideoSubscription;
import com.nithin.doremi_rest_nithin.enums.SubscriptionPlan;

public class VideoSubscriptionFactory extends AbstractFactory {
	@Override
	Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType) {
		switch (subscriptionPlanType) {
		case FREE:
			return new FreeVideoSubscription();
		case PERSONAL:
			return new PersonalVideoSubscription();
		case PREMIUM:
			return new PremiumVideoSubscription();
		}
		return null;
	}
}
