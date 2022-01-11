package encapsulation;

class Author{
	String name;
	String email;
	char gender;
	
	Author(String name,	String email,char gender){
		this.email=email;
		this.gender=gender;
		this.name=name;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	

	
}
class Book{
	String name;
	double price;
	int qltInStock;
	Author auth;
	
	Book(String name,Author auth,double price,int qltInStock){
		this.name=name;
		this.auth= auth;
		this.price=price;
		this.qltInStock=qltInStock;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQltInStock() {
		return qltInStock;
	}

	public void setQltInStock(int qltInStock) {
		this.qltInStock = qltInStock;
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Author auth=new Author("Chetan Bhagat","ahss",'M');
		Book b=new Book("Amir Gareeb",auth,1234.23,12);
		b.setName("Half-Girlfreind");
		
		System.out.println("Book name is "+b.name+ " and price of book is :"+b.price+" in stock "+ b.qltInStock+"Books Available" +"\n"+"The autho"
				+ "r detail is= Auhor name is : "
		+auth.name+" and Author mail id is :"+auth.email+" and gender is :"+auth.gender+" "+b.auth.name+"");

	}
}


