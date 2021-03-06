/**
 * Copyright 2012-, Cloudsmith Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.cloudsmith.stackhammer.api.client;

import java.io.IOException;

import com.puppetlabs.geppetto.diagnostic.Diagnostic;

/**
 * This exception is thrown when the server encounters abnormal behavior such
 * as internal server errors.
 */
public class RequestException extends IOException {
	private static final long serialVersionUID = -1088064346951892512L;

	private final Diagnostic error;

	private final int code;

	public RequestException(Diagnostic error, int code) {
		super();
		this.error = error;
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public Diagnostic getError() {
		return error;
	}

	@Override
	public String getMessage() {
		return error.toString();
	}
}
