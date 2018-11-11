
import java.util.Map;
import java.util.TreeMap;

public class Time {

    final int SCALE = 100;
    final double OP_Count = 1000000*14*1000;

    MultiplicationOperations mult = new MultiplicationOperations();
    AdditionOperations add = new AdditionOperations();
    DivisionOperarions div = new DivisionOperarions();
    SubstractionOperations sub = new SubstractionOperations();
    CycleOperations cycle = new CycleOperations();


    double addShort = add.countAddShort() - cycle.countCycle();
    double addInt = add.countAddInt() - cycle.countCycle();
    double addLong = add.countAddLong() - cycle.countCycle();
    double addFloat = add.countAddFloat() - cycle.countCycle();
    double addDouble = add.countAddDouble() - cycle.countCycle();

    double subShort = sub.countSubstractShort() - cycle.countCycle();
    double subInt = sub.countSubstractInt() - cycle.countCycle();
    double subLong = sub.countSubstractLong() - cycle.countCycle();
    double subFloat = sub.countSubstractFloat() - cycle.countCycle();
    double subDouble = sub.countSubstractDouble() - cycle.countCycle();

    double multShort = mult.countMultiplyShort() - cycle.countCycle();
    double multInt = mult.countMultiplyInt() - cycle.countCycle();
    double multLong= mult.countMultiplyLong() - cycle.countCycle();
    double multFloat = mult.countMultiplyFloat() - cycle.countCycle();
    double multDouble = mult.countMultiplyDouble() - cycle.countCycle();

    double divShort = div.countDivideShort() - cycle.countCycleDivide();
    double divInt = div.countDivideInt() - cycle.countCycleDivide();
    double divLong = div.countDivideLong() - cycle.countCycleDivide();
    double divFloat = div.countDivideFloat() - cycle.countCycleDivide();
    double divDouble = div.countDivideDouble() - cycle.countCycleDivide();

    Map<String, Double> timeMap = initializeMap();
    double min = findMin();
    double max = findMax();

    Map<String, Double> initializeMap(){
        Map<String, Double> timeMap = new TreeMap<>();
        timeMap.put("+ Short", addShort);
        timeMap.put("+ Int", addInt);
        timeMap.put("+ Long", addLong);
        timeMap.put("+ Float", addFloat);
        timeMap.put("+ Double", addDouble);

        timeMap.put("- Short", subShort);
        timeMap.put("- Int", subInt);
        timeMap.put("- Long", subLong);
        timeMap.put("- Float", subFloat);
        timeMap.put("- Double", subDouble);

        timeMap.put("* Short", multShort);
        timeMap.put("* Int", multInt);
        timeMap.put("* Long", multLong);
        timeMap.put("* Float", multFloat);
        timeMap.put("* Double", multDouble);

        timeMap.put("/ Short", divShort);
        timeMap.put("/ Int", divInt);
        timeMap.put("/ Long", divLong);
        timeMap.put("/ Float", divFloat);
        timeMap.put("/ Double", divDouble);

        return timeMap;
    }

    double findMin() {
        double min = Double.MAX_VALUE;
        try {
            for (Map.Entry entry : timeMap.entrySet()) {
                if ((double) entry.getValue() < min) {
                    min = (double) entry.getValue();
                }
            }
        }catch(NullPointerException e){
            System.out.println("Exception");
        }
        return min;
    }
    double findMax() {
        double max = 0;
        for (Map.Entry entry : timeMap.entrySet()) {
            if ((double)entry.getValue()> max){
                max = (double)entry.getValue();
            }
        }
        return max;
    }

    void output(){
        for (Map.Entry entry : timeMap.entrySet()) {
            System.out.println();
            System.out.print(String.format("%s %10s %20e %20.2f %c %10c",
                    entry.getKey().toString().split(" ")[0],//operation
                    entry.getKey().toString().split(" ")[1],//type
                    OP_Count/(double) entry.getValue(),//time
                    min*100/(double)entry.getValue(),
                    '%',' '));
            for (int i = 1; i <= min * SCALE / (double)entry.getValue(); i++){
                System.out.print('#');
            }
        }

    }

}
