package apptcvr.iss.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        // button controller
        buttonController();

        //Create ListView
        creatListView();

    }   // Main Method

    private void creatListView() {

        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
                R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09,
                R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15,
                R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};

        String[] titleString = new String[20];
        titleString[0] = "หัวข้อหลัก 1";
        titleString[1] = "หัวข้อหลัก 2";
        titleString[2] = "หัวข้อหลัก 3";
        titleString[3] = "หัวข้อหลัก 4";
        titleString[4] = "หัวข้อหลัก 5";
        titleString[5] = "หัวข้อหลัก 6";
        titleString[6] = "หัวข้อหลัก 7";
        titleString[7] = "หัวข้อหลัก 8";
        titleString[8] = "หัวข้อหลัก 9";
        titleString[9] = "หัวข้อหลัก 10";
        titleString[10] = "หัวข้อหลัก 11";
        titleString[11] = "หัวข้อหลัก 12";
        titleString[12] = "หัวข้อหลัก 13";
        titleString[13] = "หัวข้อหลัก 14";
        titleString[14] = "หัวข้อหลัก 15";
        titleString[15] = "หัวข้อหลัก 16";
        titleString[16] = "หัวข้อหลัก 17";
        titleString[17] = "หัวข้อหลัก 18";
        titleString[18] = "หัวข้อหลัก 19";
        titleString[19] = "หัวข้อหลัก 20";

        String[] detailString = getResources().getStringArray(R.array.detail_short);


        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleString, detailString);
        trafficListView.setAdapter(myAdapter);



    }   //CreateListView


    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.mosquito);
                mediaPlayer.start();

                //Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.frischeluft.co"));
                startActivity(intent);


            }
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }


}   // main class นี่คือ คลาสหลัก
