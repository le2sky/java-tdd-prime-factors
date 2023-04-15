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
    }

    private void assertFactors(int n, List<Integer> list) {
        assertThat(factors(n)).isEqualTo(list);
    }

    private List<Integer> factors(int n) {
        List<Integer> factors = new ArrayList<>();
        if (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                factors.add(2);
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
