package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fruits")
public class FruitController {

    @Autowired FruitRepository repository; // Ignore this

    // TODO GET mappings
    // TODO POST mapping
    // TODO PUT mapping
    // TODO DELETE mapping

}
