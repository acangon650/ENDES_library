package com.endes.library.main;

import com.endes.library.enums.AccountState;
import com.endes.library.enums.Language;

public class Main {

	public static void main(String[] args) {
		for(AccountState state : AccountState.values() ) {
				System.out.println(state + " ");
		}

		for(Language lan : Language.values()) {
			System.out.println(lan+" ");
		}
	}

}
