package com.challenges.codeWars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.challenges.codeWars.CodeWarsApplication.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodeWarsApplicationTests {

    @Test
    public void test1() {
        assertEquals(3, bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, bouncingBall(30.0, 0.66, 1.5));
    }

}
