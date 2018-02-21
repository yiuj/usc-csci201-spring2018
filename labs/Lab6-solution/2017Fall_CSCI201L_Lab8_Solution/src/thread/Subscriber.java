package thread;

import java.util.concurrent.ThreadLocalRandom;

public class Subscriber extends Thread{
	private MessageQueue mq = null;
	public Subscriber(MessageQueue mq){
		this.mq = mq;
	}
	public void run(){
		for (int i = 0; i < 20; i++){
			String output = Util.getDate() +" Subscriber - ";
			String m = mq.getMessage();
			if (m == ""){
				output += "tried to read but no message ...";
				i-=1;
			}else{
				output += "reading \""+m+"\"";
			}
			Util.print(output);
			try {
				long v = ThreadLocalRandom.current().nextLong(0,1000);
				//System.out.println("this is the random number"+ v);
				Thread.sleep(v);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
