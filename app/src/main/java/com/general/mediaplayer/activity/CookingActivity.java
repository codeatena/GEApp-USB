package com.general.mediaplayer.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;

import com.general.mediaplayer.control.APIService;
import com.general.mediaplayer.R;
import com.general.mediaplayer.model.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CookingActivity extends BaseActivity {

    @BindView(R.id.cookingfirst_btn)
    Button firstBtn;

    @BindView(R.id.cookingsecond_btn)
    Button secondBtn;

    @BindView(R.id.cookingthird_btn)
    Button thirdBtn;

    @BindView(R.id.cookingfourth_btn)
    Button fourthBtn;

    @BindView(R.id.cookingfifth_btn)
    Button fifthBtn;

    @BindView(R.id.cookingsixth_btn)
    Button sixthBtn;

    @BindView(R.id.cookingseventh_btn)
    Button seventhBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        View decorView = getWindow().getDecorView();
//        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        setContentView(R.layout.activity_cooking);
        ButterKnife.bind(this);

        Typeface copperplateGothicLight = Typeface.createFromAsset(getAssets(), "fonts/Gotham Light.otf");
        firstBtn.setTypeface(copperplateGothicLight);
        secondBtn.setTypeface(copperplateGothicLight);
        thirdBtn.setTypeface(copperplateGothicLight);
        fourthBtn.setTypeface(copperplateGothicLight);
        fifthBtn.setTypeface(copperplateGothicLight);
        sixthBtn.setTypeface(copperplateGothicLight);
        seventhBtn.setTypeface(copperplateGothicLight);

    }

    public void onBack(View view){

        finish();
    }

    public void onFirstClick(View view)
    {
        hideAllButtons();
        firstBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.colorCooking));

        APIService.trakCategory(this ,Constants.professionalranges);

        Intent intent = new Intent(this , MediaListActivity.class);
        intent.putExtra(Constants.MEDIA_URL, Constants.professionalranges);
        startActivity(intent);
    }

    public void onSecondClick(View view)
    {
        hideAllButtons();
        secondBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.colorCooking));

        APIService.trakCategory(this ,Constants.cooktops);

        Intent intent = new Intent(this , MediaListActivity.class);
        intent.putExtra(Constants.MEDIA_URL, Constants.cooktops);
        startActivity(intent);
    }

    public void onThirdClick(View view)
    {

        hideAllButtons();
        thirdBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.colorCooking));

        APIService.trakCategory(this ,Constants.wallovens);

        Intent intent = new Intent(this , MediaListActivity.class);
        intent.putExtra(Constants.MEDIA_URL, Constants.wallovens);
        startActivity(intent);
    }

    public void onFourthClick(View view)
    {
        hideAllButtons();
        fourthBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.colorCooking));

        APIService.trakCategory(this ,Constants.pizzaoven);

        Intent intent = new Intent(this , MediaListActivity.class);
        intent.putExtra(Constants.MEDIA_URL, Constants.pizzaoven);
        startActivity(intent);
    }

    public void onFifthClick(View view)
    {
        hideAllButtons();
        fifthBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.colorCooking));

        APIService.trakCategory(this ,Constants.advantium);

        Intent intent = new Intent(this , MediaListActivity.class);
        intent.putExtra(Constants.MEDIA_URL, Constants.advantium);
        startActivity(intent);
    }

    public void onSixthClick(View view)
    {
        hideAllButtons();
        sixthBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.colorCooking));

        APIService.trakCategory(this ,Constants.hoods);

        Intent intent = new Intent(this , MediaListActivity.class);
        intent.putExtra(Constants.MEDIA_URL, Constants.hoods);
        startActivity(intent);
    }

    public void onSeventhClick(View view)
    {
        hideAllButtons();
        seventhBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.colorCooking));

        APIService.trakCategory(this ,Constants.selectionguide);

        Intent intent = new Intent(this , MediaListActivity.class);
        intent.putExtra(Constants.MEDIA_URL, Constants.selectionguide);
        startActivity(intent);
    }

    private void hideAllButtons()
    {
        firstBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        secondBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        thirdBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        fourthBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        fifthBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        sixthBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        seventhBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
    }
}
