package lui.koala;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.ImageView;
//import android.view.Window;

public class LoadingScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        //set font
        TextView ala = (TextView) findViewById(R.id.textView);
        TextView k = (TextView) findViewById(R.id.textView2);
        Typeface tf = Typeface.createFromAsset(getAssets(), "Fonts/Odin Rounded - Bold.otf");
        ala.setTypeface(tf);
        k.setTypeface(tf);

        ImageView img = (ImageView) findViewById(R.id.koala);
        img.setImageDrawable(getResources().getDrawable(R.drawable.koalalogobrows));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loading_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
