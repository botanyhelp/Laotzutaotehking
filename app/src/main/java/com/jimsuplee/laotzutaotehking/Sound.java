/**Copyright (C) 2015 Thomas Maher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.jimsuplee.laotzutaotehking;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.ImageView;
//import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

/**
 * Created on 5/12/15.
 */
public class Sound extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);
    }

    public void onClickTwo(View view) {
        //
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/ogg/23974-01.ogg"));
        startActivity(browserIntent);
    }
    public void onClickThree(View view) {
        //
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/ogg/23974-02.ogg"));
        startActivity(browserIntent);
    }
    public void onClickFour(View view) {
        //
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/ogg/23974-03.ogg"));
        startActivity(browserIntent);
    }
    public void onClickFive(View view) {
        //
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/ogg/23974-04.ogg"));
        startActivity(browserIntent);
    }
    public void onClickSix(View view) {
        //
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/ogg/23974-05.ogg"));
        startActivity(browserIntent);
    }
    public void onClickSeven(View view) {
        //
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/ogg/23974-06.ogg"));
        startActivity(browserIntent);
    }
    public void onClickEight(View view) {
        //
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/ogg/23974-07.ogg"));
        startActivity(browserIntent);
    }
    public void onClickNine(View view) {
        //
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/ogg/23974-08.ogg"));
        startActivity(browserIntent);
    }
    public void onClickTen(View view) {
        //
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/ogg/23974-09.ogg"));
        startActivity(browserIntent);
    }
}
