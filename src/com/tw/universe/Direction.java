package com.tw.universe;

public enum Direction {
    N(0,1) {
        @Override
        public Direction right() {
            return E;
        }

        @Override
        public Direction left() {
            return W;
        }
    },

    E(1,0) {
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }
    },

    S(0,-1) {
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }
    },

    W(-1,0) {
        @Override
        public Direction right(){
            return N;
        }

        @Override
        public Direction left() {
            return S;
        }
    };

    private int xAxis = 0;
    private int yAxis = 0;

    public abstract Direction right();
    public abstract Direction left();

    Direction(final int xAxis, final int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getAxisX() {
        return this.xAxis;
    }

    public int getAxisY() {
        return this.yAxis;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
