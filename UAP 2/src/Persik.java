public class Persik extends Tanaman implements Perawatan {
    public Persik() {
        super(180, 250, 0.15);
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
        setPerkembangan(getPerkembangan() + 0.025);
    }

    @Override
    public String toString() {
        return "Persik - " + super.toString();
    }
}

