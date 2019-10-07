package com.company;

public class Cat implements Animal {
    private String voice;
            private String feed;

    public void voice(){
        System.out.println("I am cat and I say "+ voice);}
    public void feed(){
            System.out.println("I am cat and I like "+ feed);}

    public Cat(String voice, String feed) {
        this.voice = voice;
        this.feed = feed;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }
}
