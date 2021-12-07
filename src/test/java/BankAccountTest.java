import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankaccount;

    @BeforeEach
    void setUp() {
        bankaccount = new BankAccount("Alex");
    }

    @Test
    @DisplayName("test balance")
    void getBalance() {
        assertTrue(bankaccount.getBalance() == 0f );
    }

    //testtest
}