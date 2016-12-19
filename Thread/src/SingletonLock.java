
public class SingletonLock {
	private static Lock lock;;
	
	private SingletonLock(){
		
	}
	
	public static Lock getLock(){
		if(lock == null){
			lock = new Lock();
		}
		return lock;
	}	
}
