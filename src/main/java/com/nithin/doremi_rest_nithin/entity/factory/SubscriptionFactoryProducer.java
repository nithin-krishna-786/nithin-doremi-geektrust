package com.nithin.doremi_rest_nithin.entity.factory;

import com.nithin.doremi_rest_nithin.entity.Subscription;
import com.nithin.doremi_rest_nithin.enums.SubscriptionCategory;
import com.nithin.doremi_rest_nithin.enums.SubscriptionPlan;
import com.nithin.doremi_rest_nithin.exceptions.SubscriptionInvalidTypeException;

public class SubscriptionFactoryProducer {
	private static AbstractFactory getSubscriptionCategoryFactory(SubscriptionCategory subscriptionCategoryType) {
		switch (subscriptionCategoryType) {
		case MUSIC:
			return new MusicSubscriptionFactory();
		case VIDEO:
			return new VideoSubscriptionFactory();
		case PODCAST:
			return new PodCastSubscriptionFactory();
		}
		return null;
	}

	public static Subscription getSubscription(SubscriptionCategory subscriptionCategoryType,
			SubscriptionPlan subscriptionPlanType) {
		AbstractFactory abstractFactory = SubscriptionFactoryProducer
				.getSubscriptionCategoryFactory(subscriptionCategoryType);
		
		if (abstractFactory == null)
			throw new SubscriptionInvalidTypeException("SubscriptionCategory is Invalid!");
		
		Subscription subscription = abstractFactory.getSubscriptionPlan(subscriptionPlanType);
		if (subscription == null)
			throw new SubscriptionInvalidTypeException("SubscriptionPlan is Invalid!");
		return subscription;
	}
}
