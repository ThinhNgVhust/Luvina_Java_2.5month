import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseEventDemo extends JFrame implements MouseListener, MouseMotionListener {
	private JTextField tfMouseX;
	private JTextField tfMouseY;
	private JTextField tfDragMouseX;
	private JTextField tfDragMouseY;

	public MouseEventDemo() throws HeadlessException {
		setLayout(null);
		setTitle("Mouse Event Demo");
		// create components
		JLabel lblX = new JLabel("X-Click");
		lblX.setBounds(20, 20, 10, 5);
		JLabel lblY = new JLabel("Y-Click");
		lblY.setBounds(20, 20, 10, 5);

		tfMouseX = new JTextField(10);
		tfMouseY = new JTextField(10);
		tfMouseX.setEditable(false);
		tfMouseY.setEditable(false);
		tfDragMouseX = new JTextField(10);
		tfDragMouseY = new JTextField(10);
		tfDragMouseX.setEditable(false);
		tfDragMouseY.setEditable(false);
		// JPanel Container
		JPanel jPanel = new JPanel(new FlowLayout());
		jPanel.setBounds(0, 0, 50, 5);
		jPanel.add(tfMouseX);
		jPanel.add(tfMouseY);
		jPanel.add(tfDragMouseX);
		jPanel.add(tfDragMouseY);
		this.add(jPanel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 200);
		setLayout(new FlowLayout());
		setVisible(true);
		addMouseListener(this);
		setResizable(false);
		addMouseMotionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		tfMouseX.setText(e.getX() + "");
		tfMouseY.setText(e.getY() + "");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		this.tfDragMouseX.setText(e.getX() + "");
		this.tfDragMouseY.setText(e.getY() + "");
	}

}
