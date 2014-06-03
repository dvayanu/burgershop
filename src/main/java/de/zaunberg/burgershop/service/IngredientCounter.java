package de.zaunberg.burgershop.service;

import net.anotheria.moskito.aop.annotation.CountByParameter;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 08.12.13 15:56
 */
public class IngredientCounter {
	@CountByParameter(category = "business", producerId = "ingredients")
	public void used(String ingredient){

	}
}
