package co.ra.projects.picalculations;

import akka.actor.AbstractActor;
import co.ra.projects.picalculations.message.ResultMessage;
import co.ra.projects.picalculations.message.WorkMessage;

public  class PiWorker extends AbstractActor  {

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

	private Object getSender() {
		// TODO Auto-generated method stub
		return null;
	}

	private double calculatePiFor(int start, int nrOfElements) {
		double acc = 0.0;
		for (int i = start * nrOfElements; i <= ((start + 1) * nrOfElements - 1); i++) {
			acc += 4.0 * (1 - (i % 2) * 2) / (2 * i + 1);
		}
		return acc;
	}

}
