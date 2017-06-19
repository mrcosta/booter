package com.booter.controllers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloBootControllerTest {

    @Test
    public void shouldSayHi() {
        assertThat(new HelloBootController().sayHi(), is("hi"));
    }
}