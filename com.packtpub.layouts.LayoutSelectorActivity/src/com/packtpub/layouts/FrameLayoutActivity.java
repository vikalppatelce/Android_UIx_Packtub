/*
 * Copyright Jason Morris 2008. All rights reserved.
 */
package com.packtpub.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * <p>
 * </p><p>
 * Created on 02 Sep 2010
 * </p>
 *
 * @author Jason Morris
 */
public class FrameLayoutActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);

        final Button kicker = (Button)findViewById(R.id.overlay_button);
        kicker.setOnClickListener(this);

        final Button quit = (Button)findViewById(R.id.quit);
        quit.setOnClickListener(this);
    }

    public void onClick(final View view) {
        switch(view.getId()) {
            case R.id.overlay_button:
                final View display = findViewById(R.id.overlay);
                display.setVisibility(
                        display.getVisibility() != View.VISIBLE
                        ? View.VISIBLE
                        : View.GONE);
                break;
            case R.id.quit:
                finish();
                break;
        }
    }

}
