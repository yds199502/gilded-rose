package com.gildedrose.analysis;

import com.gildedrose.Item;
import com.gildedrose.factory.QualityAnalysis;

public class ConjuredAnalysis extends QualityAnalysis {

    @Override
    public void updateQuality(Item item) {
        int oldSellIn = item.sellIn;

        item.sellIn = item.sellIn-1;

        if(item.quality == 0){
            return;
        }

        if(item.quality > 50){
            System.out.println("Quality greater than 50");
            //理论应该是抛错
        }else{
            if(oldSellIn < 0){
                item.quality = item.quality>>2;
            }else{
                item.quality = item.quality-2;
            }

        }

    }
}
