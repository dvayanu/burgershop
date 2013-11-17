package de.zaunberg.burgershop.service;

import java.util.LinkedList;
import java.util.List;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 16.11.13 22:47
 */
public class ShopServiceImpl implements ShopService {

	private LinkedList<ShopableItem> items;

	public ShopServiceImpl(){
		items = new LinkedList<ShopableItem>();
		items.add(new ShopableItem("wheat", 585, Category.BREAD));
		items.add(new ShopableItem("wholemeal", 285, Category.BREAD));
		items.add(new ShopableItem("brioche", 585, Category.BREAD));
		items.add(new ShopableItem("burned down", 585, Category.BREAD));
		items.add(new ShopableItem("leibniz", 1085, Category.BREAD));

/*
		</tr>
		<tr>
		<td class="twolineitem1">
		<div class="price">
		<span> 13.85 € </span>
		</div>

		<div class="item_name">
		<p class="">cow</p>
		<div></div>
		</div>

		</td>

		<td class="twolineitem2">
		<div class="price">
		<span> 11.85 € </span>
		</div>
		<div class="item_name">
		<p class="">pork</p>
		<div></div>
		</div>
		</td>
		<td class="twolineitem3">
		<div class="price">
		<span> 18.85 € </span>
		</div>
		<div class="item_name">
		<p class="">lamb</p>
		<div></div>
		</div>
		</td>
		<td class="twolineitem4">
		<div class="price">
		<span> 19.85 € </span>
		</div>
		<div class="item_name">
		<p class="">dog</p>
		<div></div>
		</div>
		</td>
		<td class="twolineitem5">
		<div class="price">
		<span> 15.85 € </span>
		</div>
		<div class="item_name">
		<p class="">rat</p>
		<div></div>
		</div>
		</td>

		</tr>
		<tr>
		<td class="threelineitem1">
		<div class="price">
		<span> 10.85 € </span>
		</div>

		<div class="item_name">
		<p class="">mushrooms</p>
		<div></div>
		</div>

		</td>

		<td class="threelineitem2">
		<div class="price">
		<span> 8.55 € </span>
		</div>
		<div class="item_name">
		<p class="">brocolli</p>
		<div></div>
		</div>
		</td>
		<td class="threelineitem3">
		<div class="price">
		<span> 10.15 € </span>
		</div>
		<div class="item_name">
		<p class="">cheese</p>
		<div></div>
		</div>
		</td>
		<td class="threelineitem4">
		<div class="price">
		<span> 8.85 € </span>
		</div>
		<div class="item_name">
		<p class="">sauce</p>
		<div></div>
		</div>
		</td>
		<td class="threelineitem5">
		<div class="price">
		<span> 10.85 € </span>
		</div>
		<div class="item_name">
		<p class="">сockroach</p>
		<div></div>
		</div>
		</td>
*/
	}

	@Override
	public List<ShopableItem> getShopableItems() {
		return items;  //To change body of implemented methods use File | Settings | File Templates.
	}
}
