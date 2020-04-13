package hu.practice.enpdemo.controllers;

import org.springframework.stereotype.Service;

/**
 * Created by SZGRABI on 2020.04.13..
 */
@Service
public class CalcController {

    public Number add(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }


    public Number mul(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }
}
