/*
package location.example.administrator.location;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

*/
/**
 * 百度基站定位错误返回码
 *//*

// 61 ： GPS定位结果
// 62 ： 扫描整合定位依据失败。此时定位结果无效。
// 63 ： 网络异常，没有成功向服务器发起请求。此时定位结果无效。
// 65 ： 定位缓存的结果。
// 66 ： 离线定位结果。通过requestOfflineLocaiton调用时对应的返回结果
// 67 ： 离线定位失败。通过requestOfflineLocaiton调用时对应的返回结果
// 68 ： 网络连接失败时，查找本地离线定位时对应的返回结果
// 161： 表示网络定位结果
// 162~167： 服务端定位失败
// 502：KEY参数错误
// 505：KEY不存在或者非法
// 601：KEY服务被开发者自己禁用
// 602: KEY Mcode不匹配,意思就是您的ak配置过程中安全码设置有问题，请确保： sha1正确，“;”分号是英文状态；且包名是您当前运行应用的包名
// 501-700：KEY验证失败

public class WeatherActivity extends Activity implements OnClickListener {

	private static final String TAG = "yang.jianan";
	private TextView mText;
	private TextView mTextPoi;
	private LocationClient mLocationClient = null;
	private BDLocationListener myListener = new MyLocationListener();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weather);
		mLocationClient = new LocationClient(getApplicationContext()); // 声明LocationClient类
		// mLocationClient.setAccessKey("8mrnaFzKu3DoduLnWuB5Lt2w"); //V4.1
		// mLocationClient.setAK("8mrnaFzKu3DoduLnWuB5Lt2w"); //V4.0
		mLocationClient.registerLocationListener(myListener); // 注册监听函数
		setLocationOption();
		mLocationClient.start();// 开始定位
		initWidgets();
	}

	private void initWidgets() {
		mText = (TextView) findViewById(R.id.tv_text);
		mTextPoi = (TextView) findViewById(R.id.tv_text_poi);
		Button btn = (Button) findViewById(R.id.btn_request);
		btn.setOnClickListener(this);
		btn = (Button) findViewById(R.id.btn_request_poi);
		btn.setOnClickListener(this);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mLocationClient.stop();// 停止定位
	}

	*/
/**
	 * 设置相关参数
	 *//*

	private void setLocationOption() {
		LocationClientOption option = new LocationClientOption();
		option.setOpenGps(true);
		option.setIsNeedAddress(true);// 返回的定位结果包含地址信息
		option.setAddrType("all");// 返回的定位结果包含地址信息
		option.setCoorType("bd09ll");// 返回的定位结果是百度经纬度,默认值gcj02
		option.setScanSpan(5000);// 设置发起定位请求的间隔时间为5000ms
		option.disableCache(true);// 禁止启用缓存定位
		option.setPoiNumber(5); // 最多返回POI个数
		option.setPoiDistance(1000); // poi查询距离
		option.setPoiExtraInfo(true); // 是否需要POI的电话和地址等详细信息
		mLocationClient.setLocOption(option);
	}

	public class MyLocationListener implements BDLocationListener {
		@Override
		public void onReceiveLocation(BDLocation location) {
			if (location == null)
				return;
			StringBuffer sb = new StringBuffer(256);
			sb.append("当前时间 : ");
			sb.append(location.getTime());
			sb.append("\n错误码 : ");
			sb.append(location.getLocType());
			sb.append("\n纬度 : ");
			sb.append(location.getLatitude());
			sb.append("\n经度 : ");
			sb.append(location.getLongitude());
			sb.append("\n半径 : ");
			sb.append(location.getRadius());
			if (location.getLocType() == BDLocation.TypeGpsLocation) {
				sb.append("\n速度 : ");
				sb.append(location.getSpeed());
				sb.append("\n卫星数 : ");
				sb.append(location.getSatelliteNumber());
			} else if (location.getLocType() == BDLocation.TypeNetWorkLocation) {
				sb.append("\n地址 : ");
				sb.append(location.getAddrStr());
			}
			mText.setText(sb.toString());
			Log.d(TAG, "onReceiveLocation " + sb.toString());
		}

		public void onReceivePoi(BDLocation poiLocation) {
			// 将在下个版本中去除poi功能
			if (poiLocation == null) {
				return;
			}
			StringBuffer sb = new StringBuffer(256);
			sb.append("Poi time : ");
			sb.append(poiLocation.getTime());
			sb.append("\nerror code : ");
			sb.append(poiLocation.getLocType());
			sb.append("\nlatitude : ");
			sb.append(poiLocation.getLatitude());
			sb.append("\nlontitude : ");
			sb.append(poiLocation.getLongitude());
			sb.append("\nradius : ");
			sb.append(poiLocation.getRadius());
			if (poiLocation.getLocType() == BDLocation.TypeNetWorkLocation) {
				sb.append("\naddr : ");
				sb.append(poiLocation.getAddrStr());
			}
			if (poiLocation.hasPoi()) {
				sb.append("\nPoi:");
				sb.append(poiLocation.getPoi());
			} else {
				sb.append("noPoi information");
			}
			mTextPoi.setText(sb.toString());
			Log.d(TAG, "onReceivePoi " + sb.toString());
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
			case R.id.btn_request:
				if (mLocationClient != null && mLocationClient.isStarted())
					mLocationClient.requestLocation();
				else
					Log.d(TAG, "locClient is null or not started");
				break;
			case R.id.btn_request_poi:
				// 请求POI数据
				if (mLocationClient != null && mLocationClient.isStarted())
					mLocationClient.requestPoi();
				break;
			default:
				break;
		}
	}
}
*/
