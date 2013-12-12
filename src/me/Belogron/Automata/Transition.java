package me.Belogron.Automata;

public class Transition {

	private State mTarget;
	private String mCondition, mOutput;
	
	public Transition( State target, String cond, String out) {
		mTarget = target;
		mCondition = cond;
		mOutput = out;
	}

	public State getTarget() {
		return mTarget;
	}

	public String getCondition() {
		return mCondition;
	}

	public String getOutput() {
		return mOutput;
	}
}
