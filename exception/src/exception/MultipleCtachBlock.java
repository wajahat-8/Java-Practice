package exception;

public class MultipleCtachBlock {
	public static void main(String[] args) {
		try {
			String textString=null;
			System.out.println(textString.length());
		}
		catch (ArithmeticException e) {
			System.out.println("AritmeticException occured.");
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException Occured"+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("some other exception occured");
		}
	}

}
