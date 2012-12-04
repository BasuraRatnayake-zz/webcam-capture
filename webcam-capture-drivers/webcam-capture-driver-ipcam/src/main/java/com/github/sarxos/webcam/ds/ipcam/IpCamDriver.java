package com.github.sarxos.webcam.ds.ipcam;

import java.util.Collections;
import java.util.List;

import com.github.sarxos.webcam.WebcamDevice;
import com.github.sarxos.webcam.WebcamDriver;


/**
 * IP camera driver.
 * 
 * @author Bartosz Firyn (SarXos)
 */
public class IpCamDriver implements WebcamDriver {

	@Override
	public List<WebcamDevice> getDevices() {
		return Collections.unmodifiableList((List<? extends WebcamDevice>) IpCamDeviceRegistry.getIpCameras());
	}

	public void register(IpCamDevice device) {
		IpCamDeviceRegistry.register(device);
	}
}