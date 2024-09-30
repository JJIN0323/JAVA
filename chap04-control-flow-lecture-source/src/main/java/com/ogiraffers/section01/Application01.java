package com.ogiraffers.section01;

import com.ogiraffers.section01.conditional.A_if;
import com.ogiraffers.section01.conditional.B_ifElse;
import com.ogiraffers.section01.conditional.C_ifElesif;
import com.ogiraffers.section01.conditional.D_switch;

public class Application01 {

    public static void main(String[] args) {

        A_if a = new A_if();
        B_ifElse b = new B_ifElse();
        C_ifElesif c = new C_ifElesif();
        D_switch d = new D_switch();
        //a.testSimpleIfStatement();
        //a.testNestedIfStatement();
        //b.testIfElseStatement();
        //b.testNestedIfElseStatement();
        //c.testIfElseIfStatement();
        //c.testNestedIfElseIfStatement();
        //c.ImproveNestedIfElseIfStatement();
        //c.question();
        //d.testSwitchStatement();
        d.testSwitchVendingMachine();
    }
}
