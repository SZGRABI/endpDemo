package hu.practice.enpdemo.services;

import hu.practice.enpdemo.controllers.CalcController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

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


    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> handleWrongArguments(MethodArgumentTypeMismatchException e) {
        return ResponseEntity.notFound().header("Error", e.getErrorCode()).build();
    }
}
