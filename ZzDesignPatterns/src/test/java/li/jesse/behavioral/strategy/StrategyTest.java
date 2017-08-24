package li.jesse.behavioral.strategy;

import li.jesse.behavioral.strategy.sample.AdvancedMemberStrategy;
import li.jesse.behavioral.strategy.sample.MemberStrategy;
import li.jesse.behavioral.strategy.sample.Price;
import org.junit.Test;

public class StrategyTest
{
    @Test
    public void testClient()
    {
        MemberStrategy strategy = new AdvancedMemberStrategy();
        // 创建环境
        Price price = new Price(strategy);
        // 计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
