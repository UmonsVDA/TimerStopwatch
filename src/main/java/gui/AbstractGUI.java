package gui;

import states.Context;
import states.EventListener;

public abstract class AbstractGUI {

    EventListener observer;
    
    AbstractGUI(EventListener o) {
    	observer = o;
    	initGUI();
    	addEventListener();
    	}
    
    protected abstract void initGUI();
    
    protected abstract void addEventListener();
    
    public abstract void updateUI(Context c);
    
}
