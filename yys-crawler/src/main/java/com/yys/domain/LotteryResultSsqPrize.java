package com.yys.domain;

import javax.persistence.*;

/**
 * 彩票开奖-双色球-详情
 */
@Entity
@Table(name = "t_lottery_result_ssq_prize")
public class LotteryResultSsqPrize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "lottery_no")
    private String lottery_no;  //开奖期号

    @Column(name = "prize_name")
    private String prize_name;   //奖项名称

    @Column(name = "prize_num")
    private String prize_num;   //中奖数量

    @Column(name = "prize_amount")
    private String prize_amount;    //中奖金额

    @Column(name = "prize_require")
    private String prize_require;   //中奖条件

    public LotteryResultSsqPrize() {
    }

    public LotteryResultSsqPrize(String lottery_no, String prize_name, String prize_num, String prize_amount, String prize_require) {
        this.lottery_no = lottery_no;
        this.prize_name = prize_name;
        this.prize_num = prize_num;
        this.prize_amount = prize_amount;
        this.prize_require = prize_require;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLottery_no() {
        return lottery_no;
    }

    public void setLottery_no(String lottery_no) {
        this.lottery_no = lottery_no;
    }

    public String getPrize_name() {
        return prize_name;
    }

    public void setPrize_name(String prize_name) {
        this.prize_name = prize_name;
    }

    public String getPrize_num() {
        return prize_num;
    }

    public void setPrize_num(String prize_num) {
        this.prize_num = prize_num;
    }

    public String getPrize_amount() {
        return prize_amount;
    }

    public void setPrize_amount(String prize_amount) {
        this.prize_amount = prize_amount;
    }

    public String getPrize_require() {
        return prize_require;
    }

    public void setPrize_require(String prize_require) {
        this.prize_require = prize_require;
    }
}
