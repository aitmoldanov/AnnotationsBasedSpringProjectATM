package kz.iitu.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    AccounRepository accounRepository;

    public List<User> getAll(){
        return accounRepository.findAll();
    }

    public List<User> getAllByBalance(Long bal){
        return accounRepository.getAllByBalance(bal);
    }
}
