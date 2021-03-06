package controller.command;

import model.CoreInterface;
import model.RecorderInterface;
import view.HMIInterface;
import controller.Command;



public class Replay implements Command{

	@SuppressWarnings("unused")
	private CoreInterface c;
	@SuppressWarnings("unused")
	private HMIInterface h;
	private RecorderInterface r;
	
	public Replay(CoreInterface c, HMIInterface h, RecorderInterface r) {
		this.c = c;
		this.h = h;
		this.r = r;
	}
	
	@Override
	public void execute() {
		r.replay();		
	}

}
