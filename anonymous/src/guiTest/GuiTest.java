package guiTest;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiTest extends JFrame{
	public GuiTest() {
		super("踰꾪듉 �뀒�뒪�듃");
//		버튼 생성
		JButton btn = new JButton("�굹 �닃�윭以�!");
		//사이즈 설정
		setSize(500, 700);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

		int x = (d.width - this.getWidth()) / 2;
		int y = (d.height - this.getHeight()) / 2;
		
		setLocation(x, y);
		setLayout(new FlowLayout());
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�븞�뀞 �궃 踰꾪듉�씠�빞!");
			}
		});
		
		add(btn);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�븰 �떕�삍�뼱!");
				System.exit(0);
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiTest();
	}
}








