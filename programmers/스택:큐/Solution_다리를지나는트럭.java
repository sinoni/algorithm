package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_다리를지나는트럭 {
	static class Truck {
		int weight;
		int entry;
		
		public Truck(int weight, int time) {
			this.weight = weight;
			this.entry = time;
		}
		
	}
	public static void main(String[] args) {
//		int bridge_length = 2;
//		int weight = 10;
//		int[] truck_weights = {7,4,5,6};
		
//		int bridge_length = 100;
//		int weight = 100;
//		int[] truck_weights = {10};
		
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
	
	static Queue<Truck> waiting = new LinkedList<>();
	static Queue<Truck> bridge = new LinkedList<>();

	private static int solution(int bridge_length, int weight, int[] truck_weights) {
		for(int i=0, len = truck_weights.length; i<len; ++i) {
			waiting.offer(new Truck(truck_weights[i], 0));
		}
		
		int time=0;
		int totalWeight = 0;
		while(!waiting.isEmpty() || !bridge.isEmpty()) {
			time++;
			if(!bridge.isEmpty()) {
				Truck truck = bridge.peek();
				if(time-truck.entry>=bridge_length) {
					totalWeight-=truck.weight;
					bridge.poll();
				}
			}
			if(!waiting.isEmpty()) {
				if(totalWeight+waiting.peek().weight<=weight) {
					Truck truck = waiting.poll();
					bridge.offer(new Truck(truck.weight, time));
					totalWeight+=truck.weight;
				}
			}
		}
		
        return time;
    }
}
