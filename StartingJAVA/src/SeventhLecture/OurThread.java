package SeventhLecture;

public class OurThread extends Thread{

	private String threadName;
	private int startingPoint;
	private int counter;
	private int timeDifference;
	private int adder;
	private OurThread dependentThread;
	private boolean threadAliveFlag;
	
	public OurThread(String threadName, int startingPoint, int timeDifference, int adder, OurThread dependentThread,
			boolean threadAliveFlag) {
		super();
		this.threadName = threadName;
		this.startingPoint = startingPoint;
		this.timeDifference = timeDifference;
		this.adder = adder;
		this.dependentThread = dependentThread;
		this.threadAliveFlag = threadAliveFlag;
		}
	
	
	//-----------------run method-------------------
	
	public void run() {
		counter=startingPoint;
		if (dependentThread!=null) {
				try {
					dependentThread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		while (threadAliveFlag) {
			counter+=adder;
			
			try {
				sleep(timeDifference);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	//---------------stop method--------------------------
	
	
	public void stopThread() {
		threadAliveFlag=false;
	}

	
//	-----------------getters && setters--------------------
	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public int getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(int startingPoint) {
		this.startingPoint = startingPoint;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getTimeDifference() {
		return timeDifference;
	}

	public void setTimeDifference(int timeDifference) {
		this.timeDifference = timeDifference;
	}

	public int getAdder() {
		return adder;
	}

	public void setAdder(int adder) {
		this.adder = adder;
	}

	public OurThread getDependentThread() {
		return dependentThread;
	}

	public void setDependentThread(OurThread dependentThread) {
		this.dependentThread = dependentThread;
	}

	public boolean isThreadAliveFlag() {
		return threadAliveFlag;
	}

	public void setThreadAliveFlag(boolean threadAliveFlag) {
		this.threadAliveFlag = threadAliveFlag;
	}
	
}	
