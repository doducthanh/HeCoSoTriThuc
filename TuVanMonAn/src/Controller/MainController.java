/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Util.Common;

/**
 *
 * @author DoThanh
 */
public class MainController {

    public MainController() {
    }
    
    // tra ve gia tri MBI khi co chieu cao va can nang.
    public float getBMI(float chieucao, float cannang){
        float BMI = 0;
        BMI = (cannang/chieucao)/chieucao*10000;
        return BMI;
    }
    
    public String getResult(float chieucao, float cannang){
        float BMI = getBMI(chieucao, cannang);
        if (BMI < Common.CHI_SO_GAY) {
            return Common.GAY;
        }
        if (BMI >= Common.CHI_SO_GAY && BMI < Common.CHI_BINH_THUONG) {
            return Common.BINH_THUONG;
        }
        if (BMI >= Common.CHI_BINH_THUONG && BMI < Common.CHI_SO_THUA_CAN) {
            return Common.THUA_CAN;
        }
        if (BMI >= Common.CHI_SO_THUA_CAN) {
            return Common.BEO_PHI;
        }
        return Common.BINH_THUONG;
    }
    
}
