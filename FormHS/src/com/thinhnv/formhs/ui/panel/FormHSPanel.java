package com.thinhnv.formhs.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.thinhnv.formhs.logic.HocSinh;
import com.thinhnv.formhs.logic.QLHocSinh;

public class FormHSPanel extends BasePanel implements ActionListener {
	private JLabel lbHoTen, lbLop, lbDiem, lbKetqua, lbTimKiem;
	private JTextField tfHoTen, tfLop, tfDiem, tfTimKiem;
	private JButton btnNhapTT, btnTimKiem;
	private JTextArea tfKetQua;
	
	protected static final int TABLE_COL = 3;
	protected static final String[] COL_NAME = new String[] { "Họ tên", "Lớp", "Điểm" };
	private static final int COL_1 = 220;
	private static final int COL_2 = 100;
	private static final int COL_3 = 80;
	protected static final int[] COL_WIDTH = new int[] { COL_1, COL_2, COL_3 };
	private JTable tbKetQua;
	private QLHocSinh qlHS;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLocation(10, 100);
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
		qlHS = new QLHocSinh();
		Font fResult = new Font("Tahoma", Font.PLAIN, 20);
		Font fNormal = new Font("Tahoma", Font.PLAIN, 15);

		lbHoTen = initLabel("Họ Tên:", fNormal, Color.black);
		lbHoTen.setLocation(20, 100);
		add(lbHoTen);

		tfHoTen = initTextField(150, fNormal, Color.BLACK, true);
		tfHoTen.setLocation(lbHoTen.getX() + lbHoTen.getWidth() + 10, lbHoTen.getY() - tfHoTen.getInsets().top);
		add(tfHoTen);

		lbLop = initLabel("Lớp:", fNormal, Color.black);
		lbLop.setLocation(lbHoTen.getX() + lbHoTen.getWidth() - lbLop.getWidth(),
				lbHoTen.getY() + lbHoTen.getHeight() + 25);
		add(lbLop);

		tfLop = initTextField(150, fNormal, Color.BLACK, true);
		tfLop.setLocation(lbLop.getX() + lbLop.getWidth() + 10, lbLop.getY() - tfLop.getInsets().top);
		add(tfLop);

		lbDiem = initLabel("Điểm TK:", fNormal, Color.black);
		lbDiem.setLocation(lbLop.getX() + lbLop.getWidth() - lbDiem.getWidth(), lbLop.getY() + lbLop.getHeight() + 25);
		add(lbDiem);

		tfDiem = initTextField(150, fNormal, Color.BLACK, true);
		tfDiem.setLocation(lbDiem.getX() + lbDiem.getWidth() + 10, lbDiem.getY() - tfDiem.getInsets().top);
		add(tfDiem);

		btnNhapTT = initButton("     Nhập TT HS     ", fNormal, Color.BLACK, "nhapTTHS", this);
		btnNhapTT.setLocation(tfDiem.getX() + tfDiem.getWidth() / 2 - btnNhapTT.getWidth() / 2,
				tfDiem.getY() + tfDiem.getHeight() + 25);
		add(btnNhapTT);

		lbKetqua = initLabel("KẾT QUẢ TÌM KIẾM:", fResult, Color.BLACK);
		lbKetqua.setLocation(tfHoTen.getWidth() + tfHoTen.getX() + 30, lbHoTen.getY());
		add(lbKetqua);

//		tfKetQua = new JTextArea();
//		tfKetQua.setSize(280, btnNhapTT.getY() + btnNhapTT.getHeight() - tfLop.getY());
//		tfKetQua.setLocation(lbKetqua.getX(), lbLop.getY());
//		add(tfKetQua);
		tbKetQua = initTable(fNormal, fNormal, Color.LIGHT_GRAY, Color.LIGHT_GRAY, true);
		tbKetQua.setSize(400, btnNhapTT.getY() + btnNhapTT.getHeight() - tfLop.getY());
		tbKetQua.setLocation(lbKetqua.getX(), lbLop.getY());
		add(tbKetQua);

		JScrollPane jScrollPane = new JScrollPane(tbKetQua);
		jScrollPane.setSize(400, btnNhapTT.getY() + btnNhapTT.getHeight() - tfLop.getY());
		jScrollPane.setLocation(lbKetqua.getX(), lbLop.getY());
		add(jScrollPane);
		initTableModel();
		int i = 0;
		for (int time : COL_WIDTH) {
			TableColumn column = tbKetQua.getColumnModel().getColumn(i);
			column.setMinWidth(COL_WIDTH[i]);
			column.setMaxWidth(COL_WIDTH[i]);
			column.setPreferredWidth(COL_WIDTH[i]);
			i++;
		}

