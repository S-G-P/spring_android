package service;

import java.util.ArrayList;
import java.util.List;

import entity.SampleEntity;

/**
 * -- ServiceクラスのSampleCode --<br>
 * @author daisuke
 *
 */
public class SampleService {

	/**
	 * List<String>を返却する 
	 * @return
	 */
	public List<String> getStringData(){
		List<String> stList = new ArrayList<>(); 
		stList.add("happy");
		stList.add("sad");
		stList.add("soso...");
		return stList;			
	}
	
	/**
	 * List<SampleEntity>を返却する
	 * @return
	 */
	public List<SampleEntity> getSampleEntity() {
		List<SampleEntity> sampleEntityList = new ArrayList<>();
		SampleEntity awaji = new SampleEntity();
		awaji.id = 1;
		awaji.lastName = "awaji";
		awaji.firstName = "daisuke";
		sampleEntityList.add(awaji);		
		SampleEntity sakai = new SampleEntity();
		sakai.id = 2;
		sakai.lastName = "sakai";
		sakai.firstName = "hiroto";
		sampleEntityList.add(sakai);
		return sampleEntityList;	
	}

	
}
