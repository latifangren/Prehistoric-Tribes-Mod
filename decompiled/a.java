/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.media.Player
 *  javax.microedition.media.PlayerListener
 *  javax.microedition.media.control.VolumeControl
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class a
implements PlayerListener {
    VolumeControl a;
    Player a;

    public a(String string) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(f.w, f.f[f.f], f.e[f.f]);
            this.a = Manager.createPlayer((InputStream)byteArrayInputStream, (String)string);
            byteArrayInputStream.close();
            this.a.realize();
            this.a.addPlayerListener((PlayerListener)this);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void c() {
        try {
            if (this.a == null) {
                return;
            }
            if (this.a.getState() == 300) {
                this.a();
            }
            if (this.a.getState() != 400) {
                this.a.prefetch();
                this.a.start();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    final void a() {
        try {
            if (this.a == null) {
                return;
            }
            if (this.a.getState() == 400) {
                this.a.setMediaTime(0L);
                this.a.stop();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    final int a() {
        if (this.a == null) {
            return -1;
        }
        return this.a.getState();
    }

    final void b() {
        if (this.a == null) {
            return;
        }
        if (this.a.getState() != 0) {
            this.a.close();
        }
    }

    final void a(int n) {
        try {
            if (this.a == null) {
                return;
            }
            this.a = (VolumeControl)this.a.getControl("VolumeControl");
            if (n != 0) {
                if (this.a.getState() != 400) {
                    this.c();
                }
                this.a.setLevel(n * 20);
                return;
            }
            this.a();
        }
        catch (Exception exception) {}
    }

    public final void playerUpdate(Player player, String string, Object object) {
        if (string.equals("deviceUnavailable")) {
            this.a();
            System.currentTimeMillis();
        }
        if (string.equals("deviceAvailable")) {
            this.c();
        }
    }
}
