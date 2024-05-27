package com.nithin.doremi_rest_nithin.service;

import com.nithin.doremi_rest_nithin.enums.DeviceType;
import com.nithin.doremi_rest_nithin.enums.SubscriptionCategory;
import com.nithin.doremi_rest_nithin.enums.SubscriptionPlan;
import com.nithin.doremi_rest_nithin.exceptions.AddSubscriptionFailedException;
import com.nithin.doremi_rest_nithin.exceptions.AddTopUpFailedException;
import com.nithin.doremi_rest_nithin.exceptions.InvalidDateException;

public interface ISubscriptionService {
    void startSubscriptionForUser(String dateStr) throws InvalidDateException;
    void addSubscriptionForUser(SubscriptionCategory subscriptionCategory, SubscriptionPlan subscriptionPlan)throws AddSubscriptionFailedException;
    void addTopUpForUser(DeviceType deviceType, Integer noOfDays)throws AddTopUpFailedException;
}
