package com.strands.interviews.eventsystem.events;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleEventTest {

	@Test
	public void testNewSimpleEventNotNull() {
		SimpleEvent simpleEvent = new SimpleEvent("Testing the SimpleEvent Class");
		assertNotNull(simpleEvent);
	}

	@Test
	public void testGetSourceWithExpectedSource() {
		SimpleEvent simpleEvent = new SimpleEvent("Testing the SimpleEvent Class");
		assertNotNull(simpleEvent);
		assertEquals("Testing the SimpleEvent Class", simpleEvent.getSource());
	}

	@Test
	public void testGetSourceWithNullValue() {
		SimpleEvent simpleEvent = new SimpleEvent(null);
		assertNotNull(simpleEvent);
		assertEquals(null, simpleEvent.getSource());
	}

}
