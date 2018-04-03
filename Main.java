import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        	int n = Integer.parseInt(in.nextLine());
        	Point[] points = new Point[n];
        	for (int i = 0; i < n; i++) {
        		String[] line = in.nextLine().split(" ");
        		int x = Integer.parseInt(line[0]);
        		int y = Integer.parseInt(line[1]);
        		points[i] = new Point(x, y);
			}
        	System.out.println(Arrays.toString(points));
        }
        in.close();
	}
}