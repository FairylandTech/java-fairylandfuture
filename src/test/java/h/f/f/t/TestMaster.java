/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-21 16:53:36 UTC+08:00
 ****************************************************/
package h.f.f.t;

import java.util.*;

/**
 * @author Lionel Johnson
 * @version 1.0
 */
public class TestMaster {
    public static void main(String[] args) {
//        testRedFruit();
        testRedFruit2();
    }
    
    public static void testRedFruit() {
        HashMap<String, Double> priceMap = new HashMap<>() {
            {
                put("7天会员", 4.7);
                put("14天会员", 9.4);
                put("21天会员", 14.1);
                put("28天会员", 18.8);
                put("30天会员", 23.5);
                put("35天会员", 23.5);
                put("42天会员", 28.2);
                put("49天会员", 32.9);
                put("56天会员", 37.6);
                put("60天会员", 61.0);
                put("365天会员", 235.0);
            }
        };
        List<Map.Entry<String, Double>> priceUnitList = new ArrayList<>();
        for (Map.Entry<String, Double> redFruit : priceMap.entrySet()) {
            System.out.println(redFruit.getKey() + " : " + redFruit.getValue());
            
            double priceUnit = redFruit.getValue() / Integer.parseInt(redFruit.getKey().replaceAll("[^0-9]", ""));
            System.out.println("单价: " + priceUnit);
            
            priceUnitList.add(new AbstractMap.SimpleEntry<>(redFruit.getKey(), priceUnit));
        }
        
        priceUnitList.sort(Comparator.comparing(Map.Entry::getValue));
        
        priceUnitList.forEach(entry -> System.out.println("会员时长: " + entry.getKey() + ", 单价: " + entry.getValue()));
    }
    
    public static void testRedFruit2() {
        HashMap<String, Double> priceMap = new HashMap<>() {{
            put("7天会员", 4.7);
            put("14天会员", 9.4);
            put("21天会员", 14.1);
            put("28天会员", 18.8);
            put("30天会员", 23.5);
            put("35天会员", 23.5);
            put("42天会员", 28.2);
            put("49天会员", 32.9);
            put("56天会员", 37.6);
            put("60天会员", 61.0);
            put("365天会员", 235.0);
        }};
        
        List<Map.Entry<String, Double>> priceUnitList = new ArrayList<>();
        
        for (Map.Entry<String, Double> redFruit : priceMap.entrySet()) {
            System.out.println(redFruit.getKey() + " : " + redFruit.getValue());
            
            // 修改这里：使用正确的正则表达式提取数字
            String key = redFruit.getKey();
            
            // 方法1：使用正则表达式匹配数字（推荐）
            String daysStr = key.replaceAll("[^0-9]", "");
            
            // 方法2：使用replaceFirst，但用正确的方式提取数字
            // String daysStr = key.replaceFirst("^(\\d+).*", "$1");
            
            // 方法3：使用split分割
            // String daysStr = key.split("天")[0];
            
            if (daysStr.isEmpty()) {
                System.out.println("警告: 无法从 " + key + " 中提取天数");
                continue;
            }
            
            try {
                int days = Integer.parseInt(daysStr);
                double priceUnit = redFruit.getValue() / days;
                System.out.println("天数: " + days + ", 单价: " + String.format("%.4f", priceUnit));
                
                priceUnitList.add(new AbstractMap.SimpleEntry<>(redFruit.getKey(), priceUnit));
            } catch (NumberFormatException e) {
                System.out.println("错误: 无法解析天数 '" + daysStr + "'");
            }
        }
        
        // 按单价排序
        priceUnitList.sort(Comparator.comparing(Map.Entry::getValue));
        
        System.out.println("\n=== 按单价排序结果 ===");
        priceUnitList.forEach(entry ->
                System.out.printf("会员时长: %-10s, 单价: %.4f%n",
                        entry.getKey(), entry.getValue())
        );
        
        // 添加额外分析
        System.out.println("\n=== 单价分析 ===");
        System.out.println("最优惠: " + priceUnitList.get(0).getKey() +
                " (单价: " + String.format("%.4f", priceUnitList.get(0).getValue()) + ")");
        System.out.println("最不优惠: " + priceUnitList.get(priceUnitList.size() - 1).getKey() +
                " (单价: " + String.format("%.4f", priceUnitList.get(priceUnitList.size() - 1).getValue()) + ")");
        
        // 找出所有单价相同的会员
        Map<Double, List<String>> priceToMemberships = new HashMap<>();
        for (Map.Entry<String, Double> entry : priceUnitList) {
            priceToMemberships
                    .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }
        
        System.out.println("\n=== 相同单价统计 ===");
        priceToMemberships.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .forEach(entry ->
                        System.out.printf("单价 %.4f: %s%n",
                                entry.getKey(), entry.getValue())
                );
    }
}
