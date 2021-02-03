package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import controller.AppController;


public class DemoPanel extends JPanel
{
	private AppController controller;
	private JButton GUIButton;
	private JButton duckButton;
	
	public DemoPanel(AppController controller)
	{
		super();
		this.controller = controller;
		this.GUIButton = new JButton("Click me for nothing :) oOo");
		this.duckButton = new JButton("Click this now >:(");
		setupPanel();
		setupListeners();
	}
	
	private void setupPanel()
	{
		Color myColor = new Color(0,204,255);
		this.setBackground(myColor);
		
		this.add(GUIButton);
		this.add(duckButton);
	}
	
	private void setupListeners()
	{
		GUIButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Color myColor = new Color(0,204,255);
				int colorPicker = (int)(Math.random() * 2);
				if (colorPicker == 1)
				{
					setBackground(myColor);
				}
				else
				{
					setBackground(generateRandomColor());
				}			
			}
		});
		
		duckButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						duckButton.setText(controller.getInfo());
					}
				});
	}
	
	private Color generateRandomColor()
	{
		Color random = null;
		
		int red = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		
		random = new Color(red, green, blue);
		
		return random;
	}
	
}

