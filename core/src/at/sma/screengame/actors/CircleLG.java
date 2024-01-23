package at.sma.screengame.actors;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;


public class CircleLG {
        private ShapeRenderer shapeRenderer;

        public CircleLG() {
            shapeRenderer = new ShapeRenderer();
        }
        public void drawFilledCircle(float x, float y, float radius, Color color) {
            shapeRenderer.begin(ShapeType.Line);
            shapeRenderer.setColor(color);
            shapeRenderer.circle(x, y, radius);
            shapeRenderer.end();
        }
        public void dispose() {
            shapeRenderer.dispose();
        }
    }