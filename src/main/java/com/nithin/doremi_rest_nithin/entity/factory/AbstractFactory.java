package com.nithin.doremi_rest_nithin.entity.factory;

import com.nithin.doremi_rest_nithin.entity.Subscription;
import com.nithin.doremi_rest_nithin.enums.SubscriptionPlan;

public abstract class AbstractFactory {
	abstract Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType);
}
