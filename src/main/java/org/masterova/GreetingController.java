package org.masterova;


import org.masterova.domain.BankCard;
import org.masterova.repos.BankCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    private BankCardRepo bankCardRepo;

    @GetMapping("/bankcards")
    public List <BankCard> main() {
        return bankCardRepo.findAll();
    }

}