package cheng_JI;

import org.junit.Test;

public class Count {
    double[] aa = {93.43,
            90.81,
            86.19,
            86.42,
            94,
            90.68,
            90.06,
            89.82,
            92.9,
            93.99,
            90.32,
            91.36,
            92.48,
            88.39,
            91.92,
            91.18,
            91.05,
            87.96,
            94.49,
            91.85,
            87.92,
            90.33,
            91.13,
            91.65,
            91.68,
            88.06,
            86.23,
            89.92,
            89.92
    };
    static double gui_yo_hua(double x, double max, double min) {
        double max_x = max - x;
        double max_min = max - min;
        return (1 - max_x * 0.2 / max_min) * 100;
    }

    static double ying_yu(double s1, double s2) {
        return (s1 + s2 * 2) / 3;
    }

    static double se(double[] si, double[] pi) {
        if (si.length != pi.length) throw new RuntimeException("输入成绩与学分不对应");
        double up = 0, low = 0;
        for (int i = 0; i < si.length; i++) {
            up += si[i] * pi[i];
            low += pi[i];
        }
        return up / low;
    }

    @Test
    public void getSE() {
        System.out.println("赵建宇成绩");
        double 计算动力学1 = gui_yo_hua(88, 95, 77);
        double 计算动力学2 = gui_yo_hua(89, 100, 88);
        double 有限元方法与运用 = gui_yo_hua(87, 99, 68);
        double 数理统计 = 96;
        double 论文写作 = 93;
        double 矩阵与数值分析 = 90;
        double 英语 = 97;
        double 波动分析 = 94;
        System.out.println("计算动力学1归一化：" + 计算动力学1);
        System.out.println("计算动力学2归一化：" + 计算动力学2);
        System.out.println("计算动力学2归一化：" + 计算动力学2);
        System.out.println("有限元方法与运用：" + 有限元方法与运用);
        double[] si = {数理统计, 论文写作, 矩阵与数值分析, 计算动力学1, 计算动力学2, 有限元方法与运用, 英语, 波动分析};
        double[] pi = {2, 1, 3, 2, 1, 3, 3, 2};
        System.out.println("赵建宇总成绩：" + se(si, pi));
    }

    @Test
    public void getSE1() {
        double 论文写作与学术规范 = 93;
        double 拓扑优化与材料设计 = 90;
        double 计算动力学2 = gui_yo_hua(95, 100, 88);
        double 结构优化理论和方法 = gui_yo_hua(87, 93, 60);
        double 计算动力学1 = gui_yo_hua(87, 95, 77);
        double 现代实验力学 = gui_yo_hua(95, 100, 72);
        double 英语 = ying_yu(82, 85);
        double 矩阵与数值分析 = 85;
        double[] si = {论文写作与学术规范, 拓扑优化与材料设计, 计算动力学2, 结构优化理论和方法, 计算动力学1, 现代实验力学, 英语, 矩阵与数值分析};
        double[] pi = {1, 2, 2, 3, 2, 3, 3, 2};
        System.out.println("可钊：" + se(si, pi));
    }

    @Test
    public void se2() {
        double 有限元方法与应用 = gui_yo_hua(88, 99, 68);
        double 力学中的泛函分析与变分原理 = gui_yo_hua(89, 98, 79);
        double 计算动力学1 = gui_yo_hua(90, 95, 77);
        double 英语 = ying_yu(79, 86);
        double 矩阵与数值分析 = 90;
        double 论文写作 = 95;
        double 纳米化 = 96;
        double 弹塑性 = gui_yo_hua(86.19, 98.45, 65.3);
        double[] si = {有限元方法与应用, 力学中的泛函分析与变分原理, 计算动力学1, 英语, 矩阵与数值分析, 论文写作, 纳米化, 弹塑性};
        double[] pi = {3, 2, 2, 3, 3, 1, 2, 3};
        System.out.println("王爱成" + se(si, pi));
    }

    @Test
    public void se3() {
        double 有限元方法与应用 = gui_yo_hua(92, 99, 68);
        double 有限元及数值方法 = gui_yo_hua(82, 95, 61);
        double 连续介质力学 = gui_yo_hua(70, 100, 60);
        double 计算动力学1 = gui_yo_hua(90, 95, 77);
        double 计算动力学2 = gui_yo_hua(97, 100, 88);
        double 特色社会主义 = 87;
        double 英语 = ying_yu(84, 92);
        double 论文 = 93;
        double[] si = {有限元方法与应用, 有限元及数值方法, 连续介质力学, 计算动力学1, 计算动力学2, 特色社会主义, 英语, 论文};
        double[] pi = {3, 3, 3, 2, 2, 2, 3, 1};
        System.out.println("李丽坤" + se(si, pi));
    }

