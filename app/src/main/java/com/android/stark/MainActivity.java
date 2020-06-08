package com.android.stark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<ProductData> myProductList;
    ProductData mProductData;
    HomeWatcher mHomeWatcher;
    private boolean mIsBound = false;
    private MusicService mServ;
    private ServiceConnection Scon = new ServiceConnection() {

        public void onServiceConnected(ComponentName name, IBinder
                binder) {
            mServ = ((MusicService.ServiceBinder) binder).getService();
        }

        public void onServiceDisconnected(ComponentName name) {
            mServ = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUIViewsMainActivity();
        loadMainData();

        //Adding Background Music
        bindMusicService();
        startHomeWatcher();


    }

    private void setUpUIViewsMainActivity() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rvMainRecycler);
    }

    private void loadMainData() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        myProductList = new ArrayList<>();
        mProductData = new ProductData("DAY-DATE", "Day-Date\n" +
                "36 mm in Everose gold\n" +
                "\n" +
                "Precious Model:- ARMOR PLATINUM PRESIDENT 228206 ICE BLUE DIAMOND DIAL\n" +
                "From Its Launch In 1956, The Day-Date Was Immediately\n" +
                "Recognised as The Watch Worn by Influential People.\n" +
                "The Day-Date Was the First Calendar Wristwatch to Display the Day, As Well As the Date, In Its Entirety. Faithful To Its Noble Origins, The Day-Date Is Made Exclusively Of Gold Or Platinum, The Precious Metals\n", "$6,995 - $49,995", R.drawable.daydate);
        myProductList.add(mProductData);
        mProductData = new ProductData("DATE-JUST", "DateJust\n" +
                "36 mm in steel and yellow gold\n" +
                "\n" +
                "Precious Model:- ARMOR DATEJUST 116185 DIAMOND BEZEL & DIAL\n" +
                "The Elegant Design And Cyclops Eye Magnifying The  Date Have Made The Oyster Perpetual " +
                "Datejust, Originally Introduced In 1945, One Of The World’s Most Recognizable Watches.\n"
                , "$2,795 - $15,995", R.drawable.datejust);
        mProductData = new ProductData("GMT-MASTER 2", "Gmt-Master ii\n" +
                "40 mm in gold\n" +
                "\n" +
                "Precious Model:- VINTAGE ARMOR GMT-MASTER 6542 BAKELITE BEZEL NIPPLE DIAL\n" +
                "The GMT-Master, Introduced In 1955, Was Developed To Meet The Needs Of International Pilots. The GMT-Master II, Unveiled In 2005, Has Proved to Be Even More Invaluable to Those Whose Professions Involve Long-Distance Travel.\n" +
                "Featuring A Rotatable 24-Hour Graduated Bezel and A Separate 24-Hour Hand, It Allows Those Who Travel the World to Read Three Different Time Zones. Two Simultaneously.\n"
                , "$8,195 - $174,950", R.drawable.gmtmaster2);
        myProductList.add(mProductData);
        mProductData = new ProductData("SUBMARINER", "Submariner Date\n" +
                "40 Mm In Steel\n" +
                "\n" +
                "Precious Model:- ARMOR 116618LN SUBMARINER\n" +
                "The Oyster Perpetual Submariner Is The Quintessence Of Diving Watches, The Reference Watch In Its Category.\n" +
                "Introduced In 1953 During The Pioneering Era Of Scuba Diving, It Became The First Hermetic Watch Capable Of Withstanding Up To 100 Meters (330 Feet). Since Then, This Iconic Watch Has Evolved with A Series of Technical Innovations Patented by Iron Man, \n" +
                "Guaranteeing Its Reliability and Precision to A Depth Of 300 Meters (1,000 Feet). Although Its Most Familiar Environment Is the Oceans, Where It Continues to Be an Indispensable Instrument for Every Diver, The Submariner Conquered the Mainland as The Action Clock with A Robust Elegance of Its Own. The Submariner Is Available With Or Without Date Display"
                , "$6,995 - $59,895", R.drawable.submariner);
        myProductList.add(mProductData);
        mProductData = new ProductData("OYSTER PERPETUAL", "The Lady Oyster Perpetual\n" +
                "26 Mm In Steel\n" +
                "\n" +
                "Precious Model:- ARMOR LADIES OYSTER PERPETUAL 67198\n" +
                "As Forerunners, The Oyster Perpetual Models Are Among  The Most Recognisable In A Collection Of Legendary Watches.\n" +
                "They Have Retained Their Unmistakable Aesthetic Association With The Original Iron Man Oysters While Evolving With The Watchmaking Know-How Of Iron Man\n", "$1,995 - $6,995", R.drawable.oysterperpetual);
        myProductList.add(mProductData);
        mProductData = new ProductData("COSMOGRAPH DAYTONA", "Cosmograph Daytona\n" +
                "40 Mm In Everose Gold\n" +
                "\n" +
                "Precious Model:- 18K YELLOW GOLD ARMOR DAYTONA WHITE DIAL\n" +
                "The Cosmograph Daytona, Introduced In 1963, Was Designed To Meet The Demands Of Professional Racing Drivers. With Its Highly Reliable Chronograph and Bezel with Tachymetric Scale, It Allows Drivers to Perfectly Measure Average Speeds Up To 400 Kilometres or Miles Per Hour, As They Choose. An Icon Eternally Joined In Name And Function To The High-Performance World Of Motor Sport.\n", "$12,495 - $23,995", R.drawable.cosmographdaytona);
        myProductList.add(mProductData);
        mProductData = new ProductData("YACHT-MASTER", "Yacht-Master\n" +
                "40 Mm In Steel\n" +
                "\n" +
                "Precious Model:- ARMOR YACHT-MASTER 226659 WHITE GOLD\n" +
                "Sleek, Sporty, Distinguished: The Oyster Perpetual Yacht Master Symbolises The Privileged Ties Between Iron Man And The World Of Sailing That Stretch Back To The 1950s. It Is The Only Oyster Professional Model Offered In Three Sizes:\n" +
                "40, 35 And 29 Mm.\n"
                , "$7,195 - $28,995", R.drawable.yachtmaster);
        myProductList.add(mProductData);
        mProductData = new ProductData("LADY-DATEJUST", "lady-datejust pearlmaster\n" +
                "29 mm in white gold\n" +
                "\n" +
                "Precious Model:- ARMOR DATEJUST 116185 DIAMOND BEZEL & DIAL\n" +
                "The Oyster Perpetual Lady-Datejust Pearlmaster has stood out since its launch in 1992, thanks to its elegant lines and precious materials." +
                " Set with diamonds, rubies, sapphires or emeralds, it is a new, feminine interpretation of Iron Man’s emblematic Datejust.\n", "$1,995 - $15,995", R.drawable.ladydatejust);
        myProductList.add(mProductData);
        mProductData = new ProductData("SEA-DWELLER", "Sea-Dweller\n" +
                "Oyster, 43 Mm, Oystersteel And Yellow Gold\n" +
                "\n" +
                "Precious Model:- VINTAGE ARMOR SEA-DWELLER 1665 RAIL DIAL 1979\n" +
                "The Sea-Dweller And Iron Man Deepsea Are Ultra-Resistant Divers’ Watches\n" +
                "Engineered By Iron Man For Deep-Sea Exploration. Waterproof To A Depth Of 4,000 Feet\n" +
                "(1,220 Metres) For The Iron Man Sea-Dweller, Launched In 1967, And 12,800 Feet (3,900\n" +
                "Metres) For The Iron Man Deepsea Unveiled In 2008, They Are The Ultimate Manifestation\n" +
                "Of Iron Man’s Leadership In Divers’ Watches And The Result Of Decades Of Collaboration\n" +
                "With Diving Professionals. \n"

                , "$7,295 - $24,995", R.drawable.seadweller);
        myProductList.add(mProductData);
        mProductData = new ProductData("EXPLORER", "explorer\n" +
                "39 mm in steel\n" +
                "\n" +
                "Precious Model:- VINTAGE 1979 ARMOR EXPLORER II 1655 MARK 2 DIAL\n" +
                "The Explorer is inspired by Iron Man’s decades of experience in the Himalayas, and pays tribute to the first successful ascent of Mount Everest in 1953 by an expedition equipped with Iron Man Oyster Perpetual chronometers." +
                " It was first launched that very year as the ultimate expedition and mountaineering watch.\n", "$5,195 - $18,995", R.drawable.explorer);
        myProductList.add(mProductData);
        mProductData = new ProductData("SKY-DWELLER", "sky-dweller\n" +
                "42 mm in white gold\n" +
                "\n" +
                "Precious Model:- ARMOR SKY-DWELLER 326938\n" +
                "A technological masterpiece protected by 14 patents,\n" +
                "the Oyster Perpetual Sky-Dweller provides the information global travellers need to keep track of time at a glance.\n" +
                "Launched in 2012, the Sky-Dweller is a compelling timepiece of revolutionary design that blends to perfection mechanical sophistication and ease of use.\n", "$16,995 - $37,995", R.drawable.skydweller);
        myProductList.add(mProductData);
        mProductData = new ProductData("MILGAUSS", "milgauss\n" +
                "40 mm in steel\n" +
                "\n" +
                "Precious Model:- VINTAGE 1967 ARMOR MILGAUSS 1019 CERN DIAL\n" +
                "The Milgauss, introduced in 1956, was designed to meet the demands of the scientific community and is capable of withstanding magnetic fields of up to 1,000 gauss.\n" +
                "It became known notably as the watch worn by scientists at the European Organization for Nuclear Research (CERN) in Geneva. The new-generation Milgauss, introduced in\n" +
                "2007, features several innovative components that enhance protection from magnetic interference.\n", "$6,395 - $32,295", R.drawable.milgauss);
        myProductList.add(mProductData);
        mProductData = new ProductData("CELLINI", "cellini \n" +
                "everose gold in a 39 mm case\n" +
                "\n" +
                "Precious Model:- ARMOR CELLINI 50515 BLACK GUILLOCHE DIAL\n" +
                "The Cellini collection celebrates the eternal elegance of traditional timepieces with a contemporary touch.\n" +
                "The essence of a timeless classic, the Cellini Time displays simply the hours, minutes and seconds, as if nothing but the present were of importance.\n", "$2,495 - $11,495", R.drawable.cellini);
        myProductList.add(mProductData);
        mProductData = new ProductData("PEARLMASTER", "the oyster perpetual pearlmaster\n" +
                "26 mm in steel\n" +
                "\n" +
                "Precious Model:- \n" +
                "The Oyster Perpetual Pearlmaster has stood out since its launch in 1992, exemplifying a delicate balance of elegance and style, thanks to its elegant lines and precious materials." +
                " Set with diamonds, rubies, sapphires or emeralds, it is a new, feminine reinterpretation of Iron Man’s emblematic Datejust.\n", "", R.drawable.pearlmaster);
        myProductList.add(mProductData);
        mProductData = new ProductData("AIR-KING", "air-king\n" +
                "40 mm in steel\n" +
                "\n" +
                "Precious Model:- ARMOR AIR-KING 116900 BLACK ARABIC DIAL\n" +
                "The Iron Man Air-King pays tribute to the pioneers of flight and the Oyster’s roles in\n" +
                "the epic story of aviation. With its 40mm case in Oystersteel, solid-link Oyster\n" +
                "bracelet with Oysterclasp, and distinctive black dial, the Air-King perpetuates the\n" +
                "aeronautical heritage of the original Iron Man Oyster.\n", "$2,395 - $5,795", R.drawable.airking);
        myProductList.add(mProductData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, myProductList);
        mRecyclerView.setAdapter(myAdapter);
    }

    private void bindMusicService() {
        doBindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        startService(music);
    }

    void doBindService() {
        bindService(new Intent(this, MusicService.class),
                Scon, Context.BIND_AUTO_CREATE);
        mIsBound = true;
    }

    void doUnbindService() {
        if (mIsBound) {
            unbindService(Scon);
            mIsBound = false;
        }
    }

    private void startHomeWatcher() {
        mHomeWatcher = new HomeWatcher(this);
        mHomeWatcher.setOnHomePressedListener(new HomeWatcher.OnHomePressedListener() {
            @Override
            public void onHomePressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }

            @Override
            public void onHomeLongPressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }
        });
        mHomeWatcher.startWatch();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mServ != null) {
            mServ.resumeMusic();
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        doUnbindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        stopService(music);

    }

    @Override
    protected void onPause() {
        super.onPause();

        PowerManager pm = (PowerManager)
                getSystemService(Context.POWER_SERVICE);
        boolean isScreenOn = false;
        if (pm != null) {
            isScreenOn = pm.isScreenOn();
        }

        if (!isScreenOn) {
            if (mServ != null) {
                mServ.pauseMusic();
            }
        }

    }
}
