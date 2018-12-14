package com.example.timur.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {

    // константы для ID пунктов меню
    final int MENU_ALPHA_ID = 1;
    final int MENU_SCALE_ID = 2;
    final int MENU_TRANSLATE_ID = 3;
    final int MENU_ROTATE_ID = 4;
    final int MENU_COMBO_ID = 5;
    final int MENU_ZOOM_IN_ID = 6;
    final int MENU_ZOOM_OUT_ID = 7;
    final int MENU_MOVE_ID = 8;
    final int MENU_SLIDE_UP_ID = 9;
    final int MENU_SLIDE_DOWN_ID = 10;
    final int MENU_BOUNCE_ID =11;
    final int MENU_SEQUENTAL_ANIMATION_ID =12;


    TextView tv;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        // регистрируем контекстное меню для компонента tv
        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.tv:
                // добавляем пункты
                menu.add(0, MENU_ALPHA_ID, 0, "alpha");
                menu.add(0, MENU_SCALE_ID, 0, "scale");
                menu.add(0, MENU_TRANSLATE_ID, 0, "translate");
                menu.add(0, MENU_ROTATE_ID, 0, "rotate");
                menu.add(0, MENU_COMBO_ID, 0, "combo");
                menu.add(0, MENU_ZOOM_IN_ID, 0, "zoom in");
                menu.add(0, MENU_ZOOM_OUT_ID, 0, "zoom out");
                menu.add(0, MENU_MOVE_ID, 0, "move");
                menu.add(0, MENU_SLIDE_UP_ID, 0, "slide up");
                menu.add(0, MENU_SLIDE_DOWN_ID, 0, "slide down");
                menu.add(0, MENU_BOUNCE_ID, 0, "bounce");
                menu.add(0, MENU_SEQUENTAL_ANIMATION_ID, 0, "sequential animation");
                break;
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Animation anim = null;
        // определяем какой пункт был нажат
        switch (item.getItemId()) {
            case MENU_ALPHA_ID:
                // создаем объект анимации из файла anim/myalpha
                anim = AnimationUtils.loadAnimation(this, R.anim.myalpha);
                break;
            case MENU_SCALE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myscale);
                break;
            case MENU_TRANSLATE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
                break;
            case MENU_ROTATE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
                break;
            case MENU_COMBO_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mycombo);
                break;
            case MENU_ZOOM_IN_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myzoomin);
                break;
            case MENU_ZOOM_OUT_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myzoomout);
                break;
            case MENU_MOVE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mymove);
                break;
            case MENU_SLIDE_UP_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myslideup);
                break;
            case MENU_SLIDE_DOWN_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myslidedown);
                break;
            case MENU_BOUNCE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mybounce);
                break;
            case MENU_SEQUENTAL_ANIMATION_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mysequentialanimation);
                break;
        }
        // запускаем анимацию для компонента tv
        tv.startAnimation(anim);
        return super.onContextItemSelected(item);
    }
}
