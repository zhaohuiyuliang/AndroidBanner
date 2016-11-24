package banner.exmple.com.androidbanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;


/**
 */
public class ViewNewsBanner extends RelativeLayout implements View.OnClickListener {
    private Banner banner;
    private ImageView iv_banner;
    //private TextView tv_title;

    public ViewNewsBanner(Context context) {
        super(context, null);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_news_banner, this, true);
        iv_banner = (ImageView) findViewById(R.id.iv_banner);
        setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (banner != null) {

        }
    }


    public String getTitle() {
        return banner.getTitle();
    }
}
