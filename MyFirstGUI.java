import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFirstGUI extends JFrame {
	
	JButton additionButton;
	JTextField textValue1,
			   textValue2,
			   textAnswer;
	JLabel labelValue1,
		   labelValue2,
		   labelAnswer;
	
	public MyFirstGUI(){
		setTitle("Addition Machine");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initGUI();
	}
	
	public void initGUI(){
		JPanel masterPanel = new JPanel();
		getContentPane().add(masterPanel);
		
		masterPanel.setLayout(null);
		
		additionButton = new JButton("Let's add!");
		additionButton.setBounds(250, 55, 100, 30);
		
		textValue1 = new JTextField(15);
		textValue1.setBounds(10, 10, 100, 40);
		textValue2 = new JTextField(15);
		textValue2.setBounds(10, 50, 100, 40);
		textAnswer = new JTextField(15);
		textAnswer.setBounds(10, 90, 100, 40);
		
		labelValue1 = new JLabel("First value");
		labelValue1.setBounds(120, 10, 100, 40);
		labelValue2 = new JLabel("Second value");
		labelValue2.setBounds(120, 50, 100, 40);
		labelAnswer = new JLabel("Answer");
		labelAnswer.setBounds(120, 90, 100, 40);
		
		masterPanel.add(textValue1);
		masterPanel.add(labelValue1);
		masterPanel.add(textValue2);
		masterPanel.add(labelValue2);
		masterPanel.add(additionButton);
		masterPanel.add(textAnswer);
		masterPanel.add(labelAnswer);
		
		additionButton.addActionListener(new action());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstGUI Gui = new MyFirstGUI();
		Gui.setVisible(true);

	}

	public class action implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int x,
				y,
				z;
			
			Object source = ae.getSource();
			if(source==additionButton)
			{
				x = Integer.parseInt(textValue1.getText());
				y = Integer.parseInt(textValue2.getText());
				z = x + y;
				textAnswer.setText(String.valueOf(z));
			}
			
		}
	}

}
