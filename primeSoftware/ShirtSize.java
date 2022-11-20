package primeSoftware;

enum ShirtSize implements Size {
	XS, 
	S, 
	M, 
	L, 
	XL, 
	XXL;

	@Override
	public String getSize() {
		return super.toString();
	}
}
