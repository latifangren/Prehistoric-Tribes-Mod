/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class d
extends Canvas {
    byte a;
    boolean a = 0;

    public d(tribes tribes2) {
        this.setFullScreenMode(true);
    }

    public final void paint(Graphics graphics) {
        graphics.drawImage(f.a[0], -11, -8, 0);
    }

    final void a() {
        if (!this.a) {
            this.a = true;
            f.a[0] = Image.createImage((int)264, (int)352);
            f.a[0] = f.a[0].getGraphics();
        }
        try {
            if (this.a < 4) {
                f.a[0].setColor(0xFFFFFF);
                d.b();
                f.a[0].drawImage(Image.createImage((String)("/l" + this.a)), 131, 168, 3);
            }
        }
        catch (Exception exception) {}
        this.repaint();
    }

    private static void b() {
        f.a[0].fillRect(11, 8, 240, 321);
    }

    protected final void keyPressed(int n) {
    }
}
