package com.arcbees.project.client.application.unauthorized;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class UnAuthorizedView extends ViewImpl implements
		UnAuthorizedPresenter.MyView {
	interface Binder extends UiBinder<Widget, UnAuthorizedView> {
	}

	@UiField
	SimplePanel main;

	@Inject
	UnAuthorizedView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == UnAuthorizedPresenter.SLOT_UnAuthorized) {
			main.setWidget(content);
		} else {
			super.setInSlot(slot, content);
		}
	}
}
