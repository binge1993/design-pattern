package com.binge.demo.factory.method;

/**
 * @autor binge
 * @date 2018��5��17��
 */
public class IDCard extends Product {

	private String owner;

	public IDCard(String owner) {
		System.out.println(" ���� " + owner + " ��ID����");
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(" ʹ�� " + owner + " ��ID����");
	}

}
