package com.nithin.doremi_rest_nithin.entity.factory;

import com.nithin.doremi_rest_nithin.entity.Device;
import com.nithin.doremi_rest_nithin.entity.device.FourDevice;
import com.nithin.doremi_rest_nithin.entity.device.TenDevice;
import com.nithin.doremi_rest_nithin.enums.DeviceType;

public class DeviceFactory {
	public static Device getDevice(DeviceType deviceType) {
		switch (deviceType) {
		case FOUR_DEVICE:
			return new FourDevice();
		case TEN_DEVICE:
			return new TenDevice();
		}
		return null;
	}
}
