package org.id.modernjava.functionalprogramming.realexample;


@FunctionalInterface
public interface AccountFactory {
    public BankAccount getBankAccount (int id, double balance, String accountName);
}
