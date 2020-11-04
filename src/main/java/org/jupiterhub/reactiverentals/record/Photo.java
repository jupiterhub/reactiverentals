package org.jupiterhub.reactiverentals.record;

import java.math.BigInteger;

public record Photo(BigInteger photoId, Property property, String photoLocation, boolean photoType) {}
