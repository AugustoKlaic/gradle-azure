package com.example.gutenci;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DumbService {

  public BigDecimal sumNumbers(List<BigDecimal> numbersToBeSum) {

    if (!numbersToBeSum.isEmpty()) {
      return numbersToBeSum.stream().reduce((totalSum, number) -> totalSum = totalSum.add(number))
          .orElse(BigDecimal.ZERO);
    } else {
      return BigDecimal.ZERO;
    }
  }
}
