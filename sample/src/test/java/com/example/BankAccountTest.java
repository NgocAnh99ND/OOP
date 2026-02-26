package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("ACC123", 1000.0);
    }

    // ===== Constructor tests =====

    @Test
    void constructor_validInput_shouldCreateAccount() {
        BankAccount acc = new BankAccount("ACC001", 500.0);

        assertEquals("ACC001", acc.getAccountNumber());
        assertEquals(500.0, acc.getBalance());
    }

    @Test
    void constructor_emptyAccountNumber_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount("", 100.0);
        });
    }

    @Test
    void constructor_nullAccountNumber_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(null, 100.0);
        });
    }

    @Test
    void constructor_negativeInitialBalance_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount("ACC002", -50.0);
        });
    }

    // ===== Deposit tests =====

    @Test
    void deposit_validAmount_shouldIncreaseBalance() {
        account.deposit(500.0);

        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void deposit_zeroAmount_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        });
    }

    @Test
    void deposit_negativeAmount_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
    }

    // ===== Withdraw tests =====

    @Test
    void withdraw_validAmount_shouldDecreaseBalance() {
        account.withdraw(300.0);

        assertEquals(700.0, account.getBalance());
    }

    @Test
    void withdraw_amountGreaterThanBalance_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000.0);
        });
    }

    @Test
    void withdraw_zeroAmount_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(0);
        });
    }

    @Test
    void withdraw_negativeAmount_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50);
        });
    }
}