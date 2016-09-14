package co.grandcircus.tMartin.java.lab8;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BattingStatsTest {
	
	@Test
	public void when1Hit2AtBatsExpect500(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		
		Batter batter = new Batter(null, atBatResults);
		
		String battingAvg = batter.getBattingAvg();
		
		Assert.assertEquals(".500", battingAvg);		
	}
	
	@Test
	public void when0Hit0AtBatsExpect000(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(0);
		
		Batter batter = new Batter(null, atBatResults);
		
		String battingAvg = batter.getBattingAvg();
		
		Assert.assertEquals(".000", battingAvg);		
	}
	
	@Test
	public void when3Hits3AtBatsExpect1000(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(4);
		atBatResults.add(4);
		atBatResults.add(4);
		
		Batter batter = new Batter(null, atBatResults);
		
		String battingAvg = batter.getBattingAvg();
		
		Assert.assertEquals("1.000", battingAvg);
	}
	
	@Test
	public void when2Hits3AtBatsExpect667(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		atBatResults.add(2);
		
		Batter batter = new Batter(null, atBatResults);
		
		String battingAvg = batter.getBattingAvg();
		
		Assert.assertEquals(".667", battingAvg);
	}
	
	@Test
	public void when1Hit4AtBatsExpect250(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(0);
		atBatResults.add(3);
		atBatResults.add(0);
		
		Batter batter = new Batter(null, atBatResults);
		
		String battingAvg = batter.getBattingAvg();
		
		Assert.assertEquals(".250", battingAvg);
	}
	
	@Test
	public void when4Hits4AtBatsExpect1000(){

		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(2);
		atBatResults.add(2);
		atBatResults.add(1);
		atBatResults.add(4);
		
		Batter batter = new Batter(null, atBatResults);
		
		String battingAvg = batter.getBattingAvg();
		
		Assert.assertEquals("1.000", battingAvg);
	}
	
	@Test
	public void when5Hits9AtBatsExpect556(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		atBatResults.add(4);
		atBatResults.add(0);
		atBatResults.add(2);
		atBatResults.add(1);
		atBatResults.add(3);
		atBatResults.add(0);
		atBatResults.add(0);
		
		Batter batter = new Batter(null, atBatResults);
		
		String battingAvg = batter.getBattingAvg();
		
		Assert.assertEquals(".556", battingAvg);
	}
	
	@Test
	public void when0Hit1AtBatExpect000(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		
		Batter batter = new Batter(null, atBatResults);
		
		String battingAvg = batter.getBattingAvg();
		
		Assert.assertEquals(".000", battingAvg);
	}
	
	@Test
	public void when1Hit1AtBatExpect1000(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(3);
		
		Batter batter = new Batter(null, atBatResults);
		
		String battingAvg = batter.getBattingAvg();
		
		Assert.assertEquals("1.000", battingAvg);
	}
	
	@Test
	public void when1BaseEarned2AtBatsExpect500Slugging(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		
		Batter batter = new Batter(null, atBatResults);
		
		String sluggingPct = batter.getSluggingPct();
		
		Assert.assertEquals(".500", sluggingPct);		
	}
	
	@Test
	public void when0BasesEarned2AtBatsExpect000Slugging(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(0);
		
		Batter batter = new Batter(null, atBatResults);
		
		String sluggingPct = batter.getSluggingPct();
		
		Assert.assertEquals(".000", sluggingPct);		
	}
	
	@Test
	public void when12BasesEarned3AtBatsExpect4000(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(4);
		atBatResults.add(4);
		atBatResults.add(4);
		
		Batter batter = new Batter(null, atBatResults);
		
		String sluggingPct = batter.getSluggingPct();
		
		Assert.assertEquals("4.000", sluggingPct);
	}
	
	@Test
	public void when3BasesEarned3AtBatsExpect1000(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		atBatResults.add(2);
		
		Batter batter = new Batter(null, atBatResults);
		
		String sluggingPct = batter.getSluggingPct();
		
		Assert.assertEquals("1.000", sluggingPct);
	}
	
	@Test
	public void when3BasesEarned4AtBatsExpect750Slugging(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(0);
		atBatResults.add(3);
		atBatResults.add(0);
		
		Batter batter = new Batter(null, atBatResults);
		
		String sluggingPct = batter.getSluggingPct();
		
		Assert.assertEquals(".750", sluggingPct);		
	}
	
	@Test
	public void when9BasesEarned4AtBatsExpect750Slugging(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(2);
		atBatResults.add(2);
		atBatResults.add(1);
		atBatResults.add(4);
		
		Batter batter = new Batter(null, atBatResults);
		
		String sluggingPct = batter.getSluggingPct();
		
		Assert.assertEquals("2.250", sluggingPct);		
	}
	
	@Test
	public void when11BasesEarned9AtBatsExpect1222Slugging(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		atBatResults.add(4);
		atBatResults.add(0);
		atBatResults.add(2);
		atBatResults.add(1);
		atBatResults.add(3);
		atBatResults.add(0);
		atBatResults.add(0);
		
		Batter batter = new Batter(null, atBatResults);
		
		String sluggingPct = batter.getSluggingPct();
		
		Assert.assertEquals("1.222", sluggingPct);
	}
	
	@Test
	public void when0BasesEarned1AtBatsExpect000Slugging(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		
		Batter batter = new Batter(null, atBatResults);
		
		String sluggingPct = batter.getSluggingPct();
		
		Assert.assertEquals(".000", sluggingPct);		
	}
	
	@Test
	public void when3BasesEarned1AtBatsExpect000Slugging(){
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(3);
		
		Batter batter = new Batter(null, atBatResults);
		
		String sluggingPct = batter.getSluggingPct();
		
		Assert.assertEquals("3.000", sluggingPct);		
	}

}
