package com.example.advanceDemo;

import com.lansoeditor.demo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ListLayerDemoActivity extends Activity implements OnClickListener{

	 private String videoPath;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.list_layers_demo_layout);
		
		videoPath = getIntent().getStringExtra("videopath");
		 
		findViewById(R.id.id_layer_layermothed1).setOnClickListener(this);
		findViewById(R.id.id_layer_layermothed2).setOnClickListener(this);
		findViewById(R.id.id_layer_layermothed3).setOnClickListener(this);
		findViewById(R.id.id_layer_viewlayerdemo1).setOnClickListener(this);
		findViewById(R.id.id_layer_viewlayerdemo2).setOnClickListener(this);
		findViewById(R.id.id_layer_canvaslayerdemo).setOnClickListener(this);
		findViewById(R.id.id_layer_mvlayerdemo).setOnClickListener(this);
		findViewById(R.id.id_layer_viewremark).setOnClickListener(this);
		findViewById(R.id.id_layer_twovideolayer).setOnClickListener(this);
		findViewById(R.id.id_layer_drawpadexecute_filter).setOnClickListener(this);
		findViewById(R.id.id_layer_drawpadpictureexecute).setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.id_layer_layermothed1:
				startDemoActivity(Demo1LayerMothedActivity.class);
				break;
			case R.id.id_layer_layermothed2:
				startDemoActivity(Demo2LayerMothedActivity.class);
				break;
			case R.id.id_layer_layermothed3:
				startDemoActivity(Demo3LayerFilterActivity.class);
				break;
			case R.id.id_layer_viewlayerdemo1:
				startDemoActivity(ViewLayerDemoActivity.class);
				break;
			case R.id.id_layer_viewlayerdemo2:
				startDemoActivity(ViewLayerOnlyActivity.class);
				break;
			case R.id.id_layer_canvaslayerdemo:
				startDemoActivity(CanvasLayerDemoActivity.class);
				break;
			case R.id.id_layer_mvlayerdemo:
				startDemoActivity(MVLayerDemoActivity.class);
				break;
			case R.id.id_layer_viewremark:
				startDemoActivity(BitmapLayerMarkActivity.class);
				break;
			case R.id.id_layer_twovideolayer:
				startDemoActivity(TwoVideoLayerActivity.class);
				break;
			case R.id.id_layer_drawpadexecute_filter:
				startDemoActivity(ExecuteFilterDemoActivity.class);
				break;
			case R.id.id_layer_drawpadpictureexecute:
				startDemoActivity(ExecuteVideoLayerActivity.class);
				break;
			default:
				break;
		}
	}
	
	private void startDemoActivity(Class<?> cls)
   	{
    	Intent intent=new Intent(ListLayerDemoActivity.this,cls);
    	intent.putExtra("videopath", videoPath);
    	startActivity(intent);
   	}

	
}
