package zura.pustota.profileraven.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zura.pustota.profileraven.infra.PaisDebtsProperty;
import zura.pustota.profileraven.infra.ProfileConstants;
import zura.pustota.profileraven.model.BankAccount;

@Service
@Profile(ProfileConstants.WINTER_IS_HERE)
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WinterAccountService implements AccountService {
    BankAccount account = new BankAccount(10000L);
    private final PaisDebtsProperty paisDebtsProperty;
    @Override
    public boolean toGive(String name) {

        return paisDebtsProperty.getWhoPais().stream().anyMatch(s -> s.equals(name));
    }

    @Override
    @Transactional
    public Long give(Long amount) {
        if(account.getBalance()<amount){
            throw new IllegalArgumentException("Amount is greater when bank balance");
        }
        account.setBalance(account.getBalance()-amount);
        return account.getBalance();
    }
}
