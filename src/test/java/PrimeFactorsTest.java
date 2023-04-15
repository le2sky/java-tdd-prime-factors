import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest {

    @Test
    void prime_factors() {
        assertFactors(1, Arrays.asList());
        assertFactors(2, Arrays.asList(2));
        assertFactors(3, Arrays.asList(3));
        assertFactors(4, Arrays.asList(2, 2));
        assertFactors(5, Arrays.asList(5));
        assertFactors(6, Arrays.asList(2, 3));
        assertFactors(7, Arrays.asList(7));
        assertFactors(8, Arrays.asList(2, 2, 2));
        assertFactors(9, Arrays.asList(3, 3));
    }

    private void assertFactors(int n, List<Integer> list) {
        assertThat(factors(n)).isEqualTo(list);
    }

    private List<Integer> factors(int n) {
        List<Integer> factors = new ArrayList<>();
        if (n > 1) {
            while (n % 2 == 0) {
                n /= 2;
                factors.add(2);
            }
            while (n % 3 == 0) {
                n /= 3;
                factors.add(3);
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
