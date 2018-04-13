package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import com.sun.prism.Image;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class TicGame{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField textField_2;
	private JTextField textField_3;
	private String temp="x";
	//private JButton bt;
	String one="";
    String two="a";
    String thre="b";
    String four="c";
    String five="d";
    String six="e";
    String seven="f";
    String eight="g";
    String nine="h";
    int p1=0,p2=0;
    int i=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicGame window = new TicGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicGame() {
		initialize();
	}
	
		public void set() {
		if(temp.equalsIgnoreCase("x"))
			temp="o";
		else
			temp="x";
	}
	
	public void winner() {
	       //System.out.println(one+two+thre+four+five+six+seven+eight+nine);
	       if(one==("x")&&two==("x")&&thre==("x")&&i==0){
	    	  // System.out.println("hello");
	    	   p1++;i++;
	    	   t1.setText(" "+String.valueOf(p1));
	           JOptionPane.showMessageDialog(frame,"player 1 won");
	       }
	       if(i==0&&four ==("x") && five ==("x") && six ==("x")){
	    	   p1++;i++;
	    	   t1.setText(" "+String.valueOf(p1));
	    	   JOptionPane.showMessageDialog(frame,"player 1 won");
	       }
	       if(i==0&&seven==("x")&&eight==("x")&&nine==("x")){
	    	   p1++;i++;
	    	   t1.setText(" "+String.valueOf(p1));
	    	   JOptionPane.showMessageDialog(frame,"player 1 won");
	       }
	       if(i==0&&one==("x")&&four==("x")&&seven==("x")){
	    	   p1++;i++;
	    	   t1.setText(" "+String.valueOf(p1));
	    	   JOptionPane.showMessageDialog(frame,"player 1 won");
	       }
	       if(i==0&&two=="x"&&five=="x"&&eight=="x"){
	    	   p1++;i++;
	    	   t1.setText(" "+String.valueOf(p1));
	    	   JOptionPane.showMessageDialog(frame,"player 1 won");
	       }
	       if(i==0&&thre=="x"&&six=="x"&&nine=="x"){
	    	   p1++;i++;
	    	   t1.setText(" "+String.valueOf(p1));
	    	   JOptionPane.showMessageDialog(frame,"player 1 won");
	       }
	       if(i==0&&one=="x"&&five=="x"&&nine=="x"){
	    	   p1++;i++;
	    	   t1.setText(" "+String.valueOf(p1));
	    	   JOptionPane.showMessageDialog(frame,"player 1 won");
	    	   
	       }
	       if(i==0&&thre=="x"&&five=="x"&&seven=="x"){
	    	   p1++;i++;
	    	   t1.setText(" "+String.valueOf(p1));
	    	   JOptionPane.showMessageDialog(frame,"player 1 won");
	       }
	       
	       
	       if(i==0&&one=="o"&&two=="o"&&thre=="o"){
	    	   p2++;i++;
	    	   t2.setText(" "+String.valueOf(p2));
	    	   JOptionPane.showMessageDialog(frame,"player 2 won");
	       }
	       if(i==0&&four=="o"&&five=="o"&&six=="o"){
	    	   p2++;i++;
	    	   t2.setText(" "+String.valueOf(p2));
	    	   JOptionPane.showMessageDialog(frame,"player 2 won");
	       }
	       if(i==0&&seven=="o"&&eight=="o"&&nine=="o"){
	    	   p2++;i++;
	    	   t2.setText(" "+String.valueOf(p2));
	    	   JOptionPane.showMessageDialog(frame,"player 2 won");
	       }
	       if(i==0&&one=="o"&&four=="o"&&seven=="o"){
	    	   p2++;i++;
	    	   t2.setText(" "+String.valueOf(p2));
	    	   JOptionPane.showMessageDialog(frame,"player 2 won");
	       }
	       if(i==0&&two=="o"&&five=="o"&&eight=="o"){
	    	   p2++;i++;
	    	   t2.setText(" "+String.valueOf(p2));
	    	   JOptionPane.showMessageDialog(frame,"player 2 won");
	       }
	       if(i==0&&thre=="o"&&six=="o"&&nine=="o"){
	    	   p2++;i++;
	    	   t2.setText(" "+String.valueOf(p2));
	    	   JOptionPane.showMessageDialog(frame,"player 2 won");
	       }
	       if(i==0&&one=="o"&&five=="o"&&nine=="o"){
	    	   p2++;i++;
	    	   t2.setText(" "+String.valueOf(p2));
	    	   JOptionPane.showMessageDialog(frame,"player 2 won");
	       }
	       if(i==0&&thre=="o"&&five=="o"&&seven=="o"){
	    	   p2++;i++;
	    	   t2.setText(" "+String.valueOf(p2));
	    	   JOptionPane.showMessageDialog(frame,"player 2 won");
	       }
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(28, 148, 535, 302);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 4, 2, 0));
		
		JButton button = new JButton("");
		button.setFont(new Font("Trebuchet MS", Font.BOLD, 99));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setText(temp);
				one=button.getText();
				if(temp.equalsIgnoreCase("x"))
					button.setForeground(Color.blue);
				else
					button.setForeground(Color.red);
				set();
				winner();
			}
		});
		panel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setFont(new Font("Trebuchet MS", Font.BOLD, 99));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.setText(temp);
				two=button_1.getText();
				if(temp.equalsIgnoreCase("x"))
					button_1.setForeground(Color.blue);
				else
					button_1.setForeground(Color.red);
				set();
				winner();
			}
		});
		panel.add(button_1);
		
		JButton b3 = new JButton("");
		b3.setFont(new Font("Trebuchet MS", Font.BOLD, 99));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3.setText(temp);
				thre=	b3.getText();
				if(temp.equalsIgnoreCase("x"))
					b3.setForeground(Color.blue);
				else
					b3.setForeground(Color.red);
				set();
				winner();
			}
		});
		panel.add(b3);
		
		textField_2 = new JTextField("  Player 1");
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		textField_2.setEditable(false);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		t1 = new JTextField();
		t1.setText(" 0");
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 80));
		t1.setEditable(false);
		panel.add(t1);
		t1.setColumns(10);
		
		JButton b4 = new JButton("");
		b4.setFont(new Font("Trebuchet MS", Font.BOLD, 99));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4.setText(temp);
				four=	b4.getText();
				if(temp.equalsIgnoreCase("x"))
					b4.setForeground(Color.blue);
				else
					b4.setForeground(Color.red);
				set();
				winner();
			}
		});
		panel.add(b4);
		
		JButton b5 = new JButton("");
		b5.setFont(new Font("Trebuchet MS", Font.BOLD, 99));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5.setText(temp);
				five=	b5.getText();
				if(temp.equalsIgnoreCase("x"))
					b5.setForeground(Color.blue);
				else
					b5.setForeground(Color.red);
				set();
				winner();
			}
		});
		panel.add(b5);
		
		JButton b6 = new JButton("");
		b6.setFont(new Font("Trebuchet MS", Font.BOLD, 99));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6.setText(temp);
				six=	b6.getText();
				if(temp.equalsIgnoreCase("x"))
					b6.setForeground(Color.blue);
				else
					b6.setForeground(Color.red);
				set();
				winner();
			}
		});
		panel.add(b6);
		
		textField_3 = new JTextField("  Player 2");
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		textField_3.setEditable(false);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton b7 = new JButton("");
		b7.setFont(new Font("Trebuchet MS", Font.BOLD, 99));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7.setText(temp);
				seven=	b7.getText();
				if(temp.equalsIgnoreCase("x"))
					b7.setForeground(Color.blue);
				else
					b7.setForeground(Color.red);
				set();
				winner();
			}
		});
		
		t2 = new JTextField();
		t2.setText( " 0");
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 80));
		t2.setEditable(false);
		panel.add(t2);
		t2.setColumns(10);
		panel.add(b7);
		
		JButton b8 = new JButton("");
		b8.setFont(new Font("Trebuchet MS", Font.BOLD, 99));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8.setText(temp);
				eight=	b8.getText();
				if(temp.equalsIgnoreCase("x"))
					b8.setForeground(Color.blue);
				else
					b8.setForeground(Color.red);
				set();
				winner();
			}
		});
		panel.add(b8);
		
		JButton b9 = new JButton("");
		b9.setFont(new Font("Trebuchet MS", Font.BOLD, 99));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b9.setText(temp);
				nine=	b9.getText();
				if(temp.equalsIgnoreCase("x"))
					b9.setForeground(Color.blue);
				else
					b9.setForeground(Color.red);
				set();
				winner();
			}
		});
		panel.add(b9);
		
		JLabel label = new JLabel(new ImageIcon("img\\ty.png"));
		panel.add(label);
		
		JButton btnNewButton_11 = new JButton("RESTART");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setText(null);
				 button_1.setText(null);
				 b3.setText(null);
				 b4.setText(null);
				 b5.setText(null);
				 b6.setText(null);
				 b7.setText(null);
				 b8.setText(null);
				 b9.setText(null);
				 one="";
				 two="a";
				 thre="b";
				 four="c";
				 five="d";
				 six="e";
				 seven="f";
				 eight="g";
				 nine="h";
				 temp="x";
				 i=0;
			}
		});
		panel.add(btnNewButton_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(28, 21, 535, 104);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel(new ImageIcon("img\\gtic.jpg"));
		//ImageIcon img=new ImageIcon();
		lblNewLabel_12.setBounds(0,11,535, 82);
		panel_1.add(lblNewLabel_12);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(28, 471, 535, 75);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("img\\ga.jpg"));
		lblNewLabel.setBounds(0, 0, 535, 75);
		panel_2.add(lblNewLabel);
	}
}
