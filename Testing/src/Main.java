import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Main {
    public static void main(String[] args) {
        shouldBeTrue();
    }
    @Test
    @DisplayName("should be true")
    static void shouldBeTrue(){
        assertEquals("Prime number", isPrime(2));
        final NullPointerException nullPointerException= assertThrows(NullPointerException.class,isNullPtr(1));
        assertEquals("Negative number", nullPointerException.getMessage());
    }

    private static Executable isNullPtr(int i) {
        throw new NullPointerException(isPrime(i));
    }

    private static String isPrime(int i) {
        int number, index;
        number=i;
        index = 2;
        if(number<0){
            return "Is a negative number";
        }
        while(index<= number-1)
        {
            if (number % index == 0)
            {
                System.out.println("Not a prime number");
                return "Not a prime number";
            }
            index++;
        }
        if(index == number) {
            System.out.println("Prime number");
            return "Prime number";
        }
        return null;
    }
}