package pekan4_2511532008;

public class QueueArrayDriver_2511532008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray_2511532008 queue_2008 = new QueueArray_2511532008(1000);
		
		queue_2008.enqueue_2008(10);
		queue_2008.enqueue_2008(20);
		queue_2008.enqueue_2008(30);
		queue_2008.enqueue_2008(40);
		
		System.out.println("Item di depan = " + queue_2008.front_2008());
		System.out.println("Item paling belakang = " + queue_2008.rear_2008());
		System.out.println("Tampilan queue ");
		queue_2008.display_2008();
		System.out.println("");
		System.out.println(queue_2008.dequeue_2008() + "hapus dari queue ");
		System.out.println("item di depan " + queue_2008.front_2008());
		System.out.println("item di belakang " + queue_2008.rear_2008());
		System.out.println("tampilan setelah di hapus; ");
		queue_2008.display_2008();
	}

}