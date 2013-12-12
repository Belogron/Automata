package me.Belogron.Automata;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private String mName;
	private List<Transition> mTransitions;
	
	//input cache
	String mLastInput = "";
	Transition mLastQueriedTransition;
	
	public State(String name) {
		mName = name;
		mTransitions = new ArrayList<Transition>();
	}

	public String getName() {
		return mName;
	}
	
	public void addTransition(State target, String cond, String out) {
		mTransitions.add(new Transition(target, cond, out));
	}
	
	public State getNewState(String input) {
		if(!mLastInput.equals("")) {
			return mLastQueriedTransition.getTarget();
		}
		for(Transition s : mTransitions) {
			if(s.getCondition().equals(input)) {
				//Cache the input
				mLastInput = input;
				mLastQueriedTransition = s;
				
				return s.getTarget();
			}
		}
		//Nothing found, clear cache
		mLastInput = "";
		mLastQueriedTransition = null;
		return null;
	}
	
	public String getOutput(String input) {
		if(!mLastInput.equals("")) {
			return mLastQueriedTransition.getOutput();
		}
		for(Transition s : mTransitions) {
			if(s.getCondition().equals(input)) {
				//Cache the input
				mLastInput = input;
				mLastQueriedTransition = s;
				
				return s.getOutput();
			}
		}
		//Nothing found, clear cache
		mLastInput = "";
		mLastQueriedTransition = null;
		return null;
	}
}
