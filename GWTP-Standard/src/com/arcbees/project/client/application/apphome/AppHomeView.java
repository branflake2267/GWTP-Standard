package com.arcbees.project.client.application.apphome;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class AppHomeView extends ViewImpl implements AppHomePresenter.MyView {
	interface Binder extends UiBinder<Widget, AppHomeView> {
	}

	@UiField
	SimplePanel main;

	@Inject
	AppHomeView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
		
		// TODO remove
		main.add(new HTML("works"));
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == AppHomePresenter.SLOT_AppHome) {
			main.setWidget(content);
		} else {
			super.setInSlot(slot, content);
		}
	}
}
