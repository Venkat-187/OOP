package practicaltaskone;

public class Arrays {

	public static void main(String[] args) {
		//1D ARRAYS:
		int[] speed= {120,85,45,60};
		for(int i=0;i<speed.length;i++) {
			System.out.println(speed[i]+" kmph");
		}
		System.out.println("The speed of the last car is " + speed[3]+"kmph.");
		System.out.println("The speed of third car is "+speed[2]+"kmph.");
		speed[2]=92;
		System.out.println("Now, the speed of third car is "+speed[2]+"kmph.");
		System.out.println();
		
		//2D ARRAYS:
		System.out.println("Matrix:");
		int [] [] matrix = {
				{10,50},
				{90,21},
				{100,1}
		};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}

