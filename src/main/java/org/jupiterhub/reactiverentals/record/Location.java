package org.jupiterhub.reactiverentals.record;

import java.math.BigInteger;

public record Location(BigInteger locationId, Double latitude, Double langtitude, String city) {}
