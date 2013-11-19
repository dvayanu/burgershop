package de.zaunberg.burgershop.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest{
	@Test
	public void testTotalPrice(){
		Order o = new Order();
		o.addItem(new ShopableItem("foo", 100, Category.BREAD));
		o.addItem(new ShopableItem("bar", 200, Category.BREAD));
		o.addItem(new ShopableItem("2xfoo", 300, Category.BREAD));
		assertEquals(100+200+300, o.getTotalPrice());
	}

}