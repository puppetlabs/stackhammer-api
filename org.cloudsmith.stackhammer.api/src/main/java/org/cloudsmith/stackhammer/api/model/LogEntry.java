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
package org.cloudsmith.stackhammer.api.model;

/**
 * An entry describing an event in time
 */
public class LogEntry extends MessageWithSeverity {
	private static final long serialVersionUID = 9170716483071240390L;

	private long timestamp;

	private String logicalOrigin;

	private String physicalOrigin;

	private String exceptionMessage;

	private String details;

	/**
	 * Stack trace if this entry contains exception information
	 */
	public String getDetails() {
		return details;
	}

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
	 * Millisecond timestamp of when this entry was generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	public void setDetails(String details) {
		this.details = details;
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

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
