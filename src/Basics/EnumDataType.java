package Basics;

public class EnumDataType {

	public enum Seasons{WINTER, SUMMER, MONSOON};
	
	public static void main(String[] args) {
		System.out.println(Seasons.MONSOON);
		Seasons s = Seasons.SUMMER;
		
		switch (s) {
		case WINTER:
			System.out.println("Its WINTER");
			break;
			
		case SUMMER:
			System.out.println("Its SUMMER");
			break;
			
		case MONSOON:
			System.out.println("Its MONSOON");
			break;

		default:
			break;
		}
		
	}
}
