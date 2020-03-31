package com.challenges.codeWars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CodeWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeWarsApplication.class, args);
    }

    public static int bouncingBall(double h, double bounce, double window) {
//        O parâmetro de flutuação "h" em metros deve ser maior que 0
//        O parâmetro flutuante "rejeição" deve ser maior que 0 e menor que 1
//        O parâmetro float "window" deve ser menor que h.
//        Se todas as três condições acima forem atendidas, retorne um número inteiro positivo, caso contrário, retorne -1.

        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        int count = 1;
        while (h * bounce > window) {
            count = count + 2;
            h = h * bounce;
        }
        return count;
    }
}
