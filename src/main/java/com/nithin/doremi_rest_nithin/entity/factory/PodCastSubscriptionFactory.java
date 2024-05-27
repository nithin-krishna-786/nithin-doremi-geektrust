package com.nithin.doremi_rest_nithin.entity.factory;

import com.nithin.doremi_rest_nithin.entity.Subscription;
import com.nithin.doremi_rest_nithin.entity.podcast.FreePodCastSubscription;
import com.nithin.doremi_rest_nithin.entity.podcast.PersonalPodCastSubscription;
import com.nithin.doremi_rest_nithin.entity.podcast.PremiumPodCastSubscription;
import com.nithin.doremi_rest_nithin.enums.SubscriptionPlan;

public class PodCastSubscriptionFactory extends AbstractFactory {
	@Override
	Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType) {
		switch (subscriptionPlanType) {
		case FREE:
			return new FreePodCastSubscription();
		case PERSONAL:
			return new PersonalPodCastSubscription();
		case PREMIUM:
			return new PremiumPodCastSubscription();
		}
		return null;
	}
}
