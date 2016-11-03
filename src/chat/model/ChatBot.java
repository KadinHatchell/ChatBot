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
	private ArrayList<String> keyboardMashChecker;
	private String userName;
	private String content;

	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName
	 *            The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		memesList = new ArrayList<String>();
		politicalTopicList = new ArrayList<String>();
		this.userName = new String(userName);
		this.content = "content";
		buildMemesList();
		buildPoliticalTopicsList();
		buildKeyboardMashChecker();

	}

	/**
	 * Builds meme list
	 */
	private void buildMemesList()
	{
		memesList.add("doge");
		memesList.add("cute animal");
		memesList.add("cute animals");
		memesList.add("grumpy cat");
		memesList.add("dat boi");
		memesList.add("willy wonka");
		memesList.add("harambe");
		memesList.add("john cena");
		memesList.add("bobby hill");
		memesList.add("pupper");
		memesList.add("bite my shiny metal ass");
		memesList.add("deez nuts");
		memesList.add("got em");
		memesList.add("roses are red");
		memesList.add("pepe = terrorist");
		memesList.add("pepe");
		memesList.add("ALIENS");
		memesList.add("shrek");
		memesList.add("ken bone");
		memesList.add("jacob");
		memesList.add("leafyishere");

	}

	private void buildPoliticalTopicsList()
	{
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("11/8/16");
		politicalTopicList.add("liberal");
		politicalTopicList.add("conservative");
		politicalTopicList.add("Hillary");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
		politicalTopicList.add("election");
		politicalTopicList.add("build a wall");
		politicalTopicList.add("lets revote");
		politicalTopicList.add("couldve done better");
		politicalTopicList.add("Donald");
		politicalTopicList.add("Gary");
		

	}

	private void buildKeyboardMashChecker()
	{
		keyboardMashChecker.add("sfg");
		

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
		String test = "#Ç";
		System.out.println(test.toLowerCase());

		if (currentInput.toLowerCase().contains(content))
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
		for (String buildPoliticalTopiclist : politicalTopicList)
		{
			if (currentInput.equals(buildPoliticalTopiclist))
			{
				isPolitical = true;
			}
		}
		return isPolitical;
	}

	public boolean keyboardMashChecker(String currentInput)
	{boolean isKeyboard = false;
	for (String keyboardMashChecker : keyboardMashChecker)
	{
		if (currentInput.contains(keyboardMashChecker))
		{
			isKeyboard = false;
		}
	}
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
		for (String buildmemelist : memesList)
		{
			if (currentInput.equals(buildmemelist))
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
	
	public ArrayList<String> getKeyboardMashChecker()
	{
		return keyboardMashChecker;
	}

	/**
	 * Updates the content area for this Chatbot instance.
	 * 
	 * @param content
	 *            The updated value for the content area.
	 */
	public void setContent(String content)
	{
		this.content = content;

	}
}