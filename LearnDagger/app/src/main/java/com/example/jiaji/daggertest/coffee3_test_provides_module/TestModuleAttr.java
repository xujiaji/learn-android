package com.example.jiaji.daggertest.coffee3_test_provides_module;

/**
 * author: xujiaji
 * created on: 2018/5/7 16:41
 * description:
 */
public class TestModuleAttr {
    private String str;
    public TestModuleAttr(String str) { this.str = str; }
    @Override
    public String toString() {
        return "TestModuleAttr{" +
                "str='" + str + '\'' +
                '}';
    }
}
