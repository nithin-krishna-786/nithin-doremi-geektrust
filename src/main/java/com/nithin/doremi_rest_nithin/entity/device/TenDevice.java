package com.nithin.doremi_rest_nithin.entity.device;

import com.nithin.doremi_rest_nithin.constants.Constants;
import com.nithin.doremi_rest_nithin.entity.Device;

public class TenDevice extends Device {

	public TenDevice() {
		super.price = Constants.TEN_DEVICE_TOP_UP_PLAN_PRICE_PER_MONTH;
	}
}
