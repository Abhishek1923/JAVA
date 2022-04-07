class InsufficientBalException extends Exception{
	InsufficientBalException(){}
	InsufficientBalException(String s){
		super(s);
	}
}
class Bank{
	int balance=5000;
	public int getAmount(int amount)throws InsufficientBalException{
	if(balance<amount){
		throw new InsufficientBalException("InsufficientBalException");
	}
	else{
		balance=balance-amount;
	}
	return amount;
	}
}
class ExceptionTest02{
	public static void main(String[] args){
		int amt=0;
		Bank b = new Bank();
		try{
		amt = b.getAmount(6000);
		}catch(InsufficientBalException e){
			System.out.println("U dont have sufficient balance ");
		}
		System.out.println("U withdraw "+amt);
	}
}