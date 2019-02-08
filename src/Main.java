import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setResizable(false);
		myFrame.setBounds(0, 0, 300, 200);
		myFrame.setLayout(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel rate = new JLabel("Hourly Rate:");
		rate.setBounds(50, 50, 100, 25);
		myFrame.add(rate);
		
		JLabel week = new JLabel("Hours/Week");
		week.setBounds(50, 75, 100, 25);
		myFrame.add(week);
		
		JTextField rateInput = new JTextField();
		rateInput.setBounds(150, 50, 100, 25);
		myFrame.add(rateInput);
		
		JTextField weekInput = new JTextField();
		weekInput.setBounds(150, 75, 100, 25);
		myFrame.add(weekInput);
		
		JCheckBox time = new JCheckBox("Full Time");
		time.setBounds(50, 100, 100, 25);
		myFrame.add(time);
		
		JLabel salary = new JLabel("Annual Salary:$");
		salary.setBounds(50, 125, 200, 25);
		myFrame.add(salary);
		
		JButton calculate = new JButton("Calculate");
		calculate.setBounds(150, 100, 100, 25);
		myFrame.add(calculate);
		calculate.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if(time.isSelected() == true)
						{
							double num= Double.parseDouble(rateInput.getText()); 
							double product = num * 2080;
							salary.setText("Annual Salary: $" + product);
						}
						else
						{
							double num  = Double.parseDouble(rateInput.getText());
							double num2 = Double.parseDouble(weekInput.getText());
							double product = num * num2 * 52;
							salary.setText("Annual Salary: $" + product);
						}
					}
				});
		
		
		myFrame.setVisible(true);
		
		
	}

}
