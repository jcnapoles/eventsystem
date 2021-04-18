package com.strands.interviews.eventsystem.events;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubEventTest {

	@Test
	public void testSubEventNotNull() {
		SubEvent subEvent = new SubEvent("Testing subEvent");
		assertNotNull(subEvent);
	}

	@Test
	public void testSubEventInheritance() {
		SimpleEvent simpleEvent = new SubEvent("This is a subEvent");
		assertNotNull(simpleEvent);
		assertEquals("This is a subEvent", simpleEvent.getSource());
	}

	@Test
	public void testGetSourceWithExpectedSource() {
		String[] arrayString = { "This", "is", "a", "message" };
		SubEvent subEvent = new SubEvent(arrayString);
		assertNotNull(subEvent);
		assertEquals(arrayString, subEvent.getSource());
	}

}
