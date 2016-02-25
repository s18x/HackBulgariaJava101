package com.hackbulgaria.delayed.deliveries;

import java.util.ArrayList;

import com.hackbulgaria.requests.parsing.Delivery;

public class DelayedDeliveries {

	private static volatile ArrayList<Delivery> delayedDeliveries = null;

    public static ArrayList<Delivery> getBar() {
        if (delayedDeliveries == null) {
            synchronized(DelayedDeliveries.class) {
                if (delayedDeliveries == null)
                	delayedDeliveries = new ArrayList<>();
            }
        }
        return delayedDeliveries;
    }

}