    @Test
    public void se4() {
        double 力学泛函 = gui_yo_hua(92, 98, 79);
        double 计算力学2 = gui_yo_hua(95, 100, 88);
        double 有限元数值方法 = gui_yo_hua(95, 99, 68);
        double 非线性动力学 = gui_yo_hua(94, 96, 85);
        double 高等数值分析 = 94;
        double 特色社会 = 93;
        double 英语 = ying_yu(91, 93);
        double 边界网格 = 92;
        double[] si = {力学泛函, 计算力学2, 有限元数值方法, 非线性动力学, 高等数值分析, 特色社会, 英语, 边界网格};
        double[] pi = {2, 2, 3, 3, 2, 2, 3, 2};
        System.out.println("隋国号" + se(si, pi));
    }

    @Test
    public void se5() {
        double 泛函 = gui_yo_hua(97, 99, 79);
        double 论文 = 94;
        double 弹塑性力学 = gui_yo_hua(83.64, 98.45, 65.3);
        double 结构优化 = gui_yo_hua(80, 93, 60);
        double 数值方法 = gui_yo_hua(82, 99, 68);
        double 特色 = 84;
        double 英语 = 86.67;
        double 边界元 = 86;
        double[] si = {泛函, 论文, 弹塑性力学, 结构优化, 数值方法, 特色, 英语, 边界元};
        double[] pi = {2, 1, 3, 3, 3, 2, 3, 2};
        System.out.println("严晓燕" + se(si, pi));
    }

    @Test
    public void se6() {
        double q1 = gui_yo_hua(86, 99, 68);
        double 固1 = gui_yo_hua(87, 94, 60);
        double 顾2 = gui_yo_hua(82, 92, 71);
        double 论文 = 90;
        double 特色 = 83;
        double 英语 = ying_yu(80, 80);
        double 链接 = gui_yo_hua(60, 100, 60);
        double 可靠 = 86;
        double[] si = {q1, 固1, 顾2, 论文, 特色, 英语, 链接, 可靠};
        double[] pi = {3, 2, 2, 1, 2, 3, 3, 2};
        System.out.println("刘君君" + se(si, pi));
    }

