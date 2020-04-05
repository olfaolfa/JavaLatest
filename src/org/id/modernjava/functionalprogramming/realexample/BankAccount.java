package org.id.modernjava.functionalprogramming.realexample;

import lombok.*;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

@Data
@NoArgsConstructor
@ToString
public class BankAccount {
    public int id;
    public double balance;
    public String accountName;
    final Lock lock = new ReentrantLock();

    BiFunction<Double, Double, Double> substractFunction = (a, b) -> a - b;
    BiFunction<Double, Double, Double> addFunction = (a, b) -> a + b;

    public BankAccount (int id, double balance, String accountName) {
        this.id = id;
        this.balance = balance;
        this.accountName = accountName;
    }

    public boolean withDraw (Double amount) throws Exception {
        if (lock.tryLock()) {
            Thread.sleep(100);
            balance = substractFunction.apply(balance, amount);
            lock.unlock();
            return true;
        }
        return false;
    }

    public boolean deposit (Double amount) throws Exception {
        if (lock.tryLock()) {
            Thread.sleep(100);
            balance = addFunction.apply(balance, amount);
            lock.unlock();
            return true;
        }
        return false;
    }

    public boolean transfer (BankAccount to, Double amount) throws Exception {
        if (this.withDraw(amount)) {
            System.out.println("withdrawing amount " + amount + " from: " + getAccountName());
            if (to.deposit(amount)) {
                System.out.println("deposing amount " + amount + " to : " + to.getAccountName());
                return true;
            } else {
                System.out.println("failed to acquire both locks : refundings " + amount + " to " + accountName);
                while (!deposit(amount))
                    continue;
            }
        }
        return false;
    }

}

