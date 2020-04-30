package com.vishrosh.eventsystem.tests;

import com.vishrosh.eventsystem.core.EventTypeRegistry;
import com.vishrosh.eventsystem.core.EventTypes;
import com.vishrosh.eventsystem.core.SubscribeEvent;

public class Main {

	public static void main(String[] args) {
		//EventTypeRegistry.Register(EventTypes.class);
		
		//System.out.println(EventTypes.MousePressed);

	}
	
	@SubscribeEvent(event=EventTypes.Null)
	public void sd() {
		
	}

}
