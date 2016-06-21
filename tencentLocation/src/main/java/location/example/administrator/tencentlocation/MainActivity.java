/*
package location.example.administrator.tencentlocation;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManager;

public class MainActivity extends AppCompatActivity implements TencentLocationListener{
    String LocInfo;
    String task;
    Context main;
    TencentLocationManager mLocationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onLocationChanged(TencentLocation location, int error, String reason) {
        if (TencentLocation.ERROR_OK == error) {

            double lat = location.getLatitude();// 纬度
            double lot = location.getLongitude();// 经度
            double altitude = location.getAltitude();// 海拔
            float accuracy = location.getAccuracy();// 精度
            String nation = location.getNation();// 国家
            String province = location.getProvince();// 省份
            String city = location.getCity();// 城市
            String district = location.getDistrict();// 区
            String town = location.getTown();// 镇
            String village = location.getVillage();// 村
            String street = location.getStreet();// 街道
            String streetNo = location.getStreetNo();// 门号



            Log.e("定位信息:", lat + " | " + lot + " | " + altitude + " | "
                    + accuracy + " | " + nation + " | " + province + " | "
                    + city + " | " + district + " | " + town + " | " + village
                    + " | " + street + " | " + streetNo);

            task = lat + " | " + lot + " | " + altitude + " | " + accuracy
                    + " | " + nation + " | " + province + " | " + city + " | "
                    + district + " | " + town + " | " + village + " | "
                    + street + " | " + streetNo + " | ";


            String provider=location.getProvider();//定位方式
            if (TencentLocation.GPS_PROVIDER.equals(provider)) {
                // location 是GPS定位结果
                Log.e("定位方式:","GPS");
                ((MainActivity)main).phoneCall("腾讯定位:"+task+"GPS");
            } else if (TencentLocation.NETWORK_PROVIDER.equals(provider)) {
                // location 是网络定位结果
                Log.e("定位方式:","NetWork");
                ((MainActivity)main).phoneCall("腾讯定位:"+task+"NetWork"+" | "+location.getAddress());
                Log.e("地址:", location.getAddress());
            }
            mLocationManager.removeUpdates(this);
        } else {


            Log.e("reason:", reason);
            Log.e("error:", error + "");

        }
    }

    @Override
    public void onStatusUpdate(String name, int status, String desc) {
        Log.e("name:", name);
        Log.e("status:", ""+status);
        Log.e("desc:", desc);
    }

    public void destroyLocManager() {


        if(mLocationManager!=null)
            mLocationManager.removeUpdates(this);
        mLocationManager=null;
    }
}
*/
