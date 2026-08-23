/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c {
    f a;
    byte[] a;
    short[] a;
    byte[] b;
    short[] b;
    byte[] c;
    short[] c;
    byte[][] a;
    short[][] a;
    String[] a;
    byte[][] b;
    byte[][] c;
    byte[] d;
    short[] d;
    short[] e;
    short[] f;
    byte[] e;
    byte a;
    byte b;
    byte c;
    byte[] f;
    int a;
    InputStream a = null;
    int b = new short[230];
    int c = new short[310];
    int d;
    int e;
    int f = -1;
    int g;
    int h;
    byte d;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    short[] g;
    short[] h;
    int r;
    int s;
    int t;
    int u;
    int v;
    int w;
    int x;
    int y;
    int z;
    int A;

    public c(f f2) {
        this.a = new byte[][]{this.b, this.c, this.c};
        this.a = new short[][]{this.b, this.c, this.c};
        this.a = new String[]{"/s", "/t", "/d"};
        this.a = f2;
        this.a = this.a.a;
        this.a = this.a.a;
    }

    final void a() {
        this.k = 13;
        while (this.k < 33) {
            this.f[this.k] = 0;
            ++this.k;
        }
        this.b = 0;
        this.c = 0;
        this.k = 0;
        while (this.k < 122) {
            this.f[this.k] = 0;
            ++this.k;
        }
    }

    final void a(int n) {
        this.a.w = -1;
        this.g = n;
        this.c = this.a[308];
        while (this.c < this.a[309]) {
            if (n < this.a[this.c]) {
                this.c -= this.a[308];
                break;
            }
            ++this.c;
        }
        if (this.f != this.c) {
            this.f = this.c;
            this.b(2);
        }
    }

    final void b(int n) {
        try {
            try {
                String cfr_ignored_0 = "/" + f.a + this.a[n];
                this.a = this.getClass().getResourceAsStream("/" + f.a + this.a[n] + (n == 2 ? String.valueOf(this.f) : ""));
                if (this.a != null) {
                    if (n < 2) {
                        this.d = 0;
                        this.a[n][0] = 0;
                        this.c = 0;
                    } else {
                        this.d = 71;
                        this.c = this.a[1][71];
                    }
                    while ((this.b = this.a.read()) != -1) {
                        if (this.b == 124) {
                            ++this.d;
                            this.a[n][this.d] = (short)this.c;
                            continue;
                        }
                        if (this.b == 31) {
                            this.e = 0;
                            while (this.e < this.a.a.length()) {
                                this.a[n][this.c] = this.a[this.a[280] + (byte)this.a.a.charAt(this.e)];
                                ++this.e;
                                ++this.c;
                            }
                            --this.c;
                        } else {
                            this.a[n][this.c] = this.a[this.a[280] + this.b];
                        }
                        ++this.c;
                    }
                }
                this.a.close();
                this.a = null;
            }
            catch (IOException iOException) {
                return;
            }
        }
        catch (Exception exception) {}
    }

    final void a(int n, int n2, int n3, String string, int n4) {
        this.a = 0;
        while (this.a < string.length()) {
            this.b[this.b[228] + this.a] = this.a[this.a[280] + (byte)string.charAt(this.a)];
            ++this.a;
        }
        this.b[229] = (short)(this.b[228] + string.length());
        this.a(n, n2, n3, 228, n4);
    }

    final void a(int n, int n2, int n3, int n4, int n5) {
        this.h = n2 == -100 ? 13 + this.b : this.a;
        if (this.h >= 13 && this.f[this.h] != 0) {
            return;
        }
        this.d[this.h] = (byte)(this.b[n4 + 1] - this.b[n4]);
        this.e[this.h] = (byte)n5;
        if (this.h >= 13) {
            n5 = 1;
        }
        this.d[this.h] = (short)((this.d[this.h] - 1) * (0 + n5));
        this.f[this.h] = (short)n;
        this.e[this.h] = (short)(this.h >= 13 ? 0 : n2);
        this.a = 0;
        while (this.a < this.d[this.h]) {
            this.d = this.b[this.b[n4] + this.a];
            if (this.d == 126) {
                this.c[this.h][this.a] = this.d;
                int n6 = this.h;
                this.d[n6] = (short)(this.d[n6] - ((0 + n5) * 2 + 2));
            } else {
                this.c[this.h][this.a] = (byte)(this.d / 30);
                this.b[this.h][this.a] = (byte)(this.d % 30);
                if (this.d / 30 != 0 || this.d % 30 < 14) {
                    int n7 = this.h;
                    this.d[n7] = (short)(this.d[n7] + ((this.a[this.a[281 + n5] + this.c[this.h][this.a] * 21 + this.b[this.h][this.a] + 1] & 0xFF) - (this.a[this.a[281 + n5] + this.c[this.h][this.a] * 21 + this.b[this.h][this.a]] & 0xFF)));
                }
            }
            ++this.a;
        }
        if (n4 == 97) {
            this.a.a(1041, 26, n2 - 2);
            this.a.a(1047, 211, n2 - 2);
        }
        if (this.h < 13) {
            int n8 = this.h;
            this.f[n8] = (short)(this.f[n8] - this.d[this.h] * n3 / 2);
            this.a = (byte)(this.a + 1);
            return;
        }
        this.b = (byte)(this.b + 1);
        if (this.b >= 20) {
            this.b = 0;
        }
    }

    final void a(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n4 >= 0) {
            this.a(n, n2, 0, n4, n7);
            this.i = this.d[this.h] + 1;
            this.j = this.h;
        }
        if (n5 >= 0) {
            this.a(n + this.i, n2, 0, n5, n7);
            this.i += this.d[this.h] + 1;
        }
        if (n6 >= 0) {
            this.a(n + this.i, n2, 0, n6, n7);
            this.i += this.d[this.h];
        }
        while (this.j < this.a) {
            int n8 = this.j++;
            this.f[n8] = (short)(this.f[n8] - this.i * n3 / 2);
        }
    }

    final void a(Graphics graphics) {
        this.k = 0;
        while (this.k < this.a) {
            this.m = this.f[this.k];
            this.l = 0;
            while (this.l < this.d[this.k]) {
                if (this.c[this.k][this.l] == 126) {
                    this.m -= 0 + this.e[this.k] + 2;
                } else {
                    this.n = this.e[this.k];
                    this.q = this.m;
                    this.o = (this.a[this.a[281 + this.e[this.k]] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l] + 1] & 0xFF) - (this.a[this.a[281 + this.e[this.k]] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l]] & 0xFF);
                    if (this.c[this.k][this.l] == 0 && this.b[this.k][this.l] >= 14) {
                        this.n -= this.a[this.a[285] + this.b[this.k][this.l] - 14];
                        this.q -= 0 + (this.o + this.p) / 2;
                    }
                    f.a(graphics, this.a.a[0][25 + this.e[this.k]], this.a[this.a[281 + this.e[this.k]] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l]] & 0xFF, this.a[this.a[284] + this.e[this.k] * 3 + this.c[this.k][this.l]], this.o, this.a[this.a[283] + this.e[this.k] * 3 + this.c[this.k][this.l]], 11 + this.q, 8 + this.n, 20);
                    if (this.c[this.k][this.l] != 0 || this.b[this.k][this.l] < 14) {
                        this.m += this.o + 0 + this.e[this.k];
                    }
                    this.p = this.o;
                }
                ++this.l;
            }
            ++this.k;
        }
        this.a = 0;
    }

    final void b() {
        this.k = 13 + this.c;
        while (this.k != 13 + this.b) {
            int n = this.k;
            this.e[n] = (short)(this.e[n] + (this.e[this.k] / 4 + 1));
            if (this.e[this.k] >= 15) {
                this.f[this.k] = 0;
                this.c = (byte)(this.c + 1);
                if (this.c >= 20) {
                    this.c = 0;
                }
            }
            if (this.k == 32) {
                this.k = 12;
            }
            ++this.k;
        }
        this.k = 0;
        while (this.k < 122) {
            if (this.f[this.k] != 0 && this.k % 3 == this.a.c % 3) {
                this.a(this.k, -100, 0, (this.f[this.k] > 0 ? "+" : "") + this.f[this.k], this.f[this.k] > 0 ? 2 : (this.k <= 50 ? 1 : 0));
                this.f[this.k] = 0;
            }
            ++this.k;
        }
    }

    final void a(int n, int n2, int n3) {
        this.k = 13 + this.c;
        while (this.k != 13 + this.b) {
            if (this.f[this.k] == n) {
                this.m = n2 - this.d[this.k] / 2 + this.a.a(255, 5) - 2;
                this.n = n3 - 5 - this.e[this.k] * 2;
                this.l = 0;
                while (this.l < this.d[this.k]) {
                    this.o = (this.a[this.a[282] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l] + 1] & 0xFF) - (this.a[this.a[282] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l]] & 0xFF);
                    f.a(f.a[1], this.a.a[0][26], this.a[this.a[282] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l]] & 0xFF, this.a[this.a[284] + 3 + this.c[this.k][this.l]] + this.a[this.a[283] + 3 + 0] * this.e[this.k], this.o, this.a[this.a[283] + 3 + this.c[this.k][this.l]], 11 + this.m, 8 + this.n, 20);
                    this.m += this.o + 0 + 1;
                    ++this.l;
                }
            }
            if (this.k >= 32) {
                this.k = 12;
            }
            ++this.k;
        }
    }

    final void b(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        ++n;
        n3 -= 2;
        n2 += 4;
        n4 -= 4;
        if (n5 >= 71) {
            n5 += this.a[this.a[309] + this.g] & 0xFF;
        }
        this.w = 0;
        this.u = 0;
        this.g[0] = this.a[1][n5];
        this.x = 0;
        this.v = this.a[1][n5] & 0xFFFF;
        while (this.v < (this.a[1][n5 + 1] & 0xFFFF)) {
            if (this.a[1][this.v] == 42 && (this.a[1][this.v + 1] < 90 || this.a[1][this.v + 1] >= 112) || this.a[1][this.v] == 127) {
                this.w = this.v + 1;
                this.y = this.x;
            }
            if (this.a[1][this.v] == 126) {
                this.x -= 0 + n7 + 2;
            } else if (this.a[1][this.v] < 127 && (this.a[1][this.v] / 30 != 0 || this.a[1][this.v] % 30 < 14)) {
                this.x += 0 + n7;
                this.x += this.a[1][this.v] >= 90 ? 15 : (this.a[this.a[281 + n7] + this.a[1][this.v] / 30 * 21 + this.a[1][this.v] % 30 + 1] & 0xFF) - (this.a[this.a[281 + n7] + this.a[1][this.v] / 30 * 21 + this.a[1][this.v] % 30] & 0xFF);
            }
            if (this.x > n3 && this.w > (this.g[this.u] & 0xFFFF) || this.a[1][this.v] == 127) {
                ++this.u;
                this.g[this.u] = (short)this.w;
                this.h[this.u - 1] = (short)(n + (n3 - this.y) * (n6 & 1) / 2);
                this.v = this.w - 1;
                this.x = 0;
            }
            if (this.a[1][this.v] == 70 || this.a[1][this.v] == 73 || this.a[1][this.v] == 78) {
                this.w = this.v + 1;
                this.y = this.x;
            }
            ++this.v;
        }
        if (this.x > 0) {
            ++this.u;
            this.h[this.u - 1] = (short)(n + (n3 - this.x) * (n6 & 1) / 2);
            this.g[this.u] = this.a[1][n5 + 1];
        }
        this.r = n2 + (n6 == 3 && this.u * 17 < n4 ? (n4 - this.u * 17) / 2 : 0);
        this.s = n7;
        this.t = n4 / 17;
    }

    final void a(Graphics graphics, int n) {
        try {
            this.k = n;
            while (this.k < n + this.t && this.k < this.u) {
                this.m = this.h[this.k];
                this.l = this.g[this.k] & 0xFFFF;
                while (this.l < (this.g[this.k + 1] & 0xFFFF)) {
                    if (this.a[1][this.l] != 127) {
                        if (this.a[1][this.l] == 126) {
                            this.m -= 0 + this.s + 2;
                        } else {
                            this.n = this.r + (this.k - n) * 17;
                            if (this.a[1][this.l] > 112) {
                                this.z = this.a[1][this.l] - 112 - 1 + 19;
                                this.a(24, this.n, 0, String.valueOf(this.z == 24 ? this.a.a[0][this.z] * 10 + this.a.a(65535, 10) : this.a.a[0][this.z]), 0);
                                this.a(216, this.n, 2, String.valueOf(this.z == 24 ? this.a.a[1][this.z] * 10 + this.a.a(65535, 10) : this.a.a[1][this.z]), 0);
                            } else {
                                this.z = this.a[1][this.l] / 30;
                                this.A = this.a[1][this.l] % 30;
                                this.o = this.z >= 3 ? 15 : (this.a[this.a[281 + this.s] + this.z * 21 + this.A + 1] & 0xFF) - (this.a[this.a[281 + this.s] + this.z * 21 + this.A] & 0xFF);
                                this.q = this.m;
                                if (this.z >= 3) {
                                    this.a.a(560 + this.a[1][this.l] - 90, this.q, this.n + -1);
                                } else {
                                    if (this.z == 0 && this.A >= 14) {
                                        this.n -= this.a[this.a[285] + this.A - 14];
                                        this.q -= 0 + (this.o + this.p) / 2;
                                    }
                                    f.a(graphics, this.a.a[0][25 + this.s], this.a[this.a[281 + this.s] + this.z * 21 + this.A] & 0xFF, this.a[this.a[284] + this.s * 3 + this.z], this.o, this.a[this.a[283] + this.s * 3 + this.z], 11 + this.q, 8 + this.n, 20);
                                }
                                if (this.z != 0 || this.A < 14) {
                                    this.m += this.o + 0 + this.s;
                                }
                                this.p = this.o;
                            }
                        }
                    }
                    ++this.l;
                }
                ++this.k;
            }
            this.a.Q = n == 0;
            if (n + this.t < this.u) {
                this.a.R = false;
                return;
            }
            this.a.R = true;
        }
        catch (Exception exception) {}
    }
}
