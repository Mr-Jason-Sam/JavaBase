package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


public class ThreadCreate {
	public static class CreateByThread extends Thread{
		public CreateByThread() {
			
		}
		
		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
	
	
	//2.覆写Runnable()接口实现多线程，而后同样覆写run().推荐此方式
	public static class CreateByRunnable implements Runnable{
		public CreateByRunnable() {}
		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
	
	//3.覆写Callable接口实现多线程（JDK1.5）
	public static class CreateByCallable implements Callable<String>{
		@Override
		public String call() throws Exception {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			return "OK";
		}
	}
	
	//4.通过线程池启动多线程
	public static class CreateByThreadPool{
		public void testFixThreadPool() {
			testSubmit(Executors.newFixedThreadPool(5));
		}
		
		public void testSingleThreadPoolExecutor() {
			testSubmit(Executors.newSingleThreadExecutor());
		}
		
		public void testCashedThreadPool() {
			testSubmit(Executors.newCachedThreadPool());
		}
		
		private void testSubmit(ExecutorService executorService) {
			for(int i=0;i<5;i++) {
				executorService.submit(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int j=0;j<10;j++) {
							System.out.println(Thread.currentThread().getName()+":"+j);
						}
					}
				});
			}
			executorService.shutdown();
		}
	}
	public static void main(String[] args) {
//		CreateByThread thread1 = new CreateByThread();
//		CreateByThread thread2 = new CreateByThread();
//		thread1.start();
//		thread2.start();
		
//		CreateByRunnable runnable = new CreateByRunnable();
//		Thread thread1 = new Thread(runnable, "thread1");
//		Thread thread2 = new Thread(runnable, "thread2");
//		thread1.start();
//		thread2.start();
		
//		Callable<String> callable = new CreateByCallable();
//		FutureTask<String> futureTask = new FutureTask<>(callable);
//		FutureTask<String> futureTask2 = new FutureTask<>(callable);
//		Thread mThread=new Thread(futureTask);
//		Thread mThread2=new Thread(futureTask2);
////		mThread.setName("hhh");
//		mThread.start();
//		mThread2.start();
//		try {
//			System.out.println(futureTask.get());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		CreateByThreadPool pool = new CreateByThreadPool();
		pool.testFixThreadPool();
		pool.testCashedThreadPool();
		pool.testSingleThreadPoolExecutor();
	}
}
