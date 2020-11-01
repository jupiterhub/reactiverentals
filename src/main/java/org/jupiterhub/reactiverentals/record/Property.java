package org.jupiterhub.reactiverentals.record;

import java.math.BigDecimal;
import java.math.BigInteger;

public record Property(BigInteger propertyId, Account owner, String address, BigDecimal rentPrice) {}
