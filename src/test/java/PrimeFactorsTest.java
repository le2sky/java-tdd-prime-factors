import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest {

    @Test
    void prime_factors() {
        assertFactors(1, Arrays.asList());
        assertFactors(2, Arrays.asList(2));
    }

    private void assertFactors(int n, List<Integer> list) {
        assertThat(factors(n)).isEqualTo(list);
    }

    private List<Integer> factors(int n) {
        if (n == 2) {
            return Arrays.asList(2);
        }
        return Arrays.asList();
    }
}
