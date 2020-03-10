package com.capgemini.quiz.day3;

class Product {
	double price;
}

public class Quiz3 {
	public void updatePrice(Product product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}

	public static void main(String[] args) {
		Product q = new Product();
		q.price = 200;
		double newprice = 100;
		Quiz3 qu = new Quiz3();
		qu.updatePrice(q, newprice);
		System.out.println(q.price + " " + newprice);
	}

}
