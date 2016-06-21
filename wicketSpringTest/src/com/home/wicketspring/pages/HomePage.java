package com.home.wicketspring.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.home.wicketspring.services.AgeCheck;

public class HomePage extends WebPage {
	private static Logger logger = LoggerFactory.getLogger(HomePage.class.getName());
	@SpringBean
	private AgeCheck ageChecker;
	public HomePage() {
		super();
		logger.debug("initialize homepage.");
		// TODO Auto-generated constructor stub
		Label age = new Label("age", ageChecker.getAge("abc"));
		add(age);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1429962750192508156L;

}
