package com.tnsif.day3.encapsulation.copy;

public class OopsConceptDemo {
	    private int serialNum;
	    private String name;
	    private int age;

	    public int getSerialNum() {
			return serialNum;
		}

		public void setSerialNum(int serialNum) {
			this.serialNum = serialNum;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		// Optionally override toString() to print object values
	    @Override
	    public String toString() {
	        return "SerialNum: " + serialNum + ", Name: " + name + ", Age: " + age;
	    }
	}

