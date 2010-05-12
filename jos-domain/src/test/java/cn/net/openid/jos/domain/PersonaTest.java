/**
 * Copyright (c) 2006-2009, Redv.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Redv.com nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
/**
 * 
 */
package cn.net.openid.jos.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sutra
 * 
 */
public class PersonaTest {
	private Persona persona;
	private Attribute attribute;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		persona = new Persona();
		Attribute attribute = new Attribute();
		attribute.setId("test Id");
		attribute.setAlias("testAlias");
		attribute.setType("testType");
		attribute.addValue("testValue");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link cn.net.openid.jos.domain.Persona#Persona()}.
	 */
	@Test
	public void testNewPersona() {
		Persona persona = new Persona();
		assertNotNull(persona.getAttributes());
	}

	/**
	 * Test method for {@link cn.net.openid.jos.domain.Persona#Persona(User)}.
	 */
	@Test
	public void testNewPersonaWithUser() {
		User user = new User();
		Persona persona = new Persona(user);
		assertNotNull(persona.getAttributes());
	}

	/**
	 * Test method for {@link cn.net.openid.jos.domain.Persona#getAttributes()}.
	 */
	@Test
	public void testGetAttributes() {
		assertNotNull(persona.getAttributes());
		persona.addAttribute(attribute);
		assertEquals(1, persona.getAttributes().size());
	}

	/**
	 * Test method for
	 * {@link cn.net.openid.jos.domain.Persona#setAttributes(java.util.Set)}.
	 */
	@Test
	public void testSetAttributes() {
		Set<Attribute> attributes = new HashSet<Attribute>();
		attributes.add(attribute);
		persona.setAttributes(attributes);
		assertEquals(1, persona.getAttributes().size());
	}
}
