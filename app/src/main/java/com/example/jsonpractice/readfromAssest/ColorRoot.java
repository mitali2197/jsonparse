package com.example.jsonpractice.readfromAssest;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ColorRoot {
    @SerializedName("colors")
    private final List<Colors> colors;

    public ColorRoot(List<Colors> colors) {
        this.colors = colors;
    }

    public List<Colors> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "ColorRoot{" +
                "colors=" + colors +
                '}';
    }

    public static class Colors {
        @SerializedName("color")
        private final String color;

        @SerializedName("category")
        private final String category;

        @SerializedName("type")
        private final String type;

        @SerializedName("code")
        private final Code code;

        public Colors(String color, String category, String type, Code code) {
            this.color = color;
            this.category = category;
            this.type = type;
            this.code = code;
        }

        public String getColor() {
            return color;
        }

        public String getCategory() {
            return category;
        }

        public String getType() {
            return type;
        }

        public Code getCode() {
            return code;
        }

        public static class Code {
            @SerializedName("rgba")
            private final List<Integer> rgba;

            @SerializedName("hex")
            private final String hex;

            public Code(List<Integer> rgba, String hex) {
                this.rgba = rgba;
                this.hex = hex;
            }

            public List<Integer> getRgba() {
                return rgba;
            }

            public String getHex() {
                return hex;
            }

            @Override
            public String toString() {
                return "Code{" +
                        "rgba=" + rgba +
                        ", hex='" + hex + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Colors{" +
                    "color='" + color + '\'' +
                    ", category='" + category + '\'' +
                    ", type='" + type + '\'' +
                    ", code=" + code +
                    '}';
        }
    }
}
