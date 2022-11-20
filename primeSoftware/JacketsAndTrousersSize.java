package primeSoftware;

import javax.management.InvalidAttributeValueException;

public class JacketsAndTrousersSize implements Size {
	public static final int minSize = 42;
	public static final int maxSize = 66;
	
	private int size;
	
	
	public JacketsAndTrousersSize(int size) throws InvalidAttributeValueException {
		super();
		if (size < minSize || size > maxSize || size % 2 != 0) {
			throw new InvalidAttributeValueException("Invalid value provided for size");
		}
		
		this.size = size;
	}

	@Override
	public String getSize() {
		return String.valueOf(this.size);
	}
}
