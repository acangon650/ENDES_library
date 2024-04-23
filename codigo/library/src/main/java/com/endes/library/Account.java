package com.endes.library;

import java.sql.Date;

import com.endes.library.enums.AccountState;

public class Account {
	private int id;
	private History history;
	private Date opened;
	private AccountState state;
}
