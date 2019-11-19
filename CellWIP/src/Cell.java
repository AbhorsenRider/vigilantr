
public class Cell {
	private int xCoor;
	private int yCoor;
	public Cell(int tempX, int tempY){
		setXCoor(tempX);
		
	}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	public void setXCoor(int tempX){
		xCoor=tempX;
		System.out.println(xCoor);
	}
	public void setYCoor(int tempY){
		yCoor=tempY;
		System.out.println(yCoor);
	}
}
