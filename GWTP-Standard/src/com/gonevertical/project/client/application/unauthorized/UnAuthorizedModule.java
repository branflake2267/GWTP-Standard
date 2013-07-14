package com.gonevertical.project.client.application.unauthorized;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class UnAuthorizedModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		bindPresenter(UnAuthorizedPresenter.class,
				UnAuthorizedPresenter.MyView.class, UnAuthorizedView.class,
				UnAuthorizedPresenter.MyProxy.class);
	}
}
