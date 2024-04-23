package com.endes.library.main;

import com.endes.library.enums.AccountState;

public class Main {

	public static void main(String[] args) {
		for(AccountState state : AccountState.values() ) {
				System.out.print(state + " ");
				
				AccountState state2 = AccountState.Frozen;
		}

	}

}
