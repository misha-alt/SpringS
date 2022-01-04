package FuckingSpring;

public enum Albums {
    CLASSICAL, ROCK;

    private String firstSong;
    private String secondSong;
    private String thertSong;

    public String getFirstSong() {
        return firstSong;
    }

    public void setFirstSong(String firstSong) {
        this.firstSong = firstSong;
    }

    public String getSecondSong() {
        return secondSong;
    }

    public void setSecondSong(String secondSong) {
        this.secondSong = secondSong;
    }

    public String getThertSong() {
        return thertSong;
    }

    public void setThertSong(String thertSong) {
        this.thertSong = thertSong;
    }

    @Override
    public String toString() {
        return "Albums{" +
                "firstSong='" + firstSong + '\'' +
                ", secondSong='" + secondSong + '\'' +
                ", thertSong='" + thertSong + '\'' +
                '}';
    }
}
