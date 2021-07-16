package lecture2_oopIntro;

public class Product {
	  int id;
      String name;
      int unitPrice;
      String detail;

	public Product() {
		System.out.println("Ben çalıştım");
	}

	public Product(int id,String name, int unitPrice,String detail) {
	  this();
	  this.id=id;
	  this.name=name;
	  this.unitPrice=unitPrice;
	  this.detail=detail;
	
	}
	
   
      
}
