/**
 * Copyright (c) 2012 Cloudsmith Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Thomas Hallgren (Cloudsmith Inc.) - initial API and implementation
 */

package org.cloudsmith.stackhammer.api.model;

/**
 * An entry describing an event in time
 */
public class LogEntry extends MessageWithSeverity {
	private static final long serialVersionUID = 7954938050835971411L;

	private long timestamp;

	private String logicalOrigin;

	private String physicalOrigin;

	private String exceptionMessage;

	private String stackTrace;

	/**
	 * The exception message if this entry contains exception
	 * information
	 */
	public String getExceptionMessage() {
		return exceptionMessage;
	}

	/**
	 * What logical entity that this entry originated from. Typically
	 * the name of a Stack Hammer host.
	 */
	public String getLogicalOrigin() {
		return logicalOrigin;
	}

	/**
	 * What physical entity that this entry originated from. Typically an AWS instanceID.
	 */
	public String getPhysicalOrigin() {
		return physicalOrigin;
	}

	/**
	 * Stack trace if this entry contains exception information
	 */
	public String getStackTrace() {
		return stackTrace;
	}

	/**
	 * Millisecond timestamp of when this entry was generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public void setLogicalOrigin(String logicalOrigin) {
		this.logicalOrigin = logicalOrigin;
	}

	public void setPhysicalOrigin(String physicalOrigin) {
		this.physicalOrigin = physicalOrigin;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}