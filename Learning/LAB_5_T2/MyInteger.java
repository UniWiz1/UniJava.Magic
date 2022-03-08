package LAB_5_T2;

public class MyInteger {
	int value;
	
	MyInteger () {}
	
	MyInteger (int newValue){
		value = newValue;
	}
	
	int getInt () {
		return value;
	}
	
	
	Boolean isEven() {
		if (value%2==0) {
		return true;
		}
		else return false;
	}
	
	static Boolean isEven(int value) {
		if (value%2==0) {
		return true;
		}
		else return false;
	}
	
	static Boolean isEven(MyInteger MyInteger) {
		int value = MyInteger.getInt();
		if (value%2==0) {
		return true;
		}
		else return false;
	}
		
	{}
	
	Boolean isOdd() {
		if (value%2==0) {
			return false;
			}
			else return true;
	}
	
	static Boolean isOdd(int value) {
		if (value%2==0) {
			return false;
			}
			else return true;
	}
	
	static Boolean isOdd(MyInteger MyInteger) {
		int value = MyInteger.getInt();
		if (value%2==0) {
			return false;
			}
			else return true;
	}
	
	{}
	
	Boolean isPrime() {
		if (value == 0 || value == 1) {
			return false;
		}
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
			return false;
			}
		}
		return true;
	}
	
	static Boolean isPrime(int value) {
		if (value == 0 || value == 1) {
			return false;
		}
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
			return false;
			}
		}
		return true;
	}
	
	static Boolean isPrime(MyInteger MyInteger) {
		int value = MyInteger.getInt();
		if (value == 0 || value == 1) {
			return false;
		}
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
			return false;
			}
		}
		return true;
	}



	boolean equals (int n) {
		if (value == n) {
			return true;
		}
		return false;
	}
	
	boolean equals (MyInteger obj) {
		if (value == obj.value) {
			return true;
		}
		return false;
	}

	
	
	static int parseInt(char[] c) {
		int integer = Integer.parseInt(String.valueOf(c));
		return integer;
	}
	
	static int parseInt(String str) {
		int integer = Integer.parseInt(str);
		return integer;
	}

}
