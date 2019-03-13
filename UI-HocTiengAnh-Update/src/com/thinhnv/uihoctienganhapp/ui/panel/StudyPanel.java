package com.thinhnv.uihoctienganhapp.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.thinhnv.uihoctienganhapp.logic.Word;
import com.thinhnv.uihoctienganhapp.logic.WordManager;

public class StudyPanel extends BasePanel implements ActionListener {
	protected static final String TU_DUNG = "Từ đúng";
	protected static final String TU_SAI = "Từ sai";
	protected static final int TABLE_COL = 1;
	private JLabel lbChonTu, lbNhapNghia;
	private JTextField tfDoanNghia;
	private JComboBox<String> ccbChonTu;
	private JTable tbDung, tbSai;
	private JButton btnDoan, btnQuayLai;
	private WordManager wordManager;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		Font fNormal = new Font("Tahoa", Font.PLAIN, 15);
		Font fTitle = new Font("Tahoa", Font.BOLD, 20);

		lbChonTu = initLabel("   Chọn từ:   ", fNormal, Color.black);
		lbChonTu.setLocation(10, 20);
		add(lbChonTu);

		ccbChonTu = new JComboBox<String>();
		ccbChonTu.setSize(250, 30);
		ccbChonTu.setLocation(lbChonTu.getX() + lbChonTu.getWidth() + 10, lbChonTu.getY() - 5);
		add(ccbChonTu);

		initCCBModel();

		lbNhapNghia = initLabel("Nhập Nghĩa:", fNormal, Color.black);
		lbNhapNghia.setLocation(lbChonTu.getX() + lbChonTu.getWidth() - lbNhapNghia.getWidth(),
				ccbChonTu.getY() + ccbChonTu.getHeight() + 20);
		add(lbNhapNghia);

		tfDoanNghia = initTextField(240, fNormal, Color.black, true);
		tfDoanNghia.setLocation(lbNhapNghia.getX() + lbNhapNghia.getWidth() + 10,
				lbNhapNghia.getY() - tfDoanNghia.getInsets().top);
		add(tfDoanNghia);

		btnDoan = initButton("ĐOÁN", fNormal, Color.black,
				tfDoanNghia.getY() + tfDoanNghia.getHeight() - ccbChonTu.getY(), "btnDoan", this);
		btnDoan.setLocation(tfDoanNghia.getX() + tfDoanNghia.getWidth() + 30,
				tfDoanNghia.getY() + tfDoanNghia.getHeight() - btnDoan.getHeight());
		add(btnDoan);

		tbDung = initTable(fNormal, fTitle, Color.RED, Color.WHITE, true);
		tbDung.setSize(200, 250);
		tbDung.setLocation(lbNhapNghia.getX(), tfDoanNghia.getY() + tfDoanNghia.getHeight() + 20);
		tbDung.setRowHeight(30);
		JScrollPane jScrollPaneDung = new JScrollPane(tbDung);

		jScrollPaneDung.setSize(220, 350);
		jScrollPaneDung.setLocation(lbNhapNghia.getX(), tfDoanNghia.getY() + tfDoanNghia.getHeight() + 20);
		add(jScrollPaneDung);

		tbSai = initTable(fNormal, fTitle, Color.BLUE, Color.RED, true);
		tbSai.setSize(200, 250);
		tbSai.setLocation(tbDung.getX() + tbDung.getWidth() + 10, tbDung.getY());
		tbSai.setRowHeight(30);
		JScrollPane jScrollPaneSai = new JScrollPane(tbSai);
		jScrollPaneSai.setSize(220, 350);
		jScrollPaneSai.setLocation(jScrollPaneDung.getX() + jScrollPaneDung.getWidth() + 25, jScrollPaneDung.getY());
		add(jScrollPaneSai);

		initModelTalbe(tbDung);
		initModelTalbe(tbSai);

		btnQuayLai = initButton("     Quay lại     ", fNormal, Color.black, "btnQuayLai", this);
		btnQuayLai.setLocation(((int) (jScrollPaneDung.getX() + jScrollPaneDung.getWidth() + jScrollPaneSai.getX()) / 2)
				- ((int) btnQuayLai.getWidth() / 2), jScrollPaneDung.getY() + jScrollPaneDung.getHeight() + 5);
		add(btnQuayLai);
	}

	private void initModelTalbe(JTable jTable) {
		// TODO Auto-generated method stub
		DefaultTableModel model = new DefaultTableModel() {
			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return TABLE_COL;
			}

			@Override
			public String getColumnName(int column) {
				return jTable == tbDung ? TU_DUNG : TU_SAI;
			}
		};
		jTable.setModel(model);
	}

	public void initCCBModel() {
		// TODO Auto-generated method stub
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		if (this.wordManager == null) {
			this.ccbChonTu.setModel(model);
		} else {
			ArrayList<Word> lsWord = this.wordManager.getListWord();
			for (Word word : lsWord) {
				String word1 = word.getWord();
				model.addElement(word1);
			}
			ccbChonTu.setModel(model);
		}
	}

	public void setData(WordManager wordManager2) {
		// TODO Auto-generated method stub
		this.wordManager = wordManager2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		if (btn == btnDoan) {
			doanTu();
		} else if (btn == btnQuayLai) {
			quayLai();
		}
	}

	private void quayLai() {
		// TODO Auto-generated method stub
		MainPanel mainPanel = (MainPanel) getParent();
		mainPanel.goBack();
	}

	private void doanTu() {
		// TODO Auto-generated method stub
		if (this.wordManager == null) {
			showNotify("Chưa nạp thông tin");
			return;
		}
		String word = (String) (ccbChonTu.getSelectedItem());
		String mean = tfDoanNghia.getText();
		if (mean.isEmpty()) {
			showNotify("Vui lòng nhập nghĩa");
			return;
		}
		Word word1 = new Word(word, mean);
		int index = this.wordManager.getListWord().indexOf(word1);
		if (this.wordManager.getListWord().get(index).getMean().equalsIgnoreCase(mean)) {
			((DefaultTableModel) (tbDung.getModel())).addRow(new Object[] { word });
		} else {
			((DefaultTableModel) (tbSai.getModel())).addRow(new Object[] { word });
		}
	}

}
