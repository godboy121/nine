package prob5;

public class Book {
	public int bookNo;
	public String title;
	public String author;
	int statecode=1;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	void rent()
	{
		if(statecode==1)
		{
			statecode=0;
			System.out.println(this.title+"가 대여 됐습니다");
			
		}
		else
			System.out.println("오류입니다 ");
	}
	void print()
	{
		if(this.statecode==1)
		{
			System.out.println("책 제목"+this.title+", 작가:"+this.author+", 대여유무:재고있음");
			
		}
		else
			System.out.println("책 제목"+this.title+", 작가:"+this.author+", 대여유무:재고없음");
			
	}
	public Book(int bookNo,String title,String author)
	{
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		
	}
	
	
	
	
}
