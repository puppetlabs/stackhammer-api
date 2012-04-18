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

package org.cloudsmith.hammer.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URL;

import org.cloudsmith.hammer.api.model.Provider;
import org.cloudsmith.hammer.api.model.Repository;
import org.cloudsmith.hammer.api.service.RepositoryService;
import org.cloudsmith.hammer.api.service.StackHammerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author thhal
 * 
 */
public class RepositoryServiceTest extends AbstractTest {
	private static final String REPOSERVICE_URL = "https://api.stackhammer.com:443/user/repos";

	private RepositoryService service;

	@Before
	public void init() {
		StackHammerFactory factory = getStackHammerFactory();
		assertNotNull(factory);
		service = factory.createRepositoryService();
		assertNotNull(service);
	}

	@Test
	public void testCall() {
		try {
			FakeConnection conn = getFakeConnection();
			conn.setResponseCode(200);
			conn.setResponseMessage("OK");
			conn.setContent("{ name: \"cs-test1\", owner: \"test-repo\" }");
			Repository repo = service.cloneRepository(Provider.GITHUB, "cs-test1", "test-repo", "master");
			URL url = conn.getURL();
			assertNotNull(url);
			assertEquals(REPOSERVICE_URL, url.toString());
			assertEquals("POST", conn.getRequestMethod());
			assertNotNull(repo);
			assertEquals("cs-test1", repo.getName());
		}
		catch(IOException e) {
			Assert.fail(e.getMessage());
		}
	}
}
