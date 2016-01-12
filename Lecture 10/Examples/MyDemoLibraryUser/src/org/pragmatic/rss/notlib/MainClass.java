package org.pragmatic.rss.notlib;

import bg.pragmatic.pdf.lib.RssReader;

public class MainClass {
	public static void main(String[] args) {
		RssReader r = new RssReader();
		r.readAllItems("www.yahoo.com/rss");
	}
}
