package com.example.gtohill.myfirstgame;

/**
 * Created by gtohill on 01/03/18.
 */



import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by jfdimarzio on 10/21/2015.
 */


public class GameView extends GLSurfaceView {

    private final GameRenderer gameRenderer;
    GestureDetector.SimpleOnGestureListener gestureListener = new GestureDetector.SimpleOnGestureListener(){

        @Override
        public boolean onDown(MotionEvent arg0) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            //React to the fling action
            return false;
        }
        @Override
        public void onLongPress(MotionEvent e) {
            // TODO Auto-generated method stub

        }
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
                                float distanceY) {
            // TODO Auto-generated method stub
            return false;
        }
        @Override
        public void onShowPress(MotionEvent e) {
            // TODO Auto-generated method stub

        }
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            // TODO Auto-generated method stub
            return false;
        }
    };

    public GameView(Context context) {
        super(context);

        setEGLContextClientVersion(2);

        gameRenderer = new GameRenderer(context);

        setRenderer(gameRenderer);

    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {

        float x = e.getX();
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:


                if (x < getWidth() / 2) {
                    gameRenderer.setHeroMove(gameRenderer.getHeroMove() + .1f);
                }

                if (x > getWidth() /2){
                    gameRenderer.setHeroMove(gameRenderer.getHeroMove() - .1f );

                }
        }
        return true;
    }
}

