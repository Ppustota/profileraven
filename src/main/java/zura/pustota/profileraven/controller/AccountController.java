package zura.pustota.profileraven.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zura.pustota.profileraven.model.BankAccount;
import zura.pustota.profileraven.service.AccountService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AccountController {
 private final AccountService accountService;
    @GetMapping
    public ResponseEntity<?> giveCredit(@RequestParam String name, @RequestParam Long amount){
        if(!accountService.toGive(name)) {
            return ResponseEntity.ok().body("Bank don't want to give you credit");
        }
        return ResponseEntity.ok().body(accountService.give(amount));
    }
}
