/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class tribes
extends MIDlet
implements Runnable {
    f a;
    d a;
    Display a;

    public void startApp() {
        if (this.a != null) {
            this.a.e();
            return;
        }
        this.a = Display.getDisplay((MIDlet)this);
        Thread thread = new Thread(this);
        thread.start();
    }

    public void pauseApp() {
        if (this.a != null) {
            this.a.d();
        }
    }

    public void destroyApp(boolean bl) {
        if (this.a != null) {
            this.a.b();
        }
    }

    public void run() {
        System.gc();
        Thread.yield();
        this.a = new d(this);
        this.a.a();
        this.a.a = 0;
        this.a.setCurrent((Displayable)this.a);
        tribes.a(1000);
        this.a.a();
        tribes.a(2000);
        this.a.a = 1;
        this.a.a();
        System.gc();
        Thread.yield();
        tribes.a(2000);
        this.a.a = (byte)2;
        this.a.a();
        Thread.yield();
        this.a.a = (byte)5;
        this.a = new f(this);
        this.a.a();
    }

    static void a(int n) {
        try {
            Thread.sleep(n);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }
}
