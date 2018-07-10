package co.ra.projects.picalculations.message;

import lombok.Getter;

@Getter
public class WorkMessage {

	  private final int start;
	  private final int nrOfElements;
	 
	  public WorkMessage(int start, int nrOfElements) {
	    this.start = start;
	    this.nrOfElements = nrOfElements;
	  }
	 
}
