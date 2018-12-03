class Database{
	private String pName;
	private int pCount;
	Database(String pName,int pCount)
	{
		this.pName=pName;
		this.pCount=pCount;
	}
	public String getProductName(){
		return this.pName;
	}
	public int getProductCount(){
		return this.pCount;
	}
	public void setProductCount(int newProductCount){
		this.pCount = newProductCount;
	}
}
