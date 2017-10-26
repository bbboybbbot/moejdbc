package com.github.timeloveboy.moejdbc;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
}
