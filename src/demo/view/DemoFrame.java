package demo.view;

import javax.swing.JFrame;

import demo.controller.AppController;

public class DemoFrame extends JFrame
{
	private AppController controller;
	private DemoPanel panel;
	
	public DemoFrame (AppController controller)
	{
		super();
		this.controller = controller;
		this.panel = new
				DemoPanel(controller);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setTitle("My First Windowed App");
		this.setVisible(true);
	}
}
