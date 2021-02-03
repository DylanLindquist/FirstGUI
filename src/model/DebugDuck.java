package model;

public class Debugduck
{
	private int questionCount;
	private String name;
	
	public Debugduck()
	{
		this.questionCount = 0;
		this.name = "Ted";
	}

	public int getQuestionCount()
	{
		return questionCount;
	}

	public String getName()
	{
		return name;
	}

	public void setQuestionCount(int questionCount)
	{
		this.questionCount = questionCount;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
