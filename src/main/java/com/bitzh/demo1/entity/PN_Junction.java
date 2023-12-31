package com.bitzh.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * date:23/7/13
 * 估算被测PN结材料的禁带宽
 * created by murphy.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PN_Junction {
    private double Vfts;    //起始温度压降
    private double ts;      //实验起始温度
    private double K;       //温度变化的灵敏度
}
