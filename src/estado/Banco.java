package estado;

public class Banco {

		private int account_number;
		private String account_name;
		private double saldo;
		
		public Banco (int account_number, String account_name) {
			
			this.account_name = account_name;
			this.account_number = account_number;
		}
		
		public void setSaldo_name (double saldo) {
			
			this.saldo = saldo;
		}
		public double getSaldo () {
			
			return saldo;
		} 
		public int getAccount_number() {
	
			return account_number;
		}
		public void setAccount_name (String account_name) {
			
			this.account_name = account_name;
		}
		public String getAccount_name () {
			
			return account_name;
		}
		
		public void Deposit (double deposit ) {
			
			saldo= saldo+deposit;
		}
		
		public void saque (double saque) {
			
			saldo = saldo-saque-5;
		}
		
		public String toString () {
			
			return "Account date:  \n Accounte: "+ account_number+ ", Holder: "+account_name+ ", Balance: $"+saldo;
			
		}
		
		
}
