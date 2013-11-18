package de.zaunberg.burgershop.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 16.11.13 22:44
 */
public enum Category {
	BREAD, MEAT, EXTRAS;

	@Override
	public String toString() {
		File f = new File("/tmp/test");
		try {
			FileInputStream fis = new FileInputStream(f);
			//TODO sth with fis
		} catch(FileNotFoundException e) {

		}
		return super.toString();    //To change body of overridden methods use File | Settings | File Templates.
	}
}
