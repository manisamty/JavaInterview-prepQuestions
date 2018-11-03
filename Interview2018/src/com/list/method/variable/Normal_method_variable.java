package com.list.method.variable;

class Supplier{
private String pondsCream;

public String getPondsCream() {
	return pondsCream;
}

public void setPondsCream(String pondsCream) {
	this.pondsCream = pondsCream;
}

}

class Producer{
private String OrderType;
private Supplier supplier;

public Supplier getSupplier() {
	return supplier;
}

public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}

public String getOrderType() {
	return OrderType;
}

public void setOrderType(String orderType) {
	OrderType = orderType;
}

}

class Consumer{
private String location;
private Producer producer;



public Producer getProducer() {
	return producer;
}

public void setProducer(Producer producer) {
	this.producer = producer;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

}


public class Normal_method_variable {
public static void main(String[] args) {
	Supplier s=new Supplier();
	s.setPondsCream("Alovera");
	//s.getPondsCream();
	
	Producer p=new Producer();
	p.setOrderType("1345");
	p.setSupplier(s);
	
	Consumer c=new Consumer();
	c.setLocation("Bangalore");
	c.setProducer(p);

System.out.println("Supply own class : " + s.getPondsCream() + "\n" + "Producer : " 
					+ p.getOrderType() + "\n" + "Supplier : " + p.getSupplier().getPondsCream()
					
					+ "\n" + "Consumer : " + c.getLocation()+
					"\n" + "ProducerTest : "+ c.getProducer().getSupplier().getPondsCream());
}
}
