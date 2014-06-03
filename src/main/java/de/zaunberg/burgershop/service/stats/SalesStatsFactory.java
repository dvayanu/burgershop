package de.zaunberg.burgershop.service.stats;

import net.anotheria.moskito.core.dynamic.IOnDemandStatsFactory;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 12.12.13 14:31
 */
public class SalesStatsFactory implements IOnDemandStatsFactory<SalesStats>{
	@Override
	public SalesStats createStatsObject(String name) {
		return new SalesStats(name);
	}
}
