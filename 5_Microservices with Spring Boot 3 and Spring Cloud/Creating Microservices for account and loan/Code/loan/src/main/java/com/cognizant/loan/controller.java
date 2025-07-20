package com.cognizant.loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/loans")
public class controller {

        @GetMapping("/{number}")
        public Map<String, Object> getLoan(@PathVariable String number) {
            // dummy hard‑coded response
            return Map.of(
                    "number",  number,
                    "type",    "car",
                    "loan",    400_000,
                    "emi",     3258,
                    "tenure",  18
            );
        }
}
