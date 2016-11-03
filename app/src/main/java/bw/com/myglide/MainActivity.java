package bw.com.myglide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.GrayscaleTransformation;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
        String path="http://pic33.nipic.com/20130916/3420027_192919547000_2.jpg";

      //  Glide.with(this).load(path).into(img);
        //圆角处理
//        Glide.with(this)
//                .load(path)
//                .bitmapTransform(new RoundedCornersTransformation(this,30,0, RoundedCornersTransformation.CornerType.ALL))
//                .into(img);
        //加载圆形图片

//        Glide.with(this).load(path).asBitmap().centerCrop().into(new BitmapImageViewTarget(img) {
//            @Override
//            protected void setResource(Bitmap resource) {
//                RoundedBitmapDrawable circularBitmapDrawable =
//                        RoundedBitmapDrawableFactory.create(MainActivity.this.getResources(), resource);
//                circularBitmapDrawable.setCircular(true);
//                img.setImageDrawable(circularBitmapDrawable);
//            }
//        });

        //灰度处理
        Glide.with(this)
                .load(path)
                .bitmapTransform(new GrayscaleTransformation(this))
                .into(img);




    }
}
