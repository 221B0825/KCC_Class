package kosa.bank;

import java.util.Arrays;

public class MyBank {

	private Customer[] customers;
	private int customersNum;

	public MyBank() {
		this.customers = new Customer[10];

	}

	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
		System.out.println("고객 등록이 완료되었습니다.");
	}

	public int getCustomerNum() {
		return customersNum;
	}

	public Customer getCustomer(String id) {
		for (int i = 0; i < customersNum; i++) {
			if (customers[i].getId().equals(id)) {
				return customers[i];
			}
		}
		return null;
	}

	public Customer[] getAllCustomers() {
		Customer[] allValue = null;
		// 1)
//		Customer[] allValue = new Customer[customersNum];
//		for(int i=0; i<customersNum; i++) {
//			allValue[i] = customers[i];
//		}
//		
//		return allValue;

		// 2)
//		allValue = Arrays.copyOf(customers, customersNum);
		// 3)
		System.arraycopy(customers, 0, allValue, 0, customersNum);
		return allValue;
	}

}
