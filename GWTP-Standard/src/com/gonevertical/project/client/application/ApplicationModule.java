package com.gonevertical.project.client.application;

import com.gonevertical.project.client.application.error.ErrorModule;
import com.gonevertical.project.client.application.home.HomeModule;
import com.gonevertical.project.client.application.unauthorized.UnAuthorizedModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

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
