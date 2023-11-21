package com.stringreverse.ntassignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

	@Value("${MY_MESSAGE}")
    private String myMsg; 
	
    @GetMapping("/reverse")
    public String reverseWord(@RequestParam String word) {
        return new StringBuilder(word).reverse().toString();
    }

    @GetMapping("/display")
    public String displayMessage() {
        return myMsg;
    }
}