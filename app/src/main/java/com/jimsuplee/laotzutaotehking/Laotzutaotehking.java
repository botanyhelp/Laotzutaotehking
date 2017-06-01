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
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class Laotzutaotehking extends ActionBarActivity {
    static int index = 0;
    //Integer[] imageIDs = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z,R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.dd,R.drawable.ee,R.drawable.ff,R.drawable.gg,R.drawable.hh,R.drawable.ii,R.drawable.jj,R.drawable.kk,R.drawable.ll,R.drawable.mm,R.drawable.nn,R.drawable.oo,R.drawable.pp,R.drawable.qq,R.drawable.rr,R.drawable.ss,R.drawable.tt,R.drawable.uu,R.drawable.vv,R.drawable.ww,R.drawable.xx,R.drawable.yy,R.drawable.zz,R.drawable.aaa,R.drawable.bbb,R.drawable.ccc,R.drawable.ddd,R.drawable.eee,R.drawable.fff,R.drawable.ggg,R.drawable.hhh,R.drawable.iii,R.drawable.jjj,R.drawable.kkk,R.drawable.lll,R.drawable.mmm,R.drawable.nnn,R.drawable.ooo,R.drawable.ppp,R.drawable.qqq,R.drawable.rrr,R.drawable.sss,R.drawable.ttt,R.drawable.uuu,R.drawable.vvv,R.drawable.www,R.drawable.xxx,R.drawable.yyy,R.drawable.zzz,R.drawable.aaaa,R.drawable.bbbb,R.drawable.cccc};
    Integer[] verseIDs = {R.string.a,R.string.b,R.string.c,R.string.d,R.string.e,R.string.f,R.string.g,R.string.h,R.string.i,R.string.j,R.string.k,R.string.l,R.string.m,R.string.n,R.string.o,R.string.p,R.string.q,R.string.r,R.string.s,R.string.t,R.string.u,R.string.v,R.string.w,R.string.x,R.string.y,R.string.z,R.string.aa,R.string.bb,R.string.cc,R.string.dd,R.string.ee,R.string.ff,R.string.gg,R.string.hh,R.string.ii,R.string.jj,R.string.kk,R.string.ll,R.string.mm,R.string.nn,R.string.oo,R.string.pp,R.string.qq,R.string.rr,R.string.ss,R.string.tt,R.string.uu,R.string.vv,R.string.ww,R.string.xx,R.string.yy,R.string.zz,R.string.aaa,R.string.bbb,R.string.ccc,R.string.ddd,R.string.eee,R.string.fff,R.string.ggg,R.string.hhh,R.string.iii,R.string.jjj,R.string.kkk,R.string.lll,R.string.mmm,R.string.nnn,R.string.ooo,R.string.ppp,R.string.qqq,R.string.rrr,R.string.sss,R.string.ttt,R.string.uuu,R.string.vvv,R.string.www,R.string.xxx,R.string.yyy,R.string.zzz,R.string.aaaa,R.string.bbbb,R.string.cccc};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laotzutaotehking);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_laotzutaotehking, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            /*case R.id.action_sound:
                //Intent soundIntent = new Intent(this, Sound.class);
                //startActivity(soundIntent);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/files/23974/mp3/23974-01.mp3"));
                startActivity(browserIntent);
                return true;*/
            case R.id.action_previous:
                next();
                return true;
            case R.id.action_next:displayTextAndImage();
                previous();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

        //TTT commented out and replaced with above case flow
        // noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        //return super.onOptionsItemSelected(item);
    }
    public void displayTextAndImage() {
        //
        //ImageView iv = (ImageView) findViewById(R.id.image1);
        //iv.setImageResource(imageIDs[index]);
        TextView tv = (TextView) findViewById(R.id.txt_picture);
        tv.setText(verseIDs[index]);
    }

    public void previous() {
        //after hitting next icon on actionBar
        if (Laotzutaotehking.index < 80) {
            Laotzutaotehking.index += 1;
            if (Laotzutaotehking.index == 3) {
                Toast.makeText(this, "1-9 sound http://www.gutenberg.org/files/23974/mp3/23974-01.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 11) {
                Toast.makeText(this, "10-18 sound http://www.gutenberg.org/files/23974/mp3/23974-02.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 20) {
                Toast.makeText(this, "19-27 sound http://www.gutenberg.org/files/23974/mp3/23974-03.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 29) {
                Toast.makeText(this, "28-37 sound http://www.gutenberg.org/files/23974/mp3/23974-04.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 39) {
                Toast.makeText(this, "38-45 sound http://www.gutenberg.org/files/23974/mp3/23974-05.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 47) {
                Toast.makeText(this, "46-54 sound http://www.gutenberg.org/files/23974/mp3/23974-06.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 56) {
                Toast.makeText(this, "55-63 sound http://www.gutenberg.org/files/23974/mp3/23974-07.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 65) {
                Toast.makeText(this, "64-72 sound http://www.gutenberg.org/files/23974/mp3/23974-08.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 74) {
                Toast.makeText(this, "73-81 sound http://www.gutenberg.org/files/23974/mp3/23974-09.mp3", Toast.LENGTH_LONG).show();
            }
        }
        displayTextAndImage();
    }
    public void next() {
        //after hitting previous icon on actionBar
        if(Laotzutaotehking.index>0) {
            Laotzutaotehking.index-=1;
            if (Laotzutaotehking.index == 3) {
                Toast.makeText(this, "1-9 sound http://www.gutenberg.org/files/23974/mp3/23974-01.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 14) {
                Toast.makeText(this, "10-18 sound http://www.gutenberg.org/files/23974/mp3/23974-02.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 24) {
                Toast.makeText(this, "19-27 sound http://www.gutenberg.org/files/23974/mp3/23974-03.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 33) {
                Toast.makeText(this, "28-37 sound http://www.gutenberg.org/files/23974/mp3/23974-04.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 44) {
                Toast.makeText(this, "38-45 sound http://www.gutenberg.org/files/23974/mp3/23974-05.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 51) {
                Toast.makeText(this, "46-54 sound http://www.gutenberg.org/files/23974/mp3/23974-06.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 61) {
                Toast.makeText(this, "55-63 sound http://www.gutenberg.org/files/23974/mp3/23974-07.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 69) {
                Toast.makeText(this, "64-72 sound http://www.gutenberg.org/files/23974/mp3/23974-08.mp3", Toast.LENGTH_LONG).show();
            } else if (Laotzutaotehking.index == 79) {
                Toast.makeText(this, "73-81 sound http://www.gutenberg.org/files/23974/mp3/23974-09.mp3", Toast.LENGTH_LONG).show();
            }
        }
        displayTextAndImage();
    }
    //public void sound() {
        //after hitting headphones icon on actionBar
        //Intent soundIntent = new Intent(this, Sound.class);
        //startActivity(soundIntent);
    //}
}
