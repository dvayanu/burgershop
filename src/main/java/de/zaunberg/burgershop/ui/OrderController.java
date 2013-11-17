package de.zaunberg.burgershop.ui;

import de.zaunberg.burgershop.service.Order;
import de.zaunberg.burgershop.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 17.11.13 15:16
 */
@Controller
public class OrderController {
	@Autowired
	private ShopService service;

	private static Logger log = LoggerFactory.getLogger(OrderController.class);

	@RequestMapping(value = "/order.html")
	public String order(HttpServletRequest request, HttpServletResponse response, @RequestParam()String choice1, @RequestParam String choice2, @RequestParam String choice3){

		log.debug("Incoming order "+choice1+", "+choice2+", "+choice3);
		Order order = service.placeOrder(choice1, choice2, choice3);

		log.debug("Placed order "+order);


		return null;
	}

}
