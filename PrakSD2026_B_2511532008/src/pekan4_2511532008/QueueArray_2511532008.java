package pekan4_2511532008;

public class QueueArray_2511532008 {
	int front_2008, rear_2008, size_2008;
	int capacity_2008;
	int array_2008[];
	
	public QueueArray_2511532008(int capacity) {
		this.capacity_2008 = capacity;
		front_2008 = this.size_2008 = 0;
		rear_2008 = capacity - 1;
		array_2008 = new int[this.capacity_2008];
	}
	
	boolean isFull_2008 (QueueArray_2511532008 queue) {
		return (queue.size_2008 == queue.capacity_2008);
	}
	boolean isEmpty_2008 (QueueArray_2511532008 queue_2008) {
		return (queue_2008.size_2008 == 0);
	}
	void enqueue_2008(int item_2008) {
		if (isFull_2008(this))
			return ;
		this.rear_2008 = (this.rear_2008 + 1) % this.capacity_2008;
		this.array_2008[this.rear_2008] = item_2008;
		this.size_2008 = this.size_2008 + 1;
		System.out.println(item_2008 +"enqueued to queue");
	}
	int dequeue_2008() {
		if (isEmpty_2008(this))
			return Integer.MIN_VALUE;
		int item = this.array_2008[this.front_2008 ];
		this.front_2008 = (this.front_2008 + 1) % this.capacity_2008;
		this.size_2008 = size_2008;
		return item;
	}
	
	int front_2008() {
		if (isEmpty_2008(this))
			return Integer.MIN_VALUE;
		return this.array_2008[this.front_2008];
	}
	int rear_2008() {
		if (isEmpty_2008(this))
			return Integer.MIN_VALUE;
		return this.array_2008[this.rear_2008];
	}
	void display_2008() {
		int i;
		if (front_2008 == size_2008) {
			System.out.println("Antrian Kososng");
			return;
		}
		for (i = front_2008; i < rear_2008; i++) {
			System.out.print("%d <-- " + array_2008[i]);
		}
		return;
	}
	
}
