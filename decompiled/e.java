/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class e {
    f a;
    short[] a;
    byte a;
    byte[] a;
    String[] a = new String[]{"/pi0", "/pi9", "/pi8"};

    public e(f f2) {
        this.a = f2;
        this.a();
        this.c();
        this.i();
        this.a = 0;
        this.d();
        this.a = 1;
        this.d();
        this.b();
        this.f();
        this.e();
        this.g();
        this.h();
    }

    private void a() {
        System.gc();
        Thread.yield();
        int n = 0;
        this.a.b = new short[11][];
        this.a.j = new byte[25][];
        for (int i = 0; i <= 24; ++i) {
            this.a.j[i] = new byte[this.a[n + 10 + 1]];
            if (i <= 10) {
                this.a.b[i] = new short[this.a[n]];
            }
            ++n;
        }
        System.gc();
        Thread.yield();
        this.a.a = new Image[3][];
        this.a.a[2] = new Image[1];
    }

    private void b() {
        System.gc();
        Thread.yield();
        try {
            int n;
            DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream("/pd0"));
            dataInputStream.readByte();
            int n2 = 0;
            for (int i = 0; i <= 10; ++i) {
                for (n = 0; n < this.a[n2]; ++n) {
                    this.a.b[i][n] = dataInputStream.readShort();
                }
                ++n2;
                this.a.a(1);
            }
            for (n = 0; n <= 24; ++n) {
                for (int i = 0; i < this.a[n2]; ++i) {
                    this.a.j[n][i] = dataInputStream.readByte();
                }
                ++n2;
                this.a.a(1);
            }
            dataInputStream.close();
            f.aV = this.a.j[23][this.a.b[10][this.a.b[9][548] & 0x1FFF] & 0x1FFF] + 9;
            f.aU = (240 - this.a.j[1][1010] * 2) / f.aV;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void c() {
        try {
            System.gc();
            Thread.yield();
            this.a.A = 288;
            this.a.O = (byte)11;
            this.a.P = (byte)((this.a.A - 1) / 16 + 1);
            boolean bl = false;
            this.a.y = (byte)(this.a.O >> 1);
            this.a.A = (byte)(this.a.P >> 1);
            this.a.C = this.a.y;
            this.a.D = this.a.A;
            this.a.a = new int[]{264, 264, 240, 240, 240, 240, 68, 240, 68, 63, 240, 240, 240};
            this.a.b = new int[]{352, 304, 22, 48, 22, 48, 55, 86, 49, 55, 38, 0, 0};
            this.a.c = new int[]{0, 0, 304, 304, 326, 326, 0, 326, 0, 0, 326, 0, 0};
            this.a.d = new int[]{0, 16, 0, 0, 298, 272, 0, 234, 0, 0, 282, 320, 0};
            this.a.c = new byte[]{0, 1, 0, 0, 0, 0, 2, 0, 2, 2, 0, 0, 0};
            this.a.d = new byte[]{0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            f.a[this.a.c[1]] = Image.createImage((int)264, (int)304);
            f.a[this.a.c[1]] = f.a[this.a.c[1]].getGraphics();
            f.a[3] = Image.createImage((int)264, (int)304);
            f.a[3] = f.a[3].getGraphics();
            f.a[this.a.c[6]] = Image.createImage((int)79, (int)63);
            f.a[this.a.c[6]] = f.a[this.a.c[6]].getGraphics();
            this.a.bb = this.a.b[2];
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void d() {
        block7: {
            System.gc();
            Thread.yield();
            byte by = this.a[this.a];
            byte by2 = 0;
            try {
                System.gc();
                Thread.yield();
                DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream(this.a[this.a]));
                byte[] byArray = new byte[62502];
                dataInputStream.read(byArray);
                dataInputStream.close();
                int n = 0;
                for (by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                    byte by3 = (byte)(byArray[n] & 0xFF);
                    ++n;
                    if (by2 == 0) {
                        this.a.a[this.a] = new Image[by];
                    }
                    if (by3 == 255) break block7;
                    short s = (short)(by3 << 8 | byArray[n] & 0xFF);
                    ++n;
                    try {
                        if (by2 < 27) {
                            this.a.a[this.a][by2] = Image.createImage((byte[])byArray, (int)n, (int)s);
                        }
                    }
                    catch (Exception exception) {}
                    n += s;
                    this.a.a(2);
                    System.gc();
                    Thread.yield();
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void e() {
        System.gc();
        Thread.yield();
        this.a.a = new c(this.a);
        this.a.a.f = new byte[122];
        this.a.a.e = new byte[33];
        this.a.a.b = new byte[33][25];
        this.a.a.c = new byte[33][25];
        this.a.a.d = new byte[33];
        this.a.a.d = new short[33];
        this.a.a.e = new short[33];
        this.a.a.f = new short[33];
        this.a.a.g = new short[250];
        this.a.a.h = new short[250];
        this.a.a.b(0);
    }

    private void f() {
        System.gc();
        Thread.yield();
        this.a.a = new byte[17638];
        this.a.a = new short[312];
        this.a.b = new short[570];
        this.a.c = new short[5];
        InputStream inputStream = null;
        try {
            inputStream = this.getClass().getResourceAsStream("/a");
            if (inputStream != null) {
                int n;
                int n2;
                int n3;
                int n4;
                this.a.c[0] = 0;
                this.a.a[0] = 0;
                for (n4 = 0; n4 < 312; ++n4) {
                    n3 = inputStream.read() & 0xFF;
                    n2 = inputStream.read() & 0xFF;
                    n = (n2 << 8) + n3;
                    if (n4 < 311) {
                        this.a.a[n4 + 1] = (short)(this.a.a[n4] + n);
                    }
                    if (n <= 0) continue;
                    inputStream.read(this.a.a, this.a.a[n4], n);
                }
                for (n4 = 0; n4 < 5; ++n4) {
                    n3 = inputStream.read() & 0xFF;
                    n2 = inputStream.read() & 0xFF;
                    n = (n2 << 8) + n3;
                    if (n4 < 4) {
                        this.a.c[n4 + 1] = (short)(this.a.c[n4] + n);
                    }
                    for (n3 = 0; n3 < n; ++n3) {
                        n2 = inputStream.read() & 0xFF;
                        this.a.b[this.a.c[n4] + n3] = (short)(((inputStream.read() & 0xFF) << 8) + n2);
                    }
                }
            }
            inputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    private void g() {
        try {
            System.gc();
            Thread.yield();
            f.e = new short[]{8014, 6315, 5648, 3405, 3234};
            f.f = new short[]{0, 8014, 14329, 19977, 23382};
            f.w = new byte[26616];
            this.a.b = new byte[]{0, 1, 2, 3, 4, 4};
            InputStream inputStream = this.getClass().getResourceAsStream("/sa");
            inputStream.read(f.w, 0, 26616);
            inputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void h() {
        try {
            System.gc();
            Thread.yield();
            this.a.h = new int[]{0, 2545, 6965, 10649, 15487, 22633, 27261, 31708, 35466, 39214};
            this.a.v = new byte[42381];
            InputStream inputStream = this.getClass().getResourceAsStream("/ma");
            inputStream.read(this.a.v, 0, 42381);
            inputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void i() {
        System.gc();
        Thread.yield();
        this.a.e = new byte[9983];
        this.a.b = new byte[96][96];
        this.a.c = new byte[96][96];
        this.a.a = new int[3][4];
        try {
            this.a.a = this.a.a.getAppProperty("MIDlet-Version");
            this.a.d = this.a.a.getAppProperty("GameLinkEnabled").equals("true");
            this.a.a = this.a.a.getAppProperty("Cheat-Support").equals("on");
        }
        catch (Exception exception) {}
        if (!this.a.d) {
            return;
        }
        this.a.getClass();
        this.a.U = 1;
    }
}
