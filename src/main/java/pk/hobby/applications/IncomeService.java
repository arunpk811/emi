package pk.hobby.applications;


import javax.enterprise.context.ApplicationScoped;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class IncomeService {
    public List<Income> getAllIncome(){
        List<Income> incomes = Income.listAll();
        return incomes.stream()
                .sorted(Comparator.comparing(Income::getCreditDate))
                .collect(Collectors.toList());
    }
}
