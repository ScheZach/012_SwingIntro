import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FirstWindow extends JFrame {
	
	public FirstWindow() {
		super("By ZacharyS");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setBackground(Color.BLUE);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		
		JPanel p3 = new JPanel(new GridBagLayout());
		p3.setBackground(Color.GRAY);
		
		JPanel p4 = new JPanel(new GridBagLayout());
		p4.setBackground(Color.CYAN);
		
		JPanel p5 = new JPanel(new GridBagLayout());
		p5.setBackground(Color.CYAN);
		
		JButton b = new JButton("button 1");
		b.setBackground(Color.LIGHT_GRAY);
		
		JButton b2 = new JButton("button 2");
		b2.setBackground(Color.LIGHT_GRAY);
		
		JCheckBox cb1 = new JCheckBox("Subtitles");
		Color greyAlpha = new Color (204, 204, 204, 100);
		cb1.setBackground(greyAlpha);
		
		JCheckBox cb2 = new JCheckBox("Bright scheme");
		cb2.setBackground(greyAlpha);
		
		JLabel LabelAlpha = new JLabel("Fancy Label!");
		JTextArea TextAreaAlpha = new JTextArea("Fancy TextArea");
		JTextArea TextFieldAlpha = new JTextArea("Fancy TextArea");
		JTextArea TextAreaGamma = new JTextArea("Fancy TextArea");
		JTextArea TextAreaDelta = new JTextArea("Fancy TextArea");
		JTextArea TextAreaEpsilon = new JTextArea("Fancy TextArea");
		JTextArea TextAreaZeta = new JTextArea("Fancy TextArea");
		JTextArea TextAreaEta = new JTextArea("Fancy TextArea");
		JTextArea TextAreaTheta = new JTextArea("Fancy TextArea");
		
		JTextArea TextAreaBeta = new JTextArea("created by ZacharyS");
		
		JCheckBox cb3 = new JCheckBox("Are you ready to start?");
		cb3.setBackground(greyAlpha);
		
		JCheckBox cb4 = new JCheckBox("white text");
		cb4.setBackground(greyAlpha);
		
		JCheckBox cb5 = new JCheckBox("Are you sure?");
		cb5.setBackground(greyAlpha);
		
		JLabel LabelBeta = new JLabel("Settings");
		
		JLabel LabelGamma = new JLabel("Option 1");
		JLabel LabelDelta = new JLabel("Option 2");
		
		JLabel LabelEpsilon = new JLabel("Welcome to the too many things game - ");
		JLabel LabelZeta = new JLabel(" - Like really man");
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15,15,15,15);
		
		add(p, BorderLayout.SOUTH);
		p.add(LabelEpsilon);
		p.add(TextAreaBeta);
		p.add(LabelZeta);
		
		
		add(p2, BorderLayout.NORTH);
		p2.add(cb3);
		p2.add(cb5);
		
		add(p3, BorderLayout.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 0;
		p3.add(LabelAlpha, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(TextAreaGamma, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(TextAreaDelta, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p3.add(TextAreaAlpha, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p3.add(TextFieldAlpha, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		p3.add(TextAreaEpsilon, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p3.add(TextAreaZeta, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		p3.add(TextAreaEta, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		p3.add(TextAreaTheta, gbc);
		
		add(p4, BorderLayout.EAST);
		gbc.gridx = 0;
		gbc.gridy = 0;
		p4.add(LabelBeta, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p4.add(cb1, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p4.add(cb2, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		p4.add(cb4, gbc);
		
		add(p5, BorderLayout.WEST);
		gbc.gridx = 0;
		gbc.gridy = 0;
		p5.add(b, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p5.add(LabelGamma, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p5.add(b2, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p5.add(LabelDelta, gbc);
		
		setVisible(true);
	}//end of Constructor

}
