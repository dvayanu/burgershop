package de.zaunberg.burgershop.service.stats;

import net.anotheria.moskito.core.producers.IStats;
import net.anotheria.moskito.core.stats.TimeUnit;
import net.anotheria.moskito.webui.decorators.AbstractDecorator;
import net.anotheria.moskito.webui.shared.bean.DoubleValueBean;
import net.anotheria.moskito.webui.shared.bean.LongValueBean;
import net.anotheria.moskito.webui.shared.bean.StatValueBean;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 12.12.13 23:24
 */
public class SalesStatsDecorator extends AbstractDecorator {
	/**
	 * Captions.
	 */
	static final String CAPTIONS[] = {
			"Sales",
			"Volume",
			"Avg"
	};

	/**
	 * Short explanations.
	 */
	static final String SHORT_EXPLANATIONS[] = {
			"Number of sales",
			"Total earnings",
			"Avg earnings"
	};

	/**
	 * Explanations.
	 */
	static final String EXPLANATIONS[] = {
			"Total number of sales for this ingredient",
			"Total earnings from sales of this ingredient",
			"Average earnings per sale for this ingredient",
	};

	/**
	 * Creates a new decorator object with given name.
	 */
	protected SalesStatsDecorator(){
		super("Sales", CAPTIONS, SHORT_EXPLANATIONS, EXPLANATIONS);
	}

	@Override public List<StatValueBean> getValues(IStats statsObject, String interval, TimeUnit unit) {
		SalesStats stats = (SalesStats)statsObject;
		List<StatValueBean> ret = new ArrayList<StatValueBean>(CAPTIONS.length);
		int i = 0;
		long totalSales = stats.getNumber(interval);
		ret.add(new LongValueBean(CAPTIONS[i++], totalSales));
		ret.add(new LongValueBean(CAPTIONS[i++], stats.getVolume(interval)));
		ret.add(new DoubleValueBean(CAPTIONS[i++], stats.getAverageVolume(interval)));
		return ret;
	}
}
