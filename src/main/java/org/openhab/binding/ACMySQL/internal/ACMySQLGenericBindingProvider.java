/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.binding.ACMySQL.internal;

import org.openhab.binding.ACDBCommon.internal.ACDBGenericBindingProvider;


/**
 * <p>
 * MySQL Binding Provider
 * </p>
 *
 * @author kazuhiro Matsuda
 * @since 1.8.0
 */
public class ACMySQLGenericBindingProvider extends ACDBGenericBindingProvider {
	@Override
	public String getBindingType() {
		return "acmysql";
	}
}