    @Test
    public void se7() {
        double q1 = gui_yo_hua(94, 100, 72);
        double q2 = 92;
        double q3 = 91;
        double q4 = gui_yo_hua(92, 95, 77);
        double q5 = gui_yo_hua(91, 95, 61);
        double q6 = 85.6;
        double q7 = 88;
        double q8 = 85;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 1, 2, 2, 3, 3, 2, 2};
        System.out.println("徐汇前" + se(si, pi));
    }

    @Test
    public void se8() {
        double q1 = gui_yo_hua(91, 99, 68);
        double q2 = gui_yo_hua(66, 93, 60);
        double q3 = gui_yo_hua(90, 95, 77);
        double q4 = gui_yo_hua(93, 100, 88);
        double q5 = 94;
        double q6 = 88;
        double q7 = 77.33;
        double q8 = 94;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 2, 2, 1, 2, 3, 2};
        System.out.println("panyaozong" + se(si, pi));
    }

    @Test
    public void se9() {
        double q1 = gui_yo_hua(92, 99, 68);
        double q2 = gui_yo_hua(81, 100, 60);
        double q3 = gui_yo_hua(79, 93, 60);
        double q4 = gui_yo_hua(81, 95, 61);
        double q5 = 96;
        double q6 = 92;
        double q7 = ying_yu(88, 93.91);
        double q8 = 93;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 3, 3, 1, 2, 3, 2};
        System.out.println("liuzhihui" + se(si, pi));
    }

    @Test
    public void se10() {
        double q1 = gui_yo_hua(98, 99, 68);
        double q2 = gui_yo_hua(91, 100, 60);
        double q3 = gui_yo_hua(93, 94, 60);
        double q4 = gui_yo_hua(87, 92, 71);
        double q5 = 95;
        double q6 = 87;
        double q7 = ying_yu(88, 87);
        double q8 = 97;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 2, 2, 1, 3, 3, 2};
        System.out.println("zhaotianyu" + se(si, pi));
    }

    @Test
    public void se11() {
        double q1 = gui_yo_hua(93, 98, 79);
        double q2 = gui_yo_hua(94, 93, 60);
        double q3 = gui_yo_hua(93, 100, 88);
        double q4 = gui_yo_hua(94, 95, 61);
        double q5 = 96;
        double q6 = 88;
        double q7 = ying_yu(78, 85);
        double q8 = 93;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {2, 3, 2, 3, 1, 2, 3, 2};
        System.out.println("chengxubing" + se(si, pi));
    }

    @Test
    public void se12() {
        double q1 = gui_yo_hua(84, 99, 68);
        double q2 = gui_yo_hua(94, 100, 88);
        double q3 = 96;
        double q4 = 90;
        double q5 = 83;
        double q6 = gui_yo_hua(74, 100, 60);
        double q7 = 81;
        double q8 = 94;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 2, 1, 1, 3, 3, 2, 2};
        System.out.println("chenglingyun" + se(si, pi));
    }

    @Test
    public void se13() {
        double q1 = gui_yo_hua(84, 99, 68);
        double q2 = gui_yo_hua(95, 95, 77);
        double q3 = gui_yo_hua(91, 94, 60);
        double q4 = 92;
        double q5 = 88;
        double q6 = ying_yu(83, 84);
        double q7 = 89;
        double q8 = 91;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 2, 2, 1, 2, 3, 2, 2};
        System.out.println("wangguangwen" + se(si, pi));
    }

    @Test
    public void se14() {
        double q1 = gui_yo_hua(99, 99, 68);
        double q2 = gui_yo_hua(71, 95, 61);
        double q3 = gui_yo_hua(92, 100, 72);
        double q4 = 93;
        double q5 = 87;
        double q6 = ying_yu(80, 90);
        double q7 = 89;
        double q8 = 90;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 3, 1, 2, 3, 2, 2};
        System.out.println("yangzhuoyue" + se(si, pi));
    }

    @Test
    public void se15() {
        double q1 = ying_yu(86, 87);
        double q2 = 93;
        double q3 = 90;
        double q4 = 88;
        double q5 = gui_yo_hua(90, 99, 68);
        double q6 = gui_yo_hua(85, 98, 79);
        double q7 = gui_yo_hua(80, 95, 61);
        double q8 = 94;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 1, 2, 2, 3, 2, 3, 2};
        System.out.println("huosixu" + se(si, pi));
    }

    @Test
    public void se16() {
        double q1 = gui_yo_hua(64, 100, 60);
        double q2 = gui_yo_hua(91, 98, 79);
        double q3 = gui_yo_hua(80, 93, 60);
        double q4 = gui_yo_hua(84, 95, 61);
        double q5 = 92;
        double q6 = 91;
        double q7 = ying_yu(91, 94);
        double q8 = 93;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 2, 3, 3, 3, 1, 2, 2};
        System.out.println("caixiang" + se(si, pi));
    }

    @Test
    public void se17() {
        double q1 = gui_yo_hua(67, 100, 60);
        double q2 = gui_yo_hua(90, 95, 77);
        double q3 = 79;
        double q4 = 87;
        double q5 = 93;
        double q6 = gui_yo_hua(86, 99, 68);
        double q7 = 96;
        double q8 = 87;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 2, 3, 3, 1, 3, 2, 2};
        System.out.println("lijingyi" + se(si, pi));
    }

    @Test
    public void se18() {
        double q1 = gui_yo_hua(84, 99, 68);
        double q2 = gui_yo_hua(84, 95, 61);
        double q3 = gui_yo_hua(89, 100, 60);
        double q4 = 92;
        double q5 = 89;
        double q6 = 95;
        double q7 = 87;
        double q8 = 95;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 3, 2, 3, 1, 2, 2};
        System.out.println("wujie" + se(si, pi));
    }

    @Test
    public void se19() {
        double q1 = 96;
        double q2 = gui_yo_hua(92, 100, 72);
        double q3 = 93;
        double q4 = ying_yu(91.5, 87);
        double q5 = 86;
        double q6 = gui_yo_hua(82, 95, 77);
        double q7 = gui_yo_hua(87, 99, 68);
        double q8 = 90;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {1, 3, 2, 3, 3, 2, 3, 2};
        System.out.println("guiyingqi" + se(si, pi));
    }

    @Test
    public void se20() {
        double q1 = gui_yo_hua(83, 99, 68);
        double q2 = gui_yo_hua(93, 100, 60);
        double q3 = gui_yo_hua(94, 100, 88);
        double q4 = 91;
        double q5 = 92;
        double q6 = ying_yu(93, 99);
        double q7 = gui_yo_hua(71, 92, 71);
        double q8 = 95;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 2, 1, 2, 3, 2, 2};
        System.out.println("songrunze" + se(si, pi));
    }

    @Test
    public void se21() {
        double q1 = gui_yo_hua(83, 99, 68);
        double q2 = gui_yo_hua(93, 100, 60);
        double q3 = gui_yo_hua(94, 100, 88);
        double q4 = 91;
        double q5 = 92;
        double q6 = ying_yu(93, 99);
        double q7 = gui_yo_hua(71, 92, 71);
        double q8 = 95;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 2, 1, 2, 3, 2, 2};
        System.out.println("zhangyan" + se(si, pi));
    }

    @Test
    public void se22() {
        double q1 = gui_yo_hua(99, 99, 68);
        double q2 = gui_yo_hua(95.03, 98.45, 65.3);
        double q3 = gui_yo_hua(95, 100, 72);
        double q4 = 92;
        double q5 = 84;
        double q6 = 97;
        double q7 = 91.6;
        double q8 = 89;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 3, 1, 2, 3, 2, 2};
        System.out.println("lichang" + se(si, pi));
    }

    @Test
    public void se23() {
        double q1 = 94;
        double q2 = gui_yo_hua(92, 100, 88);
        double q3 = 89.5;
        double q4 = gui_yo_hua(84, 99, 68);
        double q5 = gui_yo_hua(86, 95, 77);
        double q6 = 82;
        double q7 = gui_yo_hua(72, 93, 60);
        double q8 = 85;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {1, 2, 3, 3, 2, 2, 3, 2};
        System.out.println("dengxiaodan" + se(si, pi));
    }

    @Test
    public void se24() {
        double q1 = gui_yo_hua(84, 99, 68);
        double q2 = gui_yo_hua(90, 100, 60);
        double q3 = gui_yo_hua(83.92, 98.45, 65.3);
        double q4 = 95;
        double q5 = 91.6;
        double q6 = 87.33;
        double q7 = gui_yo_hua(83, 95, 77);
        double q8 = 84;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 3, 1, 2, 3, 2, 2};
        System.out.println("wangsiqi" + se(si, pi));
    }

    @Test
    public void se25() {
        double q1 = gui_yo_hua(90, 99, 68);
        double q2 = 93;
        double q3 = gui_yo_hua(67, 93, 60);
        double q4 = gui_yo_hua(76, 95, 61);
        double q5 = 87;
        double q6 = ying_yu(81, 84.5);
        double q7 = 95;
        double q8 = 71;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 1, 3, 3, 1, 2, 2, 3};
        System.out.println("lirundong" + se(si, pi));
    }

    @Test
    public void se26() {
        double q1 = gui_yo_hua(84, 99, 68);
        double q2 = gui_yo_hua(98, 100, 60);
        double q3 = gui_yo_hua(85, 98, 79);
        double q4 = gui_yo_hua(92, 96, 85);
        double q5 = 93;
        double q6 = 87;
        double q7 = 89.33;
        double q8 = 91;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 3, 2, 3, 1, 2, 3, 2};
        System.out.println("hanchenghang" + se(si, pi));
    }

    @Test
    public void se27() {
        //有限单元法成绩
        double q1 = gui_yo_hua(99, 99, 68);
        //论文与写作
        double q2 = 93;
        //计算动力学1
        double q3 = gui_yo_hua(82, 95, 77);
        //计算动力学2
        double q4 = gui_yo_hua(93, 100, 88);
        //连续介质力学
        double q5 = gui_yo_hua(76, 100, 60);
        //数理统计
        double q6 = 91;
        //英语加权
        double q7 = ying_yu(91, 90);
        //波动分析
        double q8 = 96;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {3, 1, 2, 2, 3, 2, 3, 2};
        System.out.println("有限单元法归一化成绩：" + q1);
        System.out.println("计算动力学一归一化成绩：" + q3);
        System.out.println("计算动力学二归一化成绩：" + q4);
        System.out.println("连续介质力学归一化成绩：" + q5);
        System.out.println("英语加权成绩：" + q7);
        System.out.println("薛姝楠平均成绩：" + se(si, pi));
    }

    @Test
    public void se28() {
        double q1 = gui_yo_hua(97, 100, 88);
        double q2 = gui_yo_hua(81, 95, 61);
        double q3 = 93;
        double q4 = 76;
        double q5 = 84;
        double q6 = 76;
        double q7 = gui_yo_hua(84, 95, 77);
        double q8 = 92;
        double[] si = {q1, q2, q3, q4, q5, q6, q7, q8};
        double[] pi = {2, 3, 1, 2, 2, 3, 2, 2};
        System.out.println("zhangyan" + se(si, pi));
    }
}
