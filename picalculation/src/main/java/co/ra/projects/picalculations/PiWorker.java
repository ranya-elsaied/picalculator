package co.ra.projects.picalculations;

import akka.actor.UntypedActor;
import co.ra.projects.picalculations.message.ResultMessage;
import co.ra.projects.picalculations.message.WorkMessage;

public class PiWorker extends UntypedActor {
	 
	  // calculatePiFor ...
	 
	  public void onReceive(Object message) {
	    if (message instanceof WorkMessage) {
	    	WorkMessage work = (WorkMessage) message;
	      double result = calculatePiFor(work.getStart(), work.getNrOfElements());
	      getSender().tell(new ResultMessage(result), getSelf());
	    } else {
	      unhandled(message);
	    }
	  }


}
