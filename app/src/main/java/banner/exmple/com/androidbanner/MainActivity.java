package banner.exmple.com.androidbanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ViewHeaderAD mHeaderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHeaderView = findView(R.id.view_news_header);
//        mHeaderView.initData(getImgLoader(), listDatas);
    }

    protected <T extends View> T findView(int viewId) {
        return (T) findViewById(viewId);
    }

}
