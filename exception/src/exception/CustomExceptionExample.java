package exception;
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			validateScore(-10);
		} catch (InvalidInputException e) {
			System.out.println("Custom exception caught: "+e.getMessage());
		}
	}
	public static void validateScore(int score) throws InvalidInputException{
		if (score<0||score>100) {
			throw new InvalidInputException("score must be between 0 and 100");
		}
		System.out.println("valid score:"+score);
	}

}
