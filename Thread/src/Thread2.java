import java.util.Arrays;

public class Thread2 extends Thread{

	Lock lock;

	public Thread2() {
		this.lock = SingletonLock.getLock();
	}

	@Override
	public void run() {
		while(true){
			try {
				sleep(1000);
				synchronized(lock){	
					System.out.println("2");
					lock.notify();	
				}


			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
