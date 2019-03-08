package com.thinhnv.sampleui.ui.panel;

import javax.swing.JPanel;

import com.thinhnv.sampleui.ui.icommon.ICommon;

public abstract class BasePanel extends JPanel implements ICommon {
	public BasePanel() {
		init();
		addEvents();
		addCompts();
	}

}
