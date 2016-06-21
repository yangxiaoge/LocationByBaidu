/*
package location.example.administrator.location;

import android.util.Log;
import android.widget.TextView;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;

import butterknife.Bind;

*/
/**
 * Description:
 * Author: 0027008122 [yang.jianan@zte.com.cn]
 * Time: 2016/3/23 16:33
 * Version: 1.0
 *//*

public class MyLocationListener implements BDLocationListener {
    @Bind(R.id.text1)
    TextView text1;
    @Bind(R.id.text2)
    TextView text2;

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
        text1.setText(sb.toString());
        Log.d("yang.jianan", "onReceiveLocation " + sb.toString());
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
        text2.setText(sb.toString());
        Log.d("yang.jianan", "onReceivePoi " + sb.toString());
    }
}*/
