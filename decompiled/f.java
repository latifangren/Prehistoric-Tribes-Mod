/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class f
extends Canvas
implements Runnable {
    static int a = -6;
    static int b = -7;
    boolean a;
    tribes a;
    b a;
    c a;
    boolean b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    boolean c;
    static byte a;
    String a;
    boolean d;
    byte b;
    byte c;
    byte d;
    int l;
    byte[] a;
    short[] a;
    short[] b;
    short[] c;
    byte e;
    static byte f;
    static byte g;
    byte[] b;
    a a;
    byte h;
    int m;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    byte i;
    static boolean l;
    static boolean m;
    byte j;
    int n;
    int o;
    int p;
    boolean n;
    boolean o;
    boolean p;
    byte k;
    byte l;
    boolean q;
    int q;
    int r;
    int s;
    int t;
    int u;
    boolean r;
    int v;
    int w;
    int x;
    int y;
    int z;
    byte m;
    byte n;
    byte o;
    boolean s;
    byte p;
    byte q;
    byte r;
    byte s;
    byte t;
    byte u;
    byte v;
    short a;
    short b;
    int A;
    int[][] a;
    byte w;
    byte x;
    byte y;
    byte z;
    byte A;
    byte B;
    byte C;
    byte D;
    int B;
    int C;
    int D;
    int E;
    boolean t;
    boolean u;
    byte E;
    int F;
    int G;
    int H;
    byte F;
    byte G;
    byte[][] a;
    boolean v;
    boolean w;
    int I;
    byte H;
    int J;
    int K;
    int L;
    int M;
    byte I;
    byte J;
    byte K;
    byte L;
    int N;
    int O;
    int P;
    int Q;
    int R;
    int S;
    int T;
    int[] a;
    int[] b;
    int[] c;
    int[] d;
    byte[] c;
    byte[] d;
    static final Image[] a;
    static final Graphics[] a;
    static byte M;
    byte N;
    short c;
    short d;
    short e;
    short f;
    byte O;
    byte P;
    byte[][] b;
    byte[][] c;
    int[][][] a;
    boolean[][] a;
    short[][] a;
    byte[] e;
    byte[][] d;
    boolean x;
    int[] e;
    byte[] f;
    byte[] g;
    byte[] h;
    byte[] i;
    byte[][] e;
    byte[][][] a;
    byte[][] f;
    byte[][][] b;
    byte[][][] c;
    int U;
    int V;
    byte[][] g;
    byte[][] h;
    byte[][] i;
    Image[][] a;
    short[][] b;
    byte[][] j;
    int W;
    int X;
    int[][] b;
    int Y;
    byte Q;
    byte R;
    byte S;
    int Z;
    int aa;
    int ab;
    byte T;
    byte U;
    byte V;
    boolean y;
    byte W;
    int ac;
    boolean z;
    int ad;
    int ae;
    boolean A;
    boolean B;
    boolean C;
    int af;
    int ag;
    int ah;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    boolean D;
    byte X;
    int an;
    int ao;
    int ap;
    int aq;
    int ar;
    int as;
    int at;
    byte Y;
    int au;
    int av;
    int aw;
    int ax;
    int ay;
    int az;
    int aA;
    int aB;
    byte Z;
    byte aa;
    byte ab;
    byte ac;
    int aC;
    boolean E;
    byte ad;
    boolean[] a;
    boolean[] b;
    boolean[] c;
    boolean[] d;
    boolean F;
    byte[] j;
    byte[] k;
    short[] d;
    int aD;
    int aE;
    int aF;
    int aG;
    int aH;
    int aI;
    int aJ;
    int aK;
    byte ae;
    boolean G;
    static byte af;
    int[] f;
    byte[] l = 1;
    byte[] m;
    byte[] n;
    byte[] o;
    static byte ag;
    static byte ah;
    int aL;
    int aM;
    int aN;
    int aO;
    boolean H;
    boolean I;
    int aP;
    int aQ;
    byte ai;
    int aR;
    byte aj;
    byte ak;
    byte al;
    byte am;
    byte an;
    int aS;
    byte[] p;
    int aT;
    byte ao;
    boolean J;
    boolean K;
    byte ap;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    byte aq;
    byte[] q;
    boolean P;
    boolean Q;
    boolean R;
    byte ar;
    byte as;
    static int aU;
    static int aV;
    int aW;
    int aX;
    int aY;
    int aZ;
    byte at;
    byte au;
    byte av;
    boolean S;
    byte[] r;
    byte[] s;
    boolean T;
    boolean U;
    boolean V;
    byte aw;
    byte[] t;
    int ba;
    int bb;
    byte ax;
    byte[] u;
    byte[][] k = 1;
    int[] g;
    byte ay;
    int[] h;
    byte[] v;
    int bc;
    int bd;
    int be;
    int bf;
    String b;
    boolean W;
    boolean X;
    Random a = true;
    boolean Y;
    boolean Z;
    boolean aa;
    boolean ab;
    boolean ac;
    boolean ad;
    static short[] e;
    static short[] f;
    static byte[] w;
    int[] i;
    int[] j = 120;
    boolean ae;
    boolean af;
    boolean ag;

    public f(tribes tribes2) {
        String[] stringArray = new String[]{"en", "fr", "it", "de", "es"};
        this.v = -1;
        this.w = -1;
        this.s = (byte)-1;
        this.t = (byte)-1;
        this.v = (byte)2;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.N = 1;
        this.c = (short)96;
        this.d = (short)96;
        this.e = (short)96;
        this.f = (short)96;
        this.g = new byte[11];
        this.h = new byte[11];
        this.i = new byte[11];
        this.U = 5;
        this.V = (byte)4;
        this.ac = 1000;
        this.an = -1;
        this.a = new boolean[20];
        this.b = new boolean[20];
        this.c = new boolean[9];
        this.d = new boolean[9];
        this.j = new byte[8];
        this.f = new int[]{0, 5251341, 16704820, 16033043, 12010496};
        this.l = new byte[]{0, 1, 1, 1, 1};
        this.m = new byte[]{0, 1, 1, 2, 3};
        this.n = new byte[]{100, 98, 0, 0, 0};
        this.o = new byte[]{5, 3, 1, 1, 1};
        this.p = new byte[40];
        this.aq = (byte)2;
        this.q = new byte[2];
        this.as = (byte)3;
        this.aw = (byte)2;
        this.u = new byte[10];
        this.k = new byte[3][10];
        this.g = new int[10];
        this.b = "t";
        this.a = new Random(1L);
        this.Y = false;
        this.Z = false;
        this.aa = false;
        this.setFullScreenMode(true);
        this.a = tribes2;
    }

    public final void a() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public final void b() {
        this.b = false;
        this.z = false;
        this.aR();
        this.a.notifyDestroyed();
    }

    private void f() {
        this.a = new b();
        System.gc();
        Thread.yield();
        new e(this);
        af = (byte)98;
        this.a(0);
        this.a.a.setCurrent((Displayable)this);
        this.y = true;
    }

    private void g() {
        System.gc();
        Thread.yield();
        this.g = new byte[this.P + 3][this.O];
        this.h = new byte[13][101];
        this.i = new byte[13][101];
        this.a = new int[2][3][96];
        this.a = new boolean[this.P + 3][this.O];
        System.gc();
        Thread.yield();
        this.a = new byte[5][50];
        this.a = new short[2][26];
        this.d = new byte[7][40];
        this.e = new int[]{0xE00000, 14999808, 55808, 55808};
        this.f = new byte[12];
        this.e = new byte[3][30];
        this.a = new byte[2][10][12];
        this.f = new byte[4][30];
        this.b = new byte[2][5][30];
        this.c = new byte[2][5][5];
        System.gc();
        Thread.yield();
        this.b = new int[][]{{7250486, 11637795, 2652080, 2454300, 0x3B3B30, 0x464646, 16766976, 14352640, 10966528, 16750080, 7406848, -1}, {5276696, 8810262, 678290, 480512, 0x1D1D12, 0x282828, 16766976, -1, -1, 16750080, 0x530000, -1}};
        this.k = new byte[107];
        this.d = new short[107];
        this.r = new byte[50];
        this.s = new byte[100];
        System.gc();
        Thread.yield();
        this.a.a = new byte[2][101][80];
        this.a.b = new byte[2][22][5];
        this.a.c = new byte[5][6][6];
        this.a.a = new byte[5][50];
        this.a.c = new byte[2];
        this.a.d = new byte[6];
        this.a.e = new byte[3];
        this.a.f = new byte[3];
        this.a.d = new byte[3][2][96];
        this.a.g = new byte[3];
        this.a.e = new byte[2][3][10];
        this.a.h = new byte[10];
        this.a.c = new byte[6][10];
        this.a.a = new boolean[3];
        this.a.d = new byte[2][50];
        this.a.d = new short[6];
        this.a.i = new byte[8];
        this.a.e = new byte[4][8];
        this.a.f = new byte[2][10];
        this.a.g = new byte[3][20];
        this.a.j = new byte[50];
        this.a.k = new byte[4];
        this.i = new int[6];
        this.j = new int[]{56, 55, 51, 57, 49};
        this.t = new byte[3];
    }

    public final void run() {
        block9: {
            try {
                this.f();
                this.g();
                this.a.a(this);
                if (!this.d(0)) {
                    this.d(1);
                    this.d(2);
                }
                this.Q = (byte)14;
                this.v = 0;
                this.H = true;
                this.R = this.U;
                this.v = 59;
                this.c = -1;
                this.k[55] = -1;
                this.a[0][3] = -1000;
                this.aa = true;
                this.b = true;
                this.i();
                while (this.b) {
                    long l = f.a();
                    this.aS();
                    this.h();
                    if (this.b) {
                        this.m();
                        this.l();
                        while (this.z && !this.Z) {
                            Thread.yield();
                        }
                        if (this.ad != 0 || this.ae != 0) {
                            this.ae = 0;
                            this.ad = 0;
                            tribes.a(this.i / 2);
                            this.l();
                            while (this.z && !this.Z) {
                                Thread.yield();
                            }
                        }
                        long l2 = f.a();
                        long l3 = l2 - l;
                        if ((l3 = (long)this.i - l3) < 0L || l3 > (long)this.i) {
                            l3 = 0L;
                        }
                        tribes.a((int)l3);
                        continue;
                    }
                    break block9;
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void h() {
        this.i = this.c ? 50 : this.j;
        this.k = this.j / this.i;
        ++this.e;
        if (this.e >= 6) {
            this.E = false;
            this.q = false;
        }
        if (this.e >= 8) {
            this.e = 0;
        }
        Thread.yield();
        if (this.v == 0) {
            this.ak();
            this.o = false;
        } else if (this.v == 1) {
            if (this.i == 0) {
                this.i = (byte)-1;
                if (!(this.w == 3 || this.a[6] || this.a[8] || this.a[7])) {
                    if (this.a[0]) {
                        this.m = 0;
                    } else if (this.a[4]) {
                        this.m = 1;
                        if (this.a[this.a[296] + this.a.g] == 3) {
                            this.a.J = (byte)(120 - this.a[this.a[298] + this.a.g]);
                        }
                    }
                    this.v = 0;
                    this.l(this.a[this.a[305] + this.a[this.a[306] + this.m] + 0]);
                    this.Q = (byte)25;
                    this.R = (byte)28;
                    this.Z = 0;
                    this.H = true;
                    this.z = this.y;
                    this.B = this.A;
                    this.J = this.I;
                    this.L = this.K;
                }
            } else if (this.w == 2 || this.w == 4) {
                this.ae();
                this.o = false;
            } else {
                this.V();
                this.o = false;
                this.k();
            }
            if (this.v == 1) {
                ++this.d;
                if (this.d > 5) {
                    this.d = 0;
                    this.a((byte)100, (byte)0, (byte)0, (byte)0);
                }
                if (this.E <= 4) {
                    this.E = (byte)(this.E + 1);
                } else if (this.E >= 0) {
                    this.n = 0;
                }
                this.j = (byte)(this.j + 1);
                this.j();
            }
        }
        ++this.g;
        ++this.f;
        if (this.f >= 120) {
            this.f = 0;
        }
        if (this.o < 3) {
            ++this.o;
            this.n = true;
        } else if (this.o == 3) {
            ++this.o;
            this.i();
            this.n = false;
        }
        if (this.k) {
            this.k = false;
            this.s = 0;
            this.l(-1);
            this.P = false;
            this.a(true, true, false, false);
            this.F = false;
            this.w = 0;
            this.k = 0;
            this.q = 0;
            this.E = 0;
            this.D = 0;
            this.C = 0;
            this.B = 0;
            this.F = (byte)-1;
            this.aI();
            this.u = false;
            this.t = false;
            this.i();
        }
        if (this.p) {
            this.p = false;
            this.i();
        }
        ++this.p;
    }

    private void i() {
        m = false;
        l = false;
        this.h = false;
        this.g = false;
        this.f = false;
        this.e = false;
        this.v = false;
        this.i = false;
        this.E = (byte)4;
        this.w = false;
        this.i = (byte)-1;
        this.t = false;
        this.n = 0;
    }

    private void j() {
        try {
            this.a.g();
            this.a.e();
            this.a.h();
            this.a.i();
        }
        catch (Exception exception) {}
        ++this.c;
        ++this.h;
        if (this.h >= 100) {
            int n = this.h - 100;
            if (n >= this.d - 1) {
                this.h = 0;
            }
            for (int i = 0; i < this.c; ++i) {
                if (this.c[n][i] > -114 || this.c[n][i] <= -117) continue;
                this.c[n][i] = 0;
                this.c(i, n, 1, 1);
            }
        }
        if (this.P && this.w != 4 && this.w != 3) {
            this.Z();
        }
        this.P = false;
        if (this.u > 0 && this.v == 1) {
            this.u = (byte)(this.u + 1);
            if (this.u == 41 || this.u == 90) {
                this.v = 0;
                this.Q = (byte)24;
                this.H = true;
                this.v = 56 + 41 / this.u;
                this.o = (byte)(11 - 41 / this.u);
                this.o = 0;
            }
        }
    }

    private void k() {
        block10: {
            int n = this.I + this.y;
            int n2 = this.K + this.A;
            try {
                byte by = this.c[n2][n];
                if (!(this.u || by <= -1 && by >= -30)) {
                    boolean bl = false;
                    if (by >= 51 && this.w == 1 || by >= 1 && by <= 50) {
                        this.W = by;
                    } else {
                        for (int i = -1; i <= 1; ++i) {
                            for (int j = -1; j <= 1; ++j) {
                                if (n + j < 0 || n2 + i < 0 || n + j >= this.c || n2 + i >= this.d || ((by = this.c[n2 + i][n + j]) < 51 || this.w != 1) && (by < 1 || by > 50)) continue;
                                int n3 = this.e[202 + by];
                                int n4 = this.e[303 + by];
                                int n5 = i < 0 ? 16 - n4 : (n4 = i == 0 ? 0 : 16 + n4);
                                n3 = j < 0 ? 22 - n3 : (j == 0 ? 0 : 22 + n3);
                                n3 = n3 * n3;
                                n4 *= n4;
                                int n6 = (n4 + n3) / 2;
                                if (this.W == by && (n6 < 13 || by <= 50)) {
                                    this.ac = n6;
                                    bl = true;
                                }
                                if (n6 >= this.ac || n6 >= 13 && by > 50) continue;
                                this.ac = n6;
                                this.W = by;
                                bl = true;
                            }
                        }
                        if (!bl) {
                            this.W = 0;
                            this.ac = 1000;
                        }
                    }
                    if (this.W < 50 && this.w == 1) {
                        this.W = 0;
                    }
                    break block10;
                }
                this.W = 0;
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void l() {
        this.z = true;
        this.repaint();
        Thread.yield();
    }

    protected final void paint(Graphics graphics) {
        if (this.v == 1) {
            int n = this.ad == 0 && this.ae == 0 ? this.c[1] : 3;
            f.a(graphics, a[n], 0, 0, 262, this.A, this.a - 11 + this.ad, this.b - 8 + this.bb - this.ax + this.ae + 0, 0);
            for (n = 0; n < 20; n = (int)((byte)(n + 1))) {
                if (!this.a[n]) continue;
                f.a(graphics, a[this.c[this.a[this.a[195] + 0 + n]]], 0, this.c[this.a[this.a[195] + 0 + n]], this.a[this.a[this.a[195] + 0 + n]] + 11, this.b[this.a[this.a[195] + 0 + n]], this.a - 11, this.b + this.d[this.a[this.a[195] + 0 + n]] + 0, 0);
                if (n == 8 || n == 7) {
                    this.a(graphics, 556, this.a + this.a[this.a[this.a[195] + 0 + n]] - 68, this.b + this.b[this.a[this.a[195] + 0 + n]] - 55 + this.bb + this.d[this.a[this.a[195] + 0 + n]] + 0 + 5);
                }
                if (this.a[this.a[195] + 20 + n] == 1) {
                    this.a(graphics, 524, (int)this.a, this.b + this.bb + 0);
                    continue;
                }
                if (this.a[this.a[195] + 20 + n] != 2) continue;
                this.a(graphics, 528, (int)this.a, this.b + 320 - this.ba + 0);
            }
        } else {
            f.a(graphics, a[M], 0, 0, 251, 328, this.a - 11, this.b - 8 + 0, 0);
            if (this.s && !this.J && this.aP < 0) {
                graphics.setColor(0);
                f.a(graphics, this.a - 11, this.b - 8 + 0, 240, 16 + -this.aP);
                f.a(graphics, this.a - 11, this.b - 8 + 16 + 320 - -this.aP + 0, 240, -this.aP);
            }
        }
        this.z = false;
    }

    private void m() {
        if (this.v == 1) {
            this.N = this.c[1];
            this.n();
            this.w();
            this.u();
            a[3].drawImage(a[this.c[1]], 0, 0, 0);
            this.N = (byte)3;
            this.c(this.y * 22 - this.ad, this.A * 16 - this.ae);
            this.N = this.c[1];
            this.c(this.y * 22, this.A * 16);
            this.S = false;
            for (byte by = 0; by < 20; by = (byte)((byte)(by + 1))) {
                if (!this.a[by]) continue;
                this.a(by, 0, this.c[this.a[this.a[195] + 0 + by]] - 8);
                this.N = this.c[1];
                if (this.a[this.a[195] + 20 + by] == 1) {
                    this.a(524, 0, (int)this.ax);
                    continue;
                }
                if (this.a[this.a[195] + 20 + by] != 2) continue;
                this.a(528, 0, 320 - this.bb - this.ba + this.ax);
            }
            return;
        }
        if (this.v == 0) {
            this.F();
        }
    }

    private void n() {
        try {
            if (this.ag != 0 && this.af != 0) {
                this.A = true;
            }
            this.aj = 0;
            this.ak = 0;
            if (this.A) {
                this.A = false;
                this.C = false;
                this.al = this.O - 1;
                this.am = this.P - 1;
                this.ag = 0;
                this.af = 0;
                this.o();
            } else {
                this.ai = 0;
                this.am = -1;
                if (this.af != 0) {
                    this.aj = -this.af * 22;
                } else if (this.ag != 0) {
                    this.ak = -this.ag * 16;
                }
                f.a(a[this.c[1]], a[this.c[0]], 0, 0, 264, this.A, this.aj, this.ak, 0);
                if (this.af != 0) {
                    this.al = this.aj = ((this.af - 2) / 2 + 1) * (this.O - 1);
                    this.ak = 0;
                    this.am = this.P - 1;
                    this.af = 0;
                    this.o();
                }
                if (this.ag != 0) {
                    this.am = this.ak = ((this.ag - 2) / 2 + 1) * (this.P - 1);
                    this.aj = 0;
                    this.al = this.O - 1;
                    this.ag = 0;
                    this.o();
                }
                if (this.C) {
                    this.C = false;
                    this.aj = 0;
                    this.al = this.O - 1;
                    this.ak = this.P - 1 - 3;
                    this.am = this.P - 1;
                    this.o();
                }
                if (this.B) {
                    this.B = false;
                    this.aj = 0;
                    this.al = this.O - 1;
                    this.ak = 0;
                    this.am = this.P - 1;
                    this.D = true;
                    this.o();
                    this.D = false;
                }
            }
            if (this.am != -1 && !this.s) {
                f.a(a[this.c[0]], a[this.c[1]], 0, 0, 264, this.A, 0, 0, 0);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void o() {
        this.ai = this.ak;
        while (this.ai <= this.am) {
            this.ah = this.aj;
            while (this.ah <= this.al) {
                block10: {
                    block9: {
                        if (!this.D) break block9;
                        if (!this.a[this.ai][this.ah]) break block10;
                        this.a[this.ai][this.ah] = false;
                    }
                    if (!this.s || this.b(this.ah + this.I, this.ai + this.K)) {
                        int n = this.b[this.ai + this.K][this.ah + this.I] & 0xFF;
                        if (n < 175) {
                            this.a(n, this.ah * 22, this.ai * 16);
                        } else {
                            this.a(n, (byte)0);
                        }
                        byte by = this.c[this.ai + this.K][this.ah + this.I];
                        if (by < 0 && by >= -123) {
                            this.a((int)by, (byte)0);
                        }
                    }
                }
                ++this.ah;
            }
            ++this.ai;
        }
    }

    private void a(int n, byte by) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        block28: {
            n9 = -n;
            n8 = 0;
            byte by2 = 0;
            n7 = 0;
            n6 = 0;
            n5 = 0;
            n4 = this.ah * 22;
            n3 = this.ai * 16;
            if (f.b(n) != 2) {
                n8 = this.e[8749 + n9];
                by2 = this.a[this.a[138] + 104 + n8];
                n7 = this.e[9115 + n9];
                n6 = this.ah + this.I - this.e[8383 + n9];
                n5 = this.ai + this.K - this.e[8444 + n9];
                n4 -= n6 * 22;
                n3 -= n5 * 16;
                this.N = this.b[0][n8 + 1];
                this.O = this.j[0][n8 + 1];
                if (by == 0) {
                    int n10 = 0;
                    n2 = by2 * n5 + n6;
                    while (true) {
                        if ((this.j[3][this.N] & 0xFF) >> 6 == 0) {
                            if (n10 == n2) break block28;
                            ++n10;
                        }
                        if ((this.j[3][this.N] & 7) == 0) {
                            ++this.N;
                            --this.O;
                            continue;
                        }
                        break block28;
                        break;
                    }
                }
                n2 = this.e[8993 + n9];
                while (n2 > 0) {
                    this.g[this.e[4646 + n2]] = (byte)n2;
                    n2 = this.e[4545 + n2];
                }
            } else if (f.c(n)) {
                n8 = this.e[9833 + (n9 -= 61)];
                n7 = this.e[9933 + n9];
                this.N = this.b[0][n8 + 27 - 1];
                this.O = this.j[0][n8 + 27 - 1];
            } else if (f.c(n) != 2) {
                if (f.c(n) != 3) {
                    this.g[0] = this.c[this.K + this.ai][this.I + this.ah];
                    if (f.c(this.g[0]) != 2) {
                        if (f.c(this.g[0]) == 1) {
                            by = (byte)-1;
                        }
                        n8 = 20 - (this.g[0] + 111);
                        n7 = 1;
                    } else if (f.c(this.e[4545 + this.g[0]]) != 2) {
                        n8 = 20 - (this.e[4545 + this.g[0]] + 111);
                        n7 = 2;
                    }
                    while (n8 > 22) {
                        n8 -= 3;
                    }
                } else {
                    n8 = 23;
                    n7 = 0;
                }
                this.N = this.b[0][n8 + 1];
                this.O = this.j[0][n8 + 1];
                n9 = 0;
            } else if (n >= 1000) {
                n4 = this.S;
                n3 = this.T;
                n8 = n - 1000;
                this.N = this.b[0][n8];
                this.O = this.j[0][n8];
                if (this.v == 0) {
                    this.g[0] = 1;
                    this.g[1] = 2;
                    this.g[2] = 3;
                    this.e[2930] = 39;
                    this.e[2931] = 42;
                    this.e[2932] = 42;
                    this.e[607] = 1;
                    this.e[608] = 0;
                    this.e[609] = 6;
                    this.e[1415] = 25;
                    this.e[1416] = 45;
                    this.e[1417] = 70;
                    this.e[3031] = (byte)(this.f % 8);
                    this.e[3032] = (byte)(this.f % 8);
                    this.e[3033] = (byte)(this.f % 10);
                    this.e[5152] = 8;
                    this.e[6566] = 9;
                    this.e[5153] = 5;
                    this.e[6567] = 2;
                    this.e[5154] = 10;
                    this.e[6568] = 0;
                    this.e[1316] = 0;
                    this.e[1315] = 0;
                    this.e[1314] = 0;
                    this.e[6467] = 0;
                    this.e[6466] = 0;
                    this.e[6465] = 0;
                }
                n7 = 0;
                n9 = 0;
            } else if (n >= 175) {
                n8 = n - 180 + 34;
                this.N = this.b[0][n8];
                this.O = this.j[0][n8];
                n3 += this.aQ;
                n7 = 0;
                n9 = 0;
            }
        }
        if (by == 0) {
            do {
                this.P = (this.j[3][this.N] & 0xFF) >> 6;
                if (this.P <= n7) {
                    this.a(this.b[1][this.N] & 0xFFF, (this.ah - n6) * 22 + this.j[1][this.N], (this.ai - n5) * 16 + this.j[2][this.N]);
                }
                ++this.N;
            } while ((this.j[3][this.N] & 7) == 0 && (this.j[3][this.N] & 0xFF) >> 6 != 0);
        } else {
            this.a(n9, (byte)n7, (byte)n8, n4, n3, by);
        }
        for (n2 = 0; n2 < 8; n2 = (int)((byte)(n2 + 1))) {
            this.i[n2] = 0;
            this.h[n2] = 0;
            this.g[n2] = 0;
        }
    }

    private void a(int n, byte by, byte by2, int n2, int n3, byte by3) {
        int n4 = 0;
        int n5 = this.f;
        byte by4 = 0;
        this.U = 0;
        try {
            for (int i = 0; i < this.O; ++i) {
                int n6 = this.j[3][this.N] & 7;
                by4 = (byte)((this.j[3][this.N] & 0x3F) >> 3);
                this.P = (this.j[3][this.N] & 0xFF) >> 6;
                this.X = this.g[by4];
                boolean bl = false;
                int n7 = (this.b[1][this.N] & 0xC000) >> 14 << 7;
                if (n6 == 0 && by3 == 2 && this.P == by) {
                    this.a(this.b[1][this.N] & 0xFFF, n2 + this.j[1][this.N] + n7, n3 + this.j[2][this.N]);
                } else if (n6 == 1 && this.P <= by) {
                    if (by2 == 6 && this.U < 5) {
                        this.a[0][this.a[this.a[142]]] = (byte)(this.a[0][5] + this.a[0][8] + this.a[0][5] + this.a[0][9] + this.a[0][10]);
                        if (this.a[0][this.a[this.a[142] + this.U]] > 0 || n >= 31) {
                            this.V = this.a[0][this.a[this.a[142] + this.U]] / 7 / (this.U == 0 ? 1 : 10);
                            if (this.V >= 5 || n >= 31) {
                                this.V = 4;
                            }
                            this.a((this.b[1][this.N] & 0xFFF) + this.V, n2 + this.j[1][this.N] + n7, n3 + this.j[2][this.N]);
                        }
                        ++this.U;
                    } else if (by2 == 4 && this.U < 1) {
                        if (n >= 31) {
                            this.a((this.b[1][this.N] & 0xFFF) + 2, n2 + this.j[1][this.N] + n7, n3 + this.j[2][this.N]);
                        } else if (this.a[0][0] >= 5) {
                            this.V = this.a[0][0] > 35 ? 2 : (this.a[0][0] - 5) / 15;
                            this.a((this.b[1][this.N] & 0xFFF) + this.V, n2 + this.j[1][this.N] + n7, n3 + this.j[2][this.N]);
                        }
                        ++this.U;
                    } else {
                        this.a(this.b[1][this.N] & 0xFFF, n2 + this.j[1][this.N] + n7, n3 + this.j[2][this.N]);
                    }
                } else if ((n6 == 2 || n6 == 4 || n6 == 6) && by3 != 2) {
                    if (this.P == 0 || this.P <= by) {
                        int n8 = this.N;
                        n4 = this.b[1][this.N] & 0xFFF;
                        if (n6 == 6) {
                            n5 += this.K + this.ai + this.N * 2;
                            while (n5 >= 120) {
                                n5 -= 120;
                            }
                            if (by4 == 1 || by4 == 2 && (this.e[8627 + n] == 1 || this.e[8627 + n] == 2)) {
                                if (n >= 31) {
                                    ++n4;
                                }
                                bl = true;
                            } else if (by4 != 2) {
                                bl = true;
                            }
                        } else if (this.q == 3 && n == 31 && by4 == 0) {
                            if (n4 == 116 && n6 == 4) {
                                bl = true;
                                n5 = 0;
                            }
                        } else if (n6 == 2 && (this.e[1313 + this.X] <= 0 || this.e[1313 + this.X] >= 50)) {
                            bl = true;
                            if (this.e[1313 + this.X] == 51) {
                                this.i[by4] = 1;
                            }
                        } else if (n6 == 4 && this.i[by4] == 0 && this.e[1313 + this.X] >= 1 && this.e[1313 + this.X] != 50) {
                            n4 = this.b[1][this.N + this.e[1313 + this.X] - 1] & 0xFFF;
                            n5 = this.e[3030 + this.X];
                            bl = true;
                            this.i[by4] = 1;
                            if (this.e[8749 + n] == 2 && this.e[1313 + this.X] == 2) {
                                this.d(90, n2 + this.j[1][n8] + n7, n3 + this.j[2][n8], this.f);
                            }
                        }
                        if (bl) {
                            this.d(n4, n2 + this.j[1][n8] + n7, n3 + this.j[2][n8], n5);
                        }
                    }
                } else if ((n6 == 3 || n6 == 5 || n6 == 7) && this.h[by4] == 0 && this.X > 0 && by3 != 2) {
                    int n9 = 0;
                    if (n < 31 || (this.e[9176 + n] & 3) >= 2) {
                        if (n6 == 7 && this.e[1313 + this.X] == 50) {
                            bl = true;
                        } else if (n6 == 3 && this.e[1313 + this.X] >= 1 && this.e[1313 + this.X] != 50) {
                            n9 = this.a[this.a[139] + this.a[this.a[140] + by2] + by4];
                            switch (n9) {
                                case -1: {
                                    n9 = this.e[606 + this.X];
                                }
                            }
                            bl = true;
                        } else if (n6 == 5 && this.e[1313 + this.X] <= 0) {
                            bl = true;
                            if ((this.e[3535 + this.X] != 0 || this.e[6565 + this.X] == 1) && by2 != 10 && by2 != 11) {
                                this.x = true;
                            }
                            if (this.v == 0) {
                                n9 = this.e[606 + this.X];
                            }
                        }
                    }
                    if (bl) {
                        this.a((int)this.X, n2 + this.j[1][this.N] + n7, n3 + this.j[2][this.N], n9, (byte)29);
                        this.h[by4] = 1;
                    }
                }
                ++this.N;
            }
        }
        catch (Exception exception) {}
        this.X = 0;
    }

    private void a(int n, int n2, int n3, int n4, byte by) {
        try {
            this.aq = n;
            this.ar = n2;
            this.as = n3;
            this.at = n4;
            this.Y = by;
            this.av = this.e[this.b[this.Y] + this.aq] & 0xFF;
            int n5 = 0;
            if (this.at >= 0) {
                this.at = this.a[this.a[99] + ((this.b[3][this.av] >> 14 & 3) << 3) + this.at];
                n5 = (this.b[2][this.av] & 0xFFF) + this.at * this.j[4][this.av] + this.e[this.b[this.Y + 1] + this.aq];
                this.au = this.b[4][n5];
                this.ar += this.j[7][n5];
                this.as += this.j[8][n5] + this.aQ;
                if (this.x) {
                    if (this.av != 124) {
                        this.au += 48;
                        this.av = 1;
                    }
                    this.x = false;
                }
                if (this.av == 141 || this.av == 142 || this.av == 143 || this.av == 144) {
                    this.ar += 22 * this.a[this.a[1] + this.e[606 + this.aq]];
                }
            } else {
                this.av = -this.at;
                if (this.e[1414 + this.aq] < 12) {
                    this.av = 14;
                    this.as -= 6;
                }
                this.au = this.b[4][(this.b[2][this.av] & 0xFFF) + 2];
            }
            this.aw = (this.b[2][this.av] & 0xF000) >> 14;
            this.p();
            if (this.v != 0) {
                this.q();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void p() {
        this.aA = this.b[8][this.au];
        this.ao = -1;
        this.ap = -1;
        this.aB = 0;
        while (this.aB < this.j[15][this.au]) {
            block6: {
                block12: {
                    block7: {
                        block9: {
                            block11: {
                                block10: {
                                    block8: {
                                        this.az = this.aA + this.aB;
                                        if (this.b[7][this.az] == 0) break block6;
                                        this.ax = 0;
                                        this.ay = this.j[14][this.az] & 0xF;
                                        if (this.Y != 29) break block7;
                                        if (!this.a()) break block6;
                                        if (this.e[1414 + this.aq] < 12) break block8;
                                        if (this.aq >= 51) {
                                            this.an = 4;
                                        }
                                        if (this.b()) break block9;
                                        break block6;
                                    }
                                    if (this.ay == 7 && this.e[1515 + this.aq] == 0) break block6;
                                    if (this.ay != 0) break block10;
                                    this.ap = this.az;
                                    if (this.aq >= 51) {
                                        ++this.ax;
                                    }
                                    break block9;
                                }
                                if (this.ay != 9) break block11;
                                this.ao = this.az;
                                this.ax = this.e[5151 + this.aq] & 1;
                                break block9;
                            }
                            if (this.ay == 5) break block6;
                        }
                        if (this.b[7][this.az] != 1) break block12;
                        break block6;
                    }
                    if (this.ay == 0) {
                        this.ao = this.ap = this.az;
                    }
                }
                if ((this.j[14][this.az] & 0xFF) >> 7 == 0) {
                    this.b(this.b[7][this.az] + this.ax, this.ar + this.j[12][this.az], this.as + this.j[13][this.az]);
                } else {
                    this.a(this.b[7][this.az] + this.ax, this.ar + this.j[12][this.az], this.as + this.j[13][this.az]);
                }
                this.an = -1;
            }
            ++this.aB;
        }
    }

    private boolean a() {
        if (this.ay == 10 && !this.s && this.v == 1 && this.at > -1) {
            if (this.e[909 + this.aq] != 0 && this.e[909 + this.aq] == this.F || this.F == -1 && this.k == this.aq) {
                this.a(599, this.ar + this.j[12][this.az], this.as + this.j[13][this.az]);
            } else if (this.W == this.aq) {
                this.ax = 1;
                if (this.W >= 51) {
                    this.ax = 3;
                }
            }
            this.aC = 0;
            for (int i = this.C + 1; i <= this.C + this.E; ++i) {
                for (int j = this.B + 1; j <= this.B + this.D; ++j) {
                    byte by = this.c[i][j];
                    if (by < 1 || by > 50 || this.e[1919 + by] <= 0) continue;
                    ++this.aC;
                    if (by != this.aq) continue;
                    this.ax = 1;
                }
            }
        }
        return true;
    }

    private boolean b() {
        if (this.ay == 0) {
            this.ap = this.az;
            this.ax = 0;
            this.ax = this.e[5151 + this.aq] >> 2 & 3;
            if (this.ax > 1) {
                this.ax -= 2;
                this.an = 0;
            }
            this.ax *= 72;
            if (this.aq >= 51) {
                this.ax += 36;
            }
            this.ax += this.e[1515 + this.aq] * 18;
        } else if (this.ay == 9) {
            this.ao = this.az;
            this.ax = 0;
            this.ax = this.e[5151 + this.aq] & 3;
            if (this.aq >= 51) {
                this.an = 3;
            } else if (this.ax > 0) {
                this.an = this.ax;
            }
            this.ax = this.e[1515 + this.aq] == 1 ? 1 : (this.e[1414 + this.aq] < 30 ? 3 : (this.e[1414 + this.aq] < 50 ? 2 : 0));
            this.ax *= 12;
        } else if (this.ay == 7) {
            if (this.aq == this.a[0][17]) {
                this.ax += 2;
            } else {
                if (this.a[this.a[42] + this.a[this.a[41] + this.e[6464 + this.aq]]] == 0) {
                    return false;
                }
                this.ax += this.a[this.a[42] + this.a[this.a[41] + this.e[6464 + this.aq]]] - 1;
            }
        } else if (this.aw == 0 && this.ay >= 5 && this.ay <= 8) {
            if (this.at < 0 && this.e[6565 + this.aq] == 1) {
                return false;
            }
            if (this.ay == 5 && this.e[6565 + this.aq] == 4 || this.ay == 6 && this.e[6565 + this.aq] == 5) {
                this.ax = 1;
            } else if (this.a[this.a[145] + this.e[6565 + this.aq]] != this.ay) {
                return false;
            }
        } else if (this.aw == 2) {
            if (this.e[3535 + this.aq] != 0) {
                if (this.ay == 4 && (this.e[3636 + this.aq] > 0 || this.av == 113 || this.av == 114 || this.av == 115 || this.av == 116)) {
                    this.ax += this.e[3535 + this.aq];
                } else if (this.ay == 5) {
                    if (this.e[6565 + this.aq] == 9) {
                        return false;
                    }
                    this.ax += this.e[6565 + this.aq];
                } else if (this.ay == 8) {
                    return false;
                }
            } else if (this.e[3535 + this.aq] == 0) {
                if (this.ay == 4) {
                    return false;
                }
                if (this.ay == 5) {
                    if (this.e[6565 + this.aq] == 1) {
                        return false;
                    }
                    if (this.e[6565 + this.aq] == 9) {
                        return false;
                    }
                    this.ax += this.e[6565 + this.aq];
                } else if (this.ay == 8 && this.e[6565 + this.aq] != 1) {
                    return false;
                }
            }
        } else if (this.aw == 1 && this.ay == 5) {
            if (this.e[6565 + this.aq] == 9) {
                return false;
            }
            this.ax += this.e[6565 + this.aq];
        }
        return true;
    }

    private void q() {
        if (!this.s && this.ao >= 0 && this.ap >= 0 && this.v == 1) {
            this.a.a(this.Y == 29 ? this.aq : 101 + this.aq, this.ar + this.j[12][this.ao] + 4, this.as + this.j[13][this.ao]);
            if (this.Y == 29 && this.at > -1) {
                int n;
                for (n = 0; n < 30; ++n) {
                    if (this.b[0][2][n] != this.aq || this.b[0][1][n] == 3) continue;
                    this.d(65 + (1 - this.b[0][4][n]) * 5 + this.b[0][1][n], this.ar + this.j[12][this.ap], this.as + this.j[13][this.ap], this.f);
                    break;
                }
                if (this.e[4646 + this.aq] == 1 && this.e[2828 + this.aq] == 51 && this.e[1313 + this.aq] > 0) {
                    this.d(65, this.ar + this.j[12][this.ap], this.as + this.j[13][this.ap], this.f);
                }
                if (this.e[3333 + this.aq] > -1) {
                    this.d(77 + this.e[3333 + this.aq], this.ar + this.j[12][this.ao], this.as + this.j[13][this.ao], (this.c - (this.aq & 7)) % 15);
                }
                if (this.e[4646 + this.aq] < -1) {
                    this.d(-this.e[4646 + this.aq], this.ar + this.j[12][this.ap], this.as + this.j[13][this.ap], this.e[3030 + this.aq]);
                }
                if ((this.e[7979 + this.aq] & 4) == 4) {
                    this.d(73, this.ar + this.j[12][this.ao], this.as + this.j[13][this.ao], this.f + this.aq);
                }
                if ((this.e[7979 + this.aq] & 8) == 8) {
                    this.d(69, this.ar + this.j[12][this.ap], this.as + this.j[13][this.ap], this.f);
                }
                if (this.aq <= 50) {
                    if (this.aq == 0 || this.aq == 1 && (this.aq == this.k || this.aq == this.W || this.e[909 + this.aq] == this.F || this.aq == this.c[this.K + this.A][this.I + this.y] || this.X != 0 && -this.c[this.K + this.A][this.I + this.y] == this.e[4444 + this.aq])) {
                        this.a(577 + this.e[2222 + this.aq], this.ar + this.j[12][this.ao], this.as + this.j[13][this.ao]);
                    }
                    if (!this.F && this.e[1919 + this.aq] > 0 && (this.aq == this.k || this.aq == this.W || this.e[909 + this.aq] == this.F || this.aq == this.c[this.K + this.A][this.I + this.y] || this.e[6767 + this.aq] / 3 * 2 > this.e[1919 + this.aq] || this.X != 0 && -this.c[this.K + this.A][this.I + this.y] == this.e[4444 + this.aq])) {
                        n = this.e[6767 + this.aq] / 20;
                        int n2 = 0;
                        if (this.e[1616 + this.aq] >= 5 || this.e[1717 + this.aq] >= 5 || this.e[7575 + this.aq] > 5) {
                            n2 = 2;
                            this.a(602 + (this.e[1616 + this.aq] > this.e[1717 + this.aq] ? (this.e[1616 + this.aq] > this.e[7575 + this.aq] ? this.e[1616 + this.aq] : (this.e[1717 + this.aq] >= this.e[7575 + this.aq] ? this.e[1717 + this.aq] : this.e[7575 + this.aq] - 1)) : (this.e[1717 + this.aq] >= this.e[7575 + this.aq] ? this.e[1717 + this.aq] : this.e[7575 + this.aq] - 1)) - 5, this.ar + this.j[12][this.ao] + 2 - n + 2 - 10, this.as + this.j[13][this.ao]);
                        }
                        this.a(607 + n, this.ar + this.j[12][this.ao] + n2, this.as + this.j[13][this.ao]);
                        a[this.N].setColor(this.e[(this.e[1919 + this.aq] - 1) * 3 / this.e[6767 + this.aq]]);
                        f.a(a[this.N], this.ar + this.j[12][this.ao] + 2 - n + n2, this.as + this.j[13][this.ao] - 4, this.a[this.a[128] + n] * this.e[1919 + this.aq] / this.e[6767 + this.aq], 2);
                    }
                }
                if ((this.F || this.V) && this.aq == this.l) {
                    this.d(41, this.ar + this.j[12][this.ap] - 1, this.as + this.j[13][this.ap] - 16 - 5, this.e);
                }
            }
        }
    }

    final void a(int n, int n2, int n3, int n4) {
        for (int i = 0; i < 40; ++i) {
            if (this.d[0][i] != 0) continue;
            this.d[1][i] = 0;
            this.d[0][i] = (byte)n4;
            this.d[2][i] = (byte)n3;
            this.d[6][i] = (byte)n2;
            this.d[5][i] = (byte)n;
            return;
        }
    }

    private void r() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        byte by = 0;
        int n4 = 0;
        short s = 0;
        int n5 = 0;
        short s2 = 0;
        this.aq = -1;
        try {
            for (n = 0; n < 40; ++n) {
                if (this.d[0][n] <= 0) continue;
                int n6 = 29;
                this.aq = this.d[5][n];
                if (this.d[6][n] == 1) {
                    n2 = this.e[0 + this.aq];
                    n3 = this.e[101 + this.aq];
                } else if (this.d[6][n] == 2) {
                    n2 = this.e[9359 + this.aq];
                    n3 = this.e[9381 + this.aq];
                    n6 = 108;
                    this.d[2][n] = 0;
                } else {
                    n2 = this.e[8383 + this.aq] + (this.d[2][n] & 0xF);
                    n3 = this.e[8444 + this.aq] + (this.d[2][n] >> 4 & 0xF);
                }
                if (!this.a(n2, n3) || this.a(n2, n3) != 0 || this.e[1919 + this.aq] <= 0 && this.d[6][n] == 1) {
                    this.d[0][n] = 0;
                    return;
                }
                n2 = (n2 - this.I) * 22;
                n3 = (n3 - this.K) * 16;
                if (this.d[6][n] == 1 || this.d[6][n] == 2) {
                    by = this.e[606 + this.aq];
                    by = this.a[this.a[99] + (this.b[3][this.e[this.b[n6] + this.aq] & 0xFF] >> 14 & 3) * 8 + by];
                    n4 = (this.b[2][this.e[this.b[n6] + this.aq] & 0xFF] & 0xFFF) + by * this.j[4][this.e[this.b[n6] + this.aq] & 0xFF] + this.e[this.b[n6 + 1] + this.aq];
                    s = this.b[4][n4];
                    n5 = 0;
                    s2 = this.b[8][this.b[4][n4]];
                    for (short s3 = 0; s3 < this.j[15][s] && (this.j[14][n5 = s2 + s3] & 0xF) != this.d[2][n]; s3 = (short)(s3 + 1)) {
                    }
                    if (this.d[6][n] == 1) {
                        n2 += this.e[202 + this.aq] + this.j[12][n5];
                        n3 += this.e[303 + this.aq] + this.j[13][n5];
                    } else if (this.d[6][n] == 2) {
                        n2 += this.e[9403 + this.aq] + this.j[12][n5];
                        n3 += this.e[9425 + this.aq] + this.j[13][n5];
                    }
                }
                this.d(this.d[0][n], n2, n3, this.d[1][n]);
                byte[] byArray = this.d[1];
                int n7 = n;
                byArray[n7] = (byte)(byArray[n7] + 1);
                if (this.d[1][n] < this.j[9][this.d[0][n]]) continue;
                this.d[0][n] = 0;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    final void a(int n, int n2) {
        for (int i = 0; i < 30; ++i) {
            if (this.e[0][i] != 0) continue;
            this.e[1][i] = 0;
            this.e[2][i] = (byte)n2;
            this.e[0][i] = (byte)n;
            return;
        }
    }

    private void s() {
        for (int i = 0; i < 30; ++i) {
            if (this.e[0][i] == 0) continue;
            byte by = this.e[0][i];
            byte by2 = this.e[8383 + by];
            int n = this.e[8444 + by] - 1;
            int n2 = this.a[this.a[138] + 104 + this.e[8749 + by]];
            byte by3 = this.a[this.a[138] + 130 + this.e[8749 + by]];
            if (this.e[1][i] >= 20) {
                this.e[0][i] = 0;
                if (this.e[2][i] == 3) {
                    this.c((int)by, false);
                    this.e[8627 + by] = 3;
                }
                this.c(by2, n + 1, n2, by3);
                this.d((int)by);
            } else {
                for (int j = 0; j < by3 + 1; j += 2) {
                    for (int k = 0; k < n2; k += 2) {
                        if (!this.a(by2 + k, n + j)) continue;
                        this.d(74, (by2 + k - this.I) * 22, (n + j - this.K) * 16, (k * 2 + j) * 2 + this.e[1][i] - 1);
                    }
                }
            }
            byte[] byArray = this.e[1];
            int n3 = i;
            byArray[n3] = (byte)(byArray[n3] + 1);
        }
    }

    private boolean a(int n, int n2) {
        return n >= this.I && n < this.I + this.O && n2 >= this.K && n2 < this.K + this.P;
    }

    private void t() {
        for (int n = 0; n < 40; n = (int)((byte)(n + 1))) {
            this.d[0][n] = 0;
        }
    }

    private void d(int n, int n2, int n3, int n4) {
        int n5 = this.b[5][n] + n4 % this.j[9][n];
        this.a((int)this.b[6][n5], n2 + this.j[10][n5], n3 + this.j[11][n5]);
    }

    final void a(int n, int n2, int n3) {
        int n4 = this.b[9][n] & 0x1FFF;
        int n5 = (this.b[9][n] & 0xFFFF) >> 14 & 3;
        if (n5 != 0) {
            this.b((n5 - 1) * 3 + 1, n2, n3);
        }
        for (int i = n4; i < n4 + (this.j[16][n] & 0x3F); ++i) {
            int n6 = this.b[10][i] & 0x1FFF;
            int n7 = (this.b[10][i] & 0xC000) >> 14 << 7;
            if ((this.b[10][i] & 0x2000) >> 13 == 0) {
                this.b(n6, n2 + this.j[18][i] + n7, n3 + this.j[19][i]);
                continue;
            }
            this.a(n6, n2 + this.j[18][i] + n7, n3 + this.j[19][i]);
        }
    }

    private void b(int n, int n2, int n3) {
        block18: {
            int n4;
            block15: {
                block17: {
                    block16: {
                        if (n == 0) {
                            return;
                        }
                        n4 = this.j[20][n] & 0x1F;
                        n2 += 11;
                        n3 += 8;
                        if (n4 >= 27) break block15;
                        boolean bl = false;
                        if (this.an > -1) {
                            if (this.an == 0) {
                                if (n4 == 5) {
                                    n4 = this.an;
                                    bl = true;
                                }
                            } else if (this.an == 4) {
                                if (n4 == 14) {
                                    n4 = 4;
                                    bl = true;
                                } else if (n4 == 15) {
                                    n4 = 5;
                                    bl = true;
                                }
                            } else if (n4 == 9) {
                                n4 = this.an;
                                bl = true;
                            }
                        }
                        if (!bl) break block16;
                        if (f.a(a[this.N], this.a[1][n4], this.j[21][n] & 0x7F, this.j[22][n], this.j[23][n], this.j[24][n], n2, n3, 20)) break block17;
                        break block18;
                    }
                    f.a(a[this.N], this.a[0][n4], this.j[21][n] & 0x7F, this.j[22][n], this.j[23][n], this.j[24][n], n2, n3, 20);
                }
                return;
            }
            int n5 = (this.j[20][n] & 0xFF) >> 5 | (this.j[21][n] & 0x80) >> 4;
            a[this.N].setColor(this.j[17][n5 * 3 + 0] & 0xFF, this.j[17][n5 * 3 + 1] & 0xFF, this.j[17][n5 * 3 + 2] & 0xFF);
            if (n4 == 27) {
                f.d(a[this.N], n2 + (this.j[21][n] & 0x7F), n3 + this.j[22][n], n2 + this.j[23][n], n3 + this.j[24][n]);
                return;
            }
            if (n4 == 28) {
                f.b(a[this.N], n2 + (this.j[21][n] & 0x7F), n3 + this.j[22][n], this.j[23][n], this.j[24][n]);
                return;
            }
            if (n4 == 29) {
                f.a(a[this.N], n2 + (this.j[21][n] & 0x7F) - 11, n3 + this.j[22][n] - 8, this.j[23][n], this.j[24][n]);
                return;
            }
            if (n4 == 30) {
                f.a(a[this.N], n2 + (this.j[21][n] & 0x7F) * 4 - 11, n3 + this.j[22][n] * 4 - 8, this.j[23][n] * 4, this.j[24][n] * 4);
            }
        }
    }

    private void a(Graphics graphics, int n, int n2, int n3) {
        int n4;
        for (int i = n4 = this.b[9][n] & 0x1FFF; i < n4 + (this.j[16][n] & 0x3F); ++i) {
            int n5 = this.b[10][i] & 0x1FFF;
            int n6 = (this.b[10][i] & 0xC000) >> 14 << 7;
            if ((this.b[10][i] & 0x2000) >> 13 == 0) {
                this.b(graphics, n5, n2 + this.j[18][i] + n6, n3 + this.j[19][i]);
                continue;
            }
            this.a(graphics, n5, n2 + this.j[18][i] + n6, n3 + this.j[19][i]);
        }
    }

    private void b(Graphics graphics, int n, int n2, int n3) {
        block7: {
            if (n == 0) {
                return;
            }
            int n4 = this.j[20][n] & 0x1F;
            try {
                if (n4 == 27) {
                    graphics.setColor(0);
                    f.d(graphics, n2 + (this.j[21][n] & 0x7F), n3 + this.j[22][n], n2 + this.j[23][n], n3 + this.j[24][n]);
                    break block7;
                }
                if (n4 == 28) {
                    graphics.setColor(0);
                    f.b(graphics, n2 + (this.j[21][n] & 0x7F), n3 + this.j[22][n], this.j[23][n], this.j[24][n]);
                    break block7;
                }
                if (n4 == 29) {
                    graphics.setColor(0);
                    f.a(graphics, n2 + (this.j[21][n] & 0x7F) - 11, n3 + this.j[22][n] - 8, this.j[23][n], this.j[24][n]);
                    break block7;
                }
                if (n4 == 30) {
                    graphics.setColor(0);
                    f.a(graphics, n2 + (this.j[21][n] & 0x7F) * 4 - 11, n3 + this.j[22][n] * 4 - 8, this.j[23][n] * 4, this.j[24][n] * 4);
                    break block7;
                }
                f.a(graphics, this.a[0][n4], this.j[21][n] & 0x7F, this.j[22][n], this.j[23][n], this.j[24][n], n2, n3, 20);
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void i(int n) {
        byte by = 0;
        byte by2 = 0;
        int n2 = 0;
        int n3 = 0;
        boolean bl = true;
        try {
            do {
                if (!bl) {
                    n = this.e[6060 + n];
                }
                bl = false;
                by = this.e[7676 + n];
                n2 = 0 + (this.e[5252 + n] - this.I) * 22 + 11 + this.e[5454 + n];
                n3 = 0 + (this.e[5353 + n] - this.K) * 16 + 8 + this.e[5555 + n] - this.h[this.e[5858 + n]][n] - 10;
                by2 = this.e[6565 + n];
                if (by2 != 1 && by2 != 2 && by2 != 5) continue;
                this.a(292 + this.a[this.a[190 + this.a[this.a[77] + by2]] + by * this.a[this.a[193] + 6 + by2] + this.i[this.e[5858 + n]][n]] + this.a[this.a[193] + by2], n2, n3);
            } while (this.e[6060 + n] != 0);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void u() {
        int n = 0;
        int n2 = -16;
        byte by = 0;
        int n3 = 0;
        try {
            block58: {
                block57: {
                    this.v();
                    this.ai = -1;
                    while (this.ai < this.P + 3) {
                        int n4 = this.ai + this.K;
                        if (n4 < this.d) {
                            this.ah = this.O - 1 + 1;
                            while (this.ah >= -1) {
                                int n5 = this.ah + this.I;
                                if (n4 >= 0 && n4 < this.d && n5 >= 0 && n5 < this.c) {
                                    n = this.ah * 22;
                                    byte by2 = this.a(n5, n4);
                                    if (this.s && !this.J) {
                                        by2 = 0;
                                    }
                                    by = this.c[n4][n5];
                                    n3 = this.b[n4][n5] & 0xFF;
                                    if (by != 0) {
                                        if (by2 < 2 && (n3 >= 180 && n3 <= 231 || n3 == 243)) {
                                            this.a(n3, (byte)1);
                                        } else if (!(by2 >= 1 || by < 1 || by > 100 || this.s && this.ao == 9)) {
                                            if (f.c(this.e[4545 + by]) != 2) {
                                                this.a((int)this.e[4545 + by], (byte)1);
                                            }
                                            if (f.c(this.e[4545 + by]) == 2 || this.e[2929 + by] <= 14) {
                                                if (this.ai >= 0 && this.ah - 1 >= 0 && this.e[9833 + (this.c[n4][n5 - 1] + 61) * -1] == 5 && f.c(this.c[n4][n5 - 1])) {
                                                    if (this.ah < this.O) {
                                                        this.g[this.ai][this.ah] = 0;
                                                    }
                                                    --this.ah;
                                                    n5 = this.ah + this.I;
                                                    this.a((int)this.c[n4][n5], (byte)1);
                                                }
                                                if (f.a(by) == 0 || (this.e[7979 + by] & 2) == 0) {
                                                    this.a((int)by, n + this.e[202 + by], n2 + this.e[303 + by], (int)this.e[606 + by], (byte)29);
                                                }
                                            }
                                        } else if (by <= -1 && by >= -60 && (by2 < 2 || this.e[9176 + -by] > 0)) {
                                            if ((this.e[9176 + -by] & 4) != 0) {
                                                switch (by2) {
                                                    case 0: {
                                                        this.e[9176 + -by] = 6;
                                                        break;
                                                    }
                                                    case 1: {
                                                        this.e[9176 + -by] = 5;
                                                    }
                                                }
                                            }
                                            switch (this.e[9176 + -by] & 3) {
                                                case 1: {
                                                    by2 = 1;
                                                    break;
                                                }
                                                case 2: {
                                                    by2 = 0;
                                                }
                                            }
                                            if ((this.e[8871 + -by] & 1) == 0) {
                                                this.a((int)by, (byte)1);
                                                int n6 = 8871 + -by;
                                                this.e[n6] = (byte)(this.e[n6] | 1);
                                                byte by3 = this.e[8749 + -by];
                                                byte by4 = this.a[this.a[138] + 104 + by3];
                                                byte by5 = this.a[this.a[138] + 130 + by3];
                                                if ((this.e[9176 + -by] & 4) == 0) {
                                                    this.a.S = 0;
                                                    this.a.a((int)this.e[8383 + -by], (int)this.e[8444 + -by], (int)by4, (int)by5);
                                                    this.a.S = 1;
                                                    this.e[9176 + -by] = 4;
                                                }
                                                if (!this.s && by3 < 22) {
                                                    if ((this.a[this.a[138] + 156 + by3] != -1 || this.e[8627 + -by] == 1 || this.e[8627 + -by] == 2) && this.e[8810 + -by] == 0 && f.b(by) == 0) {
                                                        this.d(40, (this.e[8383 + -by] - this.I) * 22 + by4 * 11 - 11, (this.e[8444 + -by] - this.K) * 16 + by5 * 8 - 8, this.e);
                                                    }
                                                    if ((this.e[8505 + -by] > 0 && (by == this.c[this.K + this.A][this.I + this.y] || this.e[8566 + -by] / 2 > this.e[8505 + -by]) || this.e[8627 + -by] == 1 || this.e[8627 + -by] == 2 || by3 >= 12) && f.b(by) == 0) {
                                                        int n7;
                                                        byte by6;
                                                        int n8;
                                                        int n9;
                                                        int n10 = this.e[8566 + -by] / 80 + 6;
                                                        int n11 = (this.e[8383 + -by] - this.I) * 22 + by4 * 11 - 11;
                                                        int n12 = n2 - this.a[this.a[138] + 520 + by3] * 8 - 5;
                                                        this.a(607 + n10, n11, n12);
                                                        a[this.N].setColor(this.e[(this.e[8505 + -by] - 1) * 3 / this.e[8566 + -by]]);
                                                        f.a(a[this.N], n11 + 1, n12 + 1, this.a[this.a[128] + n10] * this.e[8505 + -by] / this.e[8566 + -by], 2);
                                                        if (by == this.c[this.K + this.A][this.I + this.y] && (n9 = (n8 = (by6 = this.a.a((int)(-by))) >> 4 & 0xF) + (n7 = by6 & 0xF)) > 0) {
                                                            n11 = n11 + 1 + this.a[this.a[128] + n10] / 2 - 4 * n9 / 2 + 1;
                                                            a[this.N].setColor(0);
                                                            f.a(a[this.N], n11 - 0, (n12 += 6) - 1, n9 * 4 - 1, 4);
                                                            f.a(a[this.N], n11 - 1, n12 - 0, n9 * 4 + 1, 2);
                                                            for (int n13 = 0; n13 < n9; n13 = (int)((byte)(n13 + 1))) {
                                                                a[this.N].setColor(n13 < n7 ? 16164864 : 4207389);
                                                                f.a(a[this.N], n11 + n13 * 4, n12, 3, 2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (by2 < 1 && f.b(by)) {
                                            int n14 = by - 101;
                                            this.a(n14, n + this.e[9403 + n14], n2 + this.e[9425 + n14], (int)this.e[9491 + n14], (byte)108);
                                        } else if (by2 < 2 && (f.c(by) || f.c(by) == 3)) {
                                            this.a((int)by, (byte)1);
                                        } else if (by2 == 0 && by <= -114 && by > -117) {
                                            if (this.h >= 94 + n4 && this.h <= 100 + n4) {
                                                this.d(75, n, n2, this.h - (100 + n4) + 6);
                                            } else if ((this.h + this.ah + this.ai) % 10 < 5) {
                                                this.a(this.b[n4][n5] & 0xFF, n, n2);
                                            }
                                        }
                                    }
                                    if (this.ah >= 0 && this.ah < this.O && this.ai >= 0 && this.g[this.ai][this.ah] > 0) {
                                        this.i(this.g[this.ai][this.ah]);
                                        this.g[this.ai][this.ah] = 0;
                                    }
                                    if (by2 == 1) {
                                        this.b(12, n - 2, n2 - 4);
                                    } else if (by2 == 2) {
                                        a[this.c[1]].setColor(0);
                                        if (n5 == 0 || n5 == this.c - 1 || n4 == 0 || n4 == this.d - 1 || this.a(n5 - 1, n4) != 2 || this.a(n5 + 1, n4) != 2 || this.a(n5, n4 - 1) != 2 || this.a(n5, n4 + 1) != 2) {
                                            this.b(11, n - 3, n2 - 2);
                                        } else {
                                            f.a(a[this.c[1]], n, n2, 22, 16);
                                        }
                                    }
                                    if (this.ai == this.A && this.ah == this.y) {
                                        this.Z = by2;
                                    }
                                }
                                --this.ah;
                            }
                            if ((this.L || this.N) && this.q[1] - this.K == this.ai) {
                                this.d(105, (this.q[0] - this.I) * 22, n2, this.f);
                            }
                            n2 += 16;
                        }
                        ++this.ai;
                    }
                    this.r();
                    this.s();
                    if (this.ad != 0 || this.ae != 0) break block57;
                    if (this.N) break block58;
                    if (this.L) {
                        this.d(31, 218, 11, this.f);
                    }
                }
                return;
            }
            this.d(30, 218, 11, this.f);
        }
        catch (Exception exception) {}
    }

    private void v() {
        int n;
        int n2;
        int n3;
        for (n3 = 1; n3 <= 60; ++n3) {
            int n4 = 8871 + n3;
            this.e[n4] = (byte)(this.e[n4] & 0xFE);
            if (this.e[9176 + n3] <= 0) continue;
            this.e[9176 + n3] = 5;
        }
        n3 = 0;
        for (n2 = 0; n2 < 5; ++n2) {
            if (this.c[n3][n2][2] >= 0 && this.c[n3][n2][3] == 1 && this.c[n3][n2][0] >= this.I - 1 && this.c[n3][n2][0] <= this.I + this.O + 1 && this.c[n3][n2][1] >= this.K - 1 && this.c[n3][n2][1] <= this.K + this.P + 1) {
                for (n = 0; n < 9; ++n) {
                    if (this.a(this.c[n3][n2][0] + this.a[this.a[141] + 0 + n], this.c[n3][n2][1] + this.a[this.a[141] + 9 + n]) != 0) continue;
                    this.d(68, (this.c[n3][n2][0] - this.I + this.a[this.a[141] + 0 + n]) * 22, (this.c[n3][n2][1] - this.K + this.a[this.a[141] + 9 + n]) * 16, this.f);
                }
            }
            if (n2 != 4 || n3 != 0) continue;
            n2 = 0;
            n3 = 1;
        }
        for (n2 = 0; n2 < 30; ++n2) {
            n = this.b[0][2][n2];
            byte by = this.b[0][3][n2];
            if (this.b[0][1][n2] != 3 || this.b[0][0][n2] == 0 || n < this.I - 1 || n > this.I + this.O + 1 || by < this.K - 1 || by > this.K + this.P + 1 || this.a(n, (int)by) != 0) continue;
            this.d(68 + (1 - this.b[0][4][n2]) * 5, (n - this.I - 0) * 22, (by - this.K - 0) * 16, this.f);
        }
    }

    private void w() {
        int n;
        int n2;
        if (this.u) {
            this.Q = this.G - this.I <= this.y ? this.G - this.I : this.y;
            this.B = this.Q + this.I - 1;
            this.R = this.H - this.K <= this.A ? this.H - this.K : this.A;
            this.C = this.R + this.K - 1;
            this.Q *= 22;
            this.R *= 16;
            n2 = this.I + this.y - this.G;
            n = this.K + this.A - this.H;
            if (n2 < 0) {
                n2 *= -1;
            }
            this.D = n2 + 1;
            if (n < 0) {
                n *= -1;
            }
            this.E = n + 1;
            n2 = (n2 + 1) * 22;
            n = (n + 1) * 16;
            a[this.c[1]].setColor(0);
            f.b(a[this.c[1]], 11 + this.Q + 1, 8 + this.R + 1, n2, n);
            a[this.c[1]].setColor(1105252);
            f.b(a[this.c[1]], 11 + this.Q, 8 + this.R, n2, n);
        }
        if (f.b(n2 = this.c[this.K + this.A][this.I + this.y]) == 0) {
            n = (this.e[8383 + -n2] - this.I) * 22;
            int n3 = (this.e[8444 + -n2] - this.K) * 16;
            int n4 = this.a[this.a[138] + 104 + this.e[8749 + -n2]] * 22;
            int n5 = this.a[this.a[138] + 130 + this.e[8749 + -n2]] * 16;
            this.d(6, n, n3, this.e);
            this.d(7, n + n4, n3, this.e);
            this.d(8, n, n3 + n5, this.e);
            this.d(9, n + n4, n3 + n5, this.e);
        }
    }

    private void c(int n, int n2) {
        int n3;
        if (this.aa != 0) {
            this.d(34 + this.aa, (this.ab - this.I) * 22, (this.ac - this.K) * 16, this.e);
            if (this.e == 5) {
                this.aa = 0;
            }
        }
        byte by = this.c[this.K + this.A][this.I + this.y];
        if (this.w != 2) {
            int n4 = -1;
            n3 = 32;
            if (this.w == 1) {
                if (this.k != 0) {
                    n4 = 1;
                } else if (this.F != -1) {
                    n4 = 0;
                    for (int i = 0; i < 50; ++i) {
                        if (this.a[this.F][i] == 0) continue;
                        n4 = (byte)(n4 + 1);
                    }
                }
                n3 = this.Z == 0 && (f.b(by) == 1 || f.b(by) || f.a(by) == 1 && (this.e[7979 + by] & 2) == 0) ? 34 : 33;
            } else if (this.w == 3) {
                int n5;
                if (this.s == 100) {
                    this.r = true;
                    n5 = 105;
                } else if (this.s < 0 || this.s <= 3) {
                    if (f.a(by) == 0 && this.e[1414 + by] >= 12 || f.a(this.W) == 0 && this.e[1414 + this.W] >= 12) {
                        this.r = this.W;
                        this.t = this.e[0 + this.r];
                        this.u = this.e[101 + this.r];
                        this.r = true;
                        n5 = 33;
                    } else if (this.s == 3) {
                        this.r = true;
                        n5 = 33;
                    } else {
                        this.r = false;
                        n5 = 32;
                    }
                } else {
                    byte by2 = this.a[this.a[138] + 104 + this.s];
                    byte by3 = this.a[this.a[138] + 130 + this.s];
                    this.t = this.y - by2 / 2;
                    this.u = this.A - by3 / 2;
                    this.S = n - by2 / 2 * 22;
                    this.T = n2 - by3 / 2 * 16 - 5 + this.e;
                    this.a(1000 + this.s + 1, (byte)2);
                    this.r = this.a(this.s, this.I + this.t, this.K + this.u, true);
                    n5 = n3 = this.r ? 41 : 40;
                }
            }
            if (this.E && this.e < 2 && n3 <= 34) {
                n3 = (byte)(n3 + 5);
            }
            this.d(n3, n, n2, this.e);
            if (n4 > 0) {
                this.a.a(n + 22, n2 + 8, 0, "" + n4, 1);
                this.a.a(a[this.N]);
            }
            if (this.aC > 0) {
                this.a.a(n + 22, n2 + 8, 0, "" + this.aC, 1);
                this.a.a(a[this.N]);
            }
            if (this.w == 3) {
                if (this.s < 0) {
                    this.a(659 - this.s - 1, n + 11 + 5, n2 + 8 + 5);
                } else if (this.s <= 3) {
                    this.d(this.s + 48, n, n2, this.e);
                }
            }
        }
        n3 = 0;
        if (this.w == 1) {
            if (this.q && this.aa != 0) {
                n3 = 47;
                this.Z = 0;
            } else if (by == -124) {
                n3 = 44;
            } else if (by == -125) {
                n3 = 45;
            } else if (f.b(by) == 0 && this.e[8749 + -by] != 10) {
                n3 = 41;
            } else if (f.c(by)) {
                n3 = this.e[9833 + (by + 61) * -1] == 7 ? 46 : 43;
            } else if (f.b(by) && this.Z == 0) {
                n3 = 43;
            }
            if (n3 != 0 && this.Z != 2) {
                this.d(n3, n, n2, this.e);
            }
        }
    }

    private void a(byte by, int n, int n2) {
        this.aD = by;
        try {
            boolean bl = this.c();
            if (this.b[by]) {
                this.b[17] = true;
                this.ae = 0;
            } else if (bl) {
                this.ae = 1;
            } else if (this.a[this.a[195] + 80 + by] == 1) {
                this.ae = (byte)2;
            } else {
                return;
            }
            this.N = this.c[this.a[this.a[195] + 0 + by]];
            this.aE = this.a[this.a[195] + 60 + by];
            byte by2 = this.a[this.a[195] + 40 + by];
            boolean bl2 = false;
            for (int i = this.b[0][by2]; i < this.b[0][by2] + this.j[0][by2]; ++i) {
                int n3 = (this.j[3][i] & 0xFF) >> 6;
                int n4 = this.j[3][i] & 7;
                this.aI = this.b[1][i] & 0xFFF;
                if (n3 < this.ae && !bl2) {
                    if (n3 != 1) continue;
                    bl2 = true;
                    continue;
                }
                this.aF = 0;
                if (bl2) {
                    bl2 = false;
                    if (this.k[this.aE] == 0 && this.ae > 0 || this.k[this.aE] < 0) {
                        ++this.aE;
                        continue;
                    }
                    this.aF = this.d[this.aE];
                    this.k[this.aE] = 0;
                    ++this.aE;
                } else if (n3 == 1) {
                    bl2 = true;
                    if (this.k[this.aE] == 0 && this.ae > 0 || this.aI == 0 || n3 < this.ae || this.k[this.aE] < 0) {
                        continue;
                    }
                } else if (n3 == 2 && this.k[this.aE] < 0) continue;
                int n5 = (this.b[1][i] >> 14 & 3) << 7;
                int n6 = (this.b[1][i] >> 12 & 3) << 7;
                this.aJ = this.j[1][i];
                this.aK = this.j[2][i];
                if (by >= 13 && by <= 16) {
                    this.aJ += 120;
                    this.aK += 110;
                } else {
                    this.aJ += n;
                    this.aK += n2;
                }
                this.aJ += n5;
                this.aK += n6;
                if (i == 1011) {
                    this.aI = this.b[1][1007] & 0xFFF;
                    this.aF = this.d[3];
                    this.d(n4, 1007);
                    this.aI = 0;
                }
                if (i == 1010) {
                    this.a(i, this.ae, this.aK);
                    continue;
                }
                if (i == 1137) {
                    this.c(i, this.aJ, this.aK);
                    continue;
                }
                if (n4 == 0 && (this.j[3][i] & 0xFF) >> 6 == 3) {
                    a[this.N].setColor(0);
                    int n7 = 99;
                    if (i == 1030) {
                        n7 = this.e[6767 + this.l];
                    }
                    if (this.aF < 0) continue;
                    int n8 = this.j[23][this.aI] * this.aF / n7;
                    f.a(a[this.N], this.j[1][i] + n8 + 1, this.aK, this.j[23][this.aI] - n8 + n6, 4);
                    continue;
                }
                if (n4 == 3 && this.aI >= 3 && this.aI <= 4) {
                    if (this.v == -1) continue;
                    if (this.b[by] || this.v != this.w) {
                        this.a.b(this.aG, this.aH, this.j[23][this.b[1][i - 1] & 0xFFF] * 4, this.j[24][this.b[1][i - 1] & 0xFFF] * 4, this.v, (this.j[3][i] & 0xFF) >> 6, this.aI - 3);
                    }
                    if (this.w != this.v) {
                        this.w = this.v;
                        this.y = 0;
                    }
                    this.z = this.y;
                    this.a.a(a[this.N], this.y);
                    continue;
                }
                if (this.aI == 0) continue;
                this.d(n4, i);
            }
            this.a.a(a[this.N]);
            this.b[by] = false;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void d(int n, int n2) {
        if (n == 0) {
            this.b(this.aI, this.aJ, this.aK);
            this.aG = this.aJ;
            this.aH = this.aK;
            return;
        }
        if (n == 1) {
            this.j(n2);
            return;
        }
        if (n == 2) {
            if (this.Q && (this.aI == 4 || this.aI == 94) || this.R && (this.aI == 5 || this.aI == 95) || !this.T && this.aI == 1 || !this.U && this.aI == 2) {
                return;
            }
            if (n2 - 1 == 1201) {
                a[M].setColor(1105252);
                f.b(a[M], 11 + this.aJ + (this.I - this.W) * 5, 8 + this.aK + (this.K - this.X + this.aL) * 4, this.O * 5 - 1, this.P * 4 - 1);
                this.d(this.aI, this.aJ + (this.y + this.I - this.W) * 5 - 11, this.aK + (this.A + this.K - this.X + this.aL) * 4 - 8, this.f / this.k);
            } else {
                this.d(this.aI, this.aJ, this.aK, this.f / this.k);
            }
            this.S = true;
            return;
        }
        if (n == 3 && this.aI == 11) {
            f.a(a[M], a[this.c[1]], 0, 0, this.j[23][this.b[1][1181] & 0xFFF] * 4, this.j[24][this.b[1][1181] & 0xFFF] * 4, 11 + this.aJ, 8 + this.aK, 0);
            return;
        }
        if (n == 3 && this.aI == 10) {
            try {
                this.c(this.o);
                a[M].drawImage(this.a[2][0], (11 + this.aJ) * 1, (8 + this.aK) * 1, 3);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        if (n == 3 && this.aI <= 2) {
            this.k(n2);
            return;
        }
        if (n == 3 && this.aI <= 6) {
            if (n2 - 1 == 1128 && (this.u[0] == 3 || this.u[0] == 1)) {
                this.a.a(this.aJ, this.aK, (this.j[3][n2] & 0xFF) >> 6, 108 + this.e[6868 + this.k[2][0]], this.aF + (this.e[1515 + this.k[2][0]] == 0 ? 0 : 1), -1, this.aI - 5);
                return;
            }
            this.a.a(this.aJ, this.aK, (this.j[3][n2] & 0xFF) >> 6, this.aF, this.aI - 5);
            return;
        }
        if (n == 4) {
            if (this.aI != 1) {
                int n3 = this.aI;
                this.bc = 11 + this.aJ + (this.j[21][n3] & 0x7F);
                this.bd = 8 + this.aK + this.j[22][n3];
                this.be = this.j[23][n3];
                this.bf = this.j[24][n3];
                f.c(a[this.N], this.bc, this.bd, this.be, this.bf);
                return;
            }
            this.bc = 0;
            this.bd = 0;
            this.be = 528;
            this.bf = 704;
            f.c(a[this.N], this.bc, this.bd, this.be, this.bf);
        }
    }

    private void j(int n) {
        if (n - 1 == 1118) {
            int n2 = this.r[this.as];
            if (this.ad != 6) {
                n2 = n2 == 16 ? this.e[8749 + this.q] : n2 + -6 + 20;
            }
            byte by = this.a[this.a[138] + 468 + n2];
            int n3 = 0;
            for (int i = 0; i < 3; ++i) {
                if (this.a[this.a[138] + (10 + i) * 26 + n2] == 0) continue;
                int n4 = this.aK - this.a[this.a[283] + 2] * (by - 1) / 2 + (this.a[this.a[283] + 2] + 2) * n3;
                ++n3;
                this.a(627 + i, this.aJ - 10 + 3, n4);
                this.a.a(this.aJ + 19, n4, (this.j[3][n] & 0xFF) >> 6, String.valueOf(this.a[this.a[138] + (10 + i) * 26 + n2]), 0);
            }
            return;
        }
        if (n - 1 == 1107) {
            int n5 = this.r[this.as] + 12;
            int n6 = 0;
            for (int i = 0; i < 3; ++i) {
                if (this.a[this.a[138] + (10 + i) * 26 + n5] == 0) continue;
                int n7 = this.aJ - 34 * (this.a[this.a[138] + 468 + n5] - 1) / 2 + 30 * n6;
                ++n6;
                this.a(627 + i, n7 - 2 - 4, this.aK);
                this.a.a(n7 + 15, this.aK, (this.j[3][n] & 0xFF) >> 6, String.valueOf(this.a[this.a[138] + (10 + i) * 26 + n5]), 0);
            }
            this.d[8] = 0;
            if (this.e[8749 + this.q] == 6 && this.r[this.as] != 1) {
                this.d[8] = -20;
            }
            return;
        }
        switch (n - 1) {
            case 1073: {
                this.aF /= 21;
            }
        }
        this.a(this.aI + this.aF, this.aJ, this.aK);
    }

    private void k(int n) {
        switch (n - 1) {
            case 1043: 
            case 1047: 
            case 1051: 
            case 1059: 
            case 1063: {
                if (this.aF >= 0 && this.a[this.a[126] + this.aF] != -1) {
                    this.aF = this.e[this.b[this.a[this.a[126] + this.aF]] + this.l] + this.a[this.a[127] + this.aF];
                    break;
                }
                return;
            }
            case 1067: {
                if (this.aF != 0 && this.e[3535 + this.l] != 0 && this.e[3535 + this.l] != 15) break;
                return;
            }
            case 1055: {
                this.aF = (9 - this.aF) * 2 + 1;
            }
        }
        switch (n - 1) {
            case 1015: {
                this.a.a(this.aJ, this.aK, (this.j[3][n] & 0xFF) >> 6, String.valueOf(this.aF) + "/" + this.a[0][16], this.aI - 1);
                return;
            }
        }
        this.a.a(this.aJ, this.aK, (this.j[3][n] & 0xFF) >> 6, String.valueOf(this.aF), this.aI - 1);
    }

    private boolean c() {
        block8: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                block15: {
                                    block14: {
                                        block13: {
                                            block12: {
                                                block11: {
                                                    block10: {
                                                        block9: {
                                                            block7: {
                                                                this.G = false;
                                                                if (this.aD != 0) break block7;
                                                                for (int i = 0; i < 5; ++i) {
                                                                    if (this.a[0][this.a[this.a[146] + i]] == this.d[this.a[this.a[195] + 60 + 0] + i]) continue;
                                                                    this.G = true;
                                                                    this.d[this.a[this.a[195] + 60 + 0] + i] = this.a[0][this.a[this.a[146] + i]];
                                                                    this.k[this.a[this.a[195] + 60 + 0] + i] = 1;
                                                                }
                                                                break block8;
                                                            }
                                                            if (this.aD != 1 && this.aD != 9) break block9;
                                                            this.x();
                                                            break block8;
                                                        }
                                                        if (this.aD != 2 && this.aD != 5) break block10;
                                                        this.z();
                                                        break block8;
                                                    }
                                                    if (this.aD != 4) break block11;
                                                    this.y();
                                                    break block8;
                                                }
                                                if (this.aD != 6) break block12;
                                                this.A();
                                                break block8;
                                            }
                                            if (this.aD != 7 && this.aD != 8) break block13;
                                            if (this.d[46] == this.r[this.as] && !this.b[this.aD]) break block8;
                                            this.d[46] = this.r[this.as];
                                            this.G = true;
                                            if (this.r[this.as] < 10) {
                                                this.d[this.a[this.a[195] + 60 + this.aD]] = this.r[this.as];
                                                this.d[this.a[this.a[195] + 60 + this.aD] + 1] = this.a[this.a[138] + 338 + this.r[this.as] + 12];
                                                this.d[this.a[this.a[195] + 60 + this.aD] + 2] = this.a[this.a[138] + 364 + this.r[this.as] + 12];
                                            }
                                            break block8;
                                        }
                                        if (this.aD != 10) break block14;
                                        if (this.Q != 16 || this.z == this.y) break block8;
                                        this.k[53] = 1;
                                        break block8;
                                    }
                                    if (this.aD != 15) break block15;
                                    this.d[73] = (short)(98 + this.m);
                                    if (this.z == this.y) break block8;
                                    this.k[72] = 1;
                                    this.G = true;
                                    break block8;
                                }
                                if (this.aD != 12) break block16;
                                if (this.am >= 51 && this.q <= 2) {
                                    this.am = (byte)51;
                                }
                                short s = (short)(this.d[57] = (short)(this.a[0][17] == this.am ? 104 : (short)(108 + this.e[6868 + this.am])));
                                if (this.Q == 17 && this.al == 3 && (this.ai == 35 || this.ai == 50 || this.ai == 54)) {
                                    this.d[57] = 105;
                                }
                                this.d[58] = this.e[2727 + this.am];
                                if (this.z == this.y) break block8;
                                this.k[56] = 1;
                                this.G = true;
                                break block8;
                            }
                            if (this.aD != 13) break block17;
                            this.d[62] = (short)(82 + (this.q == 7 ? 21 : this.a[this.a[248] + this.q]));
                            this.d[63] = this.ak;
                            if (this.z == this.y) break block8;
                            this.k[61] = 1;
                            this.G = true;
                            break block8;
                        }
                        if (this.aD != 14) break block18;
                        this.T = this.W != 0;
                        this.U = this.W + ag < this.c;
                        this.Q = this.X == 0;
                        boolean bl = this.R = this.X + ah >= this.d;
                        if (this.d[66] != this.W || this.d[71] != this.X) {
                            this.d[66] = (short)this.W;
                            this.d[71] = (short)this.X;
                            this.D();
                        }
                        this.k[66] = 1;
                        this.ag = 0;
                        this.af = 0;
                        break block8;
                    }
                    if (this.aD != 17) break block19;
                    this.B();
                    break block8;
                }
                if (this.aD != 16) break block20;
                if (this.z == this.y) break block8;
                this.k[76] = 1;
                this.G = true;
                break block8;
            }
            if (this.aD == 18 || this.aD == 19) {
                for (int i = 0; i < this.a[this.a[307] + this.m]; ++i) {
                    this.k[this.a[this.a[195] + 60 + this.aD] + i] = i == this.Z ? (byte)1 : 0;
                }
            }
        }
        return this.G;
    }

    private void x() {
        int n;
        this.k[47] = this.ay;
        for (n = 0; n < 2; ++n) {
            this.k[48 + n] = this.F == 2 + n ? 2 : (this.a[2 + n][0] > 0 ? 1 : 0);
        }
        this.k[50] = (byte)(41 + this.u[0]);
        this.k[51] = this.a[this.a[304] + this.u[0]];
        for (n = this.a[this.a[195] + 60 + 9]; n < this.a[this.a[195] + 60 + 9] + 5; ++n) {
            if (this.k[n] == -1) continue;
            if (this.d[n] != this.k[n]) {
                this.d[n] = this.k[n];
                this.k[n] = 1;
                this.G = true;
                continue;
            }
            this.k[n] = 0;
        }
    }

    private void y() {
        for (int i = 0; i < 23; ++i) {
            if (this.e[this.b[this.a[this.a[147] + i]] + this.l] == this.d[this.a[this.a[195] + 60 + 4] + i]) continue;
            this.G = true;
            this.d[this.a[this.a[195] + 60 + 4] + i] = this.e[this.b[this.a[this.a[147] + i]] + this.l];
            this.k[this.a[this.a[195] + 60 + 4] + i] = 1;
        }
        if (this.k[11] == 1 || this.k[12] == 1) {
            this.k[12] = 1;
            this.k[11] = 1;
        }
        if (this.e[3636 + this.l] == 0) {
            this.d[29] = 0;
        }
        this.d[14] = (short)(108 + this.e[6868 + this.l]);
    }

    private void z() {
        if (this.d[4] > 0) {
            this.v = this.d[4];
            this.k[3] = -1;
            this.k[5] = -1;
            this.G = true;
            return;
        }
        if (this.d[5] != this.r[this.as] || this.b[this.aD]) {
            this.d[5] = this.r[this.as];
            this.k[3] = 1;
            this.k[5] = 1;
            this.d[3] = this.r[this.as] >= 10 ? (short)(21 + this.r[this.as] - 10) : (this.r[this.as] >= 0 ? (short)(12 + this.r[this.as]) : (this.K ? (short)41 : (this.F || !this.V ? (short)(108 + this.e[6868 + -this.r[this.as]]) : (short)29)));
            this.k[4] = -1;
            this.G = true;
        }
    }

    private void A() {
        if (this.d[36] != this.r[this.as] || this.b[this.aD]) {
            this.v = 0 + this.r[this.as];
            this.d[36] = this.r[this.as];
            this.k[34] = 1;
            this.k[38] = 1;
            this.k[36] = 1;
            this.k[37] = 1;
            this.k[35] = 1;
            this.G = true;
        }
        if (this.z != this.y) {
            this.k[38] = 1;
            this.G = true;
        }
        this.d[34] = (short)(0 + this.r[this.as]);
    }

    private void B() {
        if (this.v == 1) {
            this.k[this.a[this.a[195] + 60 + this.aD]] = this.w == 3 || this.Y == 4 || this.q > 0 && this.e[8749 + this.q] == 0 && this.r[this.as] >= 0 && this.r[this.as] <= 5 ? 2 : (this.w != 4 && this.w != 2 ? 1 : 0);
            this.k[this.a[this.a[195] + 60 + this.aD] + 1] = this.K ? 2 : (this.w == 1 || this.F != -1 || this.ad != 1 && this.ad != 9 ? 0 : 1);
        } else if (this.Q == 32) {
            this.k[this.a[this.a[195] + 60 + this.aD]] = 2;
            this.k[this.a[this.a[195] + 60 + this.aD] + 1] = 3;
        } else {
            this.k[this.a[this.a[195] + 60 + this.aD]] = this.a[this.a[153] + 116 + this.Q];
            this.k[this.a[this.a[195] + 60 + this.aD] + 1] = this.a[this.a[153] + 145 + this.Q];
        }
        for (int i = this.a[this.a[195] + 60 + 17]; i < this.a[this.a[195] + 60 + 17] + 2; ++i) {
            if (this.d[i] != this.k[i]) {
                this.d[i] = this.k[i];
                this.k[i] = 1;
                this.G = true;
                continue;
            }
            this.k[i] = 0;
        }
    }

    private void a(int n, byte by, int n2) {
        int n3 = 0;
        for (n3 = 0; n3 < this.aW; ++n3) {
            int n4;
            int n5;
            int n6;
            int n7;
            f f2;
            this.N = n;
            int n8 = aV * n3;
            int n9 = 1;
            if (this.aX + n3 == this.as) {
                n9 = 0;
            } else if (by == 2) continue;
            this.b(this.b[1][n] & 0xFFF, this.aY + n8, n2 - 1);
            this.a(548 + n9, this.aY + n8, n2);
            int n10 = this.r[this.aX + n3];
            if (n10 < 0) {
                this.a(-n10, this.aY + n8 - -1, n2 + 8 + 2 + 3, -8, (byte)29);
                if (!this.V || this.F || this.aX + n3 != this.as) continue;
                f2 = this;
                n7 = 18;
                n6 = this.aY + n8;
                n5 = n2;
                n4 = this.f;
            } else {
                if (n10 <= 8) {
                    this.a(659 + n10, this.aY + n8, n2);
                    int n11 = 0;
                    int n12 = 0;
                    if (this.e[8749 + this.q] == 6) {
                        n11 = -1;
                        n12 = 6;
                    }
                    this.a.a(this.aY + n8 + 19 + n11 + 6, n2 + 5 + n12 + 2, 1, String.valueOf(this.s[n3 + this.aX]), 0);
                    if (this.e[8749 + this.q] == 6 || this.aX + n3 >= this.av || this.aX + n3 != this.as) continue;
                    this.d(3, this.aY + n8 + 6, n2 + 2 + 2, this.f);
                    this.S = true;
                    continue;
                }
                f2 = this;
                n7 = n10;
                n6 = this.aY + n8;
                n5 = n2;
                n4 = this.aX + n3 == this.as ? this.f : 0;
            }
            f2.d(n7, n6, n5, n4);
        }
        if (this.T) {
            this.d(1, this.aY - 9, n2 + 8, this.e);
        }
        if (this.U) {
            this.d(2, this.aY + this.aZ - 9 + 9, n2 + 8, this.e);
        }
    }

    private void c(int n, int n2, int n3) {
        int n4 = this.a[this.a[283] + 2] + 6;
        int n5 = 0;
        this.ab = this.a[this.a[152] + this.Q + 1] - this.a[this.a[152] + this.Q];
        int n6 = n2 + this.j[23][this.b[1][n] & 0xFFF] / 2 * 4;
        int n7 = n3 - this.ab * n4 / 2 + n4 / 2;
        for (int i = 0; i < this.ab; ++i) {
            if (i == this.Z) {
                n5 = n7;
            }
            this.b(this.b[1][n] & 0xFFF, n2, n7);
            this.a.a(n6, n7, 1, 57 + this.a[this.a[151] + this.a[this.a[152] + this.Q] + i], 0);
            n7 += n4;
        }
        this.a.a(a[this.N]);
        this.d(2, n6 - 50 - 20, n5 + 4, this.e);
        this.d(1, n6 + 49 + 20, n5 + 4, this.e);
    }

    final void a(int n) {
        if ((af = (byte)(af + n)) > 98) {
            af = (byte)98;
        }
        this.n[3] = this.n[4] = af;
        this.n[2] = this.n[4];
        for (int i = 0; i < 5; ++i) {
            a[M].setColor(this.f[i]);
            f.a(a[M], 70 + this.l[i], 312 + this.m[i], this.n[i], this.o[i]);
        }
        if (!this.y) {
            this.a.a.a();
            Thread.yield();
            return;
        }
        this.l();
    }

    private void c(byte by) {
        byte by2 = 0;
        try {
            byte by3;
            System.gc();
            Thread.yield();
            DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream("/pi8"));
            for (by2 = 0; by2 < 12 && (by3 = (byte)(dataInputStream.readByte() & 0xFF)) != 255; by2 = (byte)(by2 + 1)) {
                short s = (short)(by3 << 8 | dataInputStream.readByte() & 0xFF);
                byte[] byArray = new byte[s];
                dataInputStream.read(byArray, 0, s);
                if (by2 != by) continue;
                this.a[2][0] = Image.createImage((byte[])byArray, (int)0, (int)s);
                break;
            }
            dataInputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void C() {
        this.aM = this.c > ag ? ag : this.c;
        this.aN = this.d > ah ? ah : this.d;
        this.N = 1;
        this.b(this.b[1][1181] & 0xFFF, -11, -8);
        int n = 0;
        int n2 = 0;
        boolean bl = false;
        for (int i = 0; i < this.aN; ++i) {
            int n3 = 0;
            int n4 = -1;
            for (int j = 0; j <= this.aM; ++j) {
                if (j == this.aM) {
                    bl = true;
                } else {
                    this.e(this.W + j, this.X + i);
                }
                if (!bl && this.aO == n4) {
                    ++n2;
                    continue;
                }
                if (n2 > 0) {
                    a[this.N].setColor(n4);
                    f.a(a[this.N], n3 * 5 - 11, (this.aL + n) * 4 - 8, n2 * 5, 4);
                    n2 = 0;
                }
                if (bl) {
                    bl = false;
                    continue;
                }
                n4 = this.aO;
                n3 = j;
                n = i;
                n2 = 1;
            }
        }
    }

    private void D() {
        block3: {
            int n;
            int n2;
            block2: {
                this.N = M;
                int n3 = (this.b[1][1181] >> 12 & 3) << 7;
                this.b(this.b[1][1181] & 0xFFF, 120 + this.j[1][1181] + 11, 160 + this.j[2][1181] + 8 + n3);
                f.a(a[M], a[this.c[1]], (this.af + 1) / 2 * 5, (this.ag + 1) / 2 * 4, this.j[23][this.b[1][1181] & 0xFFF] * 5 - 5 * this.a[this.a[148] + this.af + 1] - 44, this.j[24][this.b[1][1181] & 0xFFF] * 5 - 4 * this.a[this.a[148] + this.ag + 1] - 32, 131 + this.j[1][1181] + (-this.af + 1) / 2 * 5, 168 + this.j[2][1181] + (-this.ag + 1) / 2 * 4 + n3, 0);
                a[this.c[1]].drawImage(a[this.c[0]], -(120 + this.j[1][1181] + 11) * 1, -(160 + this.j[2][1181] + 8 + n3) * 1, 0);
                n2 = (this.af + 1 >> 1) * (this.aM - 1);
                n = (this.ag + 1 >> 1) * (this.aN - 1);
                this.N = 1;
                if (this.ag != 0) break block2;
                a[this.N].setColor(0xAA9944);
                f.a(a[this.N], n2 * 5 - 11, n - 8, 5, ah * 4);
                for (n = 0; n < this.aN; ++n) {
                    this.e(this.W + n2, this.X + n);
                    a[this.N].setColor(this.aO);
                    f.a(a[this.N], n2 * 5 - 11, (this.aL + n) * 4 - 8, 5, 4);
                }
                break block3;
            }
            if (this.af != 0) break block3;
            for (n2 = 0; n2 < this.aM; ++n2) {
                this.e(this.W + n2, this.X + n);
                a[this.N].setColor(this.aO);
                f.a(a[this.N], n2 * 5 - 11, (this.aL + n) * 4 - 8, 5, 4);
            }
        }
    }

    private void e(int n, int n2) {
        this.aO = -1;
        byte by = this.a(n, n2);
        if (by != 2) {
            if (this.c[n2][n] > 0) {
                this.aO = f.a(this.c[n2][n]) == 1 && (this.e[7979 + this.c[n2][n]] & 2) != 0 ? -1 : this.b[by][f.a(this.c[n2][n]) + 6];
            } else if (this.c[n2][n] < 0) {
                this.aO = this.b[by][f.b(this.c[n2][n]) + 9];
            }
            if (this.aO == -1) {
                this.aO = this.b[by][this.a[this.a[194] + (this.b[n2][n] & 0xFF)]];
                return;
            }
        } else {
            this.aO = 6049325;
        }
    }

    private void E() {
        this.W = this.I - ag / 2 + (this.O >> 1);
        int n = this.W < 0 ? 0 : (this.W = this.W + ag >= this.c ? this.c - ag : this.W);
        if (ah > this.d) {
            this.aL = ah - this.d >> 1;
            return;
        }
        this.X = this.K - ah / 2 + (this.P >> 1);
        this.X = this.X < 0 ? 0 : (this.X + ah >= this.d ? this.d - ah : this.X);
    }

    private void F() {
        if (this.c == -1 && this.a[this.a[153] + 0 + this.Q] == 1) {
            this.G();
        } else if (this.a[this.a[153] + 0 + this.Q] == 1) {
            this.H();
        } else if (this.Q == 23) {
            this.I();
        } else if (this.Q == 15) {
            this.J();
        } else if (this.Q == 17) {
            this.P();
        } else if (this.Q == 20) {
            this.K();
        } else if (this.Q == 18) {
            if (this.H) {
                this.H = false;
                this.b[13] = true;
                this.b[11] = true;
                this.a((byte)11, 0, 0);
                this.a((byte)17, 0, 320);
            }
            this.a((byte)13, 0, 0);
        } else if (this.Q == 19) {
            this.L();
        } else if (this.Q == 24) {
            if (this.H) {
                this.H = false;
                this.b[16] = true;
                this.b[11] = true;
                this.a((byte)11, 0, 0);
                this.a((byte)16, 0, 0);
                this.a((byte)17, 0, 320);
            }
        } else if (this.Q == 25) {
            this.M();
        } else if (this.Q == 27) {
            this.N();
        } else if (this.Q == 32 && this.H) {
            this.H = false;
            try {
                a[M].drawImage(Image.createImage((String)"/l3"), 11, 8, 20);
            }
            catch (Exception exception) {}
            this.b[17] = true;
            this.a((byte)17, 0, 320);
        }
        this.N = this.c[1];
    }

    private void G() {
        if (this.H) {
            this.H = false;
            this.N = this.c[1];
            a[this.N].setColor(9422847);
            f.a(a[this.N], 0, -8, this.a[this.N], this.b[this.N]);
            a[this.N].setColor(940839);
            f.a(a[this.N], 0, -8 + this.b[this.N] - 64, this.a[this.N], 64);
            this.S = 0;
            this.T = 248;
            this.a(1118, (byte)2);
            if (this.Q == this.U || this.Q == 3 || this.Q == 12 || this.Q == 13 || this.Q == 2 || this.Q == this.V || this.Q == 9 || this.Q == 14) {
                this.k[53] = -1;
                this.k[54] = 1;
            } else if (this.Q == 16 || this.Q == 21 || this.Q == 22) {
                this.k[53] = 1;
                this.k[54] = -1;
            }
            this.k[52] = -1;
        }
        this.N = M;
        a[this.N].drawImage(a[this.c[1]], 0, 328, 36);
        a[this.N].setColor(9422847);
        f.a(a[this.N], 0, 0, this.a[this.N], 80);
        for (int i = 0; i < 4; ++i) {
            if (this.a[0][i] > 240 || this.a[0][3] == -1000) {
                this.a[0][i] = -88 - this.a(65535, 60);
                this.a[1][i] = this.a(65535, 48);
                this.a[2][i] = this.a(255, 4);
            }
            int[] nArray = this.a[0];
            int n = i;
            int n2 = nArray[n] + (this.a[2][i] + 2 >> 1);
            nArray[n] = n2;
            int[] nArray2 = this.a[1];
            int n3 = i;
            int n4 = nArray2[n3] + (this.a(255, 5) == 0 ? this.a(255, 3) - 1 : 0);
            nArray2[n3] = n4;
            this.a(1667 + this.a[2][i], n2, n4);
        }
        if (this.Q == this.U || this.Q == 12 || this.Q == 13 || this.Q == 2 || this.Q == this.V || this.Q == 9 || this.Q == 14) {
            this.k[53] = -1;
            this.k[54] = 1;
        } else if (this.Q == 16 || this.Q == 21 || this.Q == 22) {
            this.k[53] = 1;
            this.k[54] = -1;
        }
        this.k[52] = -1;
        this.b[10] = true;
        this.a(1665, 120, 0);
        this.S = 0;
        this.T = 272;
        this.a(1118, (byte)1);
        this.a((byte)10, 25, 64);
        this.b[17] = true;
        this.a((byte)17, 0, 320);
    }

    private void H() {
        if (this.H) {
            this.H = false;
            this.O();
            if (this.Q == 10 || this.Q == 11 || this.Q == 12 || this.Q == 13) {
                this.k[53] = -1;
                this.k[54] = 1;
            } else if (this.Q == 16 || this.Q == 21 || this.Q == 22) {
                this.k[53] = 1;
                this.k[54] = -1;
            }
            this.k[52] = -1;
            this.b[10] = true;
        }
        this.a((byte)10, 25, 64);
        this.a((byte)17, 0, 320);
    }

    private void I() {
        if (this.H) {
            this.H = false;
            this.b[11] = true;
            this.v = 69;
            this.k[55] = 1;
            this.a((byte)11, 0, 0);
            this.k[55] = -1;
        }
    }

    private void J() {
        if (this.H) {
            this.H = false;
            this.b[15] = true;
            this.b[11] = true;
            this.a((byte)11, 0, 0);
            this.a((byte)17, 0, 320);
        }
        this.a((byte)15, 0, 0);
    }

    private void K() {
        if (this.H) {
            this.H = false;
            this.A = true;
            this.n();
            this.u();
            this.O();
            this.b[12] = true;
        }
        this.a((byte)12, 0, 0);
        this.a((byte)17, 0, 320);
    }

    private void L() {
        if (this.H) {
            this.H = false;
            this.b[11] = true;
            this.a((byte)11, 0, 0);
            this.b[14] = true;
            this.C();
        }
        this.a((byte)14, 120, 160);
        this.b[17] = true;
        this.a((byte)17, 0, 320);
    }

    private void M() {
        this.H = false;
        if (!this.I) {
            this.O();
            a[1].drawImage(a[0], 0, 0, 0);
        }
        this.b[2] = true;
        f.a(a[0], a[1], 0, 0, 264, 301, 0, 0, 0);
        this.a((byte)(18 + this.m), 0, 0);
        this.a((byte)2, 0, this.d[this.a[this.a[195] + 0 + 2]]);
        this.a((byte)17, 0, 320);
        this.I = true;
    }

    private void N() {
        if (this.ab) {
            this.ab = false;
            this.x = this.v;
            this.v = 61;
            this.b[11] = true;
            this.k[55] = 1;
            this.a((byte)11, 0, 0);
            this.k[55] = -1;
            this.a((byte)17, 0, 320);
        }
    }

    private void O() {
        this.c[8] = 0;
        this.c[9] = 0;
        f.a(a[this.c[0]], a[this.c[1]], 0, 0, 264, this.A, 0, this.bb - this.ax, 0);
        for (byte by = 0; by < 20; by = (byte)((byte)(by + 1))) {
            if (!this.a[by]) continue;
            this.b[by] = true;
            this.a(by, 0, this.d[this.a[this.a[195] + 0 + by]]);
            this.N = this.c[0];
            if (this.a[this.a[195] + 20 + by] == 1 && this.Q != 20) {
                this.a(524, 0, 0 + this.bb);
                continue;
            }
            if (this.a[this.a[195] + 20 + by] != 2) continue;
            this.a(528, 0, 320 - this.ba);
        }
        this.c[8] = 2;
        this.c[9] = 2;
    }

    private void P() {
        if (this.aP > 0 && !this.J) {
            this.aP += 4;
            a[M].setColor(0);
            f.a(a[M], 0, 0, 240, 16 + this.aP);
            f.a(a[M], 0, 336 - this.aP, 240, this.aP);
            this.c = true;
            if (this.aP - 4 > 160) {
                this.aP = -this.aP;
                this.c = false;
                this.i();
            } else {
                return;
            }
        }
        if (this.H && !this.J) {
            this.b[12] = true;
            a[M].setColor(0);
            f.a(a[M], 0, 0, 240, 112);
            f.a(a[M], 0, 240, 240, 96);
        }
        if (this.a[this.a[155] + 0 + this.aS] == 1) {
            if (this.aR >= 0) {
                if (this.aR < this.a[this.a[155] + 84 + this.aS] || this.am != 0) {
                    this.N = 0;
                    a[M].setColor(0);
                    f.a(a[M], 0, 112, 240, 128);
                    this.d(98 + this.a[this.a[155] + 28 + this.aS], 120, 176, this.am == 0 ? this.aR : this.f);
                    this.d(104, 120, 176, this.f);
                    this.aR = this.am == 0 ? this.aR + 1 : this.aR;
                } else if (this.am == 0 && this.aS != 0) {
                    this.aR = -1;
                    this.j = true;
                    return;
                }
            }
        } else if (this.a[this.a[155] + 0 + this.aS] >= 2 || this.a[this.a[155] + 0 + this.ao] >= 2) {
            this.Q();
            this.R();
        }
        this.H = false;
        if (this.aP < 0) {
            this.aP += 4;
            this.c = true;
            if (this.aP >= -48) {
                this.aP = 0;
                this.c = false;
                this.i();
            }
        }
        if (this.aP == 0 && this.al != 0) {
            this.a((byte)12, 0, 0);
            this.a((byte)17, 0, 320);
        }
    }

    private void Q() {
        if (this.aS > 0 && this.aR >= 0 && (this.aP == 0 || this.H)) {
            if (this.aR == 0 && this.a[this.a[155] + 28 + this.aS] > 0) {
                for (int i = 0; i < this.p.length; ++i) {
                    int n;
                    if (this.p[i] == 0) continue;
                    int n2 = n = i > 6 ? 6 : i;
                    if (this.a[this.a[196] + n * 33 + 0 + this.a[this.a[155] + 28 + this.aS] * 3] != 0) {
                        this.e[2929 + this.p[i]] = this.a[this.a[196] + n * 33 + 0 + this.a[this.a[155] + 28 + this.aS] * 3];
                        this.e[1313 + this.p[i]] = this.a[this.a[196] + n * 33 + 2 + this.a[this.a[155] + 28 + this.aS] * 3];
                        this.e[2828 + this.p[i]] = 105;
                    }
                    if (this.a[this.a[196] + n * 33 + 1 + this.a[this.a[155] + 28 + this.aS] * 3] != 0) {
                        this.e[606 + this.p[i]] = (byte)(-10 + this.a[this.a[196] + n * 33 + 1 + this.a[this.a[155] + 28 + this.aS] * 3]);
                        this.e[808 + this.p[i]] = 0;
                    }
                    this.e[3030 + this.p[i]] = 0;
                }
            }
            if (this.aR >= this.a[this.a[155] + 84 + this.aS]) {
                this.aR = -2;
                if (this.al == 0) {
                    this.j = true;
                    return;
                }
            }
            ++this.aR;
            if (this.aR > 0) {
                this.j();
            }
        }
    }

    private void R() {
        if (this.an != 0 || this.a[this.a[155] + 84 + this.ao] >= -1 || this.aR > 0) {
            if (this.H) {
                this.A = true;
                this.N = 1;
                this.n();
            }
            if (this.J) {
                if (this.H) {
                    this.H = false;
                    this.A = true;
                    this.n();
                    this.u();
                    this.O();
                    this.b[12] = true;
                    return;
                }
            } else if (this.aP == 0 || this.H) {
                this.aQ = 0;
                if (this.aS == 24) {
                    this.aQ = this.a(255, 8);
                }
                f.a(a[this.c[0]], a[this.c[1]], 0, 120, 264, 128 - this.aQ, 0, 120 + this.aQ, 0);
                if (this.aS == 24) {
                    a[M].setColor(0);
                    f.a(a[M], 0, 96, 240, 16);
                    f.a(a[M], 0, 240, 240, 16);
                }
                this.N = 0;
                this.bc = 0;
                this.bd = 120;
                this.be = 264;
                this.bf = 128;
                f.c(a[this.N], this.bc, this.bd, this.be, this.bf);
                this.u();
                this.bc = 0;
                this.bd = 0;
                this.be = 528;
                this.bf = 704;
                f.c(a[this.N], this.bc, this.bd, this.be, this.bf);
            }
        }
    }

    final void b(int n) {
        this.i();
        if (n >= 0) {
            this.ai = (byte)n;
            this.S();
            this.T();
        } else {
            if (this.ak == this.aj - 1) {
                this.U();
                return;
            }
            this.ak = (byte)(this.ak + 1);
        }
        this.o = 0;
        this.v = 71 + this.ak;
        this.o = (byte)(this.a[this.a[154] + this.q] + this.ak);
        this.aS = this.a[this.a[311] + 229 + this.aT + this.ak];
        this.aR = this.a[this.a[155] + 84 + this.aS] < 0 ? -1 : 0;
        this.al = this.a[this.a[311] + 0 + this.aT + this.ak];
        this.am = this.p[this.al];
        this.an = this.a[this.a[311] + 458 + this.aT + this.ak];
        if (this.an > 100) {
            this.f(this.an, -2);
        } else if (this.an == 99) {
            this.am = this.p[0];
            this.f(this.am, -2);
        } else if (this.an > 0) {
            this.f(this.p[this.an], -2);
        } else if (this.an == -100) {
            if (this.ai == 51) {
                this.I = (byte)8;
                this.K = (byte)67;
            }
            this.f(-100, -2);
        } else if (this.an < 0) {
            this.f(this.an, -3);
            if (this.ai == 36 || this.ai == 38) {
                this.I = (byte)(this.I + 4);
                this.K = (byte)(this.K - 1);
            }
        }
        this.H = true;
    }

    private void S() {
        this.aJ();
        this.t();
        this.ak = 0;
        this.Z = 0;
        this.a.a(this.ai);
        this.aT = this.a[this.a[310] + 0 + this.ai] & 0xFF;
        this.ao = this.a[this.a[311] + 229 + this.aT];
        if (this.ai == 4 || this.ao == 0) {
            this.ao = (byte)27;
            this.a[this.a[311] + 229 + this.aT] = 27;
        }
        this.aj = (byte)((this.a[this.a[310] + 0 + this.ai + 1] & 0xFF) - this.aT);
        this.J = this.ao >= 27;
        this.v = 0;
        this.R = this.Q;
        this.Q = (byte)17;
        this.aP = this.a[this.a[155] + 56 + this.ao];
        if (this.aP == 1) {
            this.O();
        }
        if (this.ao != 9 && !this.J && this.aP != 1) {
            this.K = (byte)(this.K - 1);
        }
        this.d = new boolean[]{this.a[0], this.a[1], this.a[2], this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]};
        this.a(true, true, false, false);
        this.s = true;
        byte by = this.a[this.a[310] + 71 + this.ai];
        System.arraycopy(this.a, this.a[156] + this.a[this.a[157] + by], this.p, 0, this.a[this.a[157] + by + 1] - this.a[this.a[157] + by]);
    }

    private void T() {
        if (this.ai == 3) {
            this.d(5, 20, 2);
            this.e[6161 + this.p[2]] = 3;
            this.e[2828 + this.p[2]] = 105;
            this.e[6262 + this.p[2]] = 5;
            this.e[6363 + this.p[2]] = 10;
            this.e[1313 + this.p[2]] = 3;
            this.e[5050 + this.p[2]] = -1;
            return;
        }
        if (this.ai == 37) {
            this.a.l();
            this.aw = 1;
            this.a.a(4, 46, 9, (byte)0, (byte)9);
            this.a((byte)0, (byte)48, (byte)9, (byte)3, (byte)0);
            this.e[2934] = 14;
            this.e[611] = 2;
            this.aw = (byte)2;
            this.a.a(1, 44, 9, (byte)1, (byte)2);
            this.a.a(1, 45, 11, (byte)1, (byte)2);
            this.e[658] = 7;
            this.a.a(1, 48, 11, (byte)1, (byte)2);
            this.e[659] = 5;
            this.a.a(2, 48, 9, (byte)1, (byte)2);
            this.a[0][17] = 0;
            return;
        }
        if (this.ai == 38) {
            this.a.l();
            this.a((byte)0, 2, 52, 18, 2, true, -1);
            this.a((byte)0, 2, 54, 16, 2, true, -1);
            this.a((byte)0, 2, 55, 19, 2, true, -1);
            this.a((byte)0, 2, 58, 19, 2, true, -1);
            this.aw = 0;
            this.a.a(5, 60, 12, (byte)0, (byte)0);
            this.aw = (byte)2;
            this.d(57, 17, 1);
            this.a.a();
            return;
        }
        if (this.ai == 43) {
            this.b(52, 7);
            return;
        }
        if (this.ai == 45) {
            this.a.m();
            this.b(57, 30);
            this.b(1, 54, 30, 5);
            this.b(1, 54, 31, 5);
            this.b(1, 55, 31, 5);
            this.b(1, 55, 32, 5);
            return;
        }
        if (this.ai == 48) {
            this.q = (byte)2;
            this.aM();
            this.a.f = (byte)6;
            this.aN();
            this.q = (byte)3;
            this.a((byte)0, 24, 18, 67, 2, true, -1);
            this.a((byte)0, 25, 19, 69, 2, true, -1);
            this.a((byte)0, 25, 21, 71, 2, true, -1);
            this.a[0][12] = 0;
            this.a((byte)0, (byte)26, (byte)69, (byte)60, (byte)0);
            this.a[0][17] = 1;
            this.a.a(7, 26, 69, (byte)0, (byte)2);
            this.d(23, 69, 1);
            this.a.a(2, 1, 69, (byte)1, (byte)3);
            this.a((byte)1, (byte)21, (byte)69, (byte)60, (byte)0);
            this.e[659] = 0;
            this.e[2982] = 42;
            this.f(53, -2);
            this.e[657] = 0;
        }
    }

    private void U() {
        int n;
        this.a.d();
        if (this.ai == 26) {
            this.s = false;
            this.c();
            this.s = true;
        }
        if (this.ao == 9) {
            this.a.f();
        } else if (this.ai == 28) {
            this.d(5, 11, 0);
            this.a.I = (byte)(this.a.I & 0xFE);
            this.a.d[this.a[this.a[292] + 4]] = 0;
        } else if (this.ai == 34) {
            this.d(48, 15, 5);
            this.a.I = 0;
        } else if (this.ai == 38) {
            this.d(65, 18, 1);
            this.u = 1;
        } else if (this.ai == 44) {
            for (n = 0; n < 10; ++n) {
                this.e[9601 + n] = this.am;
            }
            this.d(53, 5, 0);
            this.f(this.am, -2);
            this.a.a();
        } else if (this.ai == 48) {
            this.u = 1;
            this.d(45, 69, 6);
        }
        for (n = 0; n < this.p.length; ++n) {
            if (this.e[2828 + this.p[n]] == 105) {
                this.e[2828 + this.p[n]] = this.e[4646 + this.p[n]] < 0 ? 69 : 57;
            }
            this.p[n] = 0;
        }
        if (this.a.f >= 50) {
            this.a.F = this.ai == 15 ? 1000000 : this.c;
            this.a.f = (byte)(this.a.f - 49);
            this.a.g = this.a[this.a[294] + this.a.f - 1];
            this.a.J = 0;
        }
        if (this.ao != 9) {
            this.J = this.I;
            this.K = !this.J || this.d[3] ? (byte)(this.K + 1) : this.K;
            this.L = this.K;
        } else {
            this.I = this.J;
            this.K = this.L;
        }
        this.s = false;
        this.aK();
        this.J = this.I;
        this.L = this.K;
        if (this.ai == 0 || this.ai == 1 || this.ai == 2 && this.p != 0 || this.ai == 32 || this.ai == 36 || this.ai == 37 || this.ai == 39 || this.ai == 46 || this.ai == 47 || this.ai == 49 || this.ai == 55) {
            this.ai = (byte)(this.ai + 1);
            this.Q = (byte)28;
            this.b((int)this.ai);
            if (this.ai == 47) {
                this.Q = (byte)18;
                this.o = this.a[this.a[154] + 8];
            }
            return;
        }
        if (this.ai != 59) {
            this.v = 1;
        }
        this.A = true;
        this.a(this.d[0], this.d[1], this.d[2], this.d[3], this.d[4], this.d[5], this.d[6], this.d[7], this.d[8]);
        this.Q = this.R;
    }

    private void d(int n, int n2, int n3) {
        for (int i = 0; i < this.p.length; ++i) {
            if (i != n3 && i < 6) continue;
            this.e(n, n2, this.p[i]);
        }
    }

    private void e(int n, int n2, int n3) {
        this.e[2828 + n3] = 69;
        this.e[3131 + n3] = (byte)n;
        this.e[3232 + n3] = (byte)n2;
        this.e[6161 + n3] = 2;
        this.e[4747 + n3] = 0;
        int n4 = 7979 + n3;
        this.e[n4] = (byte)(this.e[n4] & 0xBF);
    }

    final void c() {
        this.c = this.e;
        this.d = this.f;
        this.q = (byte)(this.q + 1);
        this.aP();
        this.a.G = this.a[219] + this.q * 4;
    }

    final void a(byte by, byte by2, byte by3) {
        if (by < 18 && (this.l == 0 || this.Q == 17 || by != 18 && this.K || this.u > 0)) {
            return;
        }
        this.Z = 0;
        this.o = 0;
        this.i();
        this.ap = by;
        this.v = 0;
        this.Q = (byte)20;
        this.H = true;
        this.v = 12 + by;
        this.am = by2;
        this.an = by3;
        this.d = new boolean[]{this.a[0], this.a[1], this.a[2], this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]};
        this.a(this.a[0], true, false, this.a[4]);
        this.A = true;
        if (by == 4 || by == 5 || by == 14 || by == 15) {
            this.a[this.a[153] + 145 + 20] = 0;
            return;
        }
        this.a[this.a[153] + 145 + 20] = 2;
    }

    protected final void keyPressed(int n) {
        if (this.n) {
            return;
        }
        if (this.o) {
            return;
        }
        this.o = true;
        if (!f.a(n)) {
            return;
        }
        this.j = 0;
        if (n == a || n == -a || n == 42) {
            l = true;
            return;
        }
        if (n == b || n == -b || n == 35) {
            m = true;
            return;
        }
        switch (n) {
            case 42: {
                break;
            }
            case 35: {
                break;
            }
            case 48: {
                this.i = 0;
                break;
            }
            case 49: {
                this.i = 1;
                this.w = true;
                break;
            }
            case 51: {
                this.i = (byte)3;
                this.w = true;
                break;
            }
            case 55: {
                this.i = (byte)7;
                this.w = true;
                break;
            }
            case 57: {
                this.i = (byte)9;
                this.w = true;
            }
        }
        if (this.a && this.y) {
            this.m(n);
        }
        try {
            this.m = this.getGameAction(n);
        }
        catch (Exception exception) {
            this.m = 666;
        }
        if (this.m == 8 || n == 53) {
            this.i = true;
            this.t = true;
            ++this.n;
            if (!this.u) {
                this.E = 0;
                return;
            }
        } else {
            if (this.m == 1 || n == 50) {
                this.e = true;
                return;
            }
            if (this.m == 6 || n == 56) {
                this.f = true;
                return;
            }
            if (this.m == 2 || n == 52) {
                this.g = true;
                return;
            }
            if (this.m == 5 || n == 54) {
                this.h = true;
            }
        }
    }

    protected final void keyReleased(int n) {
        if (this.n) {
            return;
        }
        if (!f.a(n)) {
            return;
        }
        this.j = 0;
        switch (n) {
            case 42: {
                break;
            }
            case 35: {
                break;
            }
            case 48: {
                break;
            }
            case 49: {
                this.w = false;
                break;
            }
            case 51: {
                this.w = false;
                break;
            }
            case 55: {
                this.w = false;
                break;
            }
            case 57: {
                this.w = false;
            }
        }
        try {
            this.m = this.getGameAction(n);
        }
        catch (Exception exception) {
            this.m = 666;
        }
        if (n == 53 || this.m == 8) {
            this.t = false;
            if (this.E < 4) {
                this.v = true;
            }
        }
        if (this.o) {
            this.p = true;
            return;
        }
        if (n == 50 || this.m == 1) {
            this.e = false;
            return;
        }
        if (n == 56 || this.m == 6) {
            this.f = false;
            return;
        }
        if (n == 52 || this.m == 2) {
            this.g = false;
            return;
        }
        if (n == 54 || this.m == 5) {
            this.h = false;
        }
    }

    private static boolean a(int n) {
        return n != -10;
    }

    private void V() {
        this.W();
        if (this.u && this.i) {
            this.i = false;
            this.aF();
        } else if (this.t && this.w != 3) {
            this.i = false;
            this.aE();
        } else {
            this.F = 0;
        }
        if (this.I >= 4 && this.w == 1) {
            this.aG();
        } else if (this.I > 0 && this.I < 4 && !this.w) {
            this.aH();
        }
        if (this.v) {
            this.v = false;
            this.E = (byte)4;
            this.i = false;
            byte by = this.c[this.K + this.A][this.I + this.y];
            if (this.w == 1 && this.W >= 51 && this.W <= 100) {
                this.y = (byte)(this.e[0 + this.W] - this.I);
                this.A = (byte)(this.e[101 + this.W] - this.K);
                this.e(this.W);
            } else if (this.w == 1 && f.a(by) != 0) {
                this.e(by);
            } else if (this.w == 3) {
                this.X();
            } else if (f.a(by) == 0) {
                this.d(by);
            } else if (this.w == 0 && f.b(by) == 0) {
                this.f(-by);
            } else if (f.a(this.W) == 0) {
                this.d(this.W);
                this.y = (byte)(this.e[0 + this.W] - this.I);
                this.A = (byte)(this.e[101 + this.W] - this.K);
            }
            this.E = true;
            this.e = 0;
        }
        this.aL();
        if (this.af == 0 && this.ag == 0 && !this.C) {
            this.Y();
            this.ad = this.af * 11;
            this.ae = this.ag * 8;
        }
    }

    private void W() {
        if (l) {
            l = false;
            if (this.w != 3) {
                this.a(true, false, false, false, true, false, false, false, false);
                this.w = (byte)2;
                this.Z();
            }
        } else if (m) {
            m = false;
            if (this.w == 3) {
                this.s = 0;
                this.l(-1);
            } else {
                if (this.w == 1 || this.F != -1) {
                    this.k = true;
                    return;
                }
                this.v = 0;
                this.Q = (byte)(this.q < 7 ? (this.t > -1 ? 10 : 11) : (this.W ? 10 : 11));
                this.R = (byte)28;
                this.Z = 0;
                this.H = true;
                this.X = false;
                this.z = this.y;
                this.B = this.A;
                this.J = this.I;
                this.L = this.K;
                return;
            }
        }
        if (this.i == 1) {
            this.i = (byte)-1;
            if (this.ay == 1) {
                this.ay = 0;
                this.y = this.C;
                this.I = (byte)(this.k[0][0] - this.y);
                this.A = this.D;
                this.K = (byte)(this.k[1][0] - this.A);
                this.aK();
                this.A = true;
            }
            return;
        }
        if (this.i == 3) {
            this.i = (byte)-1;
            if (this.q == 3) {
                this.a((byte)20, (byte)1, (byte)0);
                return;
            }
            this.v = 0;
            this.Q = (byte)19;
            this.H = true;
            this.v = -1;
            this.R = true;
            this.Q = true;
            this.c = true;
            this.z = this.y;
            this.B = this.A;
            this.J = this.I;
            this.L = this.K;
            this.E();
            this.i();
            return;
        }
    }

    private void X() {
        if (this.r) {
            if (this.s == 100) {
                if (this.O) {
                    this.N = this.O;
                    this.M = false;
                    this.L = false;
                    this.a.b();
                } else if (this.M) {
                    this.L = this.M;
                    this.a.b();
                }
                this.q[0] = (byte)(this.I + this.y);
                this.q[1] = (byte)(this.K + this.A);
                this.l(-1);
                return;
            }
            if (this.s < 0) {
                this.e[3131 + this.r] = this.e[8383 + this.q];
                this.e[3232 + this.r] = this.e[8444 + this.q];
                this.e[2828 + this.r] = (byte)(44 + -this.s - 1);
                this.e[6161 + this.r] = 3;
                return;
            }
            if (this.s <= 3) {
                this.n = 0;
                while (this.n < 29 && this.b[0][0][this.n] != 0) {
                    this.n = (byte)(this.n + 1);
                }
                this.b[0][1][this.n] = (byte)this.s;
                if (this.b[0][1][this.n] == 3) {
                    this.b[0][0][this.n] = (byte)this.q;
                    this.b[0][2][this.n] = (byte)(this.I + this.y);
                    this.b[0][3][this.n] = (byte)(this.K + this.A);
                    this.l(-1);
                    return;
                }
                if (f.a(this.r) == 0) {
                    this.b[0][0][this.n] = (byte)this.q;
                    this.b[0][2][this.n] = (byte)this.r;
                    return;
                }
            } else if (this.b(this.I + this.t, this.K + this.u) && this.a((byte)0, this.s, this.I + this.t, this.K + this.u, 1, false, -1) > 0) {
                this.l(-1);
                this.w = (byte)2;
            }
        }
    }

    private void d(byte by) {
        if (this.n > 1) {
            this.n = 0;
            this.B = this.I - 1;
            this.C = this.K - 1;
            this.D = this.O;
            this.E = this.P;
            this.u = true;
            this.t = true;
            this.aF();
            this.a(true, true, false, false);
            this.l = 0;
            this.k = 0;
            return;
        }
        if (this.e[1919 + by] > 0) {
            this.a(false, true, false, true);
            this.w = 1;
            this.k = this.l = by;
            this.F = (byte)-1;
        }
    }

    private void e(byte by) {
        if (this.F != -1) {
            for (int i = 0; i < 50; ++i) {
                if (this.a[this.F][i] <= 0) continue;
                this.a(this.a[this.F][i], by);
            }
        } else {
            this.a(this.k, by);
        }
        this.n = 0;
    }

    private void a(byte by, byte by2) {
        if (!(this.e[505 + by] >= 10 || this.N || this.L && (this.e[7979 + by] & 0x40) != 0)) {
            this.a.a((byte)12, (int)by, 0);
            return;
        }
        if (f.b(by2) == 0 && this.e[8749 + -by2] == 6) {
            this.a(true, false, true, false);
            this.q = -by2;
            this.w = (byte)2;
            this.Z();
            return;
        }
        if (this.n > 1 || this.e[3131 + by] == this.y + this.I && this.e[3232 + by] == this.A + this.K) {
            this.q = true;
            if (this.e[7777 + by] == 0) {
                this.e[7777 + by] = 3;
                this.a.b((int)by);
                if (this.e[7777 + by] > 0) {
                    this.e[1111 + by] = (byte)((this.e[1111 + by] & 0xF0) + this.a[this.a[129 + (this.e[606 + by] & 1) * 2] + this.a[this.a[129 + (this.e[606 + by] & 1) * 2 + 1] + this.e[1010 + by] - 5] + (this.e[1111 + by] & 0xF)]);
                }
            }
        } else if (this.e[7777 + by] > 0) {
            this.e[1111 + by] = (byte)((this.e[1111 + by] & 0xF0) + this.a[this.a[133 + (this.e[606 + by] & 1) * 2] + this.a[this.a[133 + (this.e[606 + by] & 1) * 2 + 1] + this.e[1010 + by] - 5] + (this.e[1111 + by] & 0xF)]);
            this.e[7777 + by] = 0;
        }
        this.e[3131 + by] = (byte)(this.y + this.I);
        this.e[3232 + by] = (byte)(this.A + this.K);
        int n = 7979 + by;
        this.e[n] = (byte)(this.e[n] & 0xDF);
        this.e[6161 + by] = 2;
        this.e[4747 + by] = by2;
        this.ab = (byte)(this.y + this.I);
        this.ac = (byte)(this.A + this.K);
        this.aa = (f.a(by2) == 1 || f.b(by2) == 1 || f.b(by2)) && this.a(this.y + this.I, this.A + this.K) == 0 ? 2 : 1;
    }

    final void c(int n) {
        for (int i = (n - 1) / 50 * 30 + 1; i <= (n - 1) / 50 * 30 + 30; ++i) {
            if (this.e[8810 + i] == n && (this.e[8749 + i] != 2 || this.e[8627 + i] != 0)) {
                this.a(i, false);
                this.e[8810 + i] = 0;
                this.e[9298 + i] = 0;
                return;
            }
            if (this.e[8627 + i] != 2 && this.e[8627 + i] != 1 || this.e[9237 + i] != n) continue;
            this.e[9237 + i] = 0;
        }
    }

    final void a(int n, boolean bl) {
        byte by = this.e[8993 + n];
        while (by > 0) {
            if (!(this.e[4646 + by] == 0 && !bl || this.e[8749 + n] == 11 && this.e[8627 + n] == 0 && this.a[this.a[18] + this.e[6565 + by]] != 0 || this.e[2929 + by] == -108 || this.e[2929 + by] == this.a[this.a[173] + this.a[this.a[174] + this.e[8749 + n]] + this.e[4646 + by]] || this.e[2929 + by] == this.a[this.a[176] + this.a[this.a[177] + this.e[8749 + n]] + this.e[4646 + by]])) {
                this.a((int)by, n, false, false);
            }
            by = this.e[4545 + by];
        }
    }

    private void f(byte by) {
        if (this.e[8749 + by] == 3 && this.e[4444 + this.a[0][17]] != by) {
            this.as = 0;
            this.r[0] = 0;
            this.l(4);
            return;
        }
        this.a(true, false, true, false);
        this.q = by;
        this.w = (byte)2;
        this.k = 0;
        this.Z();
    }

    private void Y() {
        if (this.B) {
            return;
        }
        if (this.g) {
            if (this.y > this.C) {
                this.y = (byte)(this.y - 1);
                return;
            }
            if (this.I > 0) {
                this.I = (byte)(this.I - 1);
                this.af = -1;
                return;
            }
            if (this.y > 0) {
                this.y = (byte)(this.y - 1);
                return;
            }
        } else if (this.h) {
            if (this.y < this.C) {
                this.y = (byte)(this.y + 1);
                return;
            }
            if (this.I < this.c - this.O) {
                this.I = (byte)(this.I + 1);
                this.af = 1;
                return;
            }
            if (this.I + this.y < this.c - 1 - 0) {
                this.y = (byte)(this.y + 1);
                return;
            }
        } else if (this.e) {
            if (this.A > this.D) {
                this.A = (byte)(this.A - 1);
                return;
            }
            if (this.K > 0 && !this.a[4] || this.K > 1 && this.a[4]) {
                this.K = (byte)(this.K - 1);
                this.ag = -1;
                return;
            }
            if (this.A > 0) {
                this.A = (byte)(this.A - 1);
                return;
            }
        } else if (this.f) {
            if (this.A < this.D) {
                this.A = (byte)(this.A + 1);
                return;
            }
            if (this.K < this.d - this.P - 1 - (this.ba >> 5)) {
                this.K = (byte)(this.K + 1);
                this.ag = 1;
                return;
            }
            if (this.K + this.A < this.d - 2 - 0 - (this.ba >> 5)) {
                this.A = (byte)(this.A + 1);
            }
        }
    }

    private void Z() {
        try {
            int n;
            if (!(this.a[2] || this.a[5] || this.a[6])) {
                return;
            }
            this.ar = 0;
            for (n = 0; n < this.r.length; n = (int)((byte)(n + 1))) {
                this.r[n] = 0;
            }
            this.at = (byte)99;
            if (this.a[2]) {
                this.aa();
                this.ab();
                this.ac();
            } else if (this.a[5]) {
                this.ad();
            } else if (this.a[6]) {
                n = this.q > 1 ? 11 : (this.ai < 18 ? 3 : 6);
                for (int n2 = 0; n2 < n; n2 = (int)((byte)(n2 + 1))) {
                    this.r[n2] = this.a[this.a[137] + n2];
                    this.ar = (byte)(this.ar + 1);
                }
            } else {
                this.ah();
                return;
            }
            if (this.P) {
                while (this.aX + this.aW > this.ar && this.as != 0) {
                    if (this.aX > 0) {
                        --this.aX;
                    }
                    this.as = (byte)(this.as - 1);
                }
            } else {
                this.as = 0;
                this.aX = 0;
                this.l = 0;
            }
            this.b[this.ad] = true;
            this.aW = aU;
            if (this.ar < this.aW) {
                this.aW = this.ar;
            }
            this.aZ = aV * this.aW;
            this.aY = (240 - this.aZ + 9) / 2;
            this.ai();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void aa() {
        if (this.e[8749 + this.q] == 0) {
            this.au = 0;
            while (this.a[0][this.au][11] != this.q) {
                this.au = (byte)(this.au + 1);
            }
            this.av = (byte)-1;
            int n = this.e[9115 + this.q] - 1;
            for (byte by = this.a[this.a[144] + n]; by < this.a[this.a[144] + n + 1]; by = (byte)(by + 1)) {
                if (0 + this.a[this.a[143] + by] >= 6 && this.av == -1) {
                    this.av = (byte)(by - this.a[this.a[144] + n]);
                }
                this.r[this.ar] = this.a[this.a[143] + by];
                this.s[by - this.a[this.a[144] + n]] = this.a[0][this.au][this.a[this.a[143] + by]];
                this.ar = (byte)(this.ar + 1);
            }
            this.at = (byte)9;
            return;
        }
        if (this.e[8749 + this.q] == 6) {
            int n;
            if (this.k > 0) {
                if (this.e[3636 + this.k] > 0) {
                    this.r[this.ar] = 29;
                    this.ar = (byte)(this.ar + 1);
                }
            } else if (this.F != -1) {
                n = 0;
                while (this.a[this.F][n] != 0) {
                    if (this.e[3636 + this.a[this.F][n]] > 0) {
                        this.r[this.ar] = 29;
                        this.ar = (byte)(this.ar + 1);
                        break;
                    }
                    n = (byte)(n + 1);
                }
            }
            this.a[0][6] = (short)(this.a[0][3] / 5);
            if (this.a[0][6] > this.at) {
                this.a[0][6] = this.at;
            }
            for (n = 0; n < 6; n = (int)((byte)(n + 1))) {
                if (this.a[0][5 + n] <= 0) continue;
                this.r[this.ar] = n;
                this.s[this.ar] = (byte)this.a[0][5 + n];
                this.ar = (byte)(this.ar + 1);
            }
            return;
        }
        if (this.e[8749 + this.q] == 8) {
            for (int n = 0; n < this.e[9115 + this.q] * 2; n = (int)((byte)(n + 1))) {
                this.r[this.ar] = (byte)(19 + n);
                this.ar = (byte)(this.ar + 1);
            }
        }
    }

    private void ab() {
        int n;
        for (n = 0; n < 8; n = (int)((byte)(n + 1))) {
            this.j[n] = 0;
        }
        n = 0;
        int n2 = 0;
        if (this.e[8810 + this.q] > 0 && (this.e[8749 + this.q] != 2 || this.e[8627 + this.q] != 0)) {
            this.j[0] = this.e[8810 + this.q];
            ++n2;
            n = 1;
        }
        byte by = this.e[8993 + this.q];
        while (by > 0) {
            if (this.e[1313 + by] > 0 && (this.e[8810 + this.q] != by || this.e[8749 + this.q] == 2 && this.e[8627 + this.q] == 0)) {
                this.j[n + this.e[4646 + by]] = by;
                ++n2;
            }
            by = this.e[4545 + by];
        }
        by = 0;
        for (int n3 = 0; n3 < n2; n3 = (int)((byte)(n3 + 1))) {
            while (this.j[by] == 0) {
                by = (byte)(by + 1);
            }
            this.r[this.ar] = -this.j[by];
            this.ar = (byte)(this.ar + 1);
            by = (byte)(by + 1);
        }
    }

    private void ac() {
        if (this.e[8627 + this.q] == 2) {
            this.r[this.ar] = 28;
            this.ar = (byte)(this.ar + 1);
        } else if (this.e[8627 + this.q] != 1 && this.e[8749 + this.q] < 12 && this.e[9115 + this.q] < this.f[this.e[8749 + this.q]]) {
            this.r[this.ar] = 16;
            this.ar = (byte)(this.ar + 1);
        }
        if (this.e[8627 + this.q] == 1) {
            this.r[this.ar] = 27;
            this.ar = (byte)(this.ar + 1);
        } else if (this.e[8505 + this.q] < this.e[8566 + this.q] && this.e[8749 + this.q] < 12) {
            this.r[this.ar] = 26;
            this.ar = (byte)(this.ar + 1);
        }
        this.r[this.ar] = 17;
        this.ar = (byte)(this.ar + 1);
    }

    private void ad() {
        if (!this.F) {
            if (this.q != 3) {
                this.r[this.ar] = 10;
                this.ar = (byte)(this.ar + 1);
            }
            this.r[this.ar] = this.N ? 15 : 12;
            this.ar = (byte)(this.ar + 1);
            if (!this.N) {
                this.r[this.ar] = this.L ? 14 : 11;
                this.ar = (byte)(this.ar + 1);
            }
            this.r[this.ar] = 13;
            this.ar = (byte)(this.ar + 1);
            this.r[this.ar] = (byte)(this.aq + 23);
            this.ar = (byte)(this.ar + 1);
            return;
        }
        this.aq = 1;
        while (this.aq <= 50) {
            if (this.e[1919 + this.aq] > 0 && this.e[1414 + this.aq] >= 12) {
                this.r[this.ar] = (byte)(-this.aq);
                this.ar = (byte)(this.ar + 1);
            }
            ++this.aq;
        }
        if (!this.K) {
            this.aq = 1;
            while (this.aq <= 50) {
                if (this.e[1919 + this.aq] > 0 && this.e[1414 + this.aq] < 12) {
                    this.r[this.ar] = (byte)(-this.aq);
                    this.ar = (byte)(this.ar + 1);
                }
                ++this.aq;
            }
        }
        this.a(false, false, false, true, true, false, false, false, false);
    }

    private void ae() {
        if (this.n > 1) {
            this.n = 0;
            return;
        }
        if (this.g && this.j != 1) {
            if (this.as >= 0) {
                if (this.as > 0) {
                    this.as = (byte)(this.as - 1);
                }
                if (this.as < this.aX) {
                    --this.aX;
                }
                this.V = false;
                this.ai();
                return;
            }
        } else if (this.h && this.j != 1) {
            if (this.as < this.ar - 1) {
                if (this.as >= this.aW - 1 && this.as - this.aX == this.aW - 1) {
                    ++this.aX;
                }
                this.as = (byte)(this.as + 1);
                this.V = false;
                this.ai();
                return;
            }
        } else if (this.e && this.S) {
            if (this.a[6]) {
                if (!this.Q) {
                    --this.y;
                    return;
                }
            } else if (this.s[this.as] < this.at) {
                byte by = this.as;
                this.s[by] = (byte)(this.s[by] + 1);
                this.a[0][this.au][this.r[this.as]] = this.s[this.as];
                return;
            }
        } else if (this.f && this.S) {
            if (this.a[6]) {
                if (!this.R) {
                    ++this.y;
                    return;
                }
            } else if (this.s[this.as] > 0) {
                byte by = this.as;
                this.s[by] = (byte)(this.s[by] - 1);
                this.a[0][this.au][this.r[this.as]] = this.s[this.as];
                return;
            }
        } else {
            if (this.i || l) {
                this.i = false;
                l = false;
                this.v = false;
                this.E = (byte)4;
                if (this.w == 4 && this.Y == 3) {
                    this.l(-2);
                    return;
                }
                if (this.Y == 4) {
                    return;
                }
                this.af();
                return;
            }
            if (m) {
                m = false;
                this.ah();
                return;
            }
        }
    }

    private void af() {
        if (this.r[this.as] == 13) {
            this.aj();
            return;
        }
        if (this.r[this.as] < 0) {
            if (this.F) {
                if (this.k == this.l) {
                    if (this.c[this.e[101 + this.k]][this.e[0 + this.k]] != this.k) {
                        this.a((int)this.k, (int)this.e[4444 + this.k], true, true);
                    }
                    if (this.K) {
                        this.a[0][17] = this.k;
                        this.K = false;
                        this.a.b((int)this.k);
                    }
                    this.d(this.k);
                    this.F = false;
                }
                this.k = this.l;
            } else if (this.V) {
                this.a((int)this.l, this.q, true, true);
                this.V = false;
            } else {
                this.V = true;
                this.P = true;
            }
            this.f(this.e[4646 + this.l] < 0 || this.e[2828 + this.l] == 92 || this.e[2828 + this.l] == 106 ? this.l : -this.e[4444 + this.l], 0);
            return;
        }
        if (this.a[6]) {
            this.aJ();
            this.l(0);
            this.s = this.a[this.a[138] + 416 + this.r[this.as]];
            return;
        }
        if (this.r[this.as] == 17) {
            this.l(3);
            return;
        }
        if (this.r[this.as] == 16 || this.r[this.as] == 26) {
            this.b(this.q, this.r[this.as] == 16);
            this.a(true, true, false, false);
            this.w = 0;
            return;
        }
        if (this.r[this.as] == 27) {
            this.e[8566 + this.q] = this.a[this.a[138] + (7 + this.e[9115 + this.q] - 1) * 26 + this.e[8749 + this.q]];
            if (this.e[8505 + this.q] > this.e[8566 + this.q]) {
                this.e[8505 + this.q] = this.e[8566 + this.q];
            }
            if (this.e[8505 + this.q] > this.a[this.a[138] + (7 + this.e[9115 + this.q] - 1) * 26 + this.e[8749 + this.q]]) {
                this.e[8505 + this.q] = this.a[this.a[138] + (7 + this.e[9115 + this.q] - 1) * 26 + this.e[8749 + this.q]];
            }
            int n = 9054 + this.q;
            this.e[n] = (byte)(this.e[n] | 1);
            this.P = true;
            return;
        }
        if (this.r[this.as] == 28) {
            int n = 9054 + this.q;
            this.e[n] = (byte)(this.e[n] | 1);
            this.P = true;
            return;
        }
        if (this.r[this.as] == 10) {
            this.a(true, false, false, false, false, true, false, false, false);
            this.P = true;
            return;
        }
        if (this.r[this.as] == 11) {
            this.M = true;
            this.l(2);
            this.s = 100;
            this.aJ();
            return;
        }
        if (this.r[this.as] == 14) {
            this.L = false;
            this.M = false;
            this.a.c();
            this.P = true;
            return;
        }
        if (this.r[this.as] == 12) {
            this.O = true;
            this.l(2);
            this.s = 100;
            this.aJ();
            return;
        }
        if (this.r[this.as] == 15) {
            this.N = false;
            this.O = false;
            this.a.c();
            this.P = true;
            return;
        }
        if (this.r[this.as] >= 23 && this.r[this.as] <= 25) {
            this.aq = (byte)(this.aq + 1);
            if (this.aq > 2) {
                this.aq = 0;
            }
            this.P = true;
            return;
        }
        if (this.r[this.as] >= 6 && this.r[this.as] <= 8) {
            this.l(2);
            this.s = 20 + this.r[this.as] - 6;
            return;
        }
        if (this.r[this.as] < 6 || this.r[this.as] == 29) {
            this.ag();
            return;
        }
        if (this.r[this.as] >= 19 && this.w != 3) {
            this.l(this.r[this.as] == 22 ? 2 : 1);
            this.s = (byte)(this.r[this.as] - 19);
        }
    }

    private void ag() {
        if (this.e[8749 + this.q] == 6) {
            int n = 3;
            if (this.r[this.as] == 29) {
                n = 2;
            }
            if (this.k > 0) {
                this.e[3131 + this.k] = (byte)(this.y + this.I);
                this.e[3232 + this.k] = (byte)(this.A + this.K);
                this.e[2828 + this.k] = (byte)(44 + this.r[this.as]);
                this.e[6161 + this.k] = n;
                this.a(false, true, false, true);
                this.w = 1;
            } else if (this.F != -1) {
                int n2 = 0;
                while (this.a[this.F][n2] > 0) {
                    this.e[3131 + this.a[this.F][n2]] = (byte)(this.y + this.I);
                    this.e[3232 + this.a[this.F][n2]] = (byte)(this.A + this.K);
                    this.e[2828 + this.a[this.F][n2]] = (byte)(44 + this.r[this.as]);
                    this.e[6161 + this.a[this.F][n2]] = n;
                    ++n2;
                }
                this.a(true, true, false, false);
                this.w = 1;
            } else {
                this.l(1);
                this.s = -this.r[this.as] - 1;
            }
            this.l = this.k;
        }
    }

    private void ah() {
        if (this.K) {
            return;
        }
        this.P = false;
        if (this.w == 4) {
            this.l(-1);
            return;
        }
        if (this.k != 0) {
            this.w = 1;
            this.l = this.k;
            this.a(false, true, false, true);
        } else if (this.F != -1) {
            this.w = 1;
            this.a(true, true, false, false);
        } else {
            this.w = 0;
            this.a(true, true, false, false);
        }
        this.q = 0;
        this.F = false;
        this.i();
        this.V = false;
    }

    private void ai() {
        this.b[2] = true;
        if (this.ad == 6) {
            this.T = this.as > 0;
            this.U = this.as < this.ar - 1;
        } else {
            this.T = this.aX > 0;
            boolean bl = this.U = this.aX + this.aW < this.ar;
        }
        if (this.r[this.as] < 0) {
            this.l = -this.r[this.as];
            this.a(false, false, this.a[2], true, this.a[5], false, false, false, false);
        } else if (this.a[4]) {
            this.l = 0;
            this.a(true, false, true, false);
        }
        this.a[8] = false;
        this.a[7] = false;
        if (this.ad == 6 || this.r[this.as] >= 6 && this.r[this.as] <= 8 || this.r[this.as] == 16) {
            this.b[8] = true;
            this.a[8] = true;
            return;
        }
        if (this.r[this.as] >= 0 && this.r[this.as] < 6) {
            this.b[7] = true;
            this.a[7] = true;
        }
    }

    private void aj() {
        this.F = true;
        this.as = 0;
        this.aX = 0;
        this.k = 0;
        while (this.e[1919 + this.l] <= 0) {
            this.l = (byte)(this.l + 1);
        }
        this.P = true;
    }

    private void l(int n) {
        this.Y = n;
        if (this.Y > -1) {
            this.d[4] = (short)(33 + this.Y);
            this.k[4] = 1;
            this.x = this.w;
            this.c = new boolean[]{this.a[0], this.a[1], this.a[2], this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]};
            if (this.Y <= 5) {
                this.a(true, false, true, false);
            } else {
                this.a(this.a[0], false, true, this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]);
            }
            this.w = (byte)(this.Y >= 3 ? 4 : 3);
            this.b[2] = true;
        } else if (this.Y == -2) {
            this.c(this.q, true);
            this.d[4] = 0;
        } else {
            this.w = this.x;
            this.a(this.c[0], this.c[1], this.c[2], this.c[3], this.c[4], this.c[5], this.c[6], this.c[7], this.c[8]);
            this.d[4] = 0;
            if (this.s == 100) {
                this.ah();
            } else {
                this.P = true;
            }
            this.M = false;
            this.O = false;
        }
        this.s = 0;
    }

    final void d(int n) {
        if (this.w == 2 && n == this.q) {
            this.P = true;
        }
    }

    final void b(int n, boolean bl) {
        this.a.b((byte)n);
        byte by = this.e[8993 + n];
        while (by > 0) {
            this.a((int)by, n, false, false);
            by = this.e[4545 + by];
        }
        int n2 = this.e[8627 + n] = bl ? 1 : 2;
        if (bl) {
            this.e[8566 + n] = this.a[this.a[138] + (7 + this.e[9115 + n]) * 26 + this.e[8749 + n]];
        }
    }

    private void ak() {
        try {
            this.al();
            if (this.Q == 22 || this.Q == 23) {
                this.am();
            } else if (m) {
                m = false;
                this.an();
            } else if ((this.i || l || this.j) && this.aR <= 0 && this.aP == 0 && (this.Q < 28 || this.Q == 32)) {
                this.j = false;
                this.i = false;
                l = false;
                this.v = false;
                this.E = (byte)4;
                if (this.Q == 32) {
                    return;
                }
                this.ao();
            } else if (this.e) {
                this.aB();
            } else if (this.f) {
                this.aC();
            }
            this.aD();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void al() {
        if (this.Q == 27 && (this.i || l)) {
            this.i = false;
            l = false;
            this.v = false;
            this.E = (byte)4;
            this.i();
            this.Q = this.R;
            this.R = this.S;
            this.H = true;
            this.v = this.x;
            if (this.e > 0) {
                this.aQ();
            }
        }
    }

    private void am() {
        this.Q = this.R;
        this.H = true;
        if (this.T == 0) {
            this.g(this.q);
            if (this.Q == 18) {
                this.a(true, true, false, false);
                this.m = 0;
                this.Q = (byte)28;
                this.b((int)this.a[this.a[303] + this.q]);
                this.Q = (byte)18;
            }
            return;
        }
        if (this.T == 1) {
            if (this.u > 0 && this.u < 41) {
                this.t = (byte)(this.t + 1);
            }
            if (!this.e(this.q < 7 ? 1 : 2)) {
                if (this.q < 7) {
                    this.t = (byte)-1;
                } else {
                    this.W = false;
                }
                this.v = 66;
            } else {
                this.v = 67;
                this.e(0);
            }
            this.R = (byte)(this.q < 7 ? (this.t > -1 ? 10 : 11) : (this.W ? 10 : 11));
            this.A = true;
            this.v = 1;
            this.n();
            this.u();
            this.v = 0;
            return;
        }
        if (this.T == 2 && !this.d(this.q < 7 ? 1 : 2)) {
            this.R = this.Q;
            this.T = 0;
            this.Q = (byte)23;
        }
    }

    private void an() {
        if (this.Q == 32) {
            this.Q = this.U;
            this.H = true;
            return;
        }
        if (this.a[this.a[153] + 29 + this.Q] == 1) {
            if (this.Q == 25) {
                this.l(-1);
                this.P = false;
                this.I = false;
            }
            this.Q = (byte)28;
        } else if (this.Q == this.U) {
            this.R = this.Q;
            this.Q = (byte)30;
        } else if (this.Q == 20) {
            if (this.a[this.a[153] + 145 + 20] == 0) {
                this.z = this.y;
                this.B = this.A;
                this.J = this.I;
                this.L = this.K;
                this.Q = (byte)28;
                this.a(this.d[0], this.d[1], this.d[2], this.d[3], this.d[4], this.d[5], this.d[6], this.d[7], this.d[8]);
            }
        } else if (this.Q == 16 && this.v == 60) {
            this.T = 0;
            this.Q = (byte)22;
            this.v = 69;
            this.R = (byte)18;
        } else if (this.Q == 2) {
            this.Q = this.U;
            this.Z = 0;
        } else if (this.Q == this.V || this.Q == 9) {
            this.Q = (byte)13;
            this.Z = 1;
        } else if (this.Q == 14) {
            this.b();
        } else if (this.a[this.a[153] + 58 + this.Q] == 1) {
            if (this.Q == 12) {
                this.e(0);
            }
            this.Q = this.R;
            this.R = this.S;
            this.Z = this.aa;
            this.m = 0;
            this.ac = true;
        } else if (this.a[this.a[153] + 58 + this.Q] > 1) {
            this.Q = this.a[this.a[153] + 58 + this.Q];
            this.R = this.S;
            this.Z = this.aa;
            this.m = 0;
        }
        this.H = true;
    }

    private void ao() {
        byte by = this.a[this.a[151] + this.a[this.a[152] + this.Q] + this.Z];
        if (this.af) {
            this.V = (byte)8;
            this.r = (byte)4;
        }
        if (this.a[this.a[153] + 87 + this.Q] == 1) {
            this.Q = this.R;
        } else if (this.Q == 19) {
            this.z = this.y;
            this.B = this.A;
            this.J = this.I;
            this.L = this.K;
            this.Q = (byte)28;
        } else if (this.Q == 20) {
            this.ap();
        } else if (this.Q == 18 || this.Q == 17) {
            this.b(-1);
        } else if (this.Q == 15) {
            this.aq();
        } else if (this.Q == 16) {
            this.ar();
        } else if (this.Q == 12) {
            this.as();
        } else if (this.Q == 13) {
            this.at();
        } else if (this.Q == this.V) {
            this.au();
        } else if (this.Q == 9) {
            this.q = this.a[this.a[249] + by - 25];
            this.T = 0;
            this.Q = (byte)22;
            this.v = 69;
            this.R = (byte)29;
        } else if (this.Q == 24) {
            this.av();
        } else if (this.Q == 25) {
            ++this.Z;
            if (this.Z >= this.a[this.a[307] + this.m]) {
                this.Z = 0;
            }
            this.d[4] = (short)(33 + this.a[this.a[305] + this.a[this.a[306] + this.m] + this.Z]);
            this.b[2] = true;
        } else if (this.Q == 14) {
            a = (byte)this.Z;
            this.a.b(0);
            this.a.b(1);
            this.Q = (byte)16;
        } else if (by == 6) {
            this.Q = (byte)28;
        } else if (by == 0) {
            this.R = this.Q;
            this.Q = (byte)2;
            this.aa = this.Z;
        } else if (by == 12) {
            this.q = 0;
            this.R = this.Q;
            if (this.s > -1) {
                this.Q = (byte)3;
            } else {
                this.Q = (byte)13;
                this.Z = 1;
            }
            this.aa = 0;
        } else if (by == 13) {
            this.aw();
        } else if (by == 10) {
            this.ax();
        } else if (by == 11) {
            this.Q = (byte)31;
        } else if (by == 9) {
            this.ay();
        } else if (by == 5) {
            this.R = this.Q;
            this.Q = (byte)30;
            this.aa = this.Z;
        } else if (by == 1) {
            this.az();
            this.a[this.a[153] + 116 + this.Q] = 4;
            this.m = 1;
            this.a.a(70);
        } else if (by == 3) {
            this.az();
            this.a[this.a[153] + 116 + this.Q] = 2;
            this.m = 0;
            this.a.a(74);
        } else if (by == 2) {
            this.R = this.Q;
            this.Q = (byte)12;
            this.aa = this.Z;
            this.Z = 1;
            this.a[this.a[151] + this.a[this.a[152] + 12] + 1] = (byte)(17 + this.e / 2);
            this.a[this.a[151] + this.a[this.a[152] + 12] + 3] = (byte)(17 + this.l);
        } else if (by == 4) {
            this.Q = (byte)32;
        } else if (by == 7) {
            this.aA();
        } else if (by == 8) {
            this.R = this.Q;
            this.Q = (byte)16;
            this.aa = this.Z;
            this.v = 63;
        }
        this.H = true;
    }

    private void ap() {
        if (this.a[this.a[153] + 145 + 20] == 0) {
            if (this.ap == 14 || this.ap == 15) {
                this.e((int)this.am);
                this.f((int)this.am);
                this.a.v = this.am;
                this.a.u = 0;
                if (this.a.a(this.ap == 14 ? 4 : 2)) {
                    this.e[6161 + this.am] = 2;
                }
            } else {
                this.f(this.an, 0);
            }
            this.aJ();
            if (this.w == 3) {
                this.l(-1);
                this.ah();
            } else {
                this.a(this.d[0], this.d[1], this.d[2], this.d[3], this.d[4], this.d[5], this.d[6], this.d[7], this.d[8]);
            }
        } else {
            this.a(this.d[0], this.d[1], this.d[2], this.d[3], this.d[4], this.d[5], this.d[6], this.d[7], this.d[8]);
        }
        this.z = this.y;
        this.B = this.A;
        this.J = this.I;
        this.L = this.K;
        this.Q = (byte)28;
        if (this.K) {
            this.o = 0;
            this.aJ();
            this.l(-1);
            this.P = false;
            this.a(true, false, false, false, true, false, false, false, false);
            this.w = (byte)2;
            this.b[4] = true;
            this.Z();
            this.aj();
        }
    }

    private void aq() {
        if (this.m >= 4) {
            return;
        }
        if (this.m > 0) {
            if (this.m == 3) {
                this.a[this.a[153] + 116 + this.Q] = 2;
            }
            this.a.a(70 + this.m);
            this.v = 71;
            this.m = (byte)(this.m + 1);
            return;
        }
        if (this.m == -1) {
            if (this.u == 41) {
                this.aM();
                if (this.q < 5) {
                    this.q = (byte)(this.q + 1);
                    this.T = 0;
                    this.Q = (byte)23;
                    this.v = 69;
                    this.R = (byte)18;
                    this.s = this.a[this.a[248] + this.q];
                    if (this.r < this.s) {
                        this.r = this.s;
                    }
                    this.V = (byte)(4 + this.r);
                    this.e(0);
                } else if (this.q == 6) {
                    this.c = -1;
                    this.Q = this.U;
                    this.b(59);
                    this.q = (byte)(this.q + 1);
                    this.Q = (byte)18;
                } else {
                    this.c = -1;
                    this.Q = this.U;
                }
                this.Z = 0;
                return;
            }
            if (this.q == 1 || this.q == 6) {
                this.q = (byte)(this.q - 1);
            }
            this.aM();
            this.R = this.U;
            this.Q = (byte)16;
            this.v = 58;
            this.Z = 0;
            this.c = -1;
        }
    }

    private void ar() {
        if (this.v == 68) {
            this.b();
            return;
        }
        if (this.v == 65) {
            this.aM();
            this.Q = this.U;
            this.Z = 0;
            this.c = -1;
            this.g = 0;
            return;
        }
        if (this.v == 58) {
            this.T = 0;
            this.Q = (byte)22;
            this.v = 69;
            this.R = (byte)(this.q < 7 ? 18 : 29);
            return;
        }
        if (this.v == 59) {
            this.e = (byte)2;
            this.ac = true;
            this.aQ();
            this.R = this.Q = this.U;
            return;
        }
        if (this.v == 64) {
            this.T = 1;
            this.Q = (byte)22;
            this.v = 69;
            this.R = (byte)21;
            return;
        }
        if (this.v == 63) {
            this.Q = (byte)31;
            return;
        }
        if (this.v == 60) {
            this.p = 1;
            this.T = 0;
            this.Q = (byte)22;
            this.v = 69;
            this.R = (byte)18;
            return;
        }
        if (this.v == 62) {
            this.s = (byte)-1;
            this.t = (byte)-2;
            this.Q = (byte)13;
            this.R = (byte)2;
            this.Z = 1;
            this.e(0);
        }
    }

    private void as() {
        if (this.Z == 1) {
            this.e = (byte)(this.e == 0 ? 2 : 0);
            this.a[this.a[151] + this.a[this.a[152] + 12] + 1] = (byte)(17 + this.e / 2);
            if (this.a != null) {
                this.a.a(this.e);
                return;
            }
            this.aR();
            this.aQ();
            return;
        }
        if (this.Z == 3) {
            this.l = this.l == 0 ? 1 : 0;
            this.a[this.a[151] + this.a[this.a[152] + 12] + 3] = (byte)(17 + this.l);
        }
    }

    private void at() {
        this.b = (byte)(this.Z / 2);
        if (this.q >= 7) {
            this.Q = (byte)9;
            this.d = this.b;
        } else {
            if (this.r == 0) {
                this.Q = (byte)16;
                this.v = 60;
                this.p = 0;
                this.s = 0;
            } else {
                this.Q = this.V;
            }
            this.c = this.b;
            this.e(0);
        }
        this.Z = 0;
    }

    private void au() {
        this.q = this.a[this.a[249] + this.a[this.a[151] + this.a[this.a[152] + this.Q] + this.Z] - 25];
        this.s = this.a[this.a[248] + this.q];
        if (this.q == 0) {
            this.Q = (byte)16;
            this.v = 60;
            this.p = 0;
        } else {
            this.T = 0;
            this.Q = (byte)22;
            this.v = 69;
        }
        this.R = (byte)18;
        this.e(0);
    }

    private void av() {
        this.Q = (byte)15;
        this.Z = 0;
        this.a[this.a[153] + 116 + this.Q] = 0;
        this.a[this.a[153] + 145 + this.Q] = 2;
        this.a[this.a[153] + 58 + this.Q] = 0;
        this.a.a(75);
        this.v = 71;
        this.m = (byte)-1;
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 5; ++j) {
                short[] sArray = this.a[i];
                sArray[24] = (short)(sArray[24] + this.a[i][19 + j] * this.a[this.a[112] + j] / 10);
            }
        }
    }

    private void aw() {
        this.q = (byte)7;
        this.R = this.Q;
        if (this.W) {
            this.Q = (byte)3;
            this.Z = 0;
        } else if (this.r > 0 || this.af) {
            this.Q = (byte)13;
            this.Z = 1;
        } else {
            this.v = 70;
            this.Q = (byte)21;
            this.Z = 0;
        }
        this.aa = 1;
    }

    private void ax() {
        this.Z = 0;
        this.R = this.Q;
        if (this.q < 7) {
            if (this.s > -1) {
                this.Q = (byte)16;
                this.v = 62;
                return;
            }
            if (this.Q == 4) {
                this.Q = (byte)16;
                this.v = 60;
                this.p = 0;
                return;
            }
            this.Q = this.V;
            return;
        }
        this.Q = (byte)13;
        this.aa = 1;
        this.Z = 1;
    }

    private void ay() {
        if (!this.X) {
            this.R = this.Q;
            this.Q = (byte)16;
            this.v = 65;
            return;
        }
        this.aM();
        this.Q = this.U;
        this.Z = 0;
        this.c = -1;
        this.g = 0;
    }

    private void az() {
        this.R = this.Q;
        this.Q = (byte)15;
        this.aa = this.Z;
        this.v = 71;
        this.a[this.a[153] + 145 + this.Q] = 0;
        this.a[this.a[153] + 58 + this.Q] = 1;
    }

    private void aA() {
        this.R = this.Q;
        this.aa = this.Z;
        this.X = true;
        if (this.q < 7 ? this.t > -1 : this.W) {
            this.Q = (byte)16;
            this.v = 64;
            return;
        }
        this.T = 1;
        this.Q = (byte)22;
        this.v = 69;
        this.R = (byte)21;
    }

    private void aB() {
        if (this.a[this.a[153] + 174 + this.Q] == 1) {
            if (!this.Q) {
                --this.y;
                return;
            }
        } else {
            if (this.Q == 12) {
                --this.Z;
            } else if (this.Q == 13 && this.Z == 1) {
                --this.Z;
            }
            this.Z = this.Z > 0 ? this.Z - 1 : this.ab - 1;
        }
    }

    private void aC() {
        if (this.a[this.a[153] + 174 + this.Q] == 1) {
            if (!this.R) {
                ++this.y;
                return;
            }
        } else {
            int n = this.Z = this.Z < this.ab - 1 ? this.Z + 1 : 0;
            if (this.Q == 12) {
                this.Z = this.Z / 2 * 2 + 1;
                return;
            }
            if (this.Q == 13 && this.Z == 0) {
                ++this.Z;
            }
        }
    }

    private void aD() {
        if (this.Q == 31) {
            if (this.t >= this.s || this.q >= 7) {
                this.T = (byte)2;
                this.Q = (byte)22;
                this.v = 69;
                this.R = (byte)28;
            } else {
                this.q = this.s;
                if (this.q >= 1) {
                    this.q = (byte)(this.q + 1);
                }
                this.T = 0;
                this.Q = (byte)22;
                this.v = 69;
                this.R = (byte)18;
            }
            this.b = this.c;
        }
        if (this.Q == 28) {
            this.a(this.a[0], this.a[1], this.a[2], this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]);
            this.c = false;
            this.y = this.z;
            this.A = this.B;
            this.I = this.J;
            this.K = this.L;
            this.A = true;
            this.v = 1;
            this.i();
            return;
        }
        if (this.Q == 19) {
            this.Y();
            this.E();
            return;
        }
        if (this.Q == 30) {
            this.Q = (byte)16;
            this.v = 68;
            this.H = true;
            return;
        }
        if (this.Q == 29) {
            this.a(true, true, false, false);
            this.A = true;
            this.Q = (byte)28;
        }
    }

    private void aE() {
        ++this.F;
        if (this.F > 4) {
            this.u = true;
            this.t = false;
            this.F = 0;
            this.F = (byte)4;
            this.k = 0;
            this.a(true, true, false, false);
            this.q = 0;
            this.G = this.y + this.I;
            this.H = this.A + this.K;
            this.aI();
        }
    }

    private void aF() {
        this.u = false;
        this.t = false;
        this.aI();
        this.L = 0;
        this.K = this.C + 1;
        while (this.K <= this.C + this.E) {
            this.J = this.B + 1;
            while (this.J <= this.B + this.D) {
                this.H = this.c[this.K][this.J];
                if (this.H >= 1 && this.H <= 50 && this.e[1919 + this.H] > 0) {
                    if (this.L < 50) {
                        this.a[4][this.L] = this.H;
                        this.e[909 + this.H] = 4;
                    }
                    ++this.L;
                }
                ++this.J;
            }
            ++this.K;
        }
        if (this.a[4][0] == 0) {
            this.w = 0;
            this.k = 0;
            this.F = (byte)-1;
        } else if (this.a[4][1] == 0) {
            this.e[909 + this.a[4][0]] = 0;
            this.d(this.a[4][0]);
            this.a[4][0] = 0;
            this.F = (byte)-1;
        } else {
            this.F = (byte)4;
            this.w = 1;
            this.M = this.L;
            if (this.M > 50) {
                this.M = 50;
            }
        }
        this.E = 0;
        this.D = 0;
        this.C = 0;
        this.B = 0;
    }

    private void aG() {
        this.w = false;
        this.I = 0;
        switch (this.i) {
            case 7: {
                this.G = (byte)2;
                break;
            }
            case 9: {
                this.G = (byte)3;
                break;
            }
            default: {
                return;
            }
        }
        this.L = 0;
        while (this.L < 50) {
            this.a[0][this.L] = this.H = this.F != -1 ? this.a[this.F][this.L] : (this.L == 0 ? this.k : (byte)0);
            this.e[909 + this.a[this.G][this.L]] = 0;
            this.a[this.G][this.L] = 0;
            ++this.L;
        }
        this.L = 0;
        while (this.L < 50) {
            this.H = this.a[0][this.L];
            if (this.H != 0) {
                this.e((int)this.H);
                this.a[this.G][this.L] = this.H;
                this.e[909 + this.H] = this.G;
            }
            ++this.L;
        }
        this.w = 1;
        this.F = this.G;
        this.k = 0;
        this.a(true, true, false, false);
    }

    private void aH() {
        this.w = false;
        this.I = 0;
        switch (this.i) {
            case 7: {
                this.G = (byte)2;
                break;
            }
            case 9: {
                this.G = (byte)3;
                break;
            }
            default: {
                return;
            }
        }
        if (this.F == this.G) {
            this.f(this.a[this.F][0], 0);
            return;
        }
        if (this.a[this.G][0] != 0) {
            this.F = this.G;
            this.aI();
            this.M = 0;
            this.L = 0;
            while (this.L < 50) {
                if (this.a[this.F][this.L] != 0) {
                    this.e[909 + this.a[this.F][this.L]] = this.F;
                    ++this.M;
                }
                ++this.L;
            }
            this.w = 1;
            this.k = 0;
            this.a(true, true, false, false);
        }
    }

    final void e(int n) {
        for (int i = 0; i < 5; ++i) {
            int n2 = i < 4 ? this.a[this.a[125] + i] : 4;
            if (n2 == -1) continue;
            for (int j = 0; j < 50; ++j) {
                if (this.a[n2][j] != n) continue;
                while (j < 50) {
                    this.a[n2][j] = j < 49 ? this.a[n2][j + 1] : (byte)0;
                    ++j;
                }
                if (this.a[n2][0] == 0 && this.F == this.e[909 + n]) {
                    if (this.w == 1) {
                        this.w = 0;
                    }
                    this.F = (byte)-1;
                }
                this.e[909 + n] = 0;
                return;
            }
        }
    }

    private void aI() {
        for (int i = 0; i < 50; ++i) {
            if (this.a[4][i] == 0) continue;
            this.e[909 + this.a[4][i]] = 0;
            this.a[4][i] = 0;
        }
    }

    private void aJ() {
        if (this.u) {
            this.u = false;
            this.F = (byte)-1;
            this.k = 0;
            this.E = 0;
            this.D = 0;
            this.C = 0;
            this.B = 0;
        }
    }

    private void aK() {
        this.y = this.C;
        this.A = this.D;
        while (this.I < 0) {
            this.I = (byte)(this.I + 1);
        }
        while (this.K < 0 && !this.s) {
            this.K = (byte)(this.K + 1);
        }
        while (this.I + this.O > this.c - 1) {
            this.I = (byte)(this.I - 1);
        }
        while (this.K + this.P >= this.d - 1) {
            this.K = (byte)(this.K - 1);
        }
    }

    private void aL() {
        if (this.w) {
            ++this.I;
            if (this.I > 10) {
                this.w = false;
                this.I = 0;
            }
        }
    }

    private static byte a(int n) {
        if (n >= 1 && n <= 50) {
            return 0;
        }
        if (n >= 51 && n <= 100) {
            return 1;
        }
        return 2;
    }

    final byte a(byte by, byte by2, byte by3, byte by4, byte by5) {
        byte by6 = (byte)(1 + by * 50);
        byte by7 = 0;
        while (this.e[1919 + by6 + by7] != 0) {
            by7 = (byte)(by7 + 1);
        }
        if (by7 >= 50) {
            return -1;
        }
        by7 = (byte)(by7 + by6);
        if (this.F) {
            this.P = true;
        }
        byte by8 = by2;
        this.e[3131 + by7] = by8;
        this.e[6262 + by7] = by8;
        this.e[0 + by7] = by8;
        byte by9 = by3;
        this.e[3232 + by7] = by9;
        this.e[6363 + by7] = by9;
        this.e[101 + by7] = by9;
        this.e[303 + by7] = 0;
        this.e[202 + by7] = 0;
        this.e[808 + by7] = 0;
        this.e[909 + by7] = 0;
        this.e[1111 + by7] = 0;
        this.e[4949 + by7] = (byte)(4 + (by5 & 7));
        this.e[606 + by7] = 3;
        this.e[1313 + by7] = 0;
        this.e[1414 + by7] = by4;
        this.e[1616 + by7] = (byte)((by5 & 7) * 2 + this.a(255, 2));
        this.e[1717 + by7] = (byte)((by5 & 7) * 2 + this.a(255, 2));
        this.e[1818 + by7] = (byte)(3 + (by5 & 7));
        this.e[2020 + by7] = (byte)(50 + 25 * (1 - by) + this.a(255, 25));
        this.e[2121 + by7] = (byte)(50 + 25 * (1 - by) + this.a(255, 25));
        this.e[505 + by7] = (byte)(50 + 25 * (1 - by) + this.a(255, 25));
        int n = (by5 & 0x20) != 0 ? 3 : 0;
        int n2 = this.a(255, 3);
        int n3 = this.a(255, 3);
        this.e[6969 + by7] = (byte)(n2 == 0 ? 2 + this.a(255, 2 + n) : 1);
        this.e[7070 + by7] = (byte)(n2 == 1 ? 2 + this.a(255, 2 + n) : 1);
        this.e[7272 + by7] = (byte)(n2 == 2 ? 2 + this.a(255, 2 + n) : 1);
        this.e[7171 + by7] = (byte)(n3 == 0 ? 2 + this.a(255, 2 + n) : 1);
        this.e[7373 + by7] = (byte)(n3 == 1 ? 2 + by + this.a(255, 2 + n) : 1 + by);
        this.e[7474 + by7] = (byte)(n3 == 2 ? 2 + this.a(255, 2 + n) : 1);
        this.e[7575 + by7] = (byte)(1 + (by5 >> 3 & 3) * 3 + this.a(255, 3));
        this.e[6464 + by7] = 69;
        this.e[3434 + by7] = -1;
        this.e[3535 + by7] = 0;
        this.e[3636 + by7] = 0;
        this.e[3737 + by7] = (byte)(2 + this.a(255, 2));
        this.e[3838 + by7] = by7;
        this.e[4545 + by7] = 0;
        this.e[4646 + by7] = -1;
        this.e[4747 + by7] = by7;
        this.e[4848 + by7] = 0;
        int n4 = 0;
        int n5 = 0;
        n4 = this.a(255, 3);
        n5 = this.a(15, 4);
        this.e[5151 + by7] = (byte)(n5 << 2 | n4);
        if ((this.a[by][12] <= this.a[by][13] || this.aw == 0) && this.aw != 1) {
            this.e[1515 + by7] = 0;
            short[] sArray = this.a[by];
            sArray[12] = (short)(sArray[12] + 1);
        } else {
            this.e[1515 + by7] = 1;
            short[] sArray = this.a[by];
            sArray[13] = (short)(sArray[13] + 1);
        }
        if (by4 < 12) {
            this.e[2828 + by7] = 17;
            this.e[2929 + by7] = 14;
            byte by10 = (byte)(5 + this.a(255, 10));
            this.e[1919 + by7] = by10;
            this.e[6767 + by7] = by10;
            this.e[1010 + by7] = 8;
        } else {
            this.e[2828 + by7] = 69;
            this.e[2929 + by7] = 8;
            byte by11 = (byte)((this.q == 0 && by == 1 ? 20 : 40) + (this.e[1515 + by7] - 1) * -10 + this.a(255, 15));
            this.e[1919 + by7] = by11;
            this.e[6767 + by7] = by11;
            this.e[1010 + by7] = (byte)((by5 & 7) == 0 ? 8 : 9 - (by5 & 7));
        }
        this.e[4444 + by7] = by7;
        this.e[6565 + by7] = 9;
        if ((by5 & 0x40) != 0) {
            this.e[6565 + by7] = (byte)this.a(255, 4 + by * 2);
        }
        if (this.q == 3) {
            this.e[6565 + by7] = 0;
        }
        if ((this.q == 4 || this.q == 5) && this.e[6565 + by7] == 1) {
            this.e[6565 + by7] = 3;
        }
        this.e[3333 + by7] = -1;
        this.e[8282 + by7] = 0;
        this.e[7979 + by7] = 0;
        this.e[8080 + by7] = 0;
        this.e[2626 + by7] = 0;
        this.e[2525 + by7] = 0;
        this.e[2424 + by7] = 0;
        this.e[2323 + by7] = 0;
        this.e[2222 + by7] = 0;
        this.g((int)by7);
        this.b(by7);
        if (this.c[by3][by2] == 0) {
            this.c[by3][by2] = by7;
        }
        if (!this.s) {
            short[] sArray = this.a[by];
            sArray[11] = (short)(sArray[11] + 1);
            if (by == 0) {
                this.a((byte)1, by2, by3, by7);
            }
            short[] sArray2 = this.a[by];
            sArray2[19] = (short)(sArray2[19] + 1);
        }
        if (by == 0) {
            this.a.a((int)this.e[0 + by7], (int)this.e[101 + by7], (int)this.e[4949 + by7]);
        }
        return by7;
    }

    final void a(byte by) {
        byte by2 = (byte)((by - 1) / 50);
        int n = this.e[0 + by] + this.a[this.a[1] + this.e[606 + by]];
        int n2 = this.e[101 + by] + this.a[this.a[1] + 8 + this.e[606 + by]];
        if ((this.e[2929 + by] & 0xFF) <= 7 && (this.e[1111 + by] & 0xF) < (this.a[this.a[15] + (this.e[606 + by] & 1) * 9 + this.e[1010 + by] - this.e[7777 + by]] + 1) / 2 && this.c[n2][n] == -128) {
            this.c[n2][n] = this.e[4545 + by] >= 111 ? -this.e[4545 + by] : (byte)0;
        }
        this.e((int)by);
        this.f((int)by);
        this.e[1919 + by] = -1;
        this.c((int)by);
        if (this.F || by == this.e[8810 + this.q]) {
            this.P = true;
        }
        if (!this.s) {
            if (by2 == 0) {
                this.a((byte)3, this.e[0 + by], this.e[101 + by], by);
            }
            short[] sArray = this.a[1 - by2];
            sArray[22] = (short)(sArray[22] + 1);
        }
    }

    private void f(int n, int n2) {
        this.J = this.I;
        this.L = this.K;
        if (n > 100) {
            this.I = (byte)(this.e[9359 + n - 101] - this.C);
            this.K = (byte)(this.e[9381 + n - 101] - this.D + n2);
        } else if (n > 0) {
            this.I = (byte)(this.e[0 + n] - this.C);
            this.K = (byte)(this.e[101 + n] - this.D + n2);
        } else if (n == -100) {
            this.I = (byte)(this.I - this.C);
            this.K = (byte)(this.K - (this.D - n2));
        } else if (n < 0) {
            this.I = (byte)(this.e[8383 + -n] + (this.a[this.a[138] + 104 + this.e[8749 + -n]] >> 1) - this.C);
            this.K = (byte)(this.e[8444 + -n] + (this.a[this.a[138] + 130 + this.e[8749 + -n]] >> 1) - this.D + n2);
        } else {
            return;
        }
        this.aK();
        this.A = true;
    }

    final void b(int n, int n2) {
        int n3;
        for (n3 = 1; n3 <= 50; n3 = (int)((byte)(n3 + 1))) {
            if (this.e[1919 + n3] <= 0) continue;
            this.c[this.e[101 + n3]][this.e[0 + n3]] = 0;
        }
        for (n3 = 1; n3 <= 50; n3 = (int)((byte)(n3 + 1))) {
            if (this.e[1919 + n3] <= 0) continue;
            if (this.c[n2][n] != 0) {
                this.a.v = 0;
                this.a.a(1, 127, n, n2);
                n = this.e[3131];
                n2 = this.e[3232];
            }
            if ((this.e[2929 + n3] & 0xFF) <= 7 && (this.e[1111 + n3] & 0xF) < (this.a[this.a[15] + (this.e[606 + n3] & 1) * 9 + this.e[1010 + n3] - this.e[7777 + n3]] + 1) / 2 && this.c[this.e[101 + n3] + this.a[this.a[1] + 8 + this.e[606 + n3]]][this.e[0 + n3] + this.a[this.a[1] + this.e[606 + n3]]] == -128) {
                this.c[this.e[101 + n3] + this.a[this.a[1] + 8 + this.e[606 + n3]]][this.e[0 + n3] + this.a[this.a[1] + this.e[606 + n3]]] = 0;
            }
            byte by = (byte)n;
            this.e[3131 + n3] = by;
            this.e[6262 + n3] = by;
            this.e[0 + n3] = by;
            byte by2 = (byte)n2;
            this.e[3232 + n3] = by2;
            this.e[6363 + n3] = by2;
            this.e[101 + n3] = by2;
            this.e[303 + n3] = 0;
            this.e[202 + n3] = 0;
            this.e[808 + n3] = 0;
            this.e[2828 + n3] = 69;
            this.e[2929 + n3] = 8;
            this.e[3030 + n3] = 0;
            this.e[6161 + n3] = 0;
            this.c[this.e[101 + n3]][this.e[0 + n3]] = n3;
            this.a.a((int)this.e[0 + n3], (int)this.e[101 + n3], (int)this.e[4949 + n3]);
        }
    }

    final void f(int n) {
        if (this.k == n) {
            this.k = 0;
            if (this.w == 1) {
                this.w = 0;
                this.l = 0;
                this.a(true, true, false, false);
                return;
            }
            if (this.w == 2 && this.e[8749 + this.q] == 6) {
                this.w = 0;
                this.a(true, true, false, false);
            }
        }
    }

    final void b(byte by) {
        int n = 2;
        if (by >= 51) {
            n = by == 51 ? 4 : 3;
        } else if (this.e[1414 + by] < 12) {
            n = 0;
        } else if (this.e[1414 + by] < 35) {
            n = 1;
        }
        this.e[2727 + by] = (byte)(this.a[this.a[189] + this.e[1515 + by] * 10 + n * 2] + this.a(255, (int)this.a[this.a[189] + this.e[1515 + by] * 10 + n * 2 + 1]));
        if (by == this.l) {
            this.b[4] = this.a[4];
        }
    }

    final void g(int n) {
        this.e[6868 + n] = (byte)(n == 51 || n == 52 ? -2 : (byte)(n > 51 ? -1 : (byte)((n > 3 ? 1 + this.a(65535, 58) : n) % 60 + 60 * this.e[1515 + n] - 1)));
    }

    private static byte b(int n) {
        if (n <= -1 && n >= -30) {
            return 0;
        }
        if (n <= -31 && n >= -60) {
            return 1;
        }
        return 2;
    }

    final byte a(byte by, int n, int n2, int n3, int n4, boolean bl, int n5) {
        int n6 = this.a[this.a[138] + 104 + n];
        int n7 = this.a[this.a[138] + 130 + n];
        byte by2 = (byte)(1 + by * 30);
        byte by3 = 0;
        try {
            int n8;
            while (this.e[8505 + by2 + by3] != 0) {
                by3 = (byte)(by3 + 1);
            }
            if (by3 >= 30) {
                if (by == 0) {
                    this.s = 100;
                    this.l(-1);
                    this.u[0] = 0;
                    this.a((byte)10, (byte)0, (byte)0, (byte)0);
                }
                return -1;
            }
            by3 = (byte)(by3 + by2);
            if (n5 == -1) {
                if (!this.a(n, n2, n3, !bl)) {
                    return -2;
                }
            } else {
                by3 = (byte)n5;
            }
            if (n >= 20 && n <= 22) {
                if (n5 == -1) {
                    for (by3 = 0; by3 < 30 && this.f[0][by3] != 0; by3 = (byte)((byte)(by3 + 1))) {
                    }
                } else {
                    by3 = (byte)n5;
                }
                if (by3 == 30) {
                    return -1;
                }
                this.f[0][by3] = (byte)this.q;
                this.f[2][by3] = (byte)n2;
                this.f[3][by3] = (byte)n3;
                this.f[1][by3] = (byte)n;
                if (!bl) {
                    byte[] byArray = this.a[0][this.au];
                    int n9 = 6 + this.s - 20;
                    byArray[n9] = (byte)(byArray[n9] + 1);
                    this.c[n3][n2] = by == 0 ? -123 : -126;
                } else {
                    this.c[n3][n2] = (byte)(20 - n - 111 - by * 6);
                }
                this.c(n2, n3, 1, 1);
                return by3;
            }
            if (n == 0) {
                n8 = 0;
                while (this.a[by][n8][11] != 0) {
                    byte by4 = (byte)(n8 + 1);
                    n8 = by4;
                    if (by4 <= 10) continue;
                    return -1;
                }
                this.a[by][n8][11] = by3;
            }
            this.c(n2, n3, n6, n7);
            this.e[8383 + by3] = (byte)n2;
            this.e[8444 + by3] = (byte)n3;
            this.e[8749 + by3] = (byte)n;
            this.e[8871 + by3] = 0;
            this.e[9176 + by3] = 0;
            this.e[8932 + by3] = 0;
            this.e[8993 + by3] = 0;
            this.e[9054 + by3] = 0;
            if (n4 == 0) {
                n4 = this.a[this.a[113] + (this.q < 2 ? 0 : (this.q == 2 ? 12 : 24)) + n];
            }
            this.e[9115 + by3] = (byte)n4;
            this.e[8810 + by3] = 0;
            this.e[8688 + by3] = 5;
            this.e[8627 + by3] = 0;
            byte by5 = this.a[this.a[138] + 182 + n];
            this.e[8566 + by3] = by5;
            this.e[8505 + by3] = by5;
            if (n >= 12 && n <= 19) {
                if (!this.a.a(by3)) {
                    if (by == 0) {
                        this.s = 100;
                        this.l(-1);
                        this.u[0] = 0;
                        this.a((byte)10, (byte)0, (byte)0, (byte)0);
                    }
                    this.e[8505 + by3] = 0;
                    return -1;
                }
                this.e[9237 + by3] = (byte)(by == 0 ? this.r[this.as] : this.a.v);
                this.e[8566 + by3] = this.a[this.a[138] + 182 + this.e[9237 + by3]];
                this.e[9115 + by3] = 3;
            } else if (by == 0) {
                this.a.a(this.e[8383 + by3] + this.a[this.a[138] + 104 + this.e[8749 + by3]] / 2, this.e[8444 + by3] + this.a[this.a[138] + 130 + this.e[8749 + by3]] / 2, this.e[8688 + by3] & 0xF);
            }
            for (n8 = 0; n8 < n7; ++n8) {
                for (int i = 0; i < n6; ++i) {
                    this.c[n3 + n8][n2 + i] = -by3;
                }
            }
            if (n == 2) {
                short[] sArray = this.a[by];
                sArray[16] = (short)(sArray[16] + 4);
                if (this.a[by][16] > 50) {
                    this.a[by][16] = 50;
                }
            }
            if (!this.s && n5 == -1) {
                short[] sArray = this.a[by];
                sArray[14] = (short)(sArray[14] + 1);
                short[] sArray2 = this.a[by];
                sArray2[20] = (short)(sArray2[20] + 1);
            }
            if (n == 2) {
                this.a.a((int)by3);
            }
            if (bl && by == 0) {
                this.a((byte)5, (byte)n2, (byte)n3, (byte)0);
            }
            return by3;
        }
        catch (Exception exception) {
            return -1;
        }
    }

    final void c(int n, boolean bl) {
        int n2;
        byte by = this.e[8749 + n];
        byte by2 = this.e[8383 + n];
        byte by3 = this.e[8444 + n];
        int n3 = this.a[this.a[138] + 104 + by];
        int n4 = this.a[this.a[138] + 130 + by];
        int n5 = n2 = n < 31 ? 0 : 1;
        if (by == 2) {
            this.a.a(n);
        }
        try {
            block16: {
                block15: {
                    int n6;
                    block14: {
                        if (!bl) break block14;
                        this.f(n == 1 ? -1 : 0, 0);
                        this.e[8505 + n] = -1;
                        this.a(n, 3);
                        byte by4 = this.e[8993 + n];
                        while (by4 > 0) {
                            this.a((int)by4, n, true, false);
                            by4 = this.e[4545 + by4];
                        }
                        if (this.e[8810 + n] > 1 && (this.e[8749 + n] != 2 || this.e[8627 + n] != 0)) {
                            this.a((int)this.e[8810 + n], n, true, false);
                        }
                        if (this.w != 2 && this.w != 4 || n != this.q) break block15;
                        break block16;
                    }
                    this.e[8505 + n] = 0;
                    this.e[8627 + n] = 3;
                    for (n6 = 0; n6 < n4; ++n6) {
                        for (int i = 0; i < n3; ++i) {
                            this.c[by3 + n6][by2 + i] = 0;
                        }
                    }
                    if (by == 2) {
                        short[] sArray = this.a[n2];
                        sArray[16] = (short)(sArray[16] - 4);
                        if (this.a[n2][16] < 0) {
                            this.a[n2][16] = 1;
                        }
                        for (n6 = n2 * 50 + 1; n6 <= (n2 + 1) * 50; ++n6) {
                            if (this.e[3434 + n6] != n) continue;
                            this.e[3434 + n6] = 0;
                        }
                    }
                    if (!this.s) {
                        short[] sArray = this.a[n2];
                        sArray[14] = (short)(sArray[14] - 1);
                        short[] sArray2 = this.a[1 - n2];
                        sArray2[21] = (short)(sArray2[21] + 1);
                    }
                    if (by == 0) {
                        n6 = 0;
                        while (this.a[n2][n6][11] != n) {
                            byte by5 = (byte)(n6 + 1);
                            n6 = by5;
                            if (by5 < 10) continue;
                            n6 = (byte)(n6 - 1);
                            break;
                        }
                        this.a[n2][n6][11] = 0;
                    }
                    this.a.c(n);
                    if (n2 == 0) {
                        this.a((byte)8, by2, by3, (byte)0);
                    }
                }
                return;
            }
            this.w = 0;
            this.q = 0;
            this.a(true, true, false, false);
        }
        catch (Exception exception) {}
    }

    private boolean a(int n, int n2, int n3, boolean bl) {
        int n4 = this.a[this.a[138] + 104 + n];
        int n5 = this.a[this.a[138] + 130 + n];
        boolean bl2 = true;
        for (int i = 0; i < n5; ++i) {
            for (int j = 0; j < n4; ++j) {
                if (this.b(n2 + j, n3 + i) && this.c[n3 + i][n2 + j] == 0 && (!bl || this.a(n2 + j, n3 + i) == 0)) continue;
                bl2 = false;
            }
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    private void a(int var1_1, int var2_2, boolean var3_3, boolean var4_4) {
        block11: {
            block7: {
                block10: {
                    block8: {
                        block9: {
                            if (this.e[2828 + var1_1] == 93 || this.e[2828 + var1_1] == 92 || this.e[2828 + var1_1] == 106) {
                                var3_3 = true;
                            }
                            if (this.e[8810 + var2_2] != var1_1 || this.e[8749 + var2_2] == 2 && this.e[8627 + var2_2] == 0) break block7;
                            if (var3_3) {
                                this.e[8810 + var2_2] = 0;
                            }
                            this.d(var2_2);
                            if (this.c[this.e[101 + var1_1]][this.e[0 + var1_1]] == var1_1) break block8;
                            if (var3_3) break block9;
                            this.e[2828 + var1_1] = 87;
                            ** GOTO lbl-1000
                        }
                        this.e[6161 + var1_1] = 2;
                        break block10;
                    }
                    this.e[3131 + var1_1] = this.e[0 + var1_1];
                    this.e[3232 + var1_1] = this.e[101 + var1_1];
                    if (var3_3) {
                        this.e[6262 + var1_1] = this.e[0 + var1_1];
                        this.e[6363 + var1_1] = this.e[101 + var1_1];
                    }
                    this.e[2828 + var1_1] = 69;
                    if (var3_3) {
                        this.e[6161 + var1_1] = 2;
                        this.e[4747 + var1_1] = 0;
                    } else lbl-1000:
                    // 2 sources

                    {
                        this.e[6161 + var1_1] = 3;
                    }
                }
                if (var4_4) {
                    this.a(var2_2, false);
                    return;
                }
                break block11;
            }
            if (!var3_3 || this.e[8627 + var2_2] == 0 && (this.e[8749 + var2_2] == 2 || this.e[8749 + var2_2] == 7 || this.e[8749 + var2_2] == 4 || this.e[8749 + var2_2] == 8)) {
                this.e[2828 + var1_1] = 87;
                this.e[6161 + var1_1] = 3;
                return;
            }
            this.e[6161 + var1_1] = 2;
        }
    }

    final void h(int n) {
        this.f(n);
        this.e(n);
    }

    final byte a(int n, byte by) {
        byte by2;
        byte by3 = 1;
        int n2 = 0;
        if (n >= 51) {
            by3 = 31;
            n2 = 1;
        }
        while (by3 < 30) {
            if (this.e[8810 + by3 + 0] == n) {
                by3 = (byte)(by3 + 0);
                break;
            }
            by3 = (byte)(by3 + 1);
        }
        for (by2 = 0; by2 < 30; by2 = (byte)(by2 + 1)) {
            if (this.b[n2][0][by2] != by3) continue;
            this.b[n2][4][by2] = by;
            break;
        }
        return by2;
    }

    private static boolean b(int n) {
        return n >= 101 && n <= 122;
    }

    final void b(int n, int n2, int n3, int n4) {
        int n5;
        for (n5 = 0; n5 < 22; n5 = (int)((byte)(n5 + 1))) {
            if (this.e[9513 + n5] != 0) continue;
            if (this.q == 3) break;
            int n6 = n4;
            this.t[n6] = (byte)(this.t[n6] + 1);
            break;
        }
        this.e[9513 + n5] = this.a[this.a[180] + n];
        this.e[9535 + n5] = (byte)n;
        byte by = (byte)n2;
        this.e[9645 + n5] = by;
        this.e[9359 + n5] = by;
        byte by2 = (byte)n3;
        this.e[9667 + n5] = by2;
        this.e[9381 + n5] = by2;
        this.e[9425 + n5] = 0;
        this.e[9403 + n5] = 0;
        this.e[9689 + n5] = 0;
        this.e[9711 + n5] = 0;
        this.e[9601 + n5] = 0;
        this.e[9491 + n5] = (byte)this.a(255, 8);
        this.e[9469 + n5] = (byte)n4;
        this.e[9557 + n5] = this.a[this.a[184] + n];
        this.e[9579 + n5] = 0;
        this.e[9447 + n5] = 0;
        this.c[n3][n2] = (byte)(101 + n5);
    }

    private static boolean c(int n) {
        return n <= -61 && n >= -110;
    }

    final void a(int n, int n2, int n3, byte by) {
        int n4;
        for (n4 = 0; n4 < 50 && this.e[9833 + n4] != 0; n4 = (int)((byte)(n4 + 1))) {
        }
        if (n4 == 50) {
            n4 = 0;
            while (this.e[9833 + n4] != 6 || this.e[9833 + n4] != 7) {
                n4 = (byte)(n4 + 1);
            }
            this.c[this.e[9783 + n4]][this.e[9733 + n4]] = 0;
        }
        this.e[9833 + n4] = (byte)n;
        this.e[9733 + n4] = (byte)n2;
        this.e[9783 + n4] = (byte)n3;
        this.e[9883 + n4] = by;
        this.c[n3][n2] = (byte)(-61 - n4);
    }

    private static byte c(int n) {
        if (n <= -111 && n >= -116) {
            return 0;
        }
        if (n <= -117 && n >= -122) {
            return 1;
        }
        if (n == -123) {
            return 3;
        }
        return 2;
    }

    private boolean b(int n, int n2) {
        return n >= 0 && n2 >= 0 && n < this.c && n2 < this.d;
    }

    private byte a(int n, int n2) {
        if ((this.a[0][n >> 5][n2] >> n & 0x1F & 1) == 0) {
            return 2;
        }
        if ((this.a[1][n >> 5][n2] >> n & 0x1F & 1) == 0) {
            return 1;
        }
        return 0;
    }

    final void c(int n, int n2, int n3, int n4) {
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n; j < n + n3; ++j) {
                if (!this.a(j, i)) continue;
                this.a[i - this.K][j - this.I] = true;
            }
        }
        this.B = true;
    }

    private void a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.a(bl, bl2, bl3, bl4, false, false, false, false, false);
    }

    private void a(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, boolean bl9) {
        this.b[0] = this.a[0] = bl;
        this.b[1] = this.a[1] = bl2;
        this.b[2] = this.a[2] = bl3;
        this.b[4] = this.a[4] = bl4;
        this.b[5] = this.a[5] = bl5;
        this.b[6] = this.a[6] = bl6;
        this.b[7] = this.a[7] = bl7;
        this.b[8] = this.a[8] = bl8;
        this.b[9] = this.a[9] = bl9;
        this.a[17] = true;
        this.b[17] = true;
        if (bl2) {
            if (this.u[0] == 0) {
                this.a[1] = true;
                this.b[1] = true;
                this.a[9] = false;
                this.b[9] = false;
            } else if (this.u[0] != 0) {
                this.a[9] = true;
                this.b[9] = true;
                this.a[1] = false;
                this.b[1] = false;
            }
        }
        int n = this.bb;
        if (this.a[4]) {
            this.bb = 48;
            this.ax = this.d[3];
        } else {
            this.bb = 22;
            this.ax = this.d[2];
        }
        if (n < this.bb && this.ag == 0 && this.K < this.d - 1) {
            this.ag = 1;
            this.K = (byte)(this.K + 1);
            this.A = (byte)(this.A - 1);
            if (this.K < this.d - 1) {
                this.K = (byte)(this.K + 1);
                this.A = (byte)(this.A - 1);
                this.A = true;
            }
        } else if (n > this.bb && !bl4 && this.ag == 0 && this.K > 0) {
            this.ag = -1;
            this.K = (byte)(this.K - 1);
            this.A = (byte)(this.A + 1);
            if (this.K > 0) {
                this.K = (byte)(this.K - 1);
                this.A = (byte)(this.A + 1);
                this.A = true;
            }
        }
        if (this.a[1]) {
            this.ad = 1;
        } else if (this.a[2]) {
            this.ad = (byte)2;
        } else if (this.a[5]) {
            this.ad = (byte)5;
        } else if (this.a[6]) {
            this.ad = (byte)6;
        } else if (this.a[9]) {
            this.ad = (byte)9;
        }
        this.ba = this.b[this.a[this.a[195] + 0 + this.ad]];
        byte by = this.P;
        this.P = (byte)((319 - this.bb - this.ba + this.d[2]) / 16 + 1);
        if (this.P > by) {
            this.C = true;
        }
        this.A = this.P * 16;
        this.A += 16;
        this.c[2] = this.c[3] = this.A;
        this.c[7] = this.c[10] = this.A + this.bb;
        this.c[5] = this.c[10];
        this.c[4] = this.c[10];
        this.c[11] = this.c[this.a[this.a[195] + 0 + this.ad]] + this.b[this.a[this.a[195] + 0 + this.ad]];
    }

    final void a(byte by, byte by2, byte by3, byte by4) {
        if (this.c == 0 || this.u > 0) {
            return;
        }
        boolean bl = false;
        if (by != 100) {
            bl = true;
            for (int i = 0; i < 10; ++i) {
                if (this.u[i] != 0) continue;
                this.u[i] = by;
                this.k[0][i] = by2;
                this.k[1][i] = by3;
                this.k[2][i] = by4;
                this.g[i] = 0;
                break;
            }
        } else if (this.u[0] != 0) {
            boolean bl2 = false;
            bl = true;
            this.ay = 0;
            int n = 0;
            while (n < 9) {
                int n2 = n++;
                this.g[n2] = this.g[n2] + 1;
            }
            if (this.u[1] != 0) {
                if (this.g[0] > 1) {
                    bl2 = true;
                }
            } else if (this.g[0] > 4) {
                bl2 = true;
            }
            if (bl2) {
                for (n = 0; n < 9; ++n) {
                    this.u[n] = this.u[n + 1];
                    this.k[0][n] = this.k[0][n + 1];
                    this.k[1][n] = this.k[1][n + 1];
                    this.k[2][n] = this.k[2][n + 1];
                    this.g[n] = this.g[n + 1];
                    this.u[n + 1] = 0;
                }
                if (this.u[0] != 0 && this.u[1] == 0) {
                    this.g[0] = 0;
                }
            }
        }
        if (bl && (this.a[1] || this.a[9])) {
            this.a(this.a[0], true, false, this.a[4]);
            this.ay = this.k[0][0] == 0 && this.k[1][0] == 0 ? (byte)0 : 1;
        }
    }

    private void g(byte by) {
        try {
            this.q = by;
            this.aM();
            this.aN();
            this.aO();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void aM() {
        int n;
        int n2;
        this.u = false;
        this.t = false;
        this.F = (byte)-1;
        for (n2 = 0; n2 < this.b[121]; ++n2) {
            this.e[n2] = 0;
        }
        for (n2 = 0; n2 <= 100; ++n2) {
            this.e[4040 + n2] = -100;
            this.e[4242 + n2] = 1;
            this.e[4343 + n2] = -1;
        }
        for (n2 = 0; n2 < 50; ++n2) {
            this.a[4][n2] = 0;
            this.a[3][n2] = 0;
            this.a[2][n2] = 0;
        }
        for (n2 = 0; n2 < 10; ++n2) {
            this.u[n2] = 0;
        }
        for (n2 = 0; n2 < 5; ++n2) {
            this.c[0][n2][2] = -1;
        }
        for (n2 = 0; n2 < 30; n2 = (int)((byte)(n2 + 1))) {
            this.e[0][n2] = 0;
        }
        for (n2 = 0; n2 < 3; n2 = (int)((byte)(n2 + 1))) {
            for (n = 0; n < 96; n = (int)((byte)(n + 1))) {
                this.a[0][n2][n] = 0;
            }
        }
        for (n2 = 0; n2 < 10; n2 = (int)((byte)(n2 + 1))) {
            for (n = 0; n < 12; n = (byte)(n + 1)) {
                this.a[0][n2][n] = 0;
                this.a[1][n2][n] = 0;
            }
        }
        for (n2 = 0; n2 < 30; n2 = (int)((byte)(n2 + 1))) {
            for (n = 0; n < 4; n = (int)((byte)(n + 1))) {
                this.f[n][n2] = 0;
            }
            for (n = 0; n < 5; n = (int)((byte)(n + 1))) {
                this.b[1][n][n2] = 0;
                this.b[0][n][n2] = 0;
            }
        }
        for (n2 = 0; n2 < 96; ++n2) {
            for (n = 0; n < 96; ++n) {
                this.b[n2][n] = 0;
                this.c[n2][n] = 0;
            }
        }
        for (n2 = 0; n2 < this.P + 3; ++n2) {
            for (n = 0; n < this.O; ++n) {
                this.g[n2][n] = 0;
            }
        }
        if (!this.s) {
            for (n2 = 0; n2 < 26; n2 = (int)((byte)(n2 + 1))) {
                this.a[1][n2] = 0;
                this.a[0][n2] = 0;
            }
            this.a[0][17] = 0;
        }
        this.a[0][16] = 1;
        this.t();
        this.c = 0;
        this.h = 0;
        this.N = false;
        this.L = false;
        this.F = false;
        this.K = false;
        this.X = 0;
        this.W = 0;
        this.aL = 0;
        this.u = 0;
        this.ay = 0;
        this.a.a();
        this.i();
        this.k = true;
    }

    private void aN() {
        int n = 0;
        try {
            int n2;
            int n3;
            int n4;
            System.gc();
            Thread.yield();
            Object var4_2 = null;
            int n5 = 0;
            this.c = this.e = (short)this.a[this.a[149] + this.q * 2];
            this.d = this.f = (short)this.a[this.a[149] + this.q * 2 + 1];
            if (this.q == 0) {
                this.c = (short)40;
                this.d = (short)32;
            } else if (this.q == 5) {
                this.c = (short)(this.c - 32);
            }
            int n6 = 0;
            int n7 = 10;
            for (n4 = 0; n4 < this.f; ++n4) {
                for (n3 = 0; n3 < this.e; ++n3) {
                    if (n7 >= this.a[this.a[197] + 0 + n6]) {
                        n = (short)(this.v[this.h[this.a[this.a[248] + this.q]] + n5] & 0xFF);
                        ++n5;
                        if (n >= 250) {
                            n7 = 0;
                            n6 = n - 250;
                            n = this.a[this.a[197] + 6 + n6] & 0xFF;
                        }
                    }
                    ++n7;
                    int n8 = n;
                    if (n8 <= 8) {
                        n8 += this.a(3, 3);
                    }
                    this.b[n4][n3] = (byte)n8;
                    n2 = (this.b[9][n8] & 0xFFFF) >> 13 & 1;
                    if ((n8 >= 175 || n2 == 1) && this.c[n4][n3] != -127) {
                        this.c[n4][n3] = -126;
                    } else if (this.c[n4][n3] == -126) {
                        this.c[n4][n3] = 0;
                    }
                    if (this.q != 3) {
                        int n9 = (this.j[16][n8] & 0xFFFF) >> 6 & 3;
                        if (n9 == 2) {
                            this.c[n4][n3] = -125;
                        }
                        if (n8 >= 180 && n8 <= 231) {
                            this.c[n4][n3] = -124;
                        } else if (n8 >= 175 && n8 <= 179) {
                            this.a(n8 - 175 + 1, n3, n4, this.a[this.a[110] + n8 - 175 + 1]);
                        }
                    }
                    if (n4 != 0 && n4 != this.f - 1 && n3 != this.e - 1) continue;
                    this.c[n4][n3] = -126;
                }
            }
            for (n4 = 0; n4 < this.d; ++n4) {
                for (n3 = 1; n3 < this.c - 1; ++n3) {
                    if (!f.c(this.c[n4][n3]) || this.e[9833 + (this.c[n4][n3] + 61) * -1] != 5) continue;
                    n2 = this.b[n4][n3 - 1];
                    if (n2 == 33 || n2 == 34 || n2 == 37 || n2 == 38) {
                        this.c[n4][n3 - 1] = -127;
                    }
                    if ((n2 = this.b[n4][n3 + 1]) != 33 && n2 != 34 && n2 != 37 && n2 != 38) continue;
                    this.c[n4][n3 + 1] = -127;
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void aO() {
        this.aP();
        this.a[0][17] = this.q == 3 ? (short)0 : 1;
        this.y = this.C;
        this.A = this.D;
        this.I = this.J = (byte)(this.a[this.a[150] + this.q * 2] - this.y);
        this.K = this.L = (byte)(this.a[this.a[150] + this.q * 2 + 1] - this.A);
        this.aK();
        this.J = this.I;
        this.L = this.K;
        this.z = this.y;
        this.B = this.A;
        this.a.d();
    }

    private void aP() {
        if (this.q == 3) {
            this.aw = 0;
        }
        short s = this.a[250 + this.q];
        byte by = this.a[this.a[262] + this.q];
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            if (this.a[s + 0 * by + by2] == -1) continue;
            if (this.a[s + 1 * by + by2] >= 0) {
                this.a(this.a[s + 0 * by + by2], this.a[s + 1 * by + by2], this.a[s + 2 * by + by2], this.a[s + 3 * by + by2], this.a[s + 4 * by + by2], true, -1);
            } else if (this.a[s + 1 * by + by2] == -1) {
                this.a((byte)(this.a[s + 0 * by + by2] & 1), this.a[s + 2 * by + by2], this.a[s + 3 * by + by2], this.a[s + 4 * by + by2], (byte)((this.a[s + 0 * by + by2] >> 1) + ((this.a[s + 0 * by + by2] & 1) != 0 ? this.b : (byte)0)));
            } else if (this.a[s + 1 * by + by2] == -2) {
                this.b(1, (int)this.a[s + 2 * by + by2], (int)this.a[s + 3 * by + by2], (int)this.a[s + 0 * by + by2]);
            }
            if (by2 > 10 || this.q == 1 || this.q == 6) continue;
            this.a[0][by2] = this.a[this.a[263] + 11 * this.q * 2 + by2];
            this.a[1][by2] = (short)(this.a[this.a[263] + 11 * (this.q * 2 + 1) + by2] * 20);
        }
        if (this.q == 0) {
            this.e[7476] = 4;
            this.e[7479] = 5;
            return;
        }
        if (this.q == 3) {
            this.aw = (byte)2;
        }
    }

    static boolean a(Graphics graphics, Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        try {
            graphics.drawRegion(image, n, n2, n3, n4, 0, n5, n6, n7);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.fillRect(11 + n, 8 + n2, n3, n4 + 0);
    }

    private static void b(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.drawRect(n, n2, n3, n4);
    }

    private static void c(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setClip(n, n2, n3, n4);
    }

    private static void d(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.drawLine(n, n2, n3, n4);
    }

    private boolean d(int n) {
        boolean bl = false;
        try {
            System.gc();
            Thread.yield();
            RecordStore recordStore = RecordStore.openRecordStore((String)(this.b + n), (boolean)true);
            if (recordStore.getNumRecords() <= 0) {
                recordStore.closeRecordStore();
                return false;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
            try {
                if (n == 0) {
                    this.l = dataInputStream.readInt();
                    this.W = dataInputStream.readBoolean();
                    this.r = dataInputStream.readByte();
                    this.V = (byte)(4 + this.r);
                    this.s = dataInputStream.readByte();
                    this.t = dataInputStream.readByte();
                    this.c = dataInputStream.readByte();
                    this.p = dataInputStream.readByte();
                } else {
                    int n2;
                    int n3;
                    this.q = dataInputStream.readByte();
                    this.aM();
                    this.p = dataInputStream.readByte();
                    this.d = dataInputStream.readByte();
                    if (n == 2) {
                        this.b = this.d;
                    }
                    this.aN();
                    dataInputStream.read(this.e);
                    dataInputStream.read(this.q);
                    dataInputStream.read(this.a[0]);
                    dataInputStream.read(this.a[1]);
                    dataInputStream.read(this.a[2]);
                    dataInputStream.read(this.a[3]);
                    for (n3 = 0; n3 < 26; ++n3) {
                        this.a[0][n3] = dataInputStream.readShort();
                        this.a[1][n3] = dataInputStream.readShort();
                    }
                    dataInputStream.read(this.e[0]);
                    dataInputStream.read(this.e[1]);
                    dataInputStream.read(this.e[2]);
                    for (n3 = 0; n3 < 10; ++n3) {
                        for (n2 = 0; n2 < 12; ++n2) {
                            this.a[0][n3][n2] = dataInputStream.readByte();
                            this.a[1][n3][n2] = dataInputStream.readByte();
                        }
                    }
                    dataInputStream.read(this.f[0]);
                    dataInputStream.read(this.f[1]);
                    dataInputStream.read(this.f[2]);
                    dataInputStream.read(this.f[3]);
                    for (n3 = 0; n3 < 5; ++n3) {
                        dataInputStream.read(this.b[0][n3]);
                        dataInputStream.read(this.b[1][n3]);
                        dataInputStream.read(this.c[0][n3]);
                        dataInputStream.read(this.c[1][n3]);
                    }
                    this.aq = dataInputStream.readByte();
                    this.y = this.z = dataInputStream.readByte();
                    this.A = this.B = dataInputStream.readByte();
                    this.I = this.J = dataInputStream.readByte();
                    this.K = this.L = dataInputStream.readByte();
                    this.h = dataInputStream.readByte();
                    this.ai = dataInputStream.readByte();
                    this.c = dataInputStream.readInt();
                    this.L = dataInputStream.readBoolean();
                    this.N = dataInputStream.readBoolean();
                    for (n3 = 0; n3 < 3; ++n3) {
                        for (n2 = 0; n2 < 96; ++n2) {
                            this.a[0][n3][n2] = dataInputStream.readInt();
                        }
                    }
                    dataInputStream.read(this.a.c[0]);
                    dataInputStream.read(this.a.c[1]);
                    dataInputStream.read(this.a.c[2]);
                    dataInputStream.read(this.a.c[3]);
                    dataInputStream.read(this.a.c[4]);
                    dataInputStream.read(this.a.c[5]);
                    this.a.f = dataInputStream.readByte();
                    this.a.K = dataInputStream.readByte();
                    this.a.R = dataInputStream.readByte();
                    this.a.L = dataInputStream.readByte();
                    this.a.aQ = dataInputStream.readInt();
                    dataInputStream.read(this.a.f[0]);
                    dataInputStream.read(this.a.f[1]);
                    dataInputStream.read(this.a.g[0]);
                    dataInputStream.read(this.a.g[1]);
                    dataInputStream.read(this.a.g[2]);
                    dataInputStream.read(this.a.j);
                    this.a.N = dataInputStream.readByte();
                    this.a.O = dataInputStream.readByte();
                    this.a.g = dataInputStream.readByte();
                    this.a.J = dataInputStream.readByte();
                    this.a.I = dataInputStream.readByte();
                    dataInputStream.read(this.t);
                    int n4 = -111;
                    while (n4 >= -122) {
                        byte by = dataInputStream.readByte();
                        n3 = by;
                        if (by == 127) {
                            --n4;
                            continue;
                        }
                        n2 = dataInputStream.readByte();
                        this.c[n2][n3] = (byte)n4;
                    }
                    for (n3 = 0; n3 < 30; ++n3) {
                        if (this.f[0][n3] == 0) continue;
                        this.c[this.f[3][n3]][this.f[2][n3]] = this.f[0][n3] <= 30 ? -123 : -126;
                    }
                    for (n3 = 0; n3 < 50; ++n3) {
                        if (this.e[9833 + n3] < 6) continue;
                        this.c[this.e[9783 + n3]][this.e[9733 + n3]] = (byte)(-61 - n3);
                    }
                    for (n3 = 1; n3 <= 100; ++n3) {
                        if (this.e[1919 + n3] == 0) continue;
                        this.e[808 + n3] = 0;
                        if (this.e[4646 + n3] >= 0) continue;
                        this.c[this.e[101 + n3]][this.e[0 + n3]] = (byte)n3;
                        if ((this.e[2929 + n3] & 0xFF) > 7 || (this.e[1111 + n3] & 0xF) >= (this.a[this.a[15] + (this.e[606 + n3] & 1) * 9 + this.e[1010 + n3] - this.e[7777 + n3]] + 1) / 2 || this.c[this.e[101 + n3] + this.a[this.a[1] + 8 + this.e[606 + n3]]][this.e[0 + n3] + this.a[this.a[1] + this.e[606 + n3]]] != 0) continue;
                        this.c[this.e[101 + n3] + this.a[this.a[1] + 8 + this.e[606 + n3]]][this.e[0 + n3] + this.a[this.a[1] + this.e[606 + n3]]] = -128;
                    }
                    for (n3 = 0; n3 < 22; ++n3) {
                        this.e[9689 + n3] = 0;
                        if (this.e[9513 + n3] == 0) continue;
                        this.c[this.e[9381 + n3]][this.e[9359 + n3]] = (byte)(101 + n3);
                        if ((this.e[9557 + n3] & 0xFF) > 7 || (this.e[9623 + n3] & 0xF) >= (this.a[this.a[15] + (this.e[9491 + n3] & 1) * 9 + this.a[this.a[179] + this.e[9535 + n3]]] + 1) / 2 || this.c[this.e[9381 + n3] + this.a[this.a[1] + 8 + this.e[9491 + n3]]][this.e[9359 + n3] + this.a[this.a[1] + this.e[9491 + n3]]] != 0) continue;
                        this.c[this.e[9381 + n3] + this.a[this.a[1] + 8 + this.e[9491 + n3]]][this.e[9359 + n3] + this.a[this.a[1] + this.e[9491 + n3]]] = -128;
                    }
                    for (n3 = 1; n3 <= 60; ++n3) {
                        if (this.e[8505 + n3] == 0) continue;
                        for (int i = 0; i < this.a[this.a[138] + 130 + this.e[8749 + n3]]; ++i) {
                            for (int j = 0; j < this.a[this.a[138] + 104 + this.e[8749 + n3]]; ++j) {
                                this.c[this.e[8444 + n3] + i][this.e[8383 + n3] + j] = (byte)(-n3);
                            }
                        }
                    }
                    this.a.n();
                    this.a.j();
                    this.a.d();
                    this.aK();
                    this.J = this.I;
                    this.L = this.K;
                }
                bl = true;
            }
            catch (Exception exception) {}
            dataInputStream.close();
            recordStore.closeRecordStore();
            if (!bl) {
                RecordStore.deleteRecordStore((String)(this.b + n));
                this.d(n);
            }
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private boolean e(int n) {
        boolean bl = false;
        try {
            RecordStore recordStore = null;
            ByteArrayOutputStream byteArrayOutputStream = null;
            FilterOutputStream filterOutputStream = null;
            try {
                RecordStore.deleteRecordStore((String)(this.b + n));
                recordStore = RecordStore.openRecordStore((String)(this.b + n), (boolean)true);
                byteArrayOutputStream = new ByteArrayOutputStream();
                filterOutputStream = new DataOutputStream(byteArrayOutputStream);
                if (n == 0) {
                    ((DataOutputStream)filterOutputStream).writeInt(this.l);
                    ((DataOutputStream)filterOutputStream).writeBoolean(this.W);
                    ((DataOutputStream)filterOutputStream).writeByte(this.r);
                    ((DataOutputStream)filterOutputStream).writeByte(this.s);
                    ((DataOutputStream)filterOutputStream).writeByte(this.t);
                    ((DataOutputStream)filterOutputStream).writeByte(this.c);
                    ((DataOutputStream)filterOutputStream).writeByte(this.p);
                } else {
                    int n2;
                    int n3;
                    if (n == 2) {
                        this.W = true;
                    } else if (n == 1) {
                        this.t = this.a[this.a[248] + this.q];
                    }
                    ((DataOutputStream)filterOutputStream).writeByte(this.q);
                    ((DataOutputStream)filterOutputStream).writeByte(this.p);
                    ((DataOutputStream)filterOutputStream).writeByte(this.d);
                    ((OutputStream)filterOutputStream).write(this.e);
                    ((OutputStream)filterOutputStream).write(this.q);
                    ((OutputStream)filterOutputStream).write(this.a[0]);
                    ((OutputStream)filterOutputStream).write(this.a[1]);
                    ((OutputStream)filterOutputStream).write(this.a[2]);
                    ((OutputStream)filterOutputStream).write(this.a[3]);
                    for (n3 = 0; n3 < 26; ++n3) {
                        ((DataOutputStream)filterOutputStream).writeShort(this.a[0][n3]);
                        ((DataOutputStream)filterOutputStream).writeShort(this.a[1][n3]);
                    }
                    ((OutputStream)filterOutputStream).write(this.e[0]);
                    ((OutputStream)filterOutputStream).write(this.e[1]);
                    ((OutputStream)filterOutputStream).write(this.e[2]);
                    for (n3 = 0; n3 < 10; ++n3) {
                        for (n2 = 0; n2 < 12; ++n2) {
                            ((DataOutputStream)filterOutputStream).writeByte(this.a[0][n3][n2]);
                            ((DataOutputStream)filterOutputStream).writeByte(this.a[1][n3][n2]);
                        }
                    }
                    ((OutputStream)filterOutputStream).write(this.f[0]);
                    ((OutputStream)filterOutputStream).write(this.f[1]);
                    ((OutputStream)filterOutputStream).write(this.f[2]);
                    ((OutputStream)filterOutputStream).write(this.f[3]);
                    for (n3 = 0; n3 < 5; ++n3) {
                        ((OutputStream)filterOutputStream).write(this.b[0][n3]);
                        ((OutputStream)filterOutputStream).write(this.b[1][n3]);
                        ((OutputStream)filterOutputStream).write(this.c[0][n3]);
                        ((OutputStream)filterOutputStream).write(this.c[1][n3]);
                    }
                    ((DataOutputStream)filterOutputStream).writeByte(this.aq);
                    ((DataOutputStream)filterOutputStream).writeByte(this.y);
                    ((DataOutputStream)filterOutputStream).writeByte(this.A);
                    ((DataOutputStream)filterOutputStream).writeByte(this.I);
                    ((DataOutputStream)filterOutputStream).writeByte(this.K);
                    ((DataOutputStream)filterOutputStream).writeByte(this.h);
                    ((DataOutputStream)filterOutputStream).writeByte(this.ai);
                    ((DataOutputStream)filterOutputStream).writeInt(this.c);
                    ((DataOutputStream)filterOutputStream).writeBoolean(this.L);
                    ((DataOutputStream)filterOutputStream).writeBoolean(this.N);
                    for (n3 = 0; n3 < 3; ++n3) {
                        for (n2 = 0; n2 < 96; ++n2) {
                            ((DataOutputStream)filterOutputStream).writeInt(this.a[0][n3][n2]);
                        }
                    }
                    ((OutputStream)filterOutputStream).write(this.a.c[0]);
                    ((OutputStream)filterOutputStream).write(this.a.c[1]);
                    ((OutputStream)filterOutputStream).write(this.a.c[2]);
                    ((OutputStream)filterOutputStream).write(this.a.c[3]);
                    ((OutputStream)filterOutputStream).write(this.a.c[4]);
                    ((OutputStream)filterOutputStream).write(this.a.c[5]);
                    ((DataOutputStream)filterOutputStream).writeByte(this.a.f);
                    ((DataOutputStream)filterOutputStream).writeByte(this.a.K);
                    ((DataOutputStream)filterOutputStream).writeByte(this.a.R);
                    ((DataOutputStream)filterOutputStream).writeByte(this.a.L);
                    ((DataOutputStream)filterOutputStream).writeInt(this.a.aQ);
                    ((OutputStream)filterOutputStream).write(this.a.f[0]);
                    ((OutputStream)filterOutputStream).write(this.a.f[1]);
                    ((OutputStream)filterOutputStream).write(this.a.g[0]);
                    ((OutputStream)filterOutputStream).write(this.a.g[1]);
                    ((OutputStream)filterOutputStream).write(this.a.g[2]);
                    ((OutputStream)filterOutputStream).write(this.a.j);
                    ((DataOutputStream)filterOutputStream).writeByte(this.a.N);
                    ((DataOutputStream)filterOutputStream).writeByte(this.a.O);
                    ((DataOutputStream)filterOutputStream).writeByte(this.a.g);
                    ((DataOutputStream)filterOutputStream).writeByte(this.a.J);
                    ((DataOutputStream)filterOutputStream).writeByte(this.a.I);
                    ((OutputStream)filterOutputStream).write(this.t);
                    for (byte by = -111; by >= -122; --by) {
                        for (n3 = 0; n3 < this.c; ++n3) {
                            for (n2 = 0; n2 < this.d; ++n2) {
                                if (this.c[n2][n3] != by) continue;
                                ((DataOutputStream)filterOutputStream).writeByte(n3);
                                ((DataOutputStream)filterOutputStream).writeByte(n2);
                            }
                        }
                        ((DataOutputStream)filterOutputStream).writeByte(127);
                    }
                }
                recordStore.addRecord(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                bl = true;
            }
            catch (Exception exception) {}
            if (recordStore != null) {
                recordStore.closeRecordStore();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            if (filterOutputStream != null) {
                filterOutputStream.close();
            }
        }
        catch (Exception exception) {}
        return bl;
    }

    final int a(int n, int n2) {
        return (this.a.nextInt() & n) % n2;
    }

    private static long a() {
        return System.currentTimeMillis();
    }

    public final void hideNotify() {
        this.d();
    }

    public final void showNotify() {
        this.e();
    }

    public final void d() {
        this.Y = true;
        this.Z = true;
        if (this.aa && !this.ad) {
            this.aR();
        }
        this.ad = true;
    }

    public final void e() {
        this.Y = false;
    }

    private void aQ() {
        this.a.k();
        f = this.b[this.h * 2 + this.a(255, 2)];
        if (this.a == null || this.a.a() <= 100 || f != g) {
            g = f;
            this.aR();
            String cfr_ignored_0 = "/s" + f;
            this.a = new a("audio/midi");
        }
        this.a.a(this.e);
    }

    private void aR() {
        if (this.a != null) {
            this.a.a();
            this.a.b();
            this.a = null;
        }
    }

    private void aS() {
        if (this.Z) {
            if (this.Q != 27 && this.ac) {
                this.ab = true;
                this.v = 0;
                this.S = this.R;
                this.R = this.Q;
                this.Q = (byte)27;
                this.z = this.y;
                this.B = this.A;
                this.J = this.I;
                this.L = this.K;
            }
            while (this.Y) {
                this.n = false;
                Thread.yield();
                tribes.a(10);
            }
        }
        this.Z = false;
        this.ad = false;
        if (this.Q != 27 && this.e == 2 && (this.a == null || this.a != null && this.a.a() != 400)) {
            this.aQ();
        }
        tribes.a(10);
    }

    private void m(int n) {
        if (n == this.j[0]) {
            for (int i = 0; i < 6; ++i) {
                this.i[i] = 0;
            }
            this.i[0] = this.j[0];
            return;
        }
        if (this.i[0] == this.j[0]) {
            int n2;
            for (n2 = 0; n2 < 6; ++n2) {
                if (this.i[n2] != 0) continue;
                this.i[n2] = n;
                break;
            }
            this.ae = true;
            for (n2 = 0; n2 < 5; ++n2) {
                if (this.i[n2] == this.j[n2]) continue;
                this.ae = false;
                break;
            }
            if (this.ae && this.i[5] != 0) {
                switch (this.i[5]) {
                    case 49: {
                        this.af = true;
                        break;
                    }
                    case 51: {
                        this.ag = true;
                        break;
                    }
                    case 55: {
                        short[] sArray = this.a[0];
                        sArray[0] = (short)(sArray[0] + 100);
                        short[] sArray2 = this.a[0];
                        sArray2[1] = (short)(sArray2[1] + 100);
                        short[] sArray3 = this.a[0];
                        sArray3[2] = (short)(sArray3[2] + 100);
                        short[] sArray4 = this.a[0];
                        sArray4[3] = (short)(sArray4[3] + 100);
                        short[] sArray5 = this.a[0];
                        sArray5[4] = (short)(sArray5[4] + 100);
                        short[] sArray6 = this.a[0];
                        sArray6[5] = (short)(sArray6[5] + 3);
                        short[] sArray7 = this.a[0];
                        sArray7[8] = (short)(sArray7[8] + 3);
                        short[] sArray8 = this.a[0];
                        sArray8[10] = (short)(sArray8[10] + 3);
                        break;
                    }
                    case 57: {
                        this.u = 1;
                        if (this.q != 0) break;
                        this.q = (byte)(this.q + 1);
                    }
                }
                this.i[0] = 0;
            }
        }
    }

    static {
        a = new Image[4];
        a = new Graphics[4];
        M = 0;
        ag = (byte)40;
        ah = (byte)60;
    }
}
