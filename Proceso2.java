public class Proceso2 implements Runnable{

	@Override
	public void run(){
		int a = 3;
		int b = 5;
		int c = 0;
		for(int i =0; i<= 0; i++){
			c = a + b;
			System.out.println("La suma de "+a+"+"+b+"="+c);
		}
	}
}