package chat.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided.
 * Students will complete methods as part of the project.
 * 
 * @author Kadin
 * @version 1.0 10/14/15
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;

	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * 
	 * @param userName
	 *            The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		memesList = new ArrayList<String>();
		politicalTopicList = new ArrayList<String>();
		this.userName = new String(userName);
		this.content = new String("topoic area of interest");

	}

	/**
	 * Builds meme list
	 */
	private void buildMemesList()
	{
		this.memesList.add("doge");
		this.memesList.add("cute animal");
		this.memesList.add("cute animals");
		this.memesList.add("grumpy cat");
		this.memesList.add("dat boi");
		this.memesList.add("willy wonka");
		this.memesList.add("harambe");
		this.memesList.add("john cena");
		this.memesList.add("bobby hill");
		this.memesList.add("pupper");
		this.memesList.add("bite my shiny metal ass");
		this.memesList.add("deez nuts");
		this.memesList.add("got em");
		this.memesList.add("roses are red");
		this.memesList.add("pepe = terrorist");
		this.memesList.add("pepe");
		this.memesList.add("ALIENS");
		this.memesList.add("shrek");
		this.memesList.add("ken bone");
		this.memesList.add("jacob");
		this.memesList.add("leafyishere");
		
		
	}

	private void buildPoliticalTopicsList()
	{
		this.memesList.add("Democrat");
		this.memesList.add("Repulican");
		this.memesList.add("11/8/16");
		this.memesList.add("liberal");
		this.memesList.add("conservative");
		this.memesList.add("Clinton");
		this.memesList.add("Trump");
		this.memesList.add("Kaine");
		this.memesList.add("Pence");
		this.memesList.add("Stein");
		this.memesList.add("Johnson");
		this.memesList.add("election");
		this.memesList.add("build a wall");
		

	}
	
	private void keyboardMashChecker()
	{
		
	}

	/**
	 * Checks the length of the supplied string. Returns false if the supplied
	 * String is empty or null, otherwise returns true.
	 * 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if (currentInput != null && !currentInput.equals(""))
		{
			hasLength = true;
		}
		
		return hasLength;
	}

	/**
	 * Checks if the supplied String matches the content area for this Chatbot
	 * instance.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;

		if (currentInput.contains(content))
		{
			hasContent = true;
		}

		return hasContent;
	}

	/**
	 * Checks if supplied String matches ANY of the topics in the
	 * politicalTopicsList. Returns true if it does find a match and false if it
	 * does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean isPolitical = false;
		for (String politicalTopic : politicalTopicList){
			if(currentInput.toLowerCase().contains(politicalTopic.toLowerCase())){;
				isPolitical = true;
			}
		}
		return isPolitical;
	}
	
	public boolean keyboardMashChecker(String currentInput)
	{
		return false;
	}
	
	public boolean inputHTMLChecker(String currentInput)
	{
		return false;
	}

	/**
	 * Checks to see that the supplied String value is in the current memesList
	 * variable.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean isMeme = false;
		for (String meme : memesList)
		{
			if (currentInput.toLowerCase().contains(meme.toLowerCase()))
			{
				isMeme = true;
			}
		}

		return isMeme;
	}

	/**
	 * Returns the username of this Chatbot instance.
	 * 
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * Returns the content area for this Chatbot instance.
	 * 
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * Getter method for the memesList object.
	 * 
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}

	/**
	 * Getter method for the politicalTopicList object.
	 * 
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}
	

	/**
	 * Updates the content area for this Chatbot instance.
	 * 
	 * @param content
	 *            The updated value for the content area.
	 */
	public void setContent(String content)
	{

	}
}