package com.svsoftdeveloper.trueorfalse.activities;

import com.svsoftdeveloper.trueorfalse.R;
import com.svsoftdeveloper.trueorfalse.activities.db.DatabaseHandler;
import com.svsoftdeveloper.trueorfalse.activities.db.Statistics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LevelSelectionActivity extends Activity implements OnClickListener{
	
	public static final String EXTRA_STATISTICS = "statistics";
	
	public DatabaseHandler db;
	public Statistics statistics;
	
	Button btnLevel1;
	Button btnLevel2;
	Button btnLevel3;
	Button btnLevel4;
	Button btnLevel5;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_levelselection);
	        
	        btnLevel1 = (Button) findViewById(R.id.btnLevel1);
	        btnLevel1.setOnClickListener(this);
	        
	        btnLevel2 = (Button) findViewById(R.id.btnLevel2);
	        btnLevel2.setOnClickListener(this);
	        
	        btnLevel3 = (Button) findViewById(R.id.btnLevel3);
	        btnLevel3.setOnClickListener(this);
	        
	        btnLevel4 = (Button) findViewById(R.id.btnLevel4);
	        btnLevel4.setOnClickListener(this);
	        
	        btnLevel5 = (Button) findViewById(R.id.btnLevel5);
	        btnLevel5.setOnClickListener(this);
	        
	        db = new DatabaseHandler(this);
	        
	        statistics = db.getStatistics(1);
	        
	        btnLevel1.setEnabled(true);
	        
	        if(statistics.getL1Done() != 0){
	        	btnLevel2.setBackgroundResource(R.drawable.button_green_play_background);
	        	btnLevel2.setEnabled(true);
	        }
	        else{
	        	btnLevel2.setEnabled(false);
	        	btnLevel2.setBackgroundResource(R.drawable.button_yellow_lock_background);
	        }
	        
	        if(statistics.getL2Done() != 0){
	        	btnLevel3.setBackgroundResource(R.drawable.button_green_play_background);
	        	btnLevel3.setEnabled(true);
	        }
	        else{
	        	btnLevel3.setEnabled(false);
	        	btnLevel3.setBackgroundResource(R.drawable.button_yellow_lock_background);
	        }
	        
	        if(statistics.getL3Done() != 0){
	        	btnLevel4.setBackgroundResource(R.drawable.button_green_play_background);
	        	btnLevel4.setEnabled(true);
	        }
	        else{
	        	btnLevel4.setEnabled(false);
	        	btnLevel4.setBackgroundResource(R.drawable.button_yellow_lock_background);
	        }
	        
	        if(statistics.getL4Done() != 0){
	        	btnLevel5.setBackgroundResource(R.drawable.button_green_play_background);
	        	btnLevel5.setEnabled(true);
	        }
	        else{
	        	btnLevel5.setEnabled(false);
	        	btnLevel5.setBackgroundResource(R.drawable.button_yellow_lock_background);
	        }
	    }
	 
	 

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent  = new Intent(this, GameActivity.class);
		switch (v.getId()) {
	    case R.id.btnLevel1:
	      // TODO Call second activity   	
	        intent.putExtra("levelnumber", 0);	    	
	        startActivity(intent);
	        //finish();
	        break;
	    case R.id.btnLevel2:
	    	// TODO Call second activity
	    	intent.putExtra("levelnumber", 1);
	    	startActivity(intent);
	    	//finish();
	    	break;  
	    case R.id.btnLevel3:
	    	// TODO Call second activity
	    	intent.putExtra("levelnumber", 2);
	    	startActivity(intent);
	    	//finish();
	    	break;
	    case R.id.btnLevel4:
	    	// TODO Call second activity
	    	intent.putExtra("levelnumber", 3);
	    	startActivity(intent);
	    	//finish();
	    	break;
	    case R.id.btnLevel5:
	    	// TODO Call second activity
	    	intent.putExtra("levelnumber", 4);
	    	startActivity(intent);
	    	//finish();
	    	break;
	    default:
	      break;
	    }
	  }
	
	
}
