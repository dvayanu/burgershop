package de.zaunberg.burgershop.service;

import net.anotheria.moskito.aop.annotation.Count;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 08.12.13 13:34
 */
@Count (category = "business", producerId = "orders")
public class OrderCounter {
	public void orderPlaced(){}

}
