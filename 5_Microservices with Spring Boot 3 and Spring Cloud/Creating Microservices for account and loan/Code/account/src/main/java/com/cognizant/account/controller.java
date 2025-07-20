package com.cognizant.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/accounts")

public class controller {

        @GetMapping("/{number}")
        public Map<String, Object> getAccount(@PathVariable String number) {

            return Map.of(
                    "number",   number,
                    "type",     "savings",
                    "balance",  new BigDecimal("234343")
            );
        }
}
