package com.gl.transaction.main;

import java.util.Scanner;
import com.gl.transaction.service.TransactionService;
public class TransactionDriver {
	
	public static void main(String args[]) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the size of transaction array");
		
		int size = s.nextInt();
		int arr[]= new int[size];
		
		System.out.println("enter the values of the array");
		for (int i = 0; i < size; i++)
			arr[i] = s.nextInt();
		System.out.println("enter the total target to be achieved");
		int targetNo = s.nextInt();
		
		TransactionService transactionservice = new TransactionService();
		transactionservice.checkTransaction(arr,targetNo);
		s.close();
	}
}
