package com.thinhnv.uihoctienganhapp.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.thinhnv.uihoctienganhapp.logic.Word;
import com.thinhnv.uihoctienganhapp.logic.WordManager;

public class WordPanel extends BasePanel implements ActionListener {
	protected static final int TABLE_COL = 1;
	protected static final String COL_NAME = "TỪ VỰNG";
	private JLabel lbDuongDan, lbTuVung, lbNghia;
	private JTable tbTuVung;
	private JTextField tfDuongDan, tfTuVung, tfNghia;
	private JButton btnNap, btnThem, btnXoa, btnHoc;
	private WordManager wordManager;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
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

		lbDuongDan = initLabel("Đường dẫn", fNormal, Color.black);
		lbDuongDan.setLocation(10, 20);
		add(lbDuongDan);

		tfDuongDan = initTextField(250, fNormal, Color.black, true);
		tfDuongDan.setLocation(lbDuongDan.getX() + lbDuongDan.getWidth() + 10,
				lbDuongDan.getY() - tfDuongDan.getInsets().top);
		add(tfDuongDan);

		btnNap = initButton("     Nạp     ", fNormal, Color.black, "btnNap", this);
		btnNap.setLocation(tfDuongDan.getX() + tfDuongDan.getWidth() + 20, tfDuongDan.getY());
		add(btnNap);

		tbTuVung = initTable(fNormal, fTitle, Color.LIGHT_GRAY, Color.LIGHT_GRAY, true);
		tbTuVung.setRowHeight(30);
		tbTuVung.setSize(btnNap.getX() + btnNap.getWidth() - lbDuongDan.getX(), 350);
		tbTuVung.setLocation(lbDuongDan.getX(), tfDuongDan.getY() + tfDuongDan.getHeight() + 20);
		add(tbTuVung);
		JScrollPane jScrollPane = new JScrollPane(tbTuVung);
		jScrollPane.setSize(btnNap.getX() + btnNap.getWidth() - lbDuongDan.getX(), 350);
		jScrollPane.setLocation(lbDuongDan.getX(), tfDuongDan.getY() + tfDuongDan.getHeight() + 20);
		add(jScrollPane);
		initTableModel();

//		btnThem = initButton("Thêm", fNormal, c, width, name, e)
		lbTuVung = initLabel("Từ vựng:", fNormal, Color.BLACK);
		lbTuVung.setLocation(tbTuVung.getX(), tbTuVung.getY() + tbTuVung.getHeight() + 10);
		add(lbTuVung);

		tfTuVung = initTextField(140, fNormal, Color.black, true);
		tfTuVung.setLocation(lbTuVung.getX() + lbTuVung.getWidth() + 10, lbTuVung.getY() - tfTuVung.getInsets().top);
		add(tfTuVung);

		lbNghia = initLabel("Nghĩa:", fNormal, Color.BLACK);
		lbNghia.setLocation(lbTuVung.getX() + lbTuVung.getWidth() - lbNghia.getWidth(),
				lbTuVung.getY() + lbTuVung.getHeight() + 20);
		add(lbNghia);

		tfNghia = initTextField(140, fNormal, Color.black, true);
		tfNghia.setLocation(lbNghia.getX() + lbNghia.getWidth() + 10, lbNghia.getY() - tfNghia.getInsets().top);
		add(tfNghia);

		btnThem = initButton("Thêm", fNormal, Color.black, tfNghia.getY() + tfNghia.getHeight() - tfTuVung.getY(),
				"btnThem", this);
		btnThem.setLocation(tfTuVung.getX() + tfTuVung.getWidth() + 10, tfTuVung.getY());
		add(btnThem);

		btnXoa = initButton("Xóa", fNormal, Color.black, tfNghia.getY() + tfNghia.getHeight() - tfTuVung.getY(),
				"btnThem", this);
		btnXoa.setLocation(btnThem.getX() + btnThem.getWidth() + 5, btnThem.getY());
		add(btnXoa);

		btnHoc = initButton("Học", fNormal, Color.black, tfNghia.getY() + tfNghia.getHeight() - tfTuVung.getY(),
				"btnThem", this);
		btnHoc.setLocation(btnXoa.getX() + btnXoa.getWidth() + 5, btnXoa.getY());
		add(btnHoc);

	}

	private void initTableModel() {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel = new DefaultTableModel() {
			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return TABLE_COL;
			}

			@Override
			public String getColumnName(int columnIndex) {
				// TODO Auto-generated method stub
				return COL_NAME;
			}
		};
		tbTuVung.setModel(tableModel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		if (btn == btnNap) {
			updateListWord();
		} else if (btn == btnThem) {
			addWord();
		} else if (btn == btnXoa) {
			deleteWord();
		} else if (btn == btnHoc) {
			study();		}
	}

	private void study() {
		// TODO Auto-generated method stub
		MainPanel mainPanel = (MainPanel) getParent();
		mainPanel.goToStudyPanel();
		updateStudyPanelCCBData();
	}

	private void updateStudyPanelCCBData() {
		// TODO Auto-generated method stub
		MainPanel mainPanel = (MainPanel) getParent();
		mainPanel.setDataStudyPanel(this.wordManager);
	}

	private void deleteWord() {
		// TODO Auto-generated method stub
		int index = tbTuVung.getSelectedRow();
		if (index == -1) {
			showNotify("Chọn để xóa");
			return;
		}
		Word word = this.wordManager.getListWord().get(index);
		try {
			if (this.wordManager.deleteWord(word)) {
				DefaultTableModel model = (DefaultTableModel) tbTuVung.getModel();
				model.setRowCount(0);
				ArrayList<Word> lsWord = this.wordManager.getListWord();
				for (Word word1 : this.wordManager.getListWord()) {
					model.addRow(new Object[] { word1 });
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			showNotify(e.getMessage());
		}

	}

	private void addWord() {
		// TODO Auto-generated method stub

		String word = tfTuVung.getText();
		String mean = tfNghia.getText();
		if (this.wordManager == null) {
			showNotify("Chưa nhập đường dẫn");
			return;
		}
		if (word.isEmpty() || mean.isEmpty()) {
			showNotify("Nhập thiếu thông tin");
			return;
		}
		try {
			wordManager.WriteFile(word, mean);
			updateListWord();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			showNotify(e.getMessage());
		} catch (NumberFormatException e) {
			// TODO: handle exception
			showNotify(e.getMessage());
		}
	}

	private void updateListWord() {
		// TODO Auto-generated method stub
//		String path = tfDuongDan.getText();
//		if (path.isEmpty()) {
//			showNotify("Đường dẫn không được trống");
//			return;
//		}
		this.wordManager = new WordManager("/home/thinhnv/data_english.txt");
		try {
			this.wordManager.readFile();
		} catch (NullPointerException e) {
			// TODO: handle exception
			showNotify("Đường dẫn không hợp lệ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			showNotify(e.getMessage());
		}
		DefaultTableModel model = (DefaultTableModel) tbTuVung.getModel();
		model.setRowCount(0);
		ArrayList<Word> lsWord = this.wordManager.getListWord();
		for (Word word : lsWord) {
			model.addRow(new Object[] { word });
		}
	}

}
