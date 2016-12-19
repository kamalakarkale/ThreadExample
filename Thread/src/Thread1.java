
public class Thread1 extends Thread{

	Lock lock;

	public Thread1() {
		this.lock = SingletonLock.getLock();
	}

	@Override
	public void run() {
		while(true){
			synchronized(lock){			
				System.out.println("1");
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
