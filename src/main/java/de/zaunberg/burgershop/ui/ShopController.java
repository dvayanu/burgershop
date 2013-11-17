package de.zaunberg.burgershop.ui;

import de.zaunberg.burgershop.service.Category;
import de.zaunberg.burgershop.service.ShopService;
import de.zaunberg.burgershop.service.ShopableItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 16.11.13 22:22
 */
@Controller
public class ShopController {

	@Autowired
	private ShopService service;

	@RequestMapping(value = "/shop.html")
	public String enterShop(){

		List<ShopableItem> items = service.getShopableItems();
		System.out.println("Items: "+items);

		HashMap<Category, List<ShopItemBean>> beans = new HashMap<Category, List<ShopItemBean>>();
		for (ShopableItem item : items){
			ShopItemBean bean = new ShopItemBean();
			bean.setItem(item.getName());
			bean.setPrice(item.getPrice());

			String nicePrice = "";

			nicePrice = ""+(item.getPrice()/100);
			int centPrice = item.getPrice()-(item.getPrice()/100*100);
			nicePrice += ".";
			nicePrice += (centPrice<10) ? centPrice == 0 ? "00" : "0"+centPrice :""+centPrice;
			bean.setNicePrice(nicePrice);

			List<ShopItemBean> itemsForCategory = beans.get(item.getCategory());
			if (itemsForCategory==null){
				itemsForCategory = new ArrayList<ShopItemBean>();
				beans.put(item.getCategory(), itemsForCategory);
			}
			itemsForCategory.add(bean);
		}

		System.out.println("beans: "+beans);

		return "shop";
	}
}
