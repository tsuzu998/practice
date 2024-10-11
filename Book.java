public class Book extends TangibleAsset{
	private String isbn;
	public Book (String name,intprice,Stringcolor,String isbn){
		super(name,prince,color);
		this.isbn = isbn;
	}
	public String getlsbn(){return this.isbn;}
}
