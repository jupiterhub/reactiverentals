package org.jupiterhub.reactiverentals.record;

import java.math.BigInteger;
import java.util.Date;

public record Account(BigInteger accountId, String emailAddress, String accountName, Date registrationDate, Integer behaviorScore) {}
