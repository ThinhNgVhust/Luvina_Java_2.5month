package com.thinhnv.hsformapp.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.thinhnv.hsformapp.logic.QuanLyHocSinh;
import com.thinhnv.hsformapp.ui.GUI;

public class FormHSPanel extends BasePanel implements ActionListener {
	private static final String TIM_KIEM = "btnTimKiem";
	private static final String NHAP_TT = "btnNhapTTHS";
	private JLabel lbNhapTen, lbHoTen, lbLop, lbDiemTK, lbKetQua;
	private JTextField tfNhapTen, tfHoTen, tfLop, tfDiem;
	private JTextArea taKetQua;
	private JButton btnNhapTT, btnTimKiem;
	private QuanLyHocSinh qlHS;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
		setBackground(Color.CYAN);
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		this.qlHS = new QuanLyHocSinh();
		Font fNormal = new Font("Tahoma", Font.PLAIN, 15);
		Font fTitle = new Font("Tahoma", Font.BOLD, 20);
		boolean isEditable = true;
		lbNhapTen = initLabel("Nhập tên học sinh", fNormal, Color.black);
		lbNhapTen.setLocation(25, 20);
		add(lbNhapTen);
		tfNhapTen = initTextField(350, fNormal, Color.black, isEditable);
		tfNhapTen.setLocation(lbNhapTen.getX() + lbNhapTen.getWidth() + 20,
				lbNhapTen.getY() - tfNhapTen.getInsets().top);
		add(tfNhapTen);
		btnTimKiem = initButton("  Tìm kiếm  ", fNormal, Color.black, TIM_KIEM, this);
		btnTimKiem.setLocation(tfNhapTen.getX() + tfNhapTen.getWidth() + 20,
				lbNhapTen.getY() - btnTimKiem.getInsets().top);
		add(btnTimKiem);

//		JLabel form = new JLabel();
		lbHoTen = initLabel("Họ tên", fNormal, Color.black);
		lbHoTen.setLocation(lbNhapTen.getX(), lbNhapTen.getY() + lbNhapTen.getHeight() + 50);
		add(lbHoTen);

		tfHoTen = initTextField(200, fNormal, Color.black, isEditable);
		tfHoTen.setLocation(lbHoTen.getX() + lbHoTen.getWidth() + 20, lbHoTen.getY() - tfHoTen.getInsets().top);
		add(tfHoTen);

		lbLop = initLabel("Lớp", fNormal, Color.black);
		lbLop.setLocation(lbHoTen.getX() + lbHoTen.getWidth() - lbLop.getWidth(),
				lbHoTen.getY() + lbHoTen.getHeight() + 30);
		add(lbLop);

		tfLop = initTextField(200, fNormal, Color.black, isEditable);
		tfLop.setLocation(lbHoTen.getX() + lbHoTen.getWidth() + 20, lbLop.getY() - tfLop.getInsets().top);
		add(tfLop);

		lbDiemTK = initLabel("Điểm TK", fNormal, Color.black);
		lbDiemTK.setLocation(lbLop.getX() + lbLop.getWidth() - lbDiemTK.getWidth(),
				lbLop.getY() + lbLop.getHeight() + 30);
		add(lbDiemTK);
		tfDiem = initTextField(200, fNormal, Color.black, isEditable);
		tfDiem.setLocation(lbHoTen.getX() + lbHoTen.getWidth() + 20, lbDiemTK.getY() - tfHoTen.getInsets().top);
		add(tfDiem);

		btnNhapTT = initButton("Nhập TT HS", fNormal, Color.black, NHAP_TT, this);
		btnNhapTT.setLocation(tfDiem.getX(), tfDiem.getY() + tfDiem.getHeight() + 30);
		add(btnNhapTT);
		btnNhapTT.setSize(tfDiem.getWidth(), 30);

		lbKetQua = initLabel("KẾT QUẢ TÌM KIẾM", fTitle, Color.black);
		lbKetQua.setLocation(tfHoTen.getX() + tfHoTen.getWidth() + 40, tfHoTen.getY());
		add(lbKetQua);
		taKetQua = new JTextArea();
		taKetQua.setSize(btnTimKiem.getX() + btnTimKiem.getWidth() - 10 - lbKetQua.getX(),
				btnNhapTT.getY() + btnNhapTT.getHeight() - tfLop.getY());
		taKetQua.setLocation(lbKetQua.getX(), tfLop.getY());
		add(taKetQua);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		String key = btn.getName();
		switch (key) {
		case TIM_KIEM:
			timKiem();
			break;
		case NHAP_TT:
		nhapTT();
			break;
		default:
			break;
		}
	}

	private void nhapTT() {
		// TODO Auto-generated method stub
		String hoTen = tfHoTen.getText();
		String lop = tfLop.getText();
		String diemTK = tfDiem.getText();
		if(hoTen.isEmpty() || lop.isEmpty() || diemTK.isEmpty()) {
			showNotify("Truong nhap bi thieu");
			return;
		}
		try {
			this.qlHS.nhapTT(hoTen, lop, Double.parseDouble(diemTK));
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
		showNotify(e.getMessage());
		}
	}

	private void timKiem() {
		// TODO Auto-generated method stub
		String findKey = tfNhapTen.getText();

		if (findKey.isEmpty()) {
			try {
				String str = this.qlHS.getListHSString();
				System.out.println("str = "+str);
				taKetQua.setText(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				showNotify(e.getMessage());
			}
		} else {
			try {
				taKetQua.setText(this.qlHS.findByName(findKey));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				showNotify(e.getMessage());
			}
		}
	}
}
