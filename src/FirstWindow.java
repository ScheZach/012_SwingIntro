import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstWindow extends JFrame {
	
	public FirstWindow() {
		super("By ZacharyS");
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setBackground(Color.BLUE);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		
		JPanel p3 = new JPanel(new GridBagLayout());
		p3.setBackground(Color.GRAY);
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.CYAN);
		
		JPanel p5 = new JPanel();
		p5.setBackground(Color.CYAN);
		
		JButton b = new JButton("button 1");
		b.setBackground(Color.DARK_GRAY);
		
		JButton b2 = new JButton("button 2");
		b2.setBackground(Color.DARK_GRAY);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15,15,15,15);
		
		add(p, BorderLayout.SOUTH);
		p5.add(b);
		p5.add(b2);
		
		add(p2, BorderLayout.NORTH);
		add(p3, BorderLayout.CENTER);
		add(p4, BorderLayout.EAST);
		add(p5, BorderLayout.WEST);
		
		setVisible(true);
	}//end of Constructor

}
