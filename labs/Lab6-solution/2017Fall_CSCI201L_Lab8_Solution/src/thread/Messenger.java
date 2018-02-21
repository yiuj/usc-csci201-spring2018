package thread;

import java.util.concurrent.ThreadLocalRandom;

public class Messenger extends Thread{
	private MessageQueue mq = null;
	public Messenger(MessageQueue mq){
		this.mq = mq;
	}
	public void run(){
		for (int i = 0; i < 20; i++){
			String message = "Message #"+(i+1);
			mq.addMessage(message);
			Util.print(Util.getDate()+" Messenger - inserting \""+ message +"\"");
			try {
				long v = ThreadLocalRandom.current().nextLong(0,1000);
				//System.out.println("this is the random number"+ v);
				Thread.sleep(v);
			} catch (InterruptedException e) {
				Util.print("interrupted exception: "+ e.getMessage());
			}
		}
	}
}
