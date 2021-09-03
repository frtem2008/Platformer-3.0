import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
    private static final boolean[] keys = new boolean[66568];
    private static boolean left;
    private static boolean right;
    private static boolean up;
    private static boolean shift;
    private static boolean f11;
    private static boolean s;
    private static boolean e;
    private static boolean r;
    private static boolean f;
    private static boolean q;
    private static boolean c;
    private static boolean v;
    private static boolean g;
    private static boolean x;
    private static boolean z;
    private static boolean b;
    private static boolean ctrl;
    private static boolean m;
    private static boolean n;
    private static boolean del;
    private static boolean tab;
    private static boolean u;

    public Keyboard() {
    }

    public boolean getB() {
        return b;
    }

    public boolean getDel() {
        return del;
    }
    public boolean getTab() {
        return tab;
    }
    public boolean getU(){
        return u;
    }
    public void update() {
        u = keys[KeyEvent.VK_U];
        tab = keys[KeyEvent.VK_TAB];
        del = keys[KeyEvent.VK_DELETE];
        b = keys[KeyEvent.VK_B];
        z = keys[KeyEvent.VK_Z];
        left = keys[37] || keys[65];
        right = keys[39] || keys[68];
        up = keys[38] || keys[87] || keys[32];
        boolean space = keys[32];
        shift = keys[16];
        f11 = keys[122];
        s = keys[83];
        e = keys[69];
        r = keys[82];
        f = keys[70];
        q = keys[81];
        c = keys[67];
        v = keys[86];
        g = keys[71];
        x = keys[88] || keys[127];
        ctrl = keys[KeyEvent.VK_CONTROL];
        m = keys[KeyEvent.VK_M];
        n = keys[KeyEvent.VK_N];
    }

    public boolean getCtrl() {
        return ctrl;
    }

    public boolean getM() {
        return m;
    }

    public boolean getN() {
        return n;
    }

    public boolean getZ() {
        return z;
    }

    public boolean getX() {
        return x;
    }

    public boolean getG() {
        return g;
    }

    public boolean getV() {
        return v;
    }

    public boolean getC() {
        return c;
    }

    public boolean getQ() {
        return q;
    }

    public boolean getF() {
        return f;
    }

    public boolean getE() {
        return e;
    }

    public boolean getR() {
        return r;
    }

    public boolean getLeft() {
        return left;
    }

    public boolean getRight() {
        return right;
    }

    public boolean getUp() {
        return up;
    }

    public boolean getF11() {
        return f11;
    }

    public boolean getS() {
        return s;
    }

    public boolean getShift() {
        return shift;
    }

    public void keyPressed(KeyEvent event) {
        keys[event.getKeyCode()] = true;
    }

    public void keyReleased(KeyEvent event) {
        keys[event.getKeyCode()] = false;
    }

    public void keyTyped(KeyEvent event) {
    }
}
