package com.digibuddies.cnectus.profile;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import com.digibuddies.cnectus.R;
import agency.tango.materialintroscreen.SlideFragment;
import de.hdodenhof.circleimageview.CircleImageView;

public class CustomSlide2 extends SlideFragment {
    private CheckBox checkBox;
    data d2;
    static public TextView tvun;
    public Spinner s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        d2=new data();
        final View view = inflater.inflate(R.layout.fragment_custom_slide2, container, false);
        CircleImageView v2=(CircleImageView)view.findViewById(R.id.avatar2);

        checkBox = (CheckBox) view.findViewById(R.id.checkBox89);
        tvun=(TextView)view.findViewById(R.id.textView111);
         s0=(Spinner) view.findViewById(R.id.spinner00);
         s1=(Spinner) view.findViewById(R.id.spinner0);
         s2=(Spinner) view.findViewById(R.id.Spinner2);
         s3=(Spinner) view.findViewById(R.id.Spinner3);
         s4=(Spinner) view.findViewById(R.id.Spinner4);
         s5=(Spinner) view.findViewById(R.id.spinner5);
         s6=(Spinner) view.findViewById(R.id.spinner6);
         s7=(Spinner) view.findViewById(R.id.Spinner7);
         s8=(Spinner) view.findViewById(R.id.spinner72);
         s9=(Spinner) view.findViewById(R.id.spinner8);
         s10=(Spinner) view.findViewById(R.id.spinner10);
        s0.setBackgroundColor(Color.DKGRAY); s1.setBackgroundColor(Color.DKGRAY);s2.setBackgroundColor(Color.DKGRAY);s3.setBackgroundColor(Color.DKGRAY);s4.setBackgroundColor(Color.DKGRAY);s5.setBackgroundColor(Color.DKGRAY);s6.setBackgroundColor(Color.DKGRAY);s7.setBackgroundColor(Color.DKGRAY);s8.setBackgroundColor(Color.DKGRAY);s9.setBackgroundColor(Color.DKGRAY);s10.setBackgroundColor(Color.DKGRAY);
        if(profileclass.avid!=0){
            v2.setImageResource(profileclass.avid);
            s0.setSelection(profileclass.p01);
            s1.setSelection(profileclass.p1);
            s2.setSelection(profileclass.p2);
            s3.setSelection(profileclass.p3);
            s4.setSelection(profileclass.p4);
            s5.setSelection(profileclass.p5);
            s6.setSelection(profileclass.p6);
            s7.setSelection(profileclass.p7);
            s8.setSelection(profileclass.p8);
            s9.setSelection(profileclass.p9);
            s10.setSelection(profileclass.p10);}
        if(!(profileclass.usern.equals(""))){
            tvun.setText(profileclass.usern);
        }
        checkBox.setChecked(false);

        return view;
    }

    @Override
    public int backgroundColor() {
        return R.color.second_slide_background;
    }

    @Override
    public int buttonsColor() {
        return R.color.second_slide_buttons;
    }

    @Override
    public boolean canMoveFurther() {
        if (!(s0.getSelectedItem().toString().equals("Select"))&&!(s1.getSelectedItem().toString().equals("Select"))&&!(s2.getSelectedItem().toString().equals("Select"))&&!(s3.getSelectedItem().toString().equals("Select"))&&!(s4.getSelectedItem().toString().equals("Select"))&&!(s5.getSelectedItem().toString().equals("Select"))&&!(s6.getSelectedItem().toString().equals("Select"))&&!(s7.getSelectedItem().toString().equals("Select"))&&!(s8.getSelectedItem().toString().equals("Select"))&&!(s9.getSelectedItem().toString().equals("Select"))&&!(s10.getSelectedItem().toString().equals("Select")))
        {
            profileclass.d.setOp01(s0.getSelectedItem().toString());profileclass.d.setP01(s0.getSelectedItemPosition());
            profileclass.d.setOp1(s1.getSelectedItem().toString());profileclass.d.setP1(s1.getSelectedItemPosition());
            profileclass.d.setOp2(s2.getSelectedItem().toString());profileclass.d.setP2(s2.getSelectedItemPosition());
            profileclass.d.setOp3(s3.getSelectedItem().toString());profileclass.d.setP3(s3.getSelectedItemPosition());
            profileclass.d.setOp4(s4.getSelectedItem().toString());profileclass.d.setP4(s4.getSelectedItemPosition());
            profileclass.d.setOp5(s5.getSelectedItem().toString());profileclass.d.setP5(s5.getSelectedItemPosition());
            profileclass.d.setOp6(s6.getSelectedItem().toString());profileclass.d.setP6(s6.getSelectedItemPosition());
            profileclass.d.setOp7(s7.getSelectedItem().toString());profileclass.d.setP7(s7.getSelectedItemPosition());
            profileclass.d.setOp8(s8.getSelectedItem().toString());profileclass.d.setP8(s8.getSelectedItemPosition());
            profileclass.d.setOp9(s9.getSelectedItem().toString());profileclass.d.setP9(s9.getSelectedItemPosition());
            profileclass.d.setOp10(s10.getSelectedItem().toString());profileclass.d.setP10(s10.getSelectedItemPosition());
            checkBox.setChecked(true);
        }

        return checkBox.isChecked();
    }

    @Override
    public String cantMoveFurtherErrorMessage() {
        return "Please select all the options!";
    }
}