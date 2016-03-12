package com.example.pmsminorproject;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	ImageButton nominal, casereg, diary, payroll;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		nominal=(ImageButton)findViewById(R.id.NominalRegistration);
		casereg=(ImageButton)findViewById(R.id.CaseRegister);
		diary=(ImageButton)findViewById(R.id.Diary);
		payroll=(ImageButton)findViewById(R.id.Payroll);
		
		nominal.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0)
			{
				Intent intent=new Intent(MainActivity.this,NominalReg.class);
				startActivity(intent);
			}
		});
		
		casereg.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0)
			{
				
			}
		});
		
		diary.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0)
			{
				
			}
		});
		
		payroll.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0)
			{
				Intent intent=new Intent(MainActivity.this, GetListViewOfPrisioners.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
