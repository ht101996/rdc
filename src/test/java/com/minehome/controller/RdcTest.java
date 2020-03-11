package com.minehome.controller;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class RdcTest {
    @Test
    public void shouldServiceWithOk() {
        Rdc rdc = new Rdc();
        assertThat(rdc.health(), Matchers.is("ok"));
    }
}
