public class Tomat extends Tanaman implements Perawatan {
    public Tomat() {
        super(100, 100, 0.25);
    }

    @Override
    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
        if (getProsesBerbuah() >= getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
        }
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + 0.05);
    }

    @Override
    public String toString() {
        return "Tomat - " + super.toString();
    }
}

