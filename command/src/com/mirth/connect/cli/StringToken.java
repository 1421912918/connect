/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL
 * license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 */

package com.mirth.connect.cli;

public class StringToken extends Token {
	private String value;

	public StringToken(String value) {
		super(value);
		this.value = value;
	}

	boolean equalsIgnoreCase(String s) {
		return value.equalsIgnoreCase(s);
	}
}
