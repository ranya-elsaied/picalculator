package co.ra.projects.picalculations.message;

import akka.util.Duration;
import lombok.Getter;

@Getter
public class PiApproximation {

	  private final double pi;
	  private final Duration duration;
	 
	  public PiApproximation(double pi, Duration duration) {
	    this.pi = pi;
	    this.duration = duration;
	  }
}
