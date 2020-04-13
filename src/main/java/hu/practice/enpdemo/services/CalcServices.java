package hu.practice.enpdemo.services;

import hu.practice.enpdemo.controllers.CalcController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by SZGRABI on 2020.04.13..
 */
@RestController
@RequestMapping("/api/calc")
public class CalcServices {

    @Autowired
    private CalcController calcController;

    @GetMapping("/{a}+{b}")
    public Number add(@PathVariable Number a, @PathVariable Number b) {
        return calcController.add(a, b);
    }

    @GetMapping("/{a}mul{b}")
    public Number mul(@PathVariable Number a, @PathVariable Number b) {
        return calcController.mul(a, b);
    }

}
