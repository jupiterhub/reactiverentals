package org.jupiterhub.reactiverentals.record;

import java.math.BigInteger;
import java.util.Set;

public record Thread(BigInteger threadId, Set<Message> messages) {}
