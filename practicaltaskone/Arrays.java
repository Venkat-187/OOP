package practicaltaskone;

public class Arrays {

	public static void main(String[] args) {
		//1D ARRAYS:
		String[] cars = {"Ferrari","Aston Martin","Audi","Porsche"};
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		System.out.println("The last car is a " + cars[3]+".");
		cars[2]="BMW";
		System.out.println("Now, the third car is a "+cars[2]+".");
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

