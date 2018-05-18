package com.binge.demo.builder;

/**
 * @autor binge
 * @date 2018年5月18日
 */
public class Person {

	// 这边设置成final
	private final String name;
	private final int age;
	private final String addr;
	private final String phone;

	public Person(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.addr = builder.addr;
		this.phone = builder.phone;
	}

	public static class Builder {

		private String name;
		private int age;
		private String addr;
		private String phone;

		public String getName() {
			return name;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setAddr(String addr) {
			this.addr = addr;
			return this;
		}

		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + ", phone=" + phone + "]";
	}

}
