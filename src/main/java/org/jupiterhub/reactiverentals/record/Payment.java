package org.jupiterhub.reactiverentals.record;

import java.math.BigDecimal;
import java.math.BigInteger;

public record Payment(BigInteger paymentId, String paymentType, BigDecimal amount) {}
