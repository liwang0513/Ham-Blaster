package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	Image face;
	int faceX = 200;
	int faceY = 200;
	
	public Menu(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		face = new Image("res/myface.jpg");
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

	}
	
	public int getID() {
		return 0;
	}
}
