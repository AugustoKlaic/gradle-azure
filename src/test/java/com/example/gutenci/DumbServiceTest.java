package com.example.gutenci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DumbServiceTest {

  private DumbService service;

  @BeforeEach
  public void setup() {
    service = new DumbService();
  }

  @Test
  public void testSum() {
    List<BigDecimal> numberToBeSum = List.of(BigDecimal.valueOf(1), BigDecimal.valueOf(1),
                                             BigDecimal.valueOf(1), BigDecimal.valueOf(1));

    BigDecimal total = service.sumNumbers(numberToBeSum);

    assertEquals(BigDecimal.valueOf(4), total);
  }

  @Test
  public void testSumEmptyList() {
    List<BigDecimal> numberToBeSum = List.of();

    BigDecimal total = service.sumNumbers(numberToBeSum);

    assertEquals(BigDecimal.valueOf(0), total);
  }
}
