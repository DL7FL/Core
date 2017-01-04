/*
 * DAPNET CORE PROJECT
 * Copyright (C) 2016
 *
 * Daniel Sialkowski
 *
 * daniel.sialkowski@rwth-aachen.de
 *
 * Institute of High Frequency Technology
 * RWTH AACHEN UNIVERSITY
 * Melatener Str. 25
 * 52074 Aachen
 */

package org.dapnet.core.transmission;

import org.dapnet.core.model.Transmitter;

public class PR430 extends Raspager {
	private static final long serialVersionUID = 1208569785866432982L;

	public PR430(Transmitter transmitter, TransmitterDeviceListener listener) {
		super(transmitter, listener, DeviceType.PR430);
	}
}
