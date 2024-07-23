package it.padi.padi.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceDataService {

    @Autowired
    private FinanceDataRepository financeDataRepository;

    public FinanceData getFinanceData(Long id) {
        return financeDataRepository.findById(id).orElse(null);
    }

    public FinanceData saveFinanceData(FinanceData financeData) {
        return financeDataRepository.save(financeData);
    }

    public void updateEntrate(Long id, double amount) {
        FinanceData financeData = getFinanceData(id);
        if (financeData != null) {
            financeData.setEntrate(financeData.getEntrate() + amount);
            financeDataRepository.save(financeData);
        }
    }

    public void updateSpese(Long id, double amount) {
        FinanceData financeData = getFinanceData(id);
        if (financeData != null) {
            financeData.setSpese(financeData.getSpese() + amount);
            financeDataRepository.save(financeData);
        }
    }
}
