package me.Belogron.Automata;

import java.util.ArrayList;
import java.util.List;

public class AutomatonSimulator {

	private List<State> mStates;
	private State mCurrentState;

	public State getCurrentState() {
		return mCurrentState;
	}

	public AutomatonSimulator() {
		mStates = new ArrayList<State>();
	}
	
	public String input(String input) throws Exception {
		if (mCurrentState == null) {
			throw new Exception("You have not set the starting state yet!");
		}
		String out = mCurrentState.getOutput(input);
		mCurrentState = mCurrentState.getNewState(input);
		return out;
	}
	
	public void addState(State state) {
		mStates.add(state);
	}
	
	public void setStartingState(State s) {
		mCurrentState = s;
	}


}
