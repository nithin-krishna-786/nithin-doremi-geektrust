package com.nithin.doremi_rest_nithin.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Device;
import com.nithin.doremi_rest_nithin.entity.DoReMiSubscription;
import com.nithin.doremi_rest_nithin.entity.Subscription;
import com.nithin.doremi_rest_nithin.entity.factory.DeviceFactory;
import com.nithin.doremi_rest_nithin.entity.factory.SubscriptionFactoryProducer;
import com.nithin.doremi_rest_nithin.enums.DeviceType;
import com.nithin.doremi_rest_nithin.enums.SubscriptionCategory;
import com.nithin.doremi_rest_nithin.enums.SubscriptionPlan;
import com.nithin.doremi_rest_nithin.enums.SubscriptionStatus;
import com.nithin.doremi_rest_nithin.enums.TopUpStatus;
import com.nithin.doremi_rest_nithin.exceptions.AddSubscriptionFailedException;
import com.nithin.doremi_rest_nithin.exceptions.AddTopUpFailedException;
import com.nithin.doremi_rest_nithin.exceptions.InvalidDateException;

public class SubscriptionService implements ISubscriptionService{
    private final DoReMiSubscription doReMiSubscription;
    private final DateTimeFormatter dateFormatter;

    public SubscriptionService(DoReMiSubscription doReMiSubscription) {
        this.doReMiSubscription = doReMiSubscription;
        this.dateFormatter=DateTimeFormatter.ofPattern(Constants.DATE_FORMAT);
    }

    private boolean isAValidStringDate(String dateStr){
        try {
            LocalDate.parse(dateStr, dateFormatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }
    @Override
    public void startSubscriptionForUser(String dateStr) throws InvalidDateException {
        if(!isAValidStringDate(dateStr)) 
        		throw new InvalidDateException("INVALID_DATE");
        LocalDate startingDate=LocalDate.parse(dateStr,dateFormatter);
        doReMiSubscription.addDateOfSubscription(startingDate);
    }

    @Override
    public void addSubscriptionForUser(SubscriptionCategory subscriptionCategory, SubscriptionPlan subscriptionPlan)throws AddSubscriptionFailedException{
        if(doReMiSubscription.getSubscriptionStatus().equals(SubscriptionStatus.NOT_STARTED)) 
        		throw new AddSubscriptionFailedException("ADD_SUBSCRIPTION_FAILED INVALID_DATE");
        if(doReMiSubscription.isSubscriptionCategoryExistInCurrentPlan(subscriptionCategory)) 
        		throw new AddSubscriptionFailedException("ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY");
        
        Subscription subscription= SubscriptionFactoryProducer.getSubscription(subscriptionCategory,subscriptionPlan);
        doReMiSubscription.addSubscriptionToCurrentPlan(subscriptionCategory,subscription);
    }

    @Override
    public void addTopUpForUser(DeviceType deviceType, Integer noOfMonths)throws AddTopUpFailedException {
    	
        if(doReMiSubscription.getSubscriptionStatus().equals(SubscriptionStatus.NOT_STARTED)) 
        		throw new AddTopUpFailedException("ADD_TOPUP_FAILED INVALID_DATE");
        if(doReMiSubscription.getSubscriptionStatus().equals(SubscriptionStatus.STARTED))
        		throw new AddTopUpFailedException("ADD_TOPUP_FAILED SUBSCRIPTIONS_NOT_FOUND");
        if(doReMiSubscription.getTopUpStatus().equals(TopUpStatus.ADDED)) 
        		throw new AddTopUpFailedException("ADD_TOPUP_FAILED DUPLICATE_TOPUP");
        
        Device device= DeviceFactory.getDevice(deviceType);
        doReMiSubscription.addAdditionalDevices(device,noOfMonths);
    }
}
