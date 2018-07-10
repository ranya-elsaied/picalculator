package co.ra.projects.picalculations.message;

import lombok.Getter;

@Getter
public class ResultMessage {
	
	  private final double value;
	  
	  public ResultMessage(double value) {
	    this.value = value;
	  }

}
