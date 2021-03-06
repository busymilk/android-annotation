package busymilk.annotation.activity;

import busymilk.annotations.activity.FullScreen;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.WindowManager;
/**
 * 要实现带注解解析功能的activity，需继承该类
 * @author qin
 *
 */
public abstract class AnnotationActionBarActivity extends ActionBarActivity {
	private boolean isFullScreen =false;
	
	@Override
	protected void onCreate(Bundle arg0) {
		if(isFullScreen){
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		}
		super.onCreate(arg0);
	}
	
	{
		isFullScreen = AnnotationActivityUtil.hasAnnotation(this.getClass(), FullScreen.class);
	}
}
