package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
import java.awt.Dimension;

/*
 * Author: Kadin Hatchell
 * GUI frame, builds the frame.
 */
public class ChatFrame extends JFrame
{
	private ChatController baseController;
	private ChatPanel basePanel;
	
	public ChatFrame(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new ChatPanel(baseController);
		
		setupFrame();
		
	}
	/*
	 * sets up the frame and making the dimensions and visibility.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("GUI");
		this.setSize(new Dimension(475, 600));
		this.setVisible(true);
	}

}
