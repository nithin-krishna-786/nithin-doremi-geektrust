package com.nithin.doremi_rest_nithin.entity.device;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Device;

public class FourDevice extends Device {
	
	public FourDevice() {
		super.price = Constants.FOUR_DEVICE_TOP_UP_PLAN_PRICE_PER_MONTH;
	}
}
