package com.arcbees.project.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.arcbees.project.client.application.home.HomeModule;
import com.arcbees.project.client.application.error.ErrorModule;
import com.arcbees.project.client.application.unauthorized.UnAuthorizedModule;

public class ApplicationModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		install(new UnAuthorizedModule());
		install(new ErrorModule());
		install(new HomeModule());
		bindPresenter(ApplicationPresenter.class,
				ApplicationPresenter.MyView.class, ApplicationView.class,
				ApplicationPresenter.MyProxy.class);
	}
}
