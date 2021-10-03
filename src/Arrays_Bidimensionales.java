
public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] array = new int [4][5];
		
		// Rellenos de forma manual
		array[0][0] = 15; 
		array[0][1] = 21;
		array[0][2] = 18;
		array[0][3] = 89;
		array[0][4] = 15; 
		
		array[1][0] = 10;
		array[1][1] = 52;
		array[1][2] = 17;
		array[1][3] = 19;
		array[1][4] = 77;
		
		array[2][0] = 19;
		array[2][1] = 29;
		array[2][2] = 19;
		array[2][3] = 17;
		array[2][4] = 71;
		
		array[3][0] = 92;
		array[3][1] = 13;
		array[3][2] = 13;
		array[3][3] = 32;
		array[3][4] = 41;
		
		System.out.println("Array Bidimensional 1");
		
		for(int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<5; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		
		int [][] array2 = {
				
				{15,21,18,89,15},
				{10,52,17,19,77},
				{19,29,19,17,71},
				{92,13,13,32,41}
		};
		
		System.out.println("\n");
		System.out.println("Array Bidimensional 2");
		
		for(int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<5; j++) {
				System.out.print(array2[i][j] + " ");
			}
		}
		
		System.out.println("\n");
		System.out.println("Array Bidimensional 3");
		
		for(int[]fila:array2) {
			System.out.println();
			for(int e:fila) {
				System.out.print(e + " ");
			}
		}
		
		
		
	}

}
