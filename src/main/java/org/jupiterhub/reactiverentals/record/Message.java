package org.jupiterhub.reactiverentals.record;

import java.math.BigInteger;

public record Message(BigInteger messageId, Account by, String content) {}
