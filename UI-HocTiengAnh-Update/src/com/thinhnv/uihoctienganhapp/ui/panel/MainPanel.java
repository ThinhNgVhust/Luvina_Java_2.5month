package com.thinhnv.uihoctienganhapp.ui.panel;

import java.awt.CardLayout;

import com.thinhnv.uihoctienganhapp.logic.WordManager;

public class MainPanel extends BasePanel {
	private WordPanel wordPanel;
	private StudyPanel studyPanel;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(new CardLayout());
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		wordPanel = new WordPanel();
		add(wordPanel);
		studyPanel = new StudyPanel();
		add(studyPanel);
	}

	public void goToStudyPanel() {
		// TODO Auto-generated method stub
		this.wordPanel.setVisible(false);
		this.studyPanel.setVisible(true);
	}

	public void setDataStudyPanel(WordManager wordManager) {
		// TODO Auto-generated method stub
		this.studyPanel.setData(wordManager);
		this.studyPanel.initCCBModel();
	}

	public void goBack() {
		// TODO Auto-generated method stub
		this.studyPanel.setVisible(false);
		this.wordPanel.setVisible(true);
	}

}
