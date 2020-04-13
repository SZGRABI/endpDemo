package hu.practice.enpdemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SZGRABI on 2020.04.13..
 */
@RestController
@RequestMapping("/")
public class HomeService {
    @Value("${app.version}")
    private String version;

    @GetMapping
    public ResponseEntity<String> getVersion() {
        return ResponseEntity.ok(String.format("V%s", version));
    }
}
