package testApp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2nd Version");
		// �ժ��s�W�� code
		Math cMath = new Math();
		System.out.println();
		System.out.print(cMath.add(5, 5));
		
	}

}
class Math{
	int add(int x, int y) {
		return x+y;
	}
}