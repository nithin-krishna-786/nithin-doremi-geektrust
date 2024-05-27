package com.nithin.doremi_rest_nithin.service;


import java.util.List;

import com.nithin.doremi_rest_nithin.dto.RenewalAmountDto;
import com.nithin.doremi_rest_nithin.dto.RenewalReminderDto;
import com.nithin.doremi_rest_nithin.exceptions.SubscriptionNotFoundException;

public interface IRenewalService {
    List<RenewalReminderDto> calculateListOfRenewalDateOfSubscriptions() throws SubscriptionNotFoundException;
    RenewalAmountDto calculateRenewalAmount();
}
