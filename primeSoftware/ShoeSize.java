package primeSoftware;

import javax.management.InvalidAttributeValueException;

public class ShoeSize implements Size {
	public static final int minSize = 39; 
	public static final int maxSize = 46;
	
	private int size;
	
	public ShoeSize(int size) throws InvalidAttributeValueException
	{
		if (size < minSize || size > maxSize) {
			throw new InvalidAttributeValueException("Invalid value provided for size");
		}
		
		this.size = size;
	}

	public String getSize() {
		return String.valueOf(this.size);
	}
}
