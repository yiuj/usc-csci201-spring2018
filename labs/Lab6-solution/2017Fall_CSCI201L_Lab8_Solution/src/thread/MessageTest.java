package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessageTest {
	public static void main(String [] args){
		
		for (int i = 0; i < 10; i++){
			System.out.println("Executing Cycle " + (i+1));
			ExecutorService executor = Executors.newFixedThreadPool(2);
			MessageQueue mq = new MessageQueue();
			Messenger msgr = new Messenger(mq);
			Subscriber subs = new Subscriber(mq);
			executor.execute(msgr);
			executor.execute(subs);
			executor.shutdown();
			while(!executor.isTerminated()){
				Thread.yield();
			}
		}
	}
}
