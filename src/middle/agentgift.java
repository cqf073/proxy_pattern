package middle;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2721:46
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class agentgift implements agent {
    pursuit gg;
    public agentgift(pursuit gg) {
        this.gg = gg;
    }


    @Override
    public void buy_folwers() {
            gg.buy_folwers();
    }

    @Override
    public void buy_chocolate() {
            gg.buy_chocolate();
    }

    @Override
    public void sent_money() {
            gg.buy_folwers();
    }
}
