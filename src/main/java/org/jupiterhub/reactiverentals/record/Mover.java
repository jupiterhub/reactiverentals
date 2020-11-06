package org.jupiterhub.reactiverentals.record;

import java.math.BigInteger;

public record Mover(BigInteger moverId, String moverName, Account account) {}
