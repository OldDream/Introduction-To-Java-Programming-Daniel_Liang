import java.util.*;
import java.util.concurrent.*;

public class Exercise30_12 {
	private static List<Double> list1 = new ArrayList<>(90000000);
	private static List<Double> list2 = new ArrayList<>(90000000);
    private static List<Double> list3 = (ArrayList<Double>);

	public static void main(String[] args) {
		//顺序执行
		for (int i = 0; i < 9000000; i++) {
				list1.add(ThreadLocalRandom.current().nextDouble());
		}
		long startTime1 = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.execute(new AssignValues());
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Sequential time is " + (endTime1 - startTime1));

		//并行
		for (int i = 0; i < 9000000; i++) {
				list2.add(ThreadLocalRandom.current().nextDouble());
			}
		System.out.println("Size of list2 " + list2.size());
		long startTime2 = System.currentTimeMillis();
		System.out.println("Parallel startTime2 : " + startTime2);
		parallelAssignValues(list2 , 0, 9000000);
		long endTime2 = System.currentTimeMillis();
		System.out.println("Parallel endTime2 : " + endTime2);
		System.out.println("Parallel time with " + Runtime.getRuntime().availableProcessors() + " processors is " + (endTime2 - startTime2));
	}

	private static void parallelAssignValues(List<Double> list, int startIndex, int endIndex) {
		RecursiveAction mainTask = new ParallelAssignValues(list, startIndex, endIndex);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(mainTask);
	}

	private static class ParallelAssignValues extends RecursiveAction {
		private final int THRESHOLD = 500;
		private List<Double> list;
		int startIndex, endIndex;

		public ParallelAssignValues(List<Double> list, int startIndex, int endIndex) {
			this.list = list;
			this.startIndex = startIndex;
			this.endIndex = endIndex;
		}
		
		@Override
		protected void compute() {
			if ((endIndex - startIndex) < THRESHOLD) {
				for (int i = startIndex; i < endIndex; i++) {
					list1.set(i, ThreadLocalRandom.current().nextDouble());
				}
			}
			else {
				int midIndex = (startIndex + endIndex) / 2 ;
				invokeAll(new ParallelAssignValues(list, startIndex, midIndex), new ParallelAssignValues(list, midIndex, endIndex));
			}
		}
	
	}

	private static class AssignValues implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 9000000; i++) {
				list1.set(i, ThreadLocalRandom.current().nextDouble());
			}
		}
	}



}