package org.jupiterhub.reactiverentals.record;

import java.math.BigInteger;
import java.util.Date;

public record Contract(BigInteger contractId, Account owner, Account lease, Date expirationDate) {}
