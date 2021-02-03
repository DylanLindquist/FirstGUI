package demo.controller;

import demo.model.DebugDuck;
import demo.view.DemoFrame;

public class AppController
{
		private DemoFrame frame;
		private DebugDuck myDuck;
		
		public AppController()
		{
			this.myDuck = new DebugDuck();
			this.frame = new DemoFrame (this);
		}
		
		public void start()
		{
			
		}
		
		public void updateQuestions()
		{
			myDuck.setQuestionCount(myDuck.getQuestionCount() + 1);
		}
		
		public String getInfo()
		{
			String info = "";
			
			info += myDuck.getName() + " has answered this many questions: " + myDuck.getQuestionCount();
					
			return info;
		}
	}