package com.example.jsonpractice.readfromAssest;

import java.util.ArrayList;

public class Color {

    ArrayList<colorlist> colors;

    public class colorlist {

       private String color,category,type;
        Code code=new Code();

        @Override
        public String toString() {
            return "colorlist{" +
                    "color='" + color + '\'' +
                    ", category='" + category + '\'' +
                    ", type='" + type + '\'' +
                    ", code=" + code +
                    '}';
        }
    }
    public class Code{
       private ArrayList<String> rgba;
       private String hex;

        public ArrayList<String> getRgba() {
            return rgba;
        }

        public void setRgba(ArrayList<String> rgba) {
            this.rgba = rgba;
        }

        public String getHex() {
            return hex;
        }

        public void setHex(String hex) {
            this.hex = hex;
        }

        @Override
        public String toString() {
            return "Code{" +
                    "rgba=" + rgba +
                    ", hex='" + hex + '\'' +
                    '}';
        }
    }
}