		lbTimKiem = initLabel("Nhập tên học sinh", fNormal, Color.BLACK);
		lbTimKiem.setLocation(lbHoTen.getX(), 10);
		add(lbTimKiem);

		tfTimKiem = initTextField(300, fNormal, Color.black, true);
		tfTimKiem.setLocation(lbTimKiem.getX() + lbTimKiem.getWidth() + 10,
				lbTimKiem.getY() - tfTimKiem.getInsets().top);
		add(tfTimKiem);
		btnTimKiem = initButton("Tìm kiếm", fNormal, Color.black, "btnTimkiem", this);
		btnTimKiem.setLocation(tfTimKiem.getX() + tfTimKiem.getWidth() + 20, tfTimKiem.getY());
		add(btnTimKiem);
	}

	private void initTableModel() {
		// TODO Auto-generated method stub
		DefaultTableModel model = new DefaultTableModel() {
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return TABLE_COL;
			}

			public String getColumnName(int column) {

				return COL_NAME[column];
			}

		};
		tbKetQua.setModel(model);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		if (btn == btnNhapTT) {
			nhapTT();
		} else if (btn == btnTimKiem) {
			timKiemTheoTen();
		}
	}

	private void timKiemTheoTen() {
		// TODO Auto-generated method stub
		File file = new File(QLHocSinh.PATH);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				showNotify(e.getMessage());
			}
		}
		try {
			FileInputStream fileIn = new FileInputStream(file);
			this.qlHS.getListHS().clear();
			String result = "";
			String gio = "";
			int kyTu = fileIn.read();
			while (kyTu != -1) {
				if (kyTu != 10) {
					gio += (char) kyTu;
				}
				if (kyTu == 10 && gio != "") {
					String[] hs = gio.split("_");
					if (tfTimKiem.getText().isEmpty()) {
						HocSinh hSinh = new HocSinh(hs[0], hs[1], Double.parseDouble(hs[2]));
						qlHS.addHS(hSinh);
					} else {
						if (hs[0].equalsIgnoreCase(tfTimKiem.getText())) {
							HocSinh hSinh = new HocSinh(hs[0], hs[1], Double.parseDouble(hs[2]));
							qlHS.addHS(hSinh);
						}
					}
					gio = "";

				}
				kyTu = fileIn.read();
			}
			System.out.println(result);
//			tfKetQua.setText(result);
			fileIn.close();
			updateData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			showNotify(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			showNotify(e.getMessage());
		}
		if (qlHS.getListHS().size() == 0) {
			showNotify("Không tìm được kết quả nào");
		} else {
			showNotify("Có " + qlHS.getListHS().size() + " kết quả");
		}
	}

	private void updateData() {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) tbKetQua.getModel();
		model.setRowCount(0);
		ArrayList<HocSinh> lsHS = this.qlHS.getListHS();
		if (lsHS.size() == 0) {
			return;
		}
		for (int i = 0; i < lsHS.size(); i++) {
			model.addRow(new Object[] { lsHS.get(i).getHoTen(), lsHS.get(i).getLop(), lsHS.get(i).getDiem() });
			System.out.println(lsHS.get(i).getHoTen());
		}
	}

	private void nhapTT() {
		// TODO Auto-generated method stub
		String hoTen = tfHoTen.getText();
		String lop = tfLop.getText();
		String diem = tfDiem.getText();
		if (hoTen.isEmpty() || lop.isEmpty() || diem.isEmpty()) {
			showNotify("Trường nhập bị thiếu, hãy nhập nốt các trường còn lại");
			return;
		}
		try {
			double diemThat = Double.parseDouble(diem);
			HocSinh hs = new HocSinh(hoTen, lop, diemThat);
			vietFile(hs);
			tfHoTen.setText(null);
			tfLop.setText(null);
			tfDiem.setText(null);
			showNotify("Nhập thông tin học sinh thành công");
		} catch (Exception e) {
			// TODO: handle exception
			showNotify(e.getMessage());
		}
	}

	private void vietFile(HocSinh hs) {
		// TODO Auto-generated method stub
		File file = new File(QLHocSinh.PATH);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				showNotify(e.getMessage());
			}
		}
		try {
			FileOutputStream fileOut = new FileOutputStream(file, true);
			String gio = hs.toString();
			for (int i = 0; i < gio.length(); i++) {
				fileOut.write(gio.charAt(i));
			}
			fileOut.write(10);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			showNotify(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			showNotify(e.getMessage());
		}
	}

}
