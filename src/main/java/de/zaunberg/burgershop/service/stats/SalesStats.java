package de.zaunberg.burgershop.service.stats;

import net.anotheria.moskito.core.predefined.Constants;
import net.anotheria.moskito.core.producers.AbstractStats;
import net.anotheria.moskito.core.stats.StatValue;
import net.anotheria.moskito.core.stats.TimeUnit;
import net.anotheria.moskito.core.stats.impl.StatValueFactory;
import net.anotheria.moskito.webui.decorators.DecoratorRegistryFactory;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 12.12.13 13:01
 */
public class SalesStats extends AbstractStats{

	static{
		DecoratorRegistryFactory.getDecoratorRegistry().addDecorator(SalesStats.class, new SalesStatsDecorator());
	}

	/**
	 * The number of sales.
	 */
	private StatValue number;

	/**
	 * The volume of sales.
	 */
	private StatValue volume;

	public SalesStats(String name) {
		super(name);

		number = StatValueFactory.createStatValue(Long.valueOf(0), "number", Constants.getDefaultIntervals());
		volume = StatValueFactory.createStatValue(Long.valueOf(0), "volume", Constants.getDefaultIntervals());
	}

	public void addSale(int priceInCents){
		number.increase();
		volume.increaseByInt(priceInCents);
	}

	public long getNumber(String intervalName){
		return number.getValueAsLong(intervalName);
	}

	public long getVolume(String intervalName){
		return volume.getValueAsLong(intervalName);
	}

	public double getAverageVolume(String intervalName){
		return (double)getVolume(intervalName) / getNumber(intervalName);
	}


	@Override
	public String toStatsString(String s, TimeUnit timeUnit) {
		return null;
	}


}
